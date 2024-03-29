package com.test.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

public class User {
   // @Autowired(required = false)
    @Resource(name = "cat")
    private Cat cat;
   // @Autowired
   @Resource
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

//    public void setCat(Cat cat) {
//        this.cat = cat;
//    }

    public Dog getDog() {
        return dog;
    }

//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
