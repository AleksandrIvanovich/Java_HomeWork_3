/*
 * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа 
 * (в языке уже есть что-то готовое для этого)
 */
package HW_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task_1 {
    public static void main(String[] args) {

            Scanner userInput  = new Scanner(System.in); 
            System.out.print("Введите число (длина массива): ");
            int numLen= userInput.nextInt();
            System.out.print("Введите число (максимальное число массива): ");
            int numMax = userInput.nextInt();

            Random ran = new Random();
            int[] array = new int[numLen];
            for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(numMax);
            }
            System.out.println(Arrays.toString(array)); 
            removingOddNumber(array);
        }
        private static void removingOddNumber(int[] array) {

            List<Integer> resArr = new ArrayList<Integer>();
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2 == 0){
                resArr.add(array[i]);
                }
            }
            System.out.println(resArr);
    } 
}
