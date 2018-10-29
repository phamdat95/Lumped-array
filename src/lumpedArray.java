import java.util.Scanner;

public class lumpedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size one: ");
        int sizeOne = scanner.nextInt();
        System.out.println("Enter size two: ");
        int sizeTwo = scanner.nextInt();
        int sizeThree = sizeOne + sizeTwo;
        int[] arrOne = new int[sizeOne];
        int[] arrTwo = new int[sizeTwo];
        int[] arrThree = new int[sizeThree];

        System.out.println("Array with size one:");
        for (int i = 0; i < sizeOne; i++){
            arrOne[i] = (int) Math.floor(Math.random()*100);
        }
        for (int i = 0; i < sizeOne; i++){
            System.out.print(arrOne[i] + " ");
        }
        System.out.println("\n Array with size two:");
        for (int i = 0; i < sizeTwo; i++){
            arrTwo[i] = (int) Math.floor(Math.random()*100);
        }
        for (int i = 0; i < sizeTwo; i++){
            System.out.print(arrTwo[i] + " ");
        }

        System.out.println("\n Array with size three:");
        for (int i = 0; i < sizeOne; i++){
            arrThree[i] = arrOne[i];
        }
        int j = 0;
        for (int i = sizeOne; i < sizeThree; i++){
            arrThree[i] = arrTwo[j];
            j = j + 1;
        }
        for (int i = 0; i < sizeThree; i++){
            System.out.print(arrThree[i] + " ");
        }
    }
}
