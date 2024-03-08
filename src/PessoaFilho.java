import java.util.ArrayList;

public class PessoaFilho {
  private String name;
  private ArrayList<PessoaFilho> childrenList;

  public PessoaFilho(String name) {
    this.name = name;
    this.childrenList = new ArrayList<PessoaFilho>();
  }

  public void addChild(PessoaFilho child) {
    this.childrenList.add(child);
  }

  public void showChildren() {
    System.out.println("Filhos da pessoa " + this.name);

    for (PessoaFilho child : childrenList) {
      System.out.println(child.name);
    }
  }
}
