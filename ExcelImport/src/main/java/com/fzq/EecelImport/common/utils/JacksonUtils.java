package com.fzq.EecelImport.common.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.text.SimpleDateFormat;

public class JacksonUtils {

    public static String getJson(Object object){
        return getJson(object,"");
    }

    public static String getJson(Object object,String dateFormat){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        objectMapper.setDateFormat(simpleDateFormat);

        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "";
    }
}