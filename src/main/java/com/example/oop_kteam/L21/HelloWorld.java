package com.example.oop_kteam.L21;

import com.example.oop_kteam.L21.mypack.Student;

// A.1, A.2
// khởi tạo đối tượng Student và gọi phương thức getInfo():
//public class HelloWorld {
//    public static void main(String[] args) {
//        Student a = new Student("Chau", 21, 1.7f);
//        a.getInfo();
//    }
//}

// ------------------------------------------------------------
// B.1, B.2
// Tận dụng từ khóa super để bảo trì và nâng cấp code
public class HelloWorld {

    public static void main(String[] args) {
        Student a = new Student("Chau", 21, 1.7f, "UTE");
        a.getInfo();
    }
}