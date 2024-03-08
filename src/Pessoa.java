import java.util.ArrayList;

public class Pessoa {
  private String name;
  private ArrayList<Pessoa> friends;
  private Relacionamento relationship;
  private Propriedade property;
  private Evento event;

  private RedeSocial socialNetwork;
  private ArrayList<Pessoa> socialNetworkFriends;

  public Pessoa(String name) {
    this.name = name;
    this.friends = new ArrayList<Pessoa>();
    this.socialNetworkFriends = new ArrayList<Pessoa>();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void addFriend(Pessoa person) {
    this.friends.add(person);
    person.friends.add(this);
  }

  public void createAccountInSocialNetwork(RedeSocial socialNetwork) {
    this.socialNetwork = socialNetwork;
    this.socialNetwork.getUsers().add(this);
    System.out.println(this.name + " criou uma conta na rede social " + socialNetwork.getName());
  }

  public void addFriendInSocialNetwork(Pessoa person) {
    if (person.socialNetwork == null) {
      System.out.println("Esta pessoa não possui uma conta nessa rede social!");
    } else if (this.socialNetwork == null) {
      System.out.println("Você não possui uma conta nessa rede social!");
    } else {
      this.socialNetworkFriends.add(person);
      person.socialNetworkFriends.add(this);
      System.out.println(this.name + " adicionou " + person.getName());
    }
  }

  public void removeFriendInSocialNetwork(Pessoa person) {
    boolean hasThisPersonAsFriend = this.socialNetworkFriends.remove(person)
        && person.getSocialNetworkFriends().remove(this);

    if (hasThisPersonAsFriend) {
      System.out.println(this.name + " removeu " + person.getName());
    } else {
      System.out.println("Você não possui essa pessoa como amigo!");
    }
  }

  public void showMyFriendsInSocialNetwork() {
    System.out.println(this.name + " seus amigos são:");

    for (Pessoa friend : socialNetworkFriends) {
      if (friend.getSocialNetworkFriends().contains(this)) {
        System.out.println(friend.name);
      }
    }
  }

  public Relacionamento getRelationship() {
    return relationship;
  }

  public void setRelationship(Relacionamento relationship) {
    this.relationship = relationship;
  }

  public Propriedade getProperty() {
    return property;
  }

  public void setProperty(Propriedade property) {
    this.property = property;
  }

  public Evento getEvent() {
    return event;
  }

  public void setEvent(Evento event) {
    this.event = event;
  }

  public RedeSocial getSocialNetwork() {
    return socialNetwork;
  }

  public void setSocialNetwork(RedeSocial socialNetwork) {
    this.socialNetwork = socialNetwork;
  }

  public ArrayList<Pessoa> getSocialNetworkFriends() {
    return socialNetworkFriends;
  }

  public void setSocialNetworkFriends(ArrayList<Pessoa> socialNetworkFriends) {
    this.socialNetworkFriends = socialNetworkFriends;
  }

  @Override
  public String toString() {
    String friendsMessage = "";

    for (Pessoa friend : friends) {
      friendsMessage += friend.name + ", ";
    }

    return "Pessoa [name=" + name + ", friends=" + friendsMessage + " ]";
  }

}
