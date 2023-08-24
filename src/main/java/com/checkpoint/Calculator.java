package com.checkpoint;

public class Calculator {

    public static void main(String[] args){

        System.out.println("Build in Docker succesful");

    }
    
    public static float addition(float N1, float N2){
        
        return N1 + N2;

    }

    public static float substraction(float N1, float N2){
        
        return N1 - N2;

    }

    public static float multiplication(float N1, float N2){
        
        return N1 * N2;

    }
    public static float division(float N1, float N2){
        
        if (N2 == 0){
            System.out.println("Valor del divisor incongruente");
            return -1;
        }
        return N1 / N2;

    }

}