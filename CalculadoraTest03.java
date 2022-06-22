package academy.devdojo.maratonajava.javacore.test;

import academy.devdojo.maratonajava.javacore.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        double result  = calculadora.dividirDoisNumeros(0, 0);
            System.out.println(result);




    }
}
