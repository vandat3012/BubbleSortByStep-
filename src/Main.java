import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your size");
        int size = scanner.nextInt();
        int list[] = new int[size];
        System.out.println("list have " + list.length + " and value ");
        for (int i = 0; i < list.length; i++) {
            System.out.println("Enter element " + i);
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input value ");
        for (int e : list) {
            System.out.println(e + "\t");
        }
        bubbleSortByStep(list);
    }

    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    needNextPass = true;
                }
            }
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
        }
        System.out.print("List after the sort: ");
        for (int j = 0; j < list.length; j++) {
            System.out.print(list[j] + "\t");
        }
    }
}