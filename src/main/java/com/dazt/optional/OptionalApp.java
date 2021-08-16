package com.dazt.optional;

public class OptionalApp {
    public static void main(String[] args) {
        Demo d = new Demo();
        Persona per = new Persona(1, "Diego Zavala");
        System.out.println("---------------------------------OPTIONAL---------------------------------");
        System.out.println("------------------------------Objeto con data-----------------------------");
        System.out.println("--El metodo isEmpty vs isPresent de Java 11, se les envia un objeto lleno-");
        d.estaVacio(per);
        d.estaPresente(per);
        System.out.println("------------------------------Instancia vacia-----------------------------");
        per = new Persona();
        d.estaVacio(per);
        d.estaPresente(per);
        System.out.println("-------------------------------Instancia null------------------------------");
        d.estaVacio(null);
        d.estaPresente(null);
    }
}
