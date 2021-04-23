package com.hospital.demo.domain;

public class Appointment {
    private int record_id;
    private String am_name;
    private String am_date;
    private String am_tel;
    private String am_type;
    private String am_state;
    private String am_sex;
    private String am_age;
    private String marry_state;
    private String birthday;

    public int getRecord_id() {
        return record_id;
    }

    public void setRecord_id(int record_id) {
        this.record_id = record_id;
    }

    public String getAm_name() {
        return am_name;
    }

    public void setAm_name(String am_name) {
        this.am_name = am_name;
    }

    public String getAm_date() {
        return am_date;
    }

    public void setAm_date(String am_date) {
        this.am_date = am_date;
    }

    public String getAm_tel() {
        return am_tel;
    }

    public void setAm_tel(String am_tel) {
        this.am_tel = am_tel;
    }

    public String getAm_type() {
        return am_type;
    }

    public void setAm_type(String am_type) {
        this.am_type = am_type;
    }

    public String getAm_state() {
        return am_state;
    }

    public void setAm_state(String am_state) {
        this.am_state = am_state;
    }

    public String getAm_sex() {
        return am_sex;
    }

    public void setAm_sex(String am_sex) {
        this.am_sex = am_sex;
    }

    public String getAm_age() {
        return am_age;
    }

    public void setAm_age(String am_age) {
        this.am_age = am_age;
    }

    public String getMarry_state() {
        return marry_state;
    }

    public void setMarry_state(String marry_state) {
        this.marry_state = marry_state;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "record_id=" + record_id +
                ", am_name='" + am_name + '\'' +
                ", am_date='" + am_date + '\'' +
                ", am_tel='" + am_tel + '\'' +
                ", am_type='" + am_type + '\'' +
                ", am_state='" + am_state + '\'' +
                ", am_sex='" + am_sex + '\'' +
                ", am_age='" + am_age + '\'' +
                ", marry_state='" + marry_state + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
