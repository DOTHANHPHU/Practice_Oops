package com.example.oop_kteam.L14;

// Câu lệnh Continue
public class lenhContinue {
    public static void main(String[] args) {
        // Câu lệnh continue sẽ bỏ qua một vòng lặp và thực hiện vòng lặp tiếp theo.
        // Continue thường được dùng trong trường hợp có những giá trị lặp ta muốn bỏ qua xử lý.

        // Tính tổng 1 mảng
        int[] array = {1,2,13,3};
        int S=0;

        for (int i : array) {
            if (i == 13) { // khi điều kiện gặp i == 13 nó sẽ bỏ qua số 13 và không cộng vào
                continue;
            }
            S += i; // sau đoạn code dòng 14 nó sẽ chạy xuống đây và cộng các ptử trong mảng, ngoại trừ ptử số 12
        }
        System.out.print("Total:" + S);
    }
}
