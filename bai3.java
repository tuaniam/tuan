import java.util.Scanner;

public class bai3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Devided by 3: ");
        for(int i=1; i<100; i++){
            if(i%3==0)
                System.out.print(i+",");
        }
        System.out.println("Devided by 5: " );
        for(int i=1; i<100; i++){
            if(i%5==0)
                System.out.print(i+",");
        }
        System.out.println("Devided by 3 & 5: ");
        for(int i=1; i<100; i++){
            if(i%3==0 && i%5==0)
                System.out.print(i+",");
        }
    }
}
