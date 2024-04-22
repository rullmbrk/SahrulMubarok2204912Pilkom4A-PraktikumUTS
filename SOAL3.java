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

public class SOAL3 {

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = reverse(number);
        return number == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat: ");
        int number = scanner.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " adalah palindrom.");
        } else {
            System.out.println(number + " bukan palindrom.");
        }

        scanner.close();
    }
}
