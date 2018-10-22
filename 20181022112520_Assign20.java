package random;

import java.util.Scanner;
import java.util.Random;

public class Assign20 {

    public static void main(String[] args) {
        int number, elements;
        int i, j;
        int positionFound = 0;
        String numberFound = "N";

        Random obj = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("how many elements?");
        elements = sc.nextInt();
        int[] array = new int[elements];
        for (i = 0; i < elements; i++) {
            array[i] = obj.nextInt(1000);
            System.out.println((i + 1) + "." + array[i]);

        }
        System.out.println("which number to search?");
        number = sc.nextInt();
        for (i = 0; i < elements; i++) {
            if (number == array[i]) {
                positionFound = i + 1;
                numberFound = "T";
            }
        }
        if (numberFound == "T") {
            System.out.println("element is found at index " + positionFound);
        } else {
            System.out.println("elememnt not found");
        }
System.out.println("End of the Assignmnet");
    }

}
