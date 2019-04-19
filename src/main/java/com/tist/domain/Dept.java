package com.tist.domain;

/**
 * 部門domain
 */
public class Dept {
    /**
     * 建構子
     *
     * @param id
     * @param deptName
     */
    public Dept(int id, String deptName) {
        this.id = id;
        this.name = deptName;
    }

    public Dept() {
    }

    /**
     * 部門編號
     */
    private int id;
    /**
     * 部門名稱
     */
    private String name;

    public int getId() {
        return id;
    }

    public int setId() {
        this.id = id;
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
