package by.matrosov.classloader;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException, InvocationTargetException {
        CustomClassLoader customClassLoader = new CustomClassLoader();

        Class<?> clazz = customClassLoader.findClass("by.matrosov.classloader.Test");
        Object object = clazz.newInstance();

        Method method = clazz.getMethod("showSmth");
        Field field = clazz.getField("justField");
        method.invoke(object);
        System.out.println(field.get(object));

        //output
        //static block init
        //constructor init
        //Hello class
        //Hello, i'm a field
    }
}