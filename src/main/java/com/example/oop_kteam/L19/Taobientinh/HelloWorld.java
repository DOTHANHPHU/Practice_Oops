package com.example.oop_kteam.L19.Taobientinh;

 // Tạo biến tĩnh
public class HelloWorld {
    public static void main(String[] args) {
        Student a = new Student("Chau", 21, 1.7f);

        // Thuộc tính/ phương thức Static gọi thông qua tên của Class
        // đúng nhất là gọi theo class vì static thì nó chỉ phụ thuộc vào class thôi bạn gọi bằng object thì đều được
        System.out.println("University (from class):" + Student.universityName);
        System.out.println("University (from instance):" + a.universityName);

        // Chỗ này in ra 1 vì mình chưa new b, mình dùng chính class của a
        System.out.println("Total (from class):" + Student.total);

        // Chỗ này in ra 2 vì new b r, nó sẽ cộng kquả của a và b lại với nhau và in ra
        Student b = new Student("Long", 24, 1.7f);
        System.out.println("Total (from instance):" + b.total);
    }

     // Nó ra 2 kquả khác nhau của dòng code số 14 và 18 vì
     // Biến toàn cục. Sau khi đi qua cái thằng student a (dòng 6) kia, biến total nó tăng lên 1 => total = 1.
     // Còn sau khi đi qua b (dòng 17) nó tăng lên 2 vì lúc này total đã là 1 sau khi chạy qua a => total = 2.
     // Biến total là biến toàn cục, nên 2 thằng a và b đang dùng chung 1 biến total
     // Dù có dùng: Student.total hay a.total hay b.total đều chỉ vào biến tĩnh static total => đều chỉ là 1 biến mà thôi
     // => a là b và b là a
}
