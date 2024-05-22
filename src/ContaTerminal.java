import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //TODO: Adicionado a classe Scanner
        Scanner sc = new Scanner(System.in);

        //TODO: Criando os atributos
        int number;
        String agency;
        String customerName;
        double balance;

        //TODO: entrada de dados
        System.out.println("Obrigado por escolher a gente para criarmos uma conta para você!");
        System.out.println();

        System.out.print("Por favor, digite o número da Agência : ");
        number = sc.nextInt();

        System.out.print("Digite o nome da Agência : ");
        agency = sc.next();

        System.out.print("Por favor, digite seu Nome : ");
        customerName = sc.next();

        System.out.print("Digite seu saldo inicial : ");
        balance = sc.nextDouble();

        System.out.println("Olá " + customerName
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agency + ", conta " + number + ", e seu saldo de " + balance + " já está disponível para saque!");
    }
}