package org.example;

import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Valentina", "Silyaeva");
        System.out.println(new GsonBuilder().create().toJson(person));
    }
}