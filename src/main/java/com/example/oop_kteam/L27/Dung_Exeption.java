package com.example.oop_kteam.L27;

public class Dung_Exeption {
    // Nếu bạn không thể lường trước toàn bộ lỗi, ta có thể đặt mặc định Exception để xử lý lỗi mà bạn chưa tính đến được.
    // Ví dụ: Tính tổng các tham số truyền vào trong phương thức main
    public static void main(String[] args) {

        int S=0;
        try {
            for (String arg : args) {
                S+= Integer.parseInt(arg);
                System.out.println(arg);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }

        // Ta dùng phương thức parseInt trong class Integer để chuyển giá trị kiểu String sang giá trị kiểu int (với điều kiện chuỗi đó mang ý nghĩa con số).
        // Giả sử người dùng cho tham số truyền vào không phải kí tự số

    }
}
