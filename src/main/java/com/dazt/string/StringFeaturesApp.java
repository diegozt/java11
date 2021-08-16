package com.dazt.string;

import java.util.stream.Collectors;

public class StringFeaturesApp {

    public void estaVacio(String texto) {
        System.out.println(texto.isBlank());
    }

    public void repetir(String texto, Integer cantidad) {
        var repetido = texto.repeat(cantidad);
        System.out.println(repetido);
    }

    public void convertirLista(String texto) {
        System.out.println(texto.lines().collect(Collectors.toList()));
    }

    public void removerEspacios(String texto) {
        System.out.println(texto.strip());
        System.out.println(texto.stripLeading());
        System.out.println(texto.stripTrailing());
        System.out.println(texto.trim());
    }

    public static void main(String[] args) {
        StringFeaturesApp app = new StringFeaturesApp();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("-----El metodo isBlank devuelve true or false de acuerdo a lo enviado-----");
        app.estaVacio("DIEGO ZAVALA");
        System.out.println("----El metodo repeat te itera un texto la cantidad de veces que indicas---");
        app.repetir("DIEGO ZAVALA ", 3);
        System.out.println("-------El metodo lines te convierte una cadena de texto a un arreglo------");
        app.convertirLista("D,I,E,G,O");
        System.out.println("-----Los metodos strip eliminan espacios en blanco dentro de una frase----");
        System.out.println("---Diferencia entre trim y strip es que trim no acepta caracteres raros---");

        app.removerEspacios("\n\t DIEGO ZAVALA \u2005");
    }
}
