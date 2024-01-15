package com.example.oop_kteam.L27;

// Từ khóa throw mục đích chính là để ném lỗi, thường khi bạn viết các phương thức cho người khác người dùng và bắt người khác phải tự xử lý những trường hợp đó.
// Bản chất các Exception là các class, nên khi ném lỗi có nghĩa là: Bạn khởi tạo đối tượng Exception và throw cho người viết sau này phải catch lại:

// Ví dụ: Throw lỗi nếu người dùng nhập tham số lớn hơn 100, ta sử dụng class ArithmeticException để xử lý:
public class Tukhoa_Throw {
        static void inputValue(int value) {
            if (value>100) {
                throw new ArithmeticException("Value>100");
            } else {
                System.out.println("Success");
            }
        }

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            inputValue(102);

        }
}
