package com.atme8.activity.domain.entity;

import java.io.Serializable;

public class ActivityRegField extends AbstractEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_reg_field.name
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_reg_field.order_
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    private Integer order;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_activity_reg_field.act_id
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    private String actId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_activity_reg_field
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_reg_field.name
     *
     * @return the value of t_activity_reg_field.name
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_reg_field.name
     *
     * @param name the value for t_activity_reg_field.name
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_reg_field.order_
     *
     * @return the value of t_activity_reg_field.order_
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_reg_field.order_
     *
     * @param order the value for t_activity_reg_field.order_
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public void setOrder(Integer order) {
        this.order = order;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_activity_reg_field.act_id
     *
     * @return the value of t_activity_reg_field.act_id
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public String getActId() {
        return actId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_activity_reg_field.act_id
     *
     * @param actId the value for t_activity_reg_field.act_id
     *
     * @mbggenerated Fri Nov 13 09:33:39 CST 2015
     */
    public void setActId(String actId) {
        this.actId = actId == null ? null : actId.trim();
    }
}