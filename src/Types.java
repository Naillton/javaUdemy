public class Types {
    public static void  main(String[] args) {
        /*
            Como java e uma linguagem fortemente tipada sempre que definirmos uma varivael
            ou constante temos que definir tambem o seu tipo, em java existem varios tipos de dados
            como por exemplo: String, int, char etc..., cada um desses tipos representa uma determinada
            combinacao de caracteres, numeros, numeros flutuantes ou um unico caractere.

            String -> cadeia de caracteres ou simplesmente um nome ou frase = "Nailton", "casa maravilhosa".
            char -> um unico caractere, uma letra = 'a', 'b'.
            byte -> numeros com precisao de -128 ate 127 = -4, -6, 5, 10.
            short -> numeros com precisao de -32768 ate 32767 = -900, 900, 1000.
            int -> numeros com precisao de -2bilhoes ate 2bilhoes = -200000, 2000000.
            long -> numeros com precisao extremamente grande = 4787463476L.
            float -> numeros flutuantes com precisao decinmal de 7 numeros apos o . = 1.678f.
            double -> numeros decimais com preciado de 15 a 16 casas apos o . = 1.123456789234567.
            boolean -> valores booleanos true ou false.
        */

        final String minhaVariavelString = "Minha varivel legal";
        char minhaVariavelChar = 'r';
        byte minhaVariavelByte = -128;
        short minhaVariavelShort = 12867;
        int minhaVariavelInt = 20000000;
        final long minhaVariavelLong = 38274278427L;
        float minhaVariavelFloat = 3.578f;
        double minhaVariavelDouble = 4.78487890;
        boolean minhaVariavelLogica = true;
    }
}
