import java.util.ArrayList;

public class RedeSocial {
  private String name;
  private ArrayList<Pessoa> users;

  public RedeSocial(String name) {
    this.name = name;
    this.users = new ArrayList<Pessoa>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Pessoa> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<Pessoa> users) {
    this.users = users;
  }

  public void showUsers() {
    System.out.println("Usuários:");

    for (Pessoa user : users) {
      System.out.println(user.getName());
    }
  }

}
