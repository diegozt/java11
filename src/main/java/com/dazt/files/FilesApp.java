package com.dazt.files;

public class FilesApp {

    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("--------El manejo de los files es mucho mas simple y menos verboso--------");
        System.out.println("-------------Esto aplica tanto para la lectura como escritura-------------");
        archivo.escribir();
        archivo.leer();
    }
}
