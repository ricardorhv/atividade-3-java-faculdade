import java.util.Scanner;

public class App {
    public static void executarAtividade1() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Pessoa pessoa2 = new Pessoa("Joao");
        pessoa1.addFriend(pessoa2);

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
    }

    public static void executarAtividade2() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Pessoa pessoa2 = new Pessoa("Joao");

        Relacionamento relacionamento1 = new Relacionamento("amigos", pessoa1, pessoa2);
        relacionamento1.removePersonFromRelationship(pessoa2);

        System.out.println(relacionamento1.toString());

        relacionamento1.addPersonToRelationship(new Pessoa("Júlia"));
        System.out.println(relacionamento1.toString());
    }

    public static void executarAtividade3() {
        No no1 = new No("7f9c2d1a-4e3b-4598-baee-3a1c2f9e4d6f");
        No no2 = new No("5a8d7f2b-9c4e-3b1f-ae2c-1f8a7d6c9b0d");
        No no3 = new No("d3e1b6f9-8c2a-4f7d-b5e6-0a1c9e8d7f2a");

        no1.addNoToConnection(no2);
        no1.addNoToConnection(no3);
        no1.showConnection();

        no2.showConnection();
    }

    public static void executarAtividade4() {
        PessoaFilho pessoa1 = new PessoaFilho("Ricardo");
        PessoaFilho pessoa2 = new PessoaFilho("Maite");

        pessoa1.addChild(pessoa2);

        pessoa1.showChildren();
        pessoa2.showChildren();

    }

    public static void executarAtividade5() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Pessoa pessoa2 = new Pessoa("Joao");
        Pessoa pessoa3 = new Pessoa("Guilherme");

        Propriedade propriedade = new Propriedade("Casa");
        propriedade.define(pessoa1, pessoa2);
        propriedade.verifyRelationshipBetweenPeople(pessoa2, pessoa3);
        propriedade.verifyRelationshipBetweenPeople(pessoa1, pessoa2);

        pessoa1.getProperty().show();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int escolha;

        System.out.println("1 - Atividade 1");
        System.out.println("2 - Atividade 2");
        System.out.println("3 - Atividade 3");
        System.out.println("4 - Atividade 4");
        System.out.println("5 - Atividade 5");
        System.out.println("6 - Atividade 6");
        System.out.println("7 - Atividade 7");
        System.out.println("8 - Atividade 8");
        System.out.print("Escolha qual atividade gostaria de visualizar: ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                executarAtividade1();
                break;
            case 2:
                executarAtividade2();
                break;
            case 3:
                executarAtividade3();
                break;
            case 4:
                executarAtividade4();
                break;
            case 5:
                executarAtividade5();
                break;
            // case 6:
            // executarAtividade6();
            // break;
            // case 7:
            // executarAtividade7();
            // break;

            default:
                break;
        }

        sc.close();
    }
}
