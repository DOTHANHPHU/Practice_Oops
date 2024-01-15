package com.example.oop_kteam.L12;

// Mảng 1 chiều
public class mangMotchieu {
    public static void main(String[] args) {
        // Cú pháp khai báo:
        // <kiểu dữ liệu> [] <tên mảng>;
        //
        // Cú pháp cấp phát bộ nhớ để tạo mảng:
        // <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];
        //
        // Cú pháp rút gọn hơn:
        // <kiểu dữ liệu> [] <tên mảng> = new <kiểu dữ liệu>[kích cỡ mảng];

        // vd: Khai báo mảng có 3 phần tử, đưa giá trị. Thử in mảng a và các giá trị mảng a
        int[] a;
        a = new int[3];
        a[0] = 5;
        a[1] = 2;
        a[2] = 1;
        System.out.println(a);
        for (int i=0; i<a.length; i++){ //a.length là một thuộc tính của mảng giúp ta có thể biết kích cỡ của mảng, nó giúp ta sử dụng vòng lặp for.
            System.out.println(a[i]); // truy xuất ohần tử tại vị trí i
        }

        System.out.println("=============================================");

        // Cú pháp khởi tạo cho mảng:
        // <kiểu dữ liệu> [] <tên mảng> = {<giá trị>,…}
        char[] a2 = {'H', 'o', 'w', 'K','t','e','a','m'};
        System.out.print(a2);
    }
}
