import java.util.ArrayList;

public class Pessoa {
  private String name;
  private ArrayList<Pessoa> friends;
  private Relacionamento relationship;
  private Propriedade property;
  private Evento event;

  public Pessoa(String name) {
    this.name = name;
    this.friends = new ArrayList<Pessoa>();
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

  @Override
  public String toString() {
    String friendsMessage = "";

    for (Pessoa friend : friends) {
      friendsMessage += friend.name + ", ";
    }

    return "Pessoa [name=" + name + ", friends=" + friendsMessage + " ]";
  }

}
