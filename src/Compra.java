import java.util.ArrayList;

public class Compra {
  private ArrayList<String> productList;
  private Pessoa person;

  public Compra(Pessoa person) {
    this.person = person;
    this.productList = new ArrayList<String>();
  }

  public ArrayList<String> getProductList() {
    return productList;
  }

  public void setProductList(ArrayList<String> productList) {
    this.productList = productList;
  }

  public Pessoa getPerson() {
    return person;
  }

  public void setPerson(Pessoa person) {
    this.person = person;
  }

  public void addProduct(String product) {
    boolean hasProduct = productList.contains(product);

    if (hasProduct) {
      System.out.println("Este item já está na lista de compras!");
    } else {
      productList.add(product);
      System.out.println(product + " foi adicionado com sucesso!");
    }
  }

  public void removeProduct(String product) {
    boolean hasProduct = productList.contains(product);

    if (hasProduct) {
      productList.remove(product);
      System.out.println(product + " foi removido com sucesso!");
    } else {
      System.out.println("Este item não está na lista de compras!");
    }
  }

  public void showProductListInfo() {
    System.out.println("Lista de compras da pessoa " + this.person.getName());
    System.out.println("********************************");
    for (String product : productList) {
      System.out.println(product);
    }
  }
}
