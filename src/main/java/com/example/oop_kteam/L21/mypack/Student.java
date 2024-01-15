package com.example.oop_kteam.L21.mypack;

// LỚP CON
// A.1
// Class Student khi chưa dùng kế thừa
    //public class Student {
    //    public String name;
    //    public int age;
    //    public float height;
    //
    //    public Student(String name, int age, float height) {
    //        this.name = name;
    //        this.age = age;
    //        this.height = height;
    //    }
    //
    //    public void getInfo() {
    //        System.out.println("Name:"+this.name);
    //        System.out.println("Age:"+this.age);
    //        System.out.println("Height:"+this.height);
    //    }
    //}

// --------------------------------------------------------------------
// A.2
// ** Khai báo và sử dụng kế thừa
// Class Student sau khi dùng kế thừa
// Cú pháp:
// class <tên lớp con> extends <tên lớp cha> {
//
// }
    //public class Student extends Person{
    //
    //    public Student(String name, int age, float height) {
    //        super(name, age, height);
    //    }
    //}

// Trong phương thức khởi tạo Student, ta sẽ dùng từ khóa super để cho lớp con truy cập các những thứ liên quan đến lớp cha.
// Như ví dụ trên thì ta dùng super() để gọi phương thức khởi tạo lớp cha.

// ------------------------------------------------------------------------------
// B.1
// ** Chú ý về kế thừa
// Slogan đặc trưng kế thừa: “Cha có thì con có, con có chưa chắc cha đã có”
// Tính chất kế thừa các ngôn ngữ lập trình hướng đối tượng đa số đều tương đồng với nhau về tính chất.
// Có thể các bạn không nhớ khái niệm và cú pháp, nhưng chỉ cần hiểu câu nói trên là bạn đã hiểu về kế thừa.
// Ví dụ: Như ví dụ trước thì lớp Student kế thừa Person,
// ngoài những thuộc tính kế thừa ra, ta muốn thêm thuộc tính universityName cho Student
//    public class Student extends Person {
//
//        public String universityName;
//
//        public Student(String name, int age, float height, String universityName) {
//            super(name, age, height);
//            this.universityName = universityName;
//        }
//    }

// Như vậy theo đúng tính chất: lớp cha Person có name, age, height thì lớp con Student có.
// Lớp con Student có universityName thì lớp cha Person không có.

// -----------------------------------------------------------------------------------------
// B.2
// Tận dụng từ khóa super để bảo trì và nâng cấp code
// Từ khóa super mục đích chính truy cập những phương thức của lớp cha.
// Trong việc phát triển phần mềm, ta cần nâng cấp chương trình.
// Việc tận dụng từ khóa super sẽ giúp ta vừa tận dụng những dòng code trước đó và viết tiếp code mới.
//
// Ví dụ: ta thấy phương thức getInfo() chỉ trả về thông tin name, age, height.
// Bây giờ, ta sẽ nâng cấp phương thức có thể trả về thông tin universityName ở lớp Student
public class Student extends Person {

    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:"+this.universityName);
    }

}