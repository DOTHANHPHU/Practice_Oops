package com.example.oop_kteam.L20.Anhxadoituong;

// Ánh xạ đối tượng khi cần sử dụng
public class Person {
    public String name;
    public int age;
    public float height;

    // Như những ví dụ trước. Nếu như không sử dụng this trong phương thức khởi tạo:
//    public Person(String name, int age, float height) {
//        name = name;
//        age = age;
//        height = height;
//    }

    // Chỉ cần thêm this, màu sắc đã thay đổi.
    // Những biến màu hồng biển là chính là thuộc tính, còn biến mà trắng là tham số trong phương thức.
    // Như vậy, nếu không có this, ta đang gán giá trị tham số cho chính nó. Không tác động đến thuộc tính của đối tượng.
    public Person(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
}
