/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get its sum from 1 to specified number: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
    }
}
