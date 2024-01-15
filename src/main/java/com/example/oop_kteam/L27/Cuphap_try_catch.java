package com.example.oop_kteam.L27;

public class Cuphap_try_catch {
    //Cú pháp:
    //
    // try {
    //
    //    //Những khối lệnh có thể phát sinh lỗi
    //
    // } catch (Exception e) { //tham số e là tên lỗi muốn xử lý
    //
    //    //Chương trình thực hiện khi gặp lỗi trên
    //
    // }

    // Ví dụ: khi gặp lỗi lấy phần tử trong mảng mà không tồn tại
    public static void main(String[] args) {

        try {
            int[] a = {5,6,7};
            System.out.println(a[4]); // theo lý là sẽ lỗi khi in ra 4
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index does not exist");
        }

    }

}


