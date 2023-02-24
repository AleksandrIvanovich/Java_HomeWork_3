/*
 * 1. Пусть дан произвольный список целых чисел, удалить из него четные числа 
 * (в языке уже есть что-то готовое для этого)
 */
package HW_3;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Task2_2 {
    public static void main(String[] args) {

            Scanner userInput  = new Scanner(System.in); 
            System.out.print("Введите число (длина массива): ");
            int numLen= userInput.nextInt();
            System.out.print("Введите число (максимальное число массива): ");
            int numMax = userInput.nextInt();

            Random ran = new Random();
            List<Integer> array = new ArrayList<Integer>(numLen);
            
            for (int i = 0; i < numLen; i++) {
                array.add(ran.nextInt(numMax));
            }
            System.out.println(array);


            for (int i = 0; i < array.size(); i++) {
                if (array.get(i)%2 != 0){
                array.remove(i);
                }
            }
            System.out.println(array);

    } 
}