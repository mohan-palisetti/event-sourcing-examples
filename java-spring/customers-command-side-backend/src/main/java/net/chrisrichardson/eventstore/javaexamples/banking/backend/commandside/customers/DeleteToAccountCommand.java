package net.chrisrichardson.eventstore.javaexamples.banking.backend.commandside.customers;

public class DeleteToAccountCommand implements CustomerCommand {

  private String accountId;

  public DeleteToAccountCommand() {
  }

  public DeleteToAccountCommand(String accountId) {
    this.accountId = accountId;
  }

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }
}
