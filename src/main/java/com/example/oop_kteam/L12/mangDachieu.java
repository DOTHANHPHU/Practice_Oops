package com.example.oop_kteam.L12;

// Mảng đa chiều
public class mangDachieu {
    public static void main(String[] args) {
        // Cú pháp khai báo:
        // <kiểu dữ liệu> [][] <tên mảng> = new <kiểu dữ liệu>[kích cỡ hàng] [kích cỡ cột];
        //
        // Cú pháp khởi tạo cho mảng:
        // <kiểu dữ liệu> [][] <tên mảng> = {{các giá trị hàng 1}, {các giá trị hàng 2},… {các giá trị hàng n}}

        // vd: Tạo ma trận 3 hàng 3 cột và in các giá trị ra theo hàng và cột.
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
