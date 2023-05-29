package org.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Apple{
    private void repair(){
        System.out.println("Repairing");
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        Class c = Class.forName("org.example.Apple");
        Apple apple = (Apple) c.newInstance();
        Apple apple1 = (Apple) c.newInstance();

        Method m = c.getDeclaredMethod("repair", null);
        m.setAccessible(true);
        m.invoke(apple);
        System.out.println();




//        Class c = Class.forName("org.example.Product");
//        System.out.println(c.getConstructors().length);
//        Constructor[] constructors = c.getConstructors();
//
//        for(Constructor constructor: constructors){
//            System.out.println(constructor);
//        }
//
//        System.out.println("###############################################");
//
//        Field fields[] = c.getDeclaredFields();
//
//        for(Field field : fields){
//            System.out.println(field);
//        }
//
//        System.out.println("###############################################");
//
//        Method[] methods = c.getMethods();
//        for(Method method : methods){
//            System.out.println(method);
//        }

    }
}