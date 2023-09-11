package org.example;

import org.springframework.stereotype.Component;

@Component
public class Person {

    public String name;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
