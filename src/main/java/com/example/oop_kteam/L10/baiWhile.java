package com.example.oop_kteam.L10;

// WHILE sẽ kiểm tra điều kiện lặp trước rồi thực hiện
public class baiWhile {
    public static void main(String[] args) {
        // Cú pháp: while (<Biểu thức điều kiện>) {
        //
        //              <Khối lệnh lặp lại>
        //
        //          }
        // Nếu <Biểu thức điều kiện> trả về true thì sẽ thực hiện <Khối lệnh lặp lại> cho đến khi <Biểu thức điều kiện> trả về false.

        int i =0;
        while(i<10){ // Khi i < 10 nó sẽ in ra, còn > 10 sẽ ngừng lại
            System.out.println(i);
            i+=1; // Sau mỗi lần in i ra thì tăng i lên 1
        }
    }
}
