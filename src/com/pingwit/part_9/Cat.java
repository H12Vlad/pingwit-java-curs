package com.pingwit.part_9;

import java.util.Objects;

public class Cat {
    private  String type;
    public String color;

    public Cat(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return  false;
        }

        Cat cat = (Cat) obj;

        return  this.color.equals(cat.getColor())
                && this.type.equals(cat.getType());
    }
    @Override
    public int hashCode(){
        return Objects.hash(type,color);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
