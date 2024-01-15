package com.example.oop_kteam.L16;

public class Oop_Mang {
    public static void main(String[] args) {
        System.out.println("Dùng Oop với mảng");
        Person[] a = new Person[2];

        a[0] = new Person(); // Phải new 1 thằng mới vì Person là 1 class tự tạo ra
        a[0].name1 = "Thanh Phu";
        a[0].height1 = 1.7f;
        a[0].age1 = 21;

        a[1] = new Person();
        a[1].name1 = "Thanh Phong";
        a[1].height1 = 1.5f;
        a[1].age1 = 30;

        System.out.println(a[0].name1);
        System.out.println(a[0].height1);
        System.out.println(a[0].age1);

        System.out.println("=============================");

        System.out.println(a[1].name1);
        System.out.println(a[1].height1);
        System.out.println(a[1].age1);
    }
}
