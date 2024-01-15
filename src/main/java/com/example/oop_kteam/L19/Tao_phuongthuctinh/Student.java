package com.example.oop_kteam.L19.Tao_phuongthuctinh;

// Tạo phương thức tĩnh
// vd: giới thiệu trường học từ class Student.
public class Student {
    public String name;
    public int age;
    public float height;

    public static String universityName = "Kteam Education";
    public static int total = 0;

    public Student(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
        total += 1;
    }

    public static void getInfoUniversity() {
        System.out.println("HowKteam. Free Educcation!");

        // Tuy nhiên, phương thức static không thể tác động đến thuộc tính và phương thức liên quan đối tượng (non-static).
        // Vì name k phải là 1 static
        // System.out.println(name);
    }

    // Phương thức tĩnh cũng giống như biến tĩnh, có thể gọi mà không cần khởi tạo đối tượng.
    // Phương thức tĩnh rất thích hợp cho những class thư viện viết sẵn, không cần khởi tạo mà chỉ cần gọi ra để chạy chương trình.
}
