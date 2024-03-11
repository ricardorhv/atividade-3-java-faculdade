import java.util.ArrayList;

public class Conexao {
  private String connectionName;
  private ArrayList<Pessoa> friends;

  public Conexao(String connectionName) {
    this.connectionName = connectionName;
    this.friends = new ArrayList<Pessoa>();
  }

  public String getConnectionName() {
    return connectionName;
  }

  public void setConnectionName(String connectionName) {
    this.connectionName = connectionName;
  }

  public ArrayList<Pessoa> getFriends() {
    return friends;
  }

  public void setFriends(ArrayList<Pessoa> friends) {
    this.friends = friends;
  }

  public void addConnection(Pessoa newFriend) {
    boolean isAlreadyInThisConnection = this.friends.contains(newFriend);

    if (isAlreadyInThisConnection) {
      System.out.println("Essa pessoa já esta na conexão de amigos!");
    } else {
      this.friends.add(newFriend);
      newFriend.getConnections().add(this);
      System.out.println(newFriend.getName() + " foi adicionado na conexão de amigos!");
    }
  }

  public void removeConnection(Pessoa friendToBeRemoved) {
    boolean isFriendInThisConnection = this.friends.contains(friendToBeRemoved);

    if (isFriendInThisConnection) {
      this.friends.remove(friendToBeRemoved);
      friendToBeRemoved.getConnections().remove(this);
      System.out.println(friendToBeRemoved.getName() + " foi removido desta conexão de amigos");
    } else {
      System.out.println("Essa pessoa não faz parte desta conexão de amigos!");
    }
  }

  public void showFriendsConnection() {
    System.out.println("Lista de amigos dentro da conexão " + this.connectionName + ":");

    for (Pessoa friend : friends) {
      System.out.println(friend.getName());
    }
  }
}
