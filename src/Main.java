import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do cachorro");
        String nome = sc.nextLine();
        System.out.println("Digite a cor do cachorro");
        String cor = sc.nextLine();
        System.out.println("Digite a altura do cachorro em cm");
        int alturaCm = Integer.parseInt(sc.nextLine());


        Borzoi borzoi1 = new Borzoi(nome, cor, alturaCm);
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.brincar();
        borzoi1.farejar();
        borzoi1.latir();
        borzoi1.prender();
        borzoi1.soltar();
        System.out.println("O cachorro se chama "+ borzoi1.nome + " ele é da cor "+ borzoi1.cor+", tem "+ borzoi1.alturaCm+"cm de altura e está "+ borzoi1.felicidade+ "/10 feliz!");

        Borzoi borzoi2 = new Borzoi("bolo", "preto", 75);
        borzoi2.brincar();
        borzoi2.latir();
        borzoi2.farejar();
        borzoi2.prender();
        borzoi2.soltar();
        System.out.println("O cachorro se chama "+ borzoi2.nome + " ele é da cor "+borzoi2.cor+", tem "+borzoi2.alturaCm+"cm de altura e está "+ borzoi2.felicidade+ "/10 feliz!");
    }
}