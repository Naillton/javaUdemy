public class SwitchCase {
    public static void main(String[] args) {
        /*
            Semelhante ao IF o switch é mais uma condição de casos
            switch (valor) {
              case sejaEsse:
                break;
              default:
            }
        */
        byte escolha = 10;
        switch(escolha) {
            case 1:
                System.out.println("Voce escolheu vizualizar o seu saldo");
                break;
            case 2:
                System.out.println("Voce escolheu atualizar seus creditos");
                break;
            default:
                System.out.println("Voce escolheu falar com a atendente");
        }

        byte nota = 11;
        switch (nota) {
            case 7:
                System.out.println("Nota regular");
                break;
            case 8:
                System.out.println("Nota boa");
                break;
            case 9:
            case 10:
                System.out.println("Nota excelente");
                break;
            default:
                System.out.println("Nota ruim precisa melhorar");
        }
    }
}
