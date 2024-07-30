package com.qing.tree.domain;

public class Student {

    private String id;
    private String parentId;
    private Integer weight;
    private String name;

    public Student(String id, String parentId, Integer weight, String name) {
        this.id = id;
        this.parentId = parentId;
        this.weight = weight;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
