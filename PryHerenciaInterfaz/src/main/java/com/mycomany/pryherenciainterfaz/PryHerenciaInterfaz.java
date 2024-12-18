package com.mycomany.pryherenciainterfaz;
public class PryHerenciaInterfaz {

    public static void main(String[] args) {
      
        Mamifero miPerro = new Perro();
        Mamifero miGato = new Gato();
        
        System.out.println("Perro: ");
        miPerro.hacerSonido();
        miPerro.amamantar();
        
        System.out.println("Gato: ");
        miGato.hacerSonido();
        miGato.amamantar();
        
    }
}
