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

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int escolha;

        System.out.println("1 - Atividade 1");
        System.out.println("2 - Atividade 2");
        System.out.println("1 - Atividade 1");
        System.out.println("1 - Atividade 1");
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
                executarAtividade1();
                break;
            case 4:
                executarAtividade1();
                break;

            default:
                break;
        }

        sc.close();
    }
}
