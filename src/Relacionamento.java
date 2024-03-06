public class Relacionamento {
  private String type;
  private Pessoa person1;
  private Pessoa person2;

  public Relacionamento(String type, Pessoa person1, Pessoa person2) {
    this.type = type;
    this.person1 = person1;
    this.person2 = person2;

    this.person1.setRelationship(this);
    this.person2.setRelationship(this);
  }

  public void addPersonToRelationship(Pessoa person) {
    if (person2 == null) {
      this.person2 = person;
      this.person2.setRelationship(this);
    } else if (person1 == null) {
      this.person1 = person;
      this.person1.setRelationship(this);
    } else {
      System.out.println(
          "A pessoa " + person.getName() + " já tem um relacionamento com outra pessoa. Remova para poder adicionar");
    }
  }

  public void removePersonFromRelationship(Pessoa person) {
    if (person == person1) {
      this.person1 = null;
    } else if (person == person2) {
      this.person2 = null;
    }
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Pessoa getPerson1() {
    return person1;
  }

  public void setPerson1(Pessoa person1) {
    this.person1 = person1;
  }

  public Pessoa getPerson2() {
    return person2;
  }

  public void setPerson2(Pessoa person2) {
    this.person2 = person2;
  }

  @Override
  public String toString() {
    if (this.person1 == null) {
      return "A pessoa " + this.person2.getName() + " não tem um relacionamento com ninguém";
    } else if (this.person2 == null) {
      return "A pessoa " + this.person1.getName() + " não tem um relacionamento com ninguém";
    }

    return "A pessoa " + this.person1.getName() + " tem um relacionamento com a pessoa "
        + this.person2.getName();
  }

}
