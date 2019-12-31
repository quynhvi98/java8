

import java.util.Scanner;

/**
 * Posted from Dec 02, 2018, 10:07 AM
 *
 * @author Vi Quynh (vi.quynh.31598@gmail.com)
 */
public class APlusB {
    static int sumOfTwoDigits(int first_digit, int second_digit) {
        if(first_digit >=0 && second_digit <=9){
            return first_digit + second_digit;
        }else{
            System.out.println("Please enter the valid data");
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(sumOfTwoDigits(a, b));
    }
}

