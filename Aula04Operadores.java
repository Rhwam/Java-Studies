package DevDojo.Iniciando;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores aritméticos(+ * / - %)
        // Operadores lógicos (< > <= >= != ==)
        int num1 = 10;
        int num2 = 20;

        var divisao = num2 / num1;
        var multiplicacao = num1 * num2;
        var soma = num1 + num2;
        var resto = num1 % num2;

//        System.out.println("Alou" + num1+num2);
//        System.out.println(num1+num2+"Alouu");

        System.out.println("Os valores são: " + num1 + " e " + num2 + ". Os resultados estão abaixo: \n");
        System.out.println("Divisão: " + divisao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Soma: " + soma);
        System.out.println("Resto: " + resto);
    }
}
