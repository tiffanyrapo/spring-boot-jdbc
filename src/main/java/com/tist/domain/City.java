package com.tist.domain;

/**
 * 縣市domain
 *
 * @author sungyeh
 */
public class City {
    /**
     * 建構子
     *
     * @param id
     * @param name
     */
    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City() {
    }

    /**
     * 縣市編號
     */
    private int id;
    /**
     * 縣市名稱
     */
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
