import java.util.Scanner;

public class bai1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i;
        int arr[] = new int[100];
        System.out.println("Decimal number: ");
        int n = scanner.nextInt();
        for(i = 0; n != 0; i++){
            arr[i] = n % 2;
            n = n / 2;
        }
        System.out.println("Binary number: ");
        for(i = i - 1; i >= 0; i--)
            System.out.print(arr[i]);

    }
}
