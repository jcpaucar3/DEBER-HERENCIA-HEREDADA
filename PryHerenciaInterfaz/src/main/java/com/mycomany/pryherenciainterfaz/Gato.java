package com.mycomany.pryherenciainterfaz;

public class Gato implements Mamifero {
    
    @Override
    public void hacerSonido(){
        System.out.println("El gato hace miau.");
    }
    
    @Override
    public void amamantar(){
        System.out.println("El gato amamanta a sus gatitos.");
    }
}
