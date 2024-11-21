package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
        int num = 9;
        whileLoop(num);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.

    public static void whileLoop(int num) {
        int i = 0;
        while(i < num){
            System.out.println(i + " < "+ num + ". El próximo ciclo valdrá: " + (i+1));
            System.out.println((i+1) + " < "+ num + ". El próximo ciclo valdrá: " + (i+2));
            i++;
        }
    }
}