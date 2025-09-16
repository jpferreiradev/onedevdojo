package academy.devdojo.maratonajava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu<nome>, morando no endereço <endereço> confirmo que recebi o salário de <salário>, na data <data>
-> Só pra diferenciar ele colocou a frase dentro de uma variavel;

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "João Paulo";
        String endereco = "Rua Érico Alves";
        String dataRecebimentoSalario = "08/09/2025";
        double salario = 1800;

        System.out.println("Eu " + nome + " morando no endereço " + endereco + " confirmo que recebi o salário de R$ " + salario + ", na data " + dataRecebimentoSalario);
    }
}
