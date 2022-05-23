package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for(int current:arr){
            sum += current;
        }
        System.out.println("Summ: " + sum);

        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        int[] array1 = new int [2];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100_000 + 100_000);
        }
        System.out.print(array1);
        int max = array1[0];
        int min = array1[0];
        int avg = 0;

        for (int b = 0; b < array1.length; b++) {
            if (max < array1[b])
                max = array1[b];
            if (max > array1[b])
                min = array1[b];
            avg = avg + array1[b]/array1.length;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);
        System.out.println("\n");

        float c =0;
        float[] array;
        for (float sumS: array){
            c += sumS;
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(avg);

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }

        for (int i : arr){
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }

    }






}

}