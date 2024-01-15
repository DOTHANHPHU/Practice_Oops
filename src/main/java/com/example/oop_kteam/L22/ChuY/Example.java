package com.example.oop_kteam.L22.ChuY;

// ** Chú ý:
// Khi đã dùng setter và getter thì thuộc tính nên để private
// Vì setter và getter nhằm quản lý truy cập của thuộc tính, thì ta không nên để thuộc tính có thể truy cập dễ dàng, không nên để ở dạng public.

// Hãy cẩn thận với kiểu dữ liệu tham chiếu
// Ta tạo một class có thuộc tính là kiểu dữ liệu tham chiếu là một mảng như sau
//public class Example {
//    private int[] array;
//
//    public void setArray (int[] array) {
//        this.array = array;
//    }
//
//    public void displayArray() {
//        for (int a : this.array) {
//            System.out.print(a);
//        }
//        System.out.println();
//    }
//
//}

// -----------------------------------------------------------------------
// Cách xử lý là tạo một bộ nhớ khác và copy giá trị đó vào. Ta sẽ dùng phương thức clone(),
// đây là phương thức hỗ trợ của Java, nó sẽ tạo một bản sao rồi trả bản sao đó cho đối tượng được gán.
// Cũng tương tụ cho phương thức Getter, ta cũng return về bản sao của thuộc tính đó:
//public class Example {
//
//    private int[] array;
//
//    public void setArray (int[] array) {
//        this.array = array.clone();
//    }
//
//    public int[] getArray() {
//        return this.array.clone();
//    }
//
//    public void displayArray() {
//        for (int a : this.array) {
//            System.out.print(a);
//        }
//        System.out.println();
//    }
//
//}

// ** Lưu ý:
// Riêng với kiểu dữ liệu String, mặc dù là kiểu dữ liệu tham chiếu.
// Tuy nhiên, String có cơ chế là khi thay đổi giá trị thì nó bàn chất nó đang tạo ra một đối tượng String mới.
// Vì vậy, như các kiểu dữ liệu nguyên thủy, bạn có thể làm phương thức getter và setter bình thường.

// -----------------------------------------------------------------------------------------
// Nếu trong lớp Example có thuộc tính lớp Person, ta có thể áp dụng Get và Set tương tự
public class Example {

    private int[] array;
    private Person person;

    public void setArray (int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return this.array.clone();
    }

    public void setPerson(Person person) {
        this.person = person.clone();
    }

    public Person getPerson(Person person) {
        return this.person.clone();
    }

    public void displayArray() {
        for (int a : this.array) {
            System.out.print(a);
        }
        System.out.println();
    }

}