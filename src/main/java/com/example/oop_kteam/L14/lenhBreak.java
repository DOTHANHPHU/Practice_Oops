package com.example.oop_kteam.L14;

// Câu lệnh Break
public class lenhBreak {
    public static void main(String[] args) {
        // Câu lệnh break sẽ dừng vòng lặp chứa nó đang chạy.
        // Thường hay sử dụng khi đạt được mục đích và không muốn tốn thời gian.

        // vd: Ta tìm một giá trị trong mảng, nếu tìm ra rồi thì dừng vòng lặp.
        int[] array = {1,2,4,8,9};

        for (int i=0; i<array.length; i++) {
            if (array[i] == 4) {
                System.out.println("Index:" + i);
                break;
            }
        }
    }
}
