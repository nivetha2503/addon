class Demo {
    public static void main(String[] args) {
        Objectoriented ref = new Objectoriented();
        System.out.println("Non-static var: " + ref.name);
        System.out.println("Non-static var: " + ref.Rollno);

        
        System.out.println("Static var: " + Objectoriented.a);
      
        Objectoriented.Display();
    }
}

class Objectoriented {
    String name = "java";
    String Rollno = "2326ja35";
    static int a = 10;

   
    public static void Display() {
        System.out.println("Static method");
    }
}