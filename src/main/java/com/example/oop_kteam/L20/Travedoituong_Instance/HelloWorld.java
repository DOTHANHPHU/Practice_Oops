package com.example.oop_kteam.L20.Travedoituong_Instance;

// Trả về đối tượng (instance) của lớp hiện tại
public class HelloWorld {
    public static void main(String[] args) {
        Person a = new Person("Chau", 21, 1.7f); // Lấy dữ liệu từ a
        System.out.println(a); // in ra a
        System.out.println(a.getInstance()); // get instance a => instance = giá trị đã in ra từ a
        Person b = a; // gán b = a => b = gía trị được in ra từ a
        Person c = a.getInstance(); // gán c = a đã được instance từ dòng 8 => c = gtrị đã được instance từ a
        System.out.println(b); // in ra giá trị b = giá trị a
        System.out.println(c); // in ra gtrị c = gtrị instance từ a
    }

    // Ở kết quả đều trả về chung một giá trị,
    // giá trị in ra theo kiểu quy tắc kiểu dữ liệu tham chiếm mà Kteam đã nói trước đó:
    // [tên lớp]@[vị trí lưu trữ]
}
