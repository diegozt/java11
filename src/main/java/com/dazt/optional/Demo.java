package com.dazt.optional;

import java.util.Optional;

public class Demo {

    //JDK 11
    public void estaVacio(Persona p) {
        Optional<Persona> op = Optional.ofNullable(p);
        if(op.isEmpty()) {
            System.out.println("[Java11] Esta vacio");
        } else {
            System.out.println("[Java11] Esta lleno: " + op.get());
        }
    }

    //JDK 8
    public void estaPresente(Persona p) {
        Optional<Persona> op = Optional.ofNullable(p);
        if(!op.isPresent()) {
            System.out.println("[Java8] Esta vacio");
        } else {
            System.out.println("[Java8] Esta lleno: " + op.get());
        }
    }
}
