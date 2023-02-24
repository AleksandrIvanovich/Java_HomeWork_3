/*
 * 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.
 */

 package HW_3;

 import java.util.Arrays;
 import java.util.Random;
 import java.util.Scanner;
 
 public class Task_2 {
     public static void main(String[] args) {
 
         Scanner userInput  = new Scanner(System.in); 
         System.out.print("Введите число (длина массива): ");
         int numLen= userInput.nextInt();
         System.out.print("Введите число (максимальное число в массиве): ");
         int numMax = userInput.nextInt();
        
         Random ran = new Random();
         int[] array = new int[numLen];
         for (int i = 0; i < array.length; i++) {
         array[i] = ran.nextInt(numMax);
         }
 
         System.out.println(Arrays.toString(array)); 
         findMaxMinNum(array, numMax);
         arithmeticMean(array);
     }
 
     private static void findMaxMinNum(int[] arr, int args){
         int max = 0;
         int min = args;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i] > max){
                 max = arr[i];
             }
         if (arr[i] < min){
              min = arr[i];
         }    
         }
         System.out.println("Max = " + max);  
         System.out.println("Min = " + min);  
     }    
 
 private static void arithmeticMean(int[] array) {
     int count = 0;
     double summ = 0;
     double arifMean;
     for (int i = 0; i < array.length; i++) {
     summ = summ + array[i]; 
     count ++;
     }
     arifMean = summ / count;
     System.out.println("Сумма = " + summ);
     System.out.println("Количество = " + count);
     
     System.out.println("Среднее арифметическое = " + arifMean);
 }
 }
