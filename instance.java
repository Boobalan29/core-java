public class instance {
    int a=100,b=200;
    int c=a+b;
    void print()
    {
        System.out.println(c);
    }
    static void subtraction(){
        int e=20;
        int f =30;
        int g;
        g=f-e;
        System.out.println("subtraction from f to e - "+g);
    }

public static void main(String[] args) {

    instance d = new instance();
    System.out.println(d.c);
    d.print();
    instance.subtraction();
}

}
