package box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double lenght = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(lenght,width,height);


        double volume = box.calculateVolume();
        double leteralSurf = box.calculateLateralSurfaceArea() ;
        double surfiseArea = box.calculateSurfaceArea() ;

        System.out.printf("Surface Area - %.2f%n", surfiseArea);
        System.out.printf("Lateral Surface Area - %.2f%n", leteralSurf);
        System.out.printf("Volume - %.2f%n", volume);
    }
}
