


import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner ref=new Scanner(System.in);
      String teacher="java is fun";
      String student1="java is fun";
      String student2=("java is hard");
      System.out.println(teacher == student1);
      System.out.println(teacher == student2);
      System.out.println(student1 == student2);
    }
}