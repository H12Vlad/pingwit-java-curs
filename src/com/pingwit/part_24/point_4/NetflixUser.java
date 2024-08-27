package com.pingwit.part_24.point_4;

public record NetflixUser(String name,Integer age) {
    NetflixUser(){
        this("AdminUser", 45);
        System.out.println("Hello from default constructor");
    }

    public NetflixUser(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello from all args constructor");
    }
}
