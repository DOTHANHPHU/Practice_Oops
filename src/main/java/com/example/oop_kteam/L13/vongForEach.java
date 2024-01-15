package com.example.oop_kteam.L13;

// FOR-EACH
public class vongForEach {
    public static void main(String[] args) {
        // Cú pháp:
        // for (<kiểu dữ liệu> <tên biến chạy> : <tên mảng>) {
        //
        //    <Khối lệnh lặp lại>
        //
        // }

        int[] array = {1,2,4};

        for (int a : array){
            System.out.println(a);
        }

        System.out.println("===================================");

        // Không thể tìm được vị trí phần tử trong mảng
        // Vì chúng ta không tác động đến index, thì trong những bài toàn tìm vị trí ta phải dùng for loop.
        int[] arr2 = {1,2,4};

        for (int i=0; i < arr2.length; i++) {
            if (arr2[i] == 4) {
                System.out.println("Index:" + i);
            }
        }

        System.out.println("===================================");

        // Không thể chạy ngược mảng
        // FOR-EACH chỉ có thể chạy xuôi theo các phần tử của mảng. nếu ta muốn chạy ngược phải sử dụng for loop.
        int[] arr3 = {1,2,4};

        for (int i = arr3.length-1; i>=0; i--) {
            System.out.println(arr3[i]);
        }

    }
}
