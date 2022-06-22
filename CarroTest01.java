package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Celta";
        carro.modelo = "hatch";
        carro.ano = 2012;

        System.out.println("Carro " + carro.nome + " Modelo " + carro.modelo + " Ano " + carro.ano);

        carro2.nome = "hb20";
        carro2.modelo ="hatch";
        carro2.ano = 2017;

        System.out.println("Carro " + carro2.nome + " Modelo " + carro2.modelo + " Ano " + carro2.ano);


    }
}
