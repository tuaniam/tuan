import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args){
        int a,b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Giá trị a là: ");
        a = scanner.nextInt();
        System.out.println("Giá trị b là: ");
        b = scanner.nextInt();

        int c = a+b;
        int d = a*b;

        System.out.println("Tổng 2 số a và b là: "+c);
        System.out.println("Tích 2 số a và b là: "+d);
    }
}
