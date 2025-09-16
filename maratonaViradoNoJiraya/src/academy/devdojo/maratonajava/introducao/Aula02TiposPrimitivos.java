package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {

        // int, double,float, char, byte,  short, long, boolean
        int idade = (int) 100000000000L;
        double salarioDouble = 1500;
        float salarioFloat = 1200.0F;
        byte valorMemoria = 127;
        short valor = 32000;
        long valorMaior = 908978675644231L;
        boolean verdadeiro = true; // pode ser falso
        char caractere = 74;

        var nome2 = "Vegetta";
        String nome = "GOKU";


        System.out.println("A idade é: " + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("Caracterer: " + caractere);
        System.out.println(idade);
        System.out.println("Oi meu nome é " + nome);


    }
}
