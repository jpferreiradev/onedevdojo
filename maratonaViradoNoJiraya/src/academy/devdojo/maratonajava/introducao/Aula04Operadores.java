package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula04Operadores {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero01 = 10;
        int numero02 = 20;

        System.out.println(numero01 - numero02); // -
        System.out.println(numero01 + numero02); // +
        System.out.println(numero01 * numero02); // *
        System.out.println(numero01 / numero02); // /
        System.out.println(numero01+numero02+"Valor"+numero01+numero02);

        // Operador de resto

        int resto = 2 % 10;
        System.out.println("Resto da divisão: " + resto);

        //Operadores lógicos < > / >= <= / != / ==
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualQueVinte = 10 == 20;
        boolean isDezIgualDesz = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte -> " +isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte -> " +isDezMenorQueVinte);
        System.out.println("isDezIgualQueVinte -> " +isDezIgualQueVinte);
        System.out.println("isDezIgualAVinte -> " +isDezIgualDesz);
        System.out.println("isDezMenorDiferenteVinte -> " +isDezDiferenteDez);

        // Operadores lógicos -> && (AND) / || (or/ ou) // (!) Negação

        System.out.println();
        int idade = 29;
        float salario = 3.500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >=  30 && salario >= 4.612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario <= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta -> " +  isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta -> " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel );

        System.out.println();
        // Operadores de atribuição -> = / += / -+ / /=
        double bonus = 1800; //1800
        //bonus = bonus + 1000;
        bonus += 1000; // <- Organizar melhor o código
        bonus -= 1000; //1800
        bonus *= 2;
        bonus /= 2;
        System.out.println(bonus);

        System.out.println();
        // Operadores unarios
        int contador = 0;
        contador += 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(contador2++);
        System.out.println(contador2);



    }
}

/*
 System.out.print("Par: ");
        int par = scan.nextInt();
        System.out.print("Impar: ");
        int impar = scan.nextInt();

        if(par % impar == 0){
            System.out.println("Numero par");
        } else{
            System.out.println("Numero impar");
        }
 */