package com.example.oop_kteam.L22.ChuY;

public class HelloWorld {
    public static void main(String[] args) {
        Example a = new Example();
        int[] mang = {1,2,3};
        a.setArray(mang);
        a.displayArray();

        mang[1] = 3;
        a.displayArray();

    }
}

// Như kết quả, lúc đầu ta tạo mảng arr ở chương trình main và gán nó cho thuộc tính array của lớp Example, như vậy array có giá trị là {1,2,3}.
// Tuy nhiêu, sau đó ta thử thay đổi giá trị một phần tử trong mang thì giá trị array cũng thay đổi theo.

// Lý do khi ta gán giá trị trong kiểu dữ liệu tham chiếu, bản chất ta gán giá trị vùng bộ nhớ lưu trữ.
// Có nghĩa lúc này array và mang đang ánh xạ chung một đối tượng trong bộ nhớ.

// Cách xử lý là tạo một bộ nhớ khác và copy giá trị đó vào.
// Ta sẽ dùng phương thức clone(), đây là phương thức hỗ trợ của Java, nó sẽ tạo một bản sao rồi trả bản sao đó cho đối tượng được gán.
