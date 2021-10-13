package com.example.kuzmichev.testsql.dto;


public class ResultSetDto {

    private Integer count;
    private Integer mobAppVersion;
    private Integer mobOsVersion;

    public ResultSetDto() {
    }

    public ResultSetDto(Integer count, Integer mobAppVersion, Integer mobOsVersion) {
        this.count = count;
        this.mobAppVersion = mobAppVersion;
        this.mobOsVersion = mobOsVersion;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getMobAppVersion() {
        return mobAppVersion;
    }

    public void setMobAppVersion(Integer mobAppVersion) {
        this.mobAppVersion = mobAppVersion;
    }

    public Integer getMobOsVersion() {
        return mobOsVersion;
    }

    public void setMobOsVersion(Integer mobOsVersion) {
        this.mobOsVersion = mobOsVersion;
    }
}
