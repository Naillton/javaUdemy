import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        String name = sc.nextLine();
        System.out.println("Informe sua Idade: ");
        String age = sc.nextLine();
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }
}