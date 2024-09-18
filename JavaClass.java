public class JavaClass {
    public static void main(String args[]){
        System.out.println("Hello world");
        int a = 4;
        int b = a + 2;


        System.out.println(b);
        MyMethod(a);
    }
    static void MyMethod(int say){
        System.out.println(say);
    }
}
