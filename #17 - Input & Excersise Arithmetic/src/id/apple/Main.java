package id.apple;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int length, width, area, height, volume;

        System.out.println("===== FIND SQUARE AREA =====");

        System.out.print("length: ");
        length = userInput.nextInt();

        System.out.print("width: ");
        width = userInput.nextInt();

        area = length * width;
        System.out.printf("area: %d", area);

        System.out.println("\n===== FIND VOLUME =====");
        System.out.print("height: ");
        height = userInput.nextInt();
        volume = area * height;
        System.out.printf("volume: %d", volume);


    }
}
