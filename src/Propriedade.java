class Propriedade {
  private Pessoa owner;
  private Pessoa oldOwner;
  private String propertyname;

  public Propriedade(String propertyname) {
    this.propertyname = propertyname;
  }

  public void define(Pessoa owner, Pessoa oldOwner) {
    this.owner = owner;
    this.oldOwner = oldOwner;
    this.owner.setProperty(this);
  }

  public void verifyRelationshipBetweenPeople(Pessoa owner, Pessoa oldOwner) {
    if (this.owner == owner && this.oldOwner == oldOwner) {
      System.out.println("A propriedade " + this.propertyname + " pertence a essas duas pessoas");
    } else {
      System.out.println("A propriedade " + this.propertyname + " não pertence a essas pessoas.");
    }
  }

  public void show() {
    System.out.println(this.owner.getName() + " possui a propriedade da pessoa " + this.oldOwner.getName());
  }

}