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

    public static void executarAtividade6() {
        Pessoa participante1 = new Pessoa("Ricardo");
        Pessoa participante2 = new Pessoa("Júlia");
        Pessoa participante3 = new Pessoa("Guilherme");
        Pessoa participante4 = new Pessoa("Ana");
        Pessoa participante5 = new Pessoa("Luan");

        Evento festa = new Evento("Festa");
        festa.addParticipant(participante1);
        festa.addParticipant(participante2);
        festa.addParticipant(participante3);
        festa.addParticipant(participante4);
        festa.addParticipant(participante5);

        festa.removeParticipant(participante5);

        festa.showParticipants();
    }

    public static void executarAtividade7() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Pessoa pessoa2 = new Pessoa("Júlia");
        Pessoa pessoa3 = new Pessoa("Guilherme");
        Pessoa pessoa4 = new Pessoa("Henrique");
        Pessoa pessoa5 = new Pessoa("João");
        Pessoa pessoa6 = new Pessoa("Maria");

        RedeSocial redeSocial = new RedeSocial("Instagram");

        pessoa1.createAccountInSocialNetwork(redeSocial);
        pessoa2.createAccountInSocialNetwork(redeSocial);
        pessoa3.createAccountInSocialNetwork(redeSocial);
        pessoa4.createAccountInSocialNetwork(redeSocial);
        pessoa5.createAccountInSocialNetwork(redeSocial);
        pessoa6.createAccountInSocialNetwork(redeSocial);

        pessoa1.addFriendInSocialNetwork(pessoa2);
        pessoa1.addFriendInSocialNetwork(pessoa4);
        pessoa1.addFriendInSocialNetwork(pessoa5);
        pessoa1.addFriendInSocialNetwork(pessoa6);

        pessoa2.addFriendInSocialNetwork(pessoa3);

        pessoa4.addFriendInSocialNetwork(pessoa2);

        pessoa1.showMyFriendsInSocialNetwork();
        pessoa4.showMyFriendsInSocialNetwork();

        pessoa4.removeFriendInSocialNetwork(pessoa1);
        pessoa4.removeFriendInSocialNetwork(pessoa6);

        pessoa4.showMyFriendsInSocialNetwork();
        pessoa1.showMyFriendsInSocialNetwork();

        redeSocial.showUsers();
    }

    public static void executarAtividade8() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Pessoa pessoa2 = new Pessoa("Guilherme");
        Pessoa pessoa3 = new Pessoa("Rafael");
        Pessoa pessoa4 = new Pessoa("Henrique");

        Conexao conexao = new Conexao("Programeiros");
        conexao.addConnection(pessoa1);
        conexao.addConnection(pessoa2);
        conexao.addConnection(pessoa2);
        conexao.addConnection(pessoa3);
        conexao.addConnection(pessoa4);

        conexao.removeConnection(pessoa4);

        conexao.showFriendsConnection();
    }

    public static void executarAtividade9() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        Compra compra = new Compra(pessoa1);

        compra.addProduct("Arroz");
        compra.addProduct("Feijão");
        compra.addProduct("Chocolate");

        compra.removeProduct("Arroz");

        compra.showProductListInfo();
    }

    public static void executarAtividade10() {
        Pessoa pessoa1 = new Pessoa("Ricardo");
        ContaBancaria contaBancaria = new ContaBancaria(pessoa1);

        contaBancaria.deposit(1000);
        contaBancaria.withdraw(500);
        contaBancaria.withdraw(600);
        contaBancaria.deposit(200);

        contaBancaria.showBalance();
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
        System.out.println("9 - Atividade 9");
        System.out.println("10 - Atividade 10");
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
            case 6:
                executarAtividade6();
                break;
            case 7:
                executarAtividade7();
                break;
            case 8:
                executarAtividade8();
                break;
            case 9:
                executarAtividade9();
                break;
            case 10:
                executarAtividade10();
                break;

            default:
                break;
        }

        sc.close();
    }
}
