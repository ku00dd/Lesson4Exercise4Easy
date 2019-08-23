/*4) Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом
результат на экран.*/
package com.gmail.dimaku1998;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Count the number of char in string.\nEnter string = ");
        String s = sc.nextLine();
        char[] array = s.toCharArray();
        byte count = 0;
        for (int i = 0 ; i < array.length ; i++){
            if (array[i] == 'b'){
                count++;
            }
        }
        System.out.println(count);
    }
}
