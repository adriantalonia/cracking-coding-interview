package _005_java_courses._01_data_structures_and_algorithms._02_classes_pointers;

public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie("green");
        Cookie cookie2 = new Cookie("blue");

        cookie.setColor("yellow");

        System.out.println(cookie.getColor());
        System.out.println(cookie2.getColor());
    }
}
