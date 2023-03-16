public class Condicional {
    public static void main(String[]  args) {
        int idade = 40;
        if ( idade < 12 ) {
            System.out.println("Voce é uma criança");
        } else if(idade >= 12 && idade < 18) {
            System.out.println("Voce é um adolescente");
        } else {
            System.out.println("Bem vindo a fase adulta");
        }
    }
}
