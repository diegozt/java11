package com.dazt.lambda;

public class LambdaApp {
    public static void main(String[] args) {
        Lambda lambda = new Lambda();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------En el metodo se puede observar el uso de var en las lambda--------");
        lambda.probar("PAR");
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------En el metodo se puede observar el uso de var en las lambda--------");
        lambda.sumar();

    }
}
