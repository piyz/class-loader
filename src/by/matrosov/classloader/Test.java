package by.matrosov.classloader;

public class Test {
    public static String justField = "Hello, i'm a field";

    static {
        System.out.println("static block init");
    }

    public Test() {
        System.out.println("constructor init");
    }

    public void showSmth(){
        System.out.println("Hello class");
    }
}