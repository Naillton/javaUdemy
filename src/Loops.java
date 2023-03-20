public class Loops {
    public static void main (String[] args) {
        /* byte vezes = 1;
        while (vezes <= 10 ) {
            System.out.println("############");
            System.out.println(vezes + " Postagem");
            vezes++;
        } */
        /* for (int i = 0; i <= 10; i ++) {
            System.out.println("Indice numero " + i);
        } */

        //String[] postagens = {"Bom dia todos", "Logica é muito legal", "gosto muito de java"};
        int number = 0;
        /* while (number < postagens.length) {
            System.out.println(postagens[number]);
            number++;
        } */

        /* for(int i = 0; i < postagens.length; i ++) {
            System.out.println(postagens[i]);
        } */

        /* do {
            System.out.println(postagens[number]);
            number++;
        } while (number < postagens.length); */

        do {
            if ( number < 10) {
                System.out.println("O chevet corre muito a " + number + " KM/H");
            } else {
                System.out.println("Bateu o motor ja era o chevet");
            }
            number++;
        } while (number <= 10);
    }
}
