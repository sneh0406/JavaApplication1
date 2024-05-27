/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author fagun
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        
        System.out.println("Enter a word: ");
        String word2 = scanner.nextLine();
        
        System.out.println("Length of a word: "+word.length());
        // Create an array to store characters
        char[] charArray = new char[word.length()];

        // Store each character in the array
        for (int i = 0; i < word.length(); i++) {
            charArray[i] = word.charAt(i);
        }

        System.out.println("Length of an charArray: "+charArray.length);
        // Print the word in reverse by iterating backward over the array
        System.out.print("Word in reverse: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

        scanner.close();
    }
    
}
