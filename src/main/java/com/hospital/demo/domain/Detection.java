package com.hospital.demo.domain;

public class Detection {
    private Integer id;
    private String name;
    private String annotation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    @Override
    public String toString() {
        return "Detection{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", annotation='" + annotation + '\'' +
                '}';
    }
}
