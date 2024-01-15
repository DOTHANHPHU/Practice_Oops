package com.example.oop_kteam.L16;

// Dùng oop vs vòng lặp
public class Oop_For {
    public static void main(String[] args) {
        System.out.println("Dùng Oop với vòng lặp");
        Person[] a = new Person[2];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Person();
            a[i].name1 = "Thanh Phu " + "Tại index: " + i;
            a[i].height1 = 1.7f;
            a[i].age1 = 21;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i].name1);
            System.out.println(a[i].height1);
            System.out.println(a[i].age1);
            System.out.println("========================");
        }
    }
}
