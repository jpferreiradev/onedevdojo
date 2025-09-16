package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // ! Operador de negação

        if (isAutorizadoComprarBebida != false) {
            System.out.println(" Autorizado a comprova bebida alcólica");
        } else {
            System.out.println(" Não Autorizado a comprova bebida alcólica");
        }


        if (!isAutorizadoComprarBebida) { // Negação
            System.out.println(" Não Autorizado a comprova bebida alcólica");
        }

        // Caso de certificação
        boolean c = false;

        if (c == true) { // Associação = / == comparação, nesse exemplo é mostrado que o if sempre vai ser executado quando for true;
            System.out.println("Dento de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if");

    }


}
