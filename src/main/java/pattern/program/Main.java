package pattern.program;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Pattern 1:
        System.out.print("Select number of rows for Pattern1 -> ");
        System.out.print("rhombus right: ");
        int pattern1 = scanner.nextInt();
        System.out.println();

        for (int i = 0 ; i < pattern1 ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = pattern1 -1  ; i > 0 ; i--){
            for (int j = i -1  ; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();

        //Pattern 2:
        System.out.print("Select number of rows for Pattern2 -> ");
        System.out.print("rhombus left: ");
        int pattern2 = scanner.nextInt();
        for (int i = 1; i <= pattern2 ; i++){
            for(int j = i ; j <= pattern2-1 ; j++){
                System.out.print("-");
            }
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= pattern2 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("-");
            }
            for(int j = i ; j < pattern2 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Pattern 3:
        System.out.print("Select number of rows for Pattern3: ");
        int pattern3 = scanner.nextInt();
        for (int i = pattern3  ; i > 0 ; i--){
            for (int j = i -1  ; j > 0 ; j--){
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 1 ; i < pattern3 ; i++){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        System.out.println();


        //Pattern 4  :
        System.out.print("Select number of rows for Pattern4 -> ");
        System.out.print("piramida: ");;
        int pattern4 = scanner.nextInt();
        for (int i = 1; i <= pattern4 ; i++){
            for(int j = 1 ; j <= pattern4-i ; j++){
                System.out.print("-");
            }
            for(int j = 1 ; j <= i*2-1 ; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}