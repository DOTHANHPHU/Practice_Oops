package com.example.oop_kteam.L23.Overriding;

// Ví dụ: Như trong bài trước ta tạo lớp Student kế thừa lớp Person.
// Với phương thức getInfo của lớp Person chỉ in được thông tin name, age, height trong khi lớp Student còn có thuộc tính universityName.
// Như vậy, ta sẽ overriding lại phương thức getInfo:
public class Student extends Person {

    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:"+this.universityName);
    }

}

// Khi ta khai báo phương thức getInfo trong lớp Student, có nghĩa ta đang overrding.
// Và đối tượng thuộc lớp Student sẽ gọi phương thức getInfo từ lớp Student thay vì lớp Person.


