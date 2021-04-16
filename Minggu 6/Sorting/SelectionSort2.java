/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;
import java.util.*;
public class SelectionSort2 {
//method that implements selectionsort
    public static void selsort(int[] arr) {
        int a = arr.length; //length of the array
        for (int i = 0; i < a; i++) {
            int min = i; //set the first position as minimum
            System.out.println("Iterasi "+(i+1));
            //find the smallest element by comparing with the element in min position
            for (int j = i+1; j < a; j++) {
                System.out.println("Bandingkan "+ arr[min] +" dengan " +arr[j]);
                if (arr[j] < arr[min]) {
                    System.out.println(arr[min] + " lebih besar dari " + arr[j]);
                    min = j;
                } 
            }
            //swap the smallest element with the element in min posisiton
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,60,35,2,45,320,5}; //input array
        System.out.println("Elemen sebelum selection sort: " +
                Arrays.toString(arr));
        selsort(arr); //calling the selection sort method
        System.out.println("Element setelah selection sort: " +
                Arrays.toString(arr));
    }
    
}
