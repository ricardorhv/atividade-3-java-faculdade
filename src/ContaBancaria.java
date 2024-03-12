public class ContaBancaria {
  private float balance;
  private Pessoa person;

  public ContaBancaria(Pessoa person) {
    this.person = person;
  }

  public float getBalance() {
    return balance;
  }

  public void setBalance(float balance) {
    this.balance = balance;
  }

  public Pessoa getPerson() {
    return person;
  }

  public void setPerson(Pessoa person) {
    this.person = person;
  }

  public void deposit(float amount) {
    this.balance += amount;
    System.out.println("R$" + amount + " foi depositado com sucesso!");
  }

  public void withdraw(float amount) {
    if ((this.balance - amount) < 0) {
      System.out.println("Você não possui esse valor disponível para saque!");
    } else {
      this.balance -= amount;
      System.out.println("R$" + amount + " foi retirado com sucesso!");
    }
  }

  public void showBalance() {
    System.out.println("Seu saldo é R$" + this.balance);
  }
}
