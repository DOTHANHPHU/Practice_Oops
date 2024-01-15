package com.example.oop_kteam.L10;

//  DO WHILE là thực hiện trước đã rồi mới kiểm tra.
public class baiDoWhile {
    public static void main(String []args){
        // Cú pháp: do {
        //
        //              <Khối lệnh lặp lại>
        //
        //          } while (<Biểu thức điều kiện>)
        // Khi đến dạng vòng lặp thì ngay lập tức sẽ thực hiện <Khối lệnh lặp lại>.
        // Sau đó sẽ kiểm tra nếu <Biểu thức điều kiện> trả về true thì sẽ thực hiện lại <Khối lệnh lặp lại> cho đến khi <Biểu thức điều kiện> trả về false.
        int i = 10;
        do { // Trong do nó sẽ in ra i và tăng i lên 1 cho đến khi nó gặp while
            System.out.println(i);
            i+=1;
        } while(i<10); // Khi i < 10 sẽ dừng lại
    }
}
