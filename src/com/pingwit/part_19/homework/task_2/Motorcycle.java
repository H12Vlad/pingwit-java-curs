package com.pingwit.part_19.homework.task_2;

import com.pingwit.part_19.homework.task_1.Engine;

import java.io.Serializable;
/* необходимо использовать Motorcycle из Task 1
1. Сериализуем Motorcycle в файл
2. Меняем поле на паблик
3. Пытаемся десериализовать в отдельном методе main()
 */
public class Motorcycle implements Serializable {
    private String brand;
    public String model;
    private Engine engine;

    public Motorcycle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}