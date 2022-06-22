package academy.devdojo.maratonajava.javacore.dominio;

public class Calculadora {

    public void somaDoisNumeros() {
        System.out.println(10 + 10);

    }
    public void diminuiDoisNumeros() {
        System.out.println(21 - 2);
    }
    public  void multiplicarDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }
    public double dividirDoisNumeros (double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;


    }
}
