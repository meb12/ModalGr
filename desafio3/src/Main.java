import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SIMULADOR DE EMPRÉSTIMO!");

        System.out.println("Nome do colaborador:");
        String nome = scanner.nextLine();

        System.out.println("Data de admissão:");
        int data = scanner.nextInt();

        System.out.println("Salário atual:");
        double salario = scanner.nextDouble();

        System.out.println("Valor desejado de empréstimo:");
        double valorEmprestimo = scanner.nextDouble();

        while (valorEmprestimo % 2 != 0) {
            System.out.println("Insira um valor válido!");
            System.out.println("Valor desejado de empréstimo:");
            valorEmprestimo = scanner.nextDouble();
        }
        Emprestimo emprestimo = new Emprestimo(nome, data, salario, valorEmprestimo);

        if (emprestimo.getAnoAdmissao() > 5) {
            if (emprestimo.getValorEmprestimo() == emprestimo.salarioAtual ||
                    emprestimo.getValorEmprestimo() <= 2 * emprestimo.getSalarioAtual()) {

                int op;


                    System.out.println("\nOpções:");
                    System.out.println("1- Notas de maior valor");
                    System.out.println("2- Notas de menor valor");
                    System.out.println("3- Notas meio a meio");
                    System.out.println("Digite a opção desejada:");
                    op = scanner.nextInt();

                    switch (op) {
                        case 1: {
                            int nota100 = (int) (emprestimo.getValorEmprestimo() / 100);
                            int nota50 = (int) ((emprestimo.getValorEmprestimo() % 100 / 50));

                            int restante = (int) (emprestimo.getValorEmprestimo() % 50);
                            int nota20 = restante / 20;
                            int nota10 = (restante % 20) / 10;
                            int nota5 = (restante % 10) / 5;
                            int nota2 = (restante % 5) / 2;

                            System.out.println("\nValor: " + emprestimo.getValorEmprestimo());
                            if (nota100 != 0) {
                                System.out.println(nota100 + " X 100 reais");
                            }
                            if (nota50 != 0) {
                                System.out.println(nota50 + " X 50 reais");
                            }
                            if (nota20 != 0) {
                                System.out.println(nota20 + " X 20 reais");
                            }
                            if (nota10 != 0) {
                                System.out.println(nota10 + " X 10 reais");
                            }
                            if (nota5 != 0) {
                                System.out.println(nota5 + " X 5 reais");
                            }
                            if (nota2 != 0) {
                                System.out.println(nota2 + " X 2 reais");
                            }
                            break;
                        }
                        case 2: {
                            int nota20 = (int) (emprestimo.getValorEmprestimo() / 20);
                            int nota10 = (int) ((emprestimo.getValorEmprestimo() % 20 / 10));
                            int nota5 = (int) ((emprestimo.getValorEmprestimo() % 10 / 5));
                            int nota2 = (int) ((emprestimo.getValorEmprestimo() % 5) / 2);

                            System.out.println("\nValor: " + emprestimo.getValorEmprestimo());
                            if (nota20 != 0) {
                                System.out.println(nota20 + " X 20 reais");
                            }
                            if (nota10 != 0) {
                                System.out.println(nota10 + " X 10 reais");
                            }
                            if (nota5 != 0) {
                                System.out.println(nota5 + " X 5 reais");
                            }
                            if (nota2 != 0) {
                                System.out.println(nota2 + " X 2 reais");
                            }
                            break;
                        }
                        case 3: {
                            int maiorValor = (int) (emprestimo.getValorEmprestimo() / 2);
                            int menorValor = (int) (emprestimo.getValorEmprestimo() / 2);

                            int nota100 = maiorValor / 100;
                            int nota50 = (maiorValor % 100) / 50;
                            int restante = maiorValor % 50;
                            int nota20 = restante / 20;
                            int nota10 = (restante % 20) / 10;
                            int nota5 = (restante % 10) / 5;
                            int nota2 = (restante % 5) / 2;

                            System.out.println("\nValor: " + emprestimo.getValorEmprestimo());
                            System.out.println("Notas meio a meio");
                            System.out.println("Maiores valores: " + maiorValor);
                            if (nota100 != 0) {
                                System.out.println(nota100 + " X 100 reais");
                            }
                            if (nota50 != 0) {
                                System.out.println(nota50 + " X 50 reais");
                            }
                            if (nota20 != 0) {
                                System.out.println(nota20 + " X 20 reais");
                            }
                            if (nota10 != 0) {
                                System.out.println(nota10 + " X 10 reais");
                            }
                            if (nota5 != 0) {
                                System.out.println(nota5 + " X 5 reais");
                            }
                            if (nota2 != 0) {
                                System.out.println(nota2 + " X 2 reais");
                            }

                            nota20 = menorValor / 20;
                            nota10 = (menorValor % 20) / 10;
                            nota5 = (menorValor % 10) / 5;
                            nota2 = (menorValor % 5) / 2;

                            System.out.println("Menores valores: " + menorValor);

                            if (nota20 != 0) {
                                System.out.println(nota20 + " X 20 reais");
                            }
                            if (nota10 != 0) {
                                System.out.println(nota10 + " X 10 reais");
                            }
                            if (nota5 != 0) {
                                System.out.println(nota5 + " X 5 reais");
                            }
                            if (nota2 != 0) {
                                System.out.println(nota2 + " X 2 reais");
                            }
                            break;

                        }
                        default:
                            System.out.println("Opção inválida!");

                    }
            } else {
                System.out.println("Agradecemos seu interesse, mas você não atende os requisitos mínimos do programa!");
            }
        }
        else{
            System.out.println("Agradecemos seu interesse, mas você não atende os requisitos mínimos do programa!");
        }
    }
}



