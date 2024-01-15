package com.example.oop_kteam.L27;

public class Tukhoa_Finally {

    // Từ khóa finally có ý nghĩa sẽ chạy những dòng code sau khi kết thúc try catch bất kì có lỗi hay không.
    // Dù có lỗi hay không nó vẫn sẽ chạy final
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int S=0;
        try {
            for (String arg : args) {
                S+= Integer.parseInt(arg);
                System.out.println(arg);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        } finally {
            System.out.println("This is end");
        }

    }
}
