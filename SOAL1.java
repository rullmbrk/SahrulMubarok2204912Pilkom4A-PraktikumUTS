/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts_pbo;

/**
 *
 * @author sahru
 */
    import java.util.Scanner;

public class SOAL1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan tiga digit integer: ");
        int number = scanner.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Tolong masukan tiga digit.");
        } else {
            String numberString = Integer.toString(number);

            boolean isPalindrom = numberString.charAt(0) == numberString.charAt(2);

            if (isPalindrom) {
                System.out.println(number + " adalah palindrom");
            } else {
                System.out.println(number + " bukan palindrom");
            }
        }

        scanner.close();
    }
}

