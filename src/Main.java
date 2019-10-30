import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome");
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arr = new ArrayList<>();
        for (int j = 0; j < 2; j++) {
            System.out.println("Please enter a number: ");
            double userInput = sc.nextDouble();
            arr.add(userInput);
        }
        if (addition(arr) == 21) {
            System.out.println(addition(arr) + "*");
        } else {
            System.out.println(addition(arr));
        }
        System.out.println("goodbye");
    }

    public static double addition(ArrayList<Double> i) {
        int sum = 0;
        for (double x : i) {
            sum += x;
        }
        return sum;
    }

    public static void quit(ArrayList<Double> i) {
        int count = 0;
        for (double x : i) {
            if (x == 0) {
                count++;
            }
            if (count == 2) {
                System.out.println("goodbye");
                break;
            }
        }
    }
}


