package com.wg.springmall.entity;

import java.util.Date;

public class SysUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.user_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.real_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_store
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String isStore;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.is_manager
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String isManager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.create_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.update_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.age
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private Integer age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.mail
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String mail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phone
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    private String phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.user_name
     *
     * @return the value of sys_user.user_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.user_name
     *
     * @param userName the value for sys_user.user_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.real_name
     *
     * @return the value of sys_user.real_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.real_name
     *
     * @param realName the value for sys_user.real_name
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_store
     *
     * @return the value of sys_user.is_store
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getIsStore() {
        return isStore;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_store
     *
     * @param isStore the value for sys_user.is_store
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setIsStore(String isStore) {
        this.isStore = isStore == null ? null : isStore.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.is_manager
     *
     * @return the value of sys_user.is_manager
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getIsManager() {
        return isManager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.is_manager
     *
     * @param isManager the value for sys_user.is_manager
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setIsManager(String isManager) {
        this.isManager = isManager == null ? null : isManager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.create_time
     *
     * @return the value of sys_user.create_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.create_time
     *
     * @param createTime the value for sys_user.create_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.update_time
     *
     * @return the value of sys_user.update_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.update_time
     *
     * @param updateTime the value for sys_user.update_time
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.age
     *
     * @return the value of sys_user.age
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public Integer getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.age
     *
     * @param age the value for sys_user.age
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.mail
     *
     * @return the value of sys_user.mail
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getMail() {
        return mail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.mail
     *
     * @param mail the value for sys_user.mail
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setMail(String mail) {
        this.mail = mail == null ? null : mail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phone
     *
     * @return the value of sys_user.phone
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phone
     *
     * @param phone the value for sys_user.phone
     *
     * @mbg.generated Sat Oct 03 19:28:02 CST 2020
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }
}