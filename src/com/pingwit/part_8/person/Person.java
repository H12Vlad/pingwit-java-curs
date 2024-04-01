package com.pingwit.part_8.person;

public class Person {
        public static String request = "Hello from Person";
        static String message = "Hello from Person";

        private String name;
        private Integer age;
        private Boolean hungry;

        static {}

        {}

        public Person() {
        }

        public Person(String name, Integer age, Boolean hungry) {
            this.name = name;
            this.age = age;
            this.hungry = hungry;
        }

        public static void sayHi() {
            System.out.println(message);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public Boolean getHungry() {
            return hungry;
        }

        public void setHungry(Boolean hungry) {
            this.hungry = hungry;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", hungry=" + hungry +
                    '}';
        }
    }

