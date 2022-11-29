package com.psdmx;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int number = 20;
        System.out.println("El número entero "+ number + " en binario es: " + NumberToBinary(number));
    }

    public static String NumberToBinary(int number) {
        return Integer.toBinaryString(number);
    }
}
