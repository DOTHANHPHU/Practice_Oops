package com.example.oop_kteam.L17;

// Class
public class Person {
    // Cú pháp:
    // <Phạm vi truy cập> class <tên lớp> {
    //
    //    <Phạm vi truy cập> <các thành phần của lớp>;
    //
    // }
    //
    // Trong đó:
    // <tên lớp>: Là tên class do người tập trình tự tạo ra
    // <Phạm vi truy cập>: gồm có những từ khóa public, protected, private,… sẽ được trình bày trong bài CÁC LOẠI PHẠM VI TRUY CẬP TRONG JAVA
    // <các thành phần của lớp>: Là biến hoặc phương thức trong lớp.

    public String name;
    public int age;
    public float height;

    public void eat() {
        System.out.print("Person is eating");
    }

    // Khái báo một class tên là Person.
    // Class Person có các thuộc tính: name lưu tên, age lưu tuổi, height lưu chiều cao
    // Class Person có phương thức eat: Khi được gọi sẽ in ra màn hình “Person is eating”
}
