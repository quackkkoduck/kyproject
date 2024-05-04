package com.kyproject.demo.dto;

public class HelloDto {

    private Long id;
    private String name;
    private double price;

    // 기본 생성자
    public HelloDto() {}

    // 매개변수가 있는 생성자
    public HelloDto(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // 게터 및 세터 메서드
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString() 메서드
    @Override
    public String toString() {
        return "HelloDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
