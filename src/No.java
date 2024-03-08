import java.util.ArrayList;

public class No {
  private String id;
  private ArrayList<No> connection;

  public No(String id) {
    this.id = id;
    this.connection = new ArrayList<No>();
  }

  public void addNoToConnection(No no) {
    connection.add(no);
    no.connection.add(this);
  }

  public void showConnection() {
    System.out.println("Conexões do Nó " + this.id);

    for (No no : connection) {
      System.out.println(no.id);
    }
  }
}
