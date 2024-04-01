package com.pingwit.part_8.person;

public class ImmutablePerson {
        private String name;
        private Integer age;
        private Boolean hungry;

        public ImmutablePerson(String name, Integer age, Boolean hungry) {
            this.name = name;
            this.age = age;
            this.hungry = hungry;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public Boolean getHungry() {
            return hungry;
        }

        @Override
        public String toString() {
            return "ImmutablePerson{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", hungry=" + hungry +
                    '}';
        }
    }