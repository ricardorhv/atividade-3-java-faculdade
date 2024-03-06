import java.util.ArrayList;

public class Pessoa {
  private String name;
  private ArrayList<Pessoa> friends;

  public Pessoa(String name) {
    this.name = name;
    this.friends = new ArrayList<Pessoa>();
  }

  public void addFriend(Pessoa pessoa) {
    this.friends.add(pessoa);
    pessoa.friends.add(this);
  }

  @Override
  public String toString() {
    String friendsMessage = "";

    for (Pessoa friend : friends) {
      friendsMessage += friend.name + ", ";
    }

    return "Pessoa [name=" + name + ", friends=" + friendsMessage + "]";
  }

}
