package com.example.oop_kteam.L25;

// Ta cho class Student kế thừa Person như sau:
// Vì bên Person ta đặt 1 abstract => để sử dụng thằng Person ta sẽ extends nó dựa theo lý thuyết Tính trừu tượng
// Một class có thể kế thừa nhiều interface, nhưng chỉ extends 1 class
public class Student extends Person implements IStudy {

    public String universityName;

    public Student(String name, int age, float height, String universityName) {
        super(name, age, height);
        this.universityName = universityName;
    }


    public void getInfo() {
        super.getInfo();
        System.out.println("University Name:"+this.universityName);
    }


    // Phải @Override lại Object clone() mới sử dụng được bởi vì ta đặt abstract cho phươc thức Object bên Lớp Person dòng 47
    @Override
    public Object clone() {
        Student other = new Student(this.name, this.getAge(), this.height, this.universityName);
        return other;
    }

    // Ta sẽ overriding, thêm đoạn chương trình trong lớp Student như sau:
    @Override
    public void study() {
        // TODO Auto-generated method stub
        System.out.println(this.name+" is studing");
    }

    // Ngoài ra, Student là lớp con Person, nên mặc dù Student không kế thừa ISpeak trực tiếp nhưng vẫn phải override phương thức speak().
    @Override
    public void speak() {
        // TODO Auto-generated method stub
        System.out.println(this.name+" is speaking");
    }
}
