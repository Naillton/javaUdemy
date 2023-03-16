public class Operacoes {
    public static void main(String[] args) {
        /*
          Operações Aritmeticas:
          Somar (+)
          Subtrair (-)
          Dividir (/)
          Multiplicar (*)
          Modulo (%)
        */

        int numero = 10;
        int segudoNumero = 5;
        int resultado;
        resultado = numero + segudoNumero;
        System.out.println("Soma = " + resultado);
        resultado = numero - segudoNumero;
        System.out.println("Subtracao = " + resultado);
        resultado = numero * segudoNumero;
        System.out.println("Multiplicacao = " + resultado);
        resultado = numero / segudoNumero;
        System.out.println("Divisao = " + resultado);
        resultado = numero % segudoNumero;
        System.out.println("Modulo = " + resultado);

        /*
          Operadores Relacionais:
          igual (==) retorna true se uma condicao for igual a outra se nao retorna false.
          maior (>) retorna true se uma condicao for maior que a outra se nao retorna false.
          menor (<) retorna true se uma condicao for menor que a outra se nao retorna false.
          maior que (>=) retorna true se uma condicao for maior ou igual que a outra se nao retorna false.
          menor que (<=) retorna true se uma condicao for menor ou igual que a outra se nao retorna false.

          Operadores Logicos:
          AND (&&) se as duas condicoes comparadas foram verdade retorna true se nao retorna false.
          OR (||) se ou menos uma das condicoes comparadas forem verdadeiras retorna true se nao retorna false.
        */

        int numberOne = 1;
        int numberTwo = 2;
        boolean resultadoBollean;
        resultadoBollean = numberOne == numberTwo;
        System.out.println("iguais = " + resultadoBollean);
        resultadoBollean = numberOne > numberTwo;
        System.out.println("Primeiro maior = " + resultadoBollean);
        resultadoBollean = numberOne < numberTwo;
        System.out.println("Primeiro menor = " + resultadoBollean);
        resultadoBollean = numberOne >= numberTwo;
        System.out.println("primeiro maior ou igual = " + resultadoBollean);
        resultadoBollean = numberOne <= numberTwo;
        System.out.println("Primeiro menor ou igual = " + resultadoBollean);
        resultadoBollean = true && true;
        System.out.println("primeira verdade e segunda verdade = " + resultadoBollean);
        resultadoBollean = true && false;
        System.out.println("So uma falsa e tudo fica falso " + resultadoBollean);
        resultadoBollean = true || true;
        System.out.println("Se uma for verdade ou a outra retorna true = " + resultadoBollean);
        resultadoBollean = false || true;
        System.out.println("So uma basta ser verdade e tudo sera verdade = " + resultadoBollean);
    }
}
