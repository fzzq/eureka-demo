package com.fzq.EecelImport.common.mapreduce;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.Reducer;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;

public class WordCount {
    // Mapper四个参数：第一个Object表示输入key的类型；第二个Text表示输入value的类型；第三个Text表示表示输出键的类型；第四个IntWritable表示输出值的类型。map这里的输出是指输出到reduce 
    public static class doMapper extends Mapper<Object, Text, Text, IntWritable> {
        public static final IntWritable one = new IntWritable(1);//这里的IntWritable相当于Int类型
        public static Text word = new Text();//Text相当于String类型

        // map参数<keyIn key,valueIn value,Context context>，将处理后的数据写入context并传给reduce
        protected void map(Object key, Text value, Context context) throws IOException, InterruptedException {


            StringTokenizer tokenizer = new StringTokenizer(value.toString(), "   ");

            //返回当前位置到下一个分隔符之间的字符串
            word.set(tokenizer.nextToken());

            //将word存到容器中，记一个数
            context.write(word, one);
        }
    }

    //参数同Map一样，依次表示是输入键类型，输入值类型，输出键类型，输出值类型。这里的输入是来源于map,所以类型要与map的输出类型对应 。
    public static class doReducer extends Reducer<Text, IntWritable, Text, IntWritable> {
        private IntWritable result = new IntWritable();

        @Override
        protected void reduce(Text key, Iterable<IntWritable> values, Context context)
                throws IOException, InterruptedException {
            int sum = 0;

            //for循环遍历，将得到的values值累加
            for (IntWritable value : values) {
                sum += value.get();
            }
            result.set(sum);
            context.write(key, result);//将结果保存到context中，最终输出形式为"key" + "result"
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        System.out.println("start");
        Job job = Job.getInstance();
        job.setJobName("wordCount");

        Path in = new Path("hdfs://***:9000/user/hadoop/input/buyer_favorite1.txt");//设置这个作业输入数据的路径(***部分为自己liunx系统的localhost或者ip地址)
        Path out = new Path("hdfs://***:9000/user/hadoop/output/wordCount");        //设置这个作业输出结果的路径

        FileInputFormat.addInputPath(job, in);
        FileOutputFormat.setOutputPath(job, out);

        job.setJarByClass(WordCount.class);// 设置运行/处理该作业的类

        job.setMapperClass(doMapper.class);//设置实现了Map步的类
        job.setReducerClass(doReducer.class);//设置实现了Reduce步的类

        job.setOutputKeyClass(Text.class);//设置输出结果key的类型
        job.setOutputValueClass(IntWritable.class);//设置输出结果value的类型

        ////执行作业
        System.exit(job.waitForCompletion(true) ? 0 : 1);
        System.out.println("end");
    }
}