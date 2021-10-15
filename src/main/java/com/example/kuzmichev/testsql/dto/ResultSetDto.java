package com.example.kuzmichev.testsql.dto;


public class ResultSetDto {
    private Integer mobAppVersion;
    private Integer count;

    public ResultSetDto() {
    }

    public ResultSetDto(Integer mobAppVersion, Integer count) {
        this.mobAppVersion = mobAppVersion;
        this.count = count;
    }

    public Integer getMobAppVersion() {
        return mobAppVersion;
    }

    public void setMobAppVersion(Integer mobAppVersion) {
        this.mobAppVersion = mobAppVersion;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
