package Ex1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        ArrayList<ContaCorrente> contasCorrentesList = new ArrayList<>();
        ArrayList<ContaPoupanca> contasPoupancasList = new ArrayList<>();
        ArrayList<ContaSalario> contasSalariosList = new ArrayList<>();

        int option = 0;
        String numero;
        String agencia;
        double saldo;

        double rentabilidade;
        double cheque;
        int cpf;

        int confirmar;

        System.out.printf("SISTEMA DE CADASTRO DE CONTA \n" +
                "Escolha qual tipo de conta você deseja:\n\n" +
                "1) Conta corrente\n" +
                "2) Conta poupança\n" +
                "3) Conta salário\n\n");
        System.out.printf("Digite uma opção => ");

        option = ler.nextInt();

        if (option == 1) {

            do {

                ContaCorrente cc = new ContaCorrente();

                System.out.printf("Digite sua agencia => ");
                agencia = ler.next();
                cc.setAgencia(agencia);

                System.out.printf("Digite seu número => ");
                numero = ler.next();
                cc.setNumero(numero);

                System.out.printf("Digite o valor que deseja depositar => ");
                saldo = ler.nextDouble();
                cc.setSaldo(saldo);

                System.out.printf("Digite o limite do seu cheque => ");
                cheque = ler.nextDouble();
                cc.setChequeEspecial(chequeEspecial);

                System.out.printf("As informações estão certas?\n\n" +
                        "0 - REFAZER\n" +
                        "1 - CONFIRMAR\n\n");
                System.out.printf("Responda => ");

                confirmar = ler.nextInt();

                contasCorrentesList.add(cc);

                System.out.printf("Conta corrente foi criada com sucesso");
                System.in.read();

            } while (confirmar != 0);

        } else if (option == 2) {

            do {

                ContaPoupanca cp = new ContaPoupanca();

                System.out.printf("Digite sua agencia => ");
                agencia = ler.next();
                cc.setAgencia(agencia);

                System.out.printf("Digite seu número => ");
                numero = ler.next();
                cc.setNumero(numero);

                System.out.printf("Digite o valor que deseja depositar => ");
                saldo = ler.nextDouble();
                cc.setSaldo(saldo);

                System.out.printf("Digite o valor da taxa de rentabilidade desejada para sua conta => ");
                rentabilidade = ler.nextDouble();
                cp.setRentabilidade(rentabilidade);

                System.out.printf("As informações estão certas?\n\n" +
                        "0 - REFAZER\n" +
                        "1 - CONFIRMAR\n\n");
                System.out.printf("Responda => ");

                confirmar = ler.nextInt();

                contasPoupancasList.add(cp);

                System.out.printf("Conta poupança foi criada com sucesso");
                System.in.read();

            } while (confirmar != 0);
        } else if (option == 3) {

            do {

                ContaSalario cs = new ContaSalario();

                System.out.printf("Digite sua agencia => ");
                agencia = ler.next();
                cc.setAgencia(agencia);

                System.out.printf("Digite seu número => ");
                numero = ler.next();
                cc.setNumero(numero);

                System.out.printf("Digite o valor que deseja depositar => ");
                saldo = ler.nextDouble();
                cc.setSaldo(saldo);

                System.out.printf("Digite o valor da taxa de rentabilidade desejada para sua conta => ");
                rentabilidade = ler.nextDouble();
                cp.setRentabilidade(cpf);

                System.out.printf("As informações estão corretas?\n\n" +
                        "0 - REFAZER\n" +
                        "1 - CONFIRMAR\n\n");
                System.out.printf("Responda => ");

                confirmar = ler.nextInt();

                contasSalariosList.add(cs);

                System.out.printf("Conta corrente foi criada com sucesso");
                System.in.read();

            } while (confirmar != 0);

        } else {

            System.out.printf("Escolha um número de 0 a 5");

        }

        ler.close();

    }
}
