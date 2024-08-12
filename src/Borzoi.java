public class Borzoi {
    public String cor;
    public int alturaCm;
    public int felicidade = 0;
    public String nome;
    public boolean preso = false;

    public Borzoi(String nome, String cor, int alturaCm) {
        this.alturaCm = alturaCm;
        this.cor = cor;
        this.alturaCm = alturaCm;
    }


    public void brincar(){
        System.out.println("A felicidade do cachorro é: "+ felicidade + "/10");
        felicidade ++;
        System.out.println("Voce brincou com ele e a felicidade dele aumentou para: "+ felicidade + "/10");
        if (felicidade >= 10){
            felicidade = 10;
            System.out.println("O cachorro está muito feliz!");
        }
    }
    public void farejar(){
        System.out.println("O cachorro com seu longo focinho sentiu cheiro de comida!");

    }
    public void prender(){
        System.out.println("Voce prendeu seu amigo focinhudo e ele nao gostou muito!");
        preso = true;
    }
    public void soltar(){
        System.out.println("Voce soltou seu borzoi e agora ele pensa em como vai fugir");
        preso = false;
    }
    public void latir(){
        System.out.println("AU AU AU");
    }
}
