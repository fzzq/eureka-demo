package com.fzq.EecelImport.entity;

import java.util.ArrayList;
import java.util.List;

public class TbmCodeGlobalExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbmCodeGlobalExample() {
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

        public Criteria andRootNameIsNull() {
            addCriterion("root_name is null");
            return (Criteria) this;
        }

        public Criteria andRootNameIsNotNull() {
            addCriterion("root_name is not null");
            return (Criteria) this;
        }

        public Criteria andRootNameEqualTo(String value) {
            addCriterion("root_name =", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotEqualTo(String value) {
            addCriterion("root_name <>", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameGreaterThan(String value) {
            addCriterion("root_name >", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameGreaterThanOrEqualTo(String value) {
            addCriterion("root_name >=", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLessThan(String value) {
            addCriterion("root_name <", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLessThanOrEqualTo(String value) {
            addCriterion("root_name <=", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameLike(String value) {
            addCriterion("root_name like", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotLike(String value) {
            addCriterion("root_name not like", value, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameIn(List<String> values) {
            addCriterion("root_name in", values, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotIn(List<String> values) {
            addCriterion("root_name not in", values, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameBetween(String value1, String value2) {
            addCriterion("root_name between", value1, value2, "rootName");
            return (Criteria) this;
        }

        public Criteria andRootNameNotBetween(String value1, String value2) {
            addCriterion("root_name not between", value1, value2, "rootName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
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

        public Criteria andUnitIsNull() {
            addCriterion("unit is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("unit is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("unit =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("unit <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("unit >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("unit >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("unit <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("unit <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("unit like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("unit not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("unit in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("unit not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("unit between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("unit not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andTtm1IsNull() {
            addCriterion("ttm1 is null");
            return (Criteria) this;
        }

        public Criteria andTtm1IsNotNull() {
            addCriterion("ttm1 is not null");
            return (Criteria) this;
        }

        public Criteria andTtm1EqualTo(Integer value) {
            addCriterion("ttm1 =", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1NotEqualTo(Integer value) {
            addCriterion("ttm1 <>", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1GreaterThan(Integer value) {
            addCriterion("ttm1 >", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1GreaterThanOrEqualTo(Integer value) {
            addCriterion("ttm1 >=", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1LessThan(Integer value) {
            addCriterion("ttm1 <", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1LessThanOrEqualTo(Integer value) {
            addCriterion("ttm1 <=", value, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1In(List<Integer> values) {
            addCriterion("ttm1 in", values, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1NotIn(List<Integer> values) {
            addCriterion("ttm1 not in", values, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1Between(Integer value1, Integer value2) {
            addCriterion("ttm1 between", value1, value2, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm1NotBetween(Integer value1, Integer value2) {
            addCriterion("ttm1 not between", value1, value2, "ttm1");
            return (Criteria) this;
        }

        public Criteria andTtm2IsNull() {
            addCriterion("ttm2 is null");
            return (Criteria) this;
        }

        public Criteria andTtm2IsNotNull() {
            addCriterion("ttm2 is not null");
            return (Criteria) this;
        }

        public Criteria andTtm2EqualTo(Integer value) {
            addCriterion("ttm2 =", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2NotEqualTo(Integer value) {
            addCriterion("ttm2 <>", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2GreaterThan(Integer value) {
            addCriterion("ttm2 >", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2GreaterThanOrEqualTo(Integer value) {
            addCriterion("ttm2 >=", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2LessThan(Integer value) {
            addCriterion("ttm2 <", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2LessThanOrEqualTo(Integer value) {
            addCriterion("ttm2 <=", value, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2In(List<Integer> values) {
            addCriterion("ttm2 in", values, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2NotIn(List<Integer> values) {
            addCriterion("ttm2 not in", values, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2Between(Integer value1, Integer value2) {
            addCriterion("ttm2 between", value1, value2, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm2NotBetween(Integer value1, Integer value2) {
            addCriterion("ttm2 not between", value1, value2, "ttm2");
            return (Criteria) this;
        }

        public Criteria andTtm3IsNull() {
            addCriterion("ttm3 is null");
            return (Criteria) this;
        }

        public Criteria andTtm3IsNotNull() {
            addCriterion("ttm3 is not null");
            return (Criteria) this;
        }

        public Criteria andTtm3EqualTo(Integer value) {
            addCriterion("ttm3 =", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3NotEqualTo(Integer value) {
            addCriterion("ttm3 <>", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3GreaterThan(Integer value) {
            addCriterion("ttm3 >", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3GreaterThanOrEqualTo(Integer value) {
            addCriterion("ttm3 >=", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3LessThan(Integer value) {
            addCriterion("ttm3 <", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3LessThanOrEqualTo(Integer value) {
            addCriterion("ttm3 <=", value, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3In(List<Integer> values) {
            addCriterion("ttm3 in", values, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3NotIn(List<Integer> values) {
            addCriterion("ttm3 not in", values, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3Between(Integer value1, Integer value2) {
            addCriterion("ttm3 between", value1, value2, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm3NotBetween(Integer value1, Integer value2) {
            addCriterion("ttm3 not between", value1, value2, "ttm3");
            return (Criteria) this;
        }

        public Criteria andTtm4IsNull() {
            addCriterion("ttm4 is null");
            return (Criteria) this;
        }

        public Criteria andTtm4IsNotNull() {
            addCriterion("ttm4 is not null");
            return (Criteria) this;
        }

        public Criteria andTtm4EqualTo(Integer value) {
            addCriterion("ttm4 =", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4NotEqualTo(Integer value) {
            addCriterion("ttm4 <>", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4GreaterThan(Integer value) {
            addCriterion("ttm4 >", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4GreaterThanOrEqualTo(Integer value) {
            addCriterion("ttm4 >=", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4LessThan(Integer value) {
            addCriterion("ttm4 <", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4LessThanOrEqualTo(Integer value) {
            addCriterion("ttm4 <=", value, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4In(List<Integer> values) {
            addCriterion("ttm4 in", values, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4NotIn(List<Integer> values) {
            addCriterion("ttm4 not in", values, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4Between(Integer value1, Integer value2) {
            addCriterion("ttm4 between", value1, value2, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm4NotBetween(Integer value1, Integer value2) {
            addCriterion("ttm4 not between", value1, value2, "ttm4");
            return (Criteria) this;
        }

        public Criteria andTtm5IsNull() {
            addCriterion("ttm5 is null");
            return (Criteria) this;
        }

        public Criteria andTtm5IsNotNull() {
            addCriterion("ttm5 is not null");
            return (Criteria) this;
        }

        public Criteria andTtm5EqualTo(Integer value) {
            addCriterion("ttm5 =", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5NotEqualTo(Integer value) {
            addCriterion("ttm5 <>", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5GreaterThan(Integer value) {
            addCriterion("ttm5 >", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5GreaterThanOrEqualTo(Integer value) {
            addCriterion("ttm5 >=", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5LessThan(Integer value) {
            addCriterion("ttm5 <", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5LessThanOrEqualTo(Integer value) {
            addCriterion("ttm5 <=", value, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5In(List<Integer> values) {
            addCriterion("ttm5 in", values, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5NotIn(List<Integer> values) {
            addCriterion("ttm5 not in", values, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5Between(Integer value1, Integer value2) {
            addCriterion("ttm5 between", value1, value2, "ttm5");
            return (Criteria) this;
        }

        public Criteria andTtm5NotBetween(Integer value1, Integer value2) {
            addCriterion("ttm5 not between", value1, value2, "ttm5");
            return (Criteria) this;
        }

        public Criteria andPreCodeIsNull() {
            addCriterion("pre_code is null");
            return (Criteria) this;
        }

        public Criteria andPreCodeIsNotNull() {
            addCriterion("pre_code is not null");
            return (Criteria) this;
        }

        public Criteria andPreCodeEqualTo(String value) {
            addCriterion("pre_code =", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotEqualTo(String value) {
            addCriterion("pre_code <>", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeGreaterThan(String value) {
            addCriterion("pre_code >", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pre_code >=", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLessThan(String value) {
            addCriterion("pre_code <", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLessThanOrEqualTo(String value) {
            addCriterion("pre_code <=", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeLike(String value) {
            addCriterion("pre_code like", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotLike(String value) {
            addCriterion("pre_code not like", value, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeIn(List<String> values) {
            addCriterion("pre_code in", values, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotIn(List<String> values) {
            addCriterion("pre_code not in", values, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeBetween(String value1, String value2) {
            addCriterion("pre_code between", value1, value2, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreCodeNotBetween(String value1, String value2) {
            addCriterion("pre_code not between", value1, value2, "preCode");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNull() {
            addCriterion("pre_name is null");
            return (Criteria) this;
        }

        public Criteria andPreNameIsNotNull() {
            addCriterion("pre_name is not null");
            return (Criteria) this;
        }

        public Criteria andPreNameEqualTo(String value) {
            addCriterion("pre_name =", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotEqualTo(String value) {
            addCriterion("pre_name <>", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThan(String value) {
            addCriterion("pre_name >", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameGreaterThanOrEqualTo(String value) {
            addCriterion("pre_name >=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThan(String value) {
            addCriterion("pre_name <", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLessThanOrEqualTo(String value) {
            addCriterion("pre_name <=", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameLike(String value) {
            addCriterion("pre_name like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotLike(String value) {
            addCriterion("pre_name not like", value, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameIn(List<String> values) {
            addCriterion("pre_name in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotIn(List<String> values) {
            addCriterion("pre_name not in", values, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameBetween(String value1, String value2) {
            addCriterion("pre_name between", value1, value2, "preName");
            return (Criteria) this;
        }

        public Criteria andPreNameNotBetween(String value1, String value2) {
            addCriterion("pre_name not between", value1, value2, "preName");
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