package com.mycomany.pryherenciainterfaz;

public class Perro implements Mamifero {
    
    @Override
    public void hacerSonido(){
        System.out.println("El perro hace guau.");
    }
    
    @Override
    public void amamantar(){
        System.out.println("El perro amamanta a sus cachorros.");
    }
}
