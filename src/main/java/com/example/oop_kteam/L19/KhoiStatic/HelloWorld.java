package com.example.oop_kteam.L19.KhoiStatic;

// Khối Static
// vd: ta tạo khối static ở class HelloWorld
public class HelloWorld {
    static String course;

    static {
        System.out.println("HowKteam");
        course = "Java core";
    }

    public static void main(String[] args) {
        System.out.println("Free education");
        System.out.println("course: "+ HelloWorld.course);
    }

    // Khối static được sử dụng cho mục đích khởi tạo giá trị các biến static.
    // Khối sẽ được thực hiện khi lớp chứa nó được load vào trong bộ nhớ.

    // Trong một lớp có thể nhiều khối tùy ý. Các khối này sẽ chạy cùng nhau, và chạy trước cả chương trình main của lớp đó.
}
