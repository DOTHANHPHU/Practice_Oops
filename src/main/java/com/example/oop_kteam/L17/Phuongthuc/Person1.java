package com.example.oop_kteam.L17.Phuongthuc;

// Nói về phương thức
public class Person1 {

    public String name;
    public int age;
    public float height;

    // Cú pháp:
    //  <Phạm vi truy cập> <từ khóa> <Kiểu dữ liệu trả về> <tên phương thức> ([Tham số]) {
    //
    //        <Chương trình>
    //
    //  }
    // Phương thức eat, có 1 tham số là foodName
    public void eat(String foodName) {
        System.out.println(name + " is eating "+ foodName);
    }

    // Phương thức getAge
    public int getAge() {
        return age;
    }

    // <Phạm vi truy cập>: Phạm vi truy cập phương thức, sẽ nói bài sau.
    // <từ khóa>: Gồm các từ khóa final, static,… sẽ nói ở những bài sau.
    // <Kiểu dữ liệu trả về>: Ta có thể định nghĩa phương thức có trả về dữ liệu kiểu gì không. Như trả kiểu int, long, double hoặc tên một class nào đó, nếu không trả về gì ta chọn từ khóa void. Để trả dữ liệu, ta sẽ dùng từ khóa return trong phương thức.
    // <tên phương thức>: Tên của phương thức
    // [Tham số]: Là những tham số ta muốn truyền vào phương thức để thực hiện.
    // <Chương trình>: Những dòng code thực hiện khi gọi tên phương thức.

}
