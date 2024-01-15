package com.example.oop_kteam.L11;

public class vongFor {
    // Cú pháp: for (<khởi tạo biến chạy>;<Biểu thức điều kiện>;<thay đổi biến chạy>) {
    //
    //              <Khối lệnh lặp lại>
    //
    //          }
    // Nguyên lý:
    //      Bước 1: Thực hiện <khởi tạo biến chạy>
    //      Bước 2: Kiểm tra <Biểu thức điều kiện> nếu biểu thức đúng thì thực hiện <Khối lệnh lặp lại> .Nếu sai thì qua Bước 4
    //      Bước 3: Thực hiện <thay đổi biến chạy>, quay lại Bước 2
    //      Bước 4: Kết thúc vòng lặp

    public static void main(String []args){
        // chương trình in 10 số tự nhiên đầu tiên
        for(int i=0; i<10; i++){
            System.out.println(i);
        }

        System.out.println("=================================================================");

        // chương trình in ra các số lẻ trong khoảng 1 đến 10
        for(int i=1; i<=10; i+=2){
            System.out.println(i);
        }
    }
}
