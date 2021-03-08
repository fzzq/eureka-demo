package com.fzq.EecelImport.entity;

import java.util.ArrayList;
import java.util.List;

public class TbmInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbmInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andTbmModelIsNull() {
            addCriterion("tbm_model is null");
            return (Criteria) this;
        }

        public Criteria andTbmModelIsNotNull() {
            addCriterion("tbm_model is not null");
            return (Criteria) this;
        }

        public Criteria andTbmModelEqualTo(String value) {
            addCriterion("tbm_model =", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelNotEqualTo(String value) {
            addCriterion("tbm_model <>", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelGreaterThan(String value) {
            addCriterion("tbm_model >", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelGreaterThanOrEqualTo(String value) {
            addCriterion("tbm_model >=", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelLessThan(String value) {
            addCriterion("tbm_model <", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelLessThanOrEqualTo(String value) {
            addCriterion("tbm_model <=", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelLike(String value) {
            addCriterion("tbm_model like", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelNotLike(String value) {
            addCriterion("tbm_model not like", value, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelIn(List<String> values) {
            addCriterion("tbm_model in", values, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelNotIn(List<String> values) {
            addCriterion("tbm_model not in", values, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelBetween(String value1, String value2) {
            addCriterion("tbm_model between", value1, value2, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmModelNotBetween(String value1, String value2) {
            addCriterion("tbm_model not between", value1, value2, "tbmModel");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNull() {
            addCriterion("tbm_type is null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIsNotNull() {
            addCriterion("tbm_type is not null");
            return (Criteria) this;
        }

        public Criteria andTbmTypeEqualTo(Integer value) {
            addCriterion("tbm_type =", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotEqualTo(Integer value) {
            addCriterion("tbm_type <>", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThan(Integer value) {
            addCriterion("tbm_type >", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("tbm_type >=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThan(Integer value) {
            addCriterion("tbm_type <", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("tbm_type <=", value, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeIn(List<Integer> values) {
            addCriterion("tbm_type in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotIn(List<Integer> values) {
            addCriterion("tbm_type not in", values, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeBetween(Integer value1, Integer value2) {
            addCriterion("tbm_type between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andTbmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("tbm_type not between", value1, value2, "tbmType");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNull() {
            addCriterion("diameter is null");
            return (Criteria) this;
        }

        public Criteria andDiameterIsNotNull() {
            addCriterion("diameter is not null");
            return (Criteria) this;
        }

        public Criteria andDiameterEqualTo(Double value) {
            addCriterion("diameter =", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotEqualTo(Double value) {
            addCriterion("diameter <>", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThan(Double value) {
            addCriterion("diameter >", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterGreaterThanOrEqualTo(Double value) {
            addCriterion("diameter >=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThan(Double value) {
            addCriterion("diameter <", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterLessThanOrEqualTo(Double value) {
            addCriterion("diameter <=", value, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterIn(List<Double> values) {
            addCriterion("diameter in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotIn(List<Double> values) {
            addCriterion("diameter not in", values, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterBetween(Double value1, Double value2) {
            addCriterion("diameter between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andDiameterNotBetween(Double value1, Double value2) {
            addCriterion("diameter not between", value1, value2, "diameter");
            return (Criteria) this;
        }

        public Criteria andDeviceLenIsNull() {
            addCriterion("device_len is null");
            return (Criteria) this;
        }

        public Criteria andDeviceLenIsNotNull() {
            addCriterion("device_len is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceLenEqualTo(Double value) {
            addCriterion("device_len =", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenNotEqualTo(Double value) {
            addCriterion("device_len <>", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenGreaterThan(Double value) {
            addCriterion("device_len >", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenGreaterThanOrEqualTo(Double value) {
            addCriterion("device_len >=", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenLessThan(Double value) {
            addCriterion("device_len <", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenLessThanOrEqualTo(Double value) {
            addCriterion("device_len <=", value, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenIn(List<Double> values) {
            addCriterion("device_len in", values, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenNotIn(List<Double> values) {
            addCriterion("device_len not in", values, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenBetween(Double value1, Double value2) {
            addCriterion("device_len between", value1, value2, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceLenNotBetween(Double value1, Double value2) {
            addCriterion("device_len not between", value1, value2, "deviceLen");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightIsNull() {
            addCriterion("device_weight is null");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightIsNotNull() {
            addCriterion("device_weight is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightEqualTo(Double value) {
            addCriterion("device_weight =", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightNotEqualTo(Double value) {
            addCriterion("device_weight <>", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightGreaterThan(Double value) {
            addCriterion("device_weight >", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("device_weight >=", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightLessThan(Double value) {
            addCriterion("device_weight <", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightLessThanOrEqualTo(Double value) {
            addCriterion("device_weight <=", value, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightIn(List<Double> values) {
            addCriterion("device_weight in", values, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightNotIn(List<Double> values) {
            addCriterion("device_weight not in", values, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightBetween(Double value1, Double value2) {
            addCriterion("device_weight between", value1, value2, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDeviceWeightNotBetween(Double value1, Double value2) {
            addCriterion("device_weight not between", value1, value2, "deviceWeight");
            return (Criteria) this;
        }

        public Criteria andDevicePowerIsNull() {
            addCriterion("device_power is null");
            return (Criteria) this;
        }

        public Criteria andDevicePowerIsNotNull() {
            addCriterion("device_power is not null");
            return (Criteria) this;
        }

        public Criteria andDevicePowerEqualTo(Double value) {
            addCriterion("device_power =", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerNotEqualTo(Double value) {
            addCriterion("device_power <>", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerGreaterThan(Double value) {
            addCriterion("device_power >", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerGreaterThanOrEqualTo(Double value) {
            addCriterion("device_power >=", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerLessThan(Double value) {
            addCriterion("device_power <", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerLessThanOrEqualTo(Double value) {
            addCriterion("device_power <=", value, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerIn(List<Double> values) {
            addCriterion("device_power in", values, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerNotIn(List<Double> values) {
            addCriterion("device_power not in", values, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerBetween(Double value1, Double value2) {
            addCriterion("device_power between", value1, value2, "devicePower");
            return (Criteria) this;
        }

        public Criteria andDevicePowerNotBetween(Double value1, Double value2) {
            addCriterion("device_power not between", value1, value2, "devicePower");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedIsNull() {
            addCriterion("cutter_speed is null");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedIsNotNull() {
            addCriterion("cutter_speed is not null");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedEqualTo(String value) {
            addCriterion("cutter_speed =", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedNotEqualTo(String value) {
            addCriterion("cutter_speed <>", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedGreaterThan(String value) {
            addCriterion("cutter_speed >", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedGreaterThanOrEqualTo(String value) {
            addCriterion("cutter_speed >=", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedLessThan(String value) {
            addCriterion("cutter_speed <", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedLessThanOrEqualTo(String value) {
            addCriterion("cutter_speed <=", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedLike(String value) {
            addCriterion("cutter_speed like", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedNotLike(String value) {
            addCriterion("cutter_speed not like", value, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedIn(List<String> values) {
            addCriterion("cutter_speed in", values, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedNotIn(List<String> values) {
            addCriterion("cutter_speed not in", values, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedBetween(String value1, String value2) {
            addCriterion("cutter_speed between", value1, value2, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andCutterSpeedNotBetween(String value1, String value2) {
            addCriterion("cutter_speed not between", value1, value2, "cutterSpeed");
            return (Criteria) this;
        }

        public Criteria andMotorNumIsNull() {
            addCriterion("motor_num is null");
            return (Criteria) this;
        }

        public Criteria andMotorNumIsNotNull() {
            addCriterion("motor_num is not null");
            return (Criteria) this;
        }

        public Criteria andMotorNumEqualTo(Integer value) {
            addCriterion("motor_num =", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotEqualTo(Integer value) {
            addCriterion("motor_num <>", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumGreaterThan(Integer value) {
            addCriterion("motor_num >", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("motor_num >=", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumLessThan(Integer value) {
            addCriterion("motor_num <", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumLessThanOrEqualTo(Integer value) {
            addCriterion("motor_num <=", value, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumIn(List<Integer> values) {
            addCriterion("motor_num in", values, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotIn(List<Integer> values) {
            addCriterion("motor_num not in", values, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumBetween(Integer value1, Integer value2) {
            addCriterion("motor_num between", value1, value2, "motorNum");
            return (Criteria) this;
        }

        public Criteria andMotorNumNotBetween(Integer value1, Integer value2) {
            addCriterion("motor_num not between", value1, value2, "motorNum");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}