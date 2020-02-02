/*
 * Arianna Biernacki
 * Student ID: 991270882
 */
package Week4;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice {

    ArrayList arrList = new ArrayList();

    public void play() {
        getUserInput();
        count();
        sum();
        max();
        reverseSequence();
    }

    private void getUserInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number (-100 will break the loop):");
        OUTER_LOOP:
        while (true) {
            for (int i = 0;; i++) {
                arrList.add(input.nextInt());

                if (arrList.get(i).equals(-100)) {
                    System.out.println("You entered -100... Exiting the loop.");
                    break OUTER_LOOP;
                }
            }
        }
    }

    private void count() {
        System.out.println("-----------------------------------------");
        System.out.println("The amount of numbers in the array are: " + arrList.size());
    }

    private void sum() {
        System.out.println("-----------------------------------------");
        int sum = 0;
        for (int i = 0; i < arrList.size(); i++) {
            sum += (int) arrList.get(i);
        }
        System.out.println("The sum is: " + sum);
    }

    private void max() {
        System.out.println("-----------------------------------------");
        int max = 0;
        for (int i = 0; i < arrList.size(); i++) {
            if ((int) arrList.get(i) > max) {
                max = (int) arrList.get(i);
            }
        }
        System.out.println("The largest number in the array is: " + max);
    }

    private void reverseSequence() {
        System.out.println("-----------------------------------------");
        System.out.println("The array in reverse is: ");
        for (int i = arrList.size() - 1; i > -1; i--){
            System.out.println(arrList.get(i));
        }
    }
}
