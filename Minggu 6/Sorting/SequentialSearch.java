/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author hp
 */
public class SequentialSearch {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] exampleVariableOne = {2, 9, 6, 7, 4, 5, 3, 0, 1};
        int target = 4;
        sequentialSearch(exampleVariableOne,target);
    }
    public static void sequentialSearch(int[] parameterOne, int parameterTwo) {
        int index = -1;
        //searches each index of the array until it reaches the last index
        for (int i = 0; i < parameterOne.length; i++) {
            if (parameterOne[i] == parameterTwo) {
                //if the target is found, int index is set the value of i and
                //the for loop is terminated
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Your target integer does not exist int the array");
        } else {
            System.out.println("Yout target integer is in index " + index + " of the array");
        }
    }
}
