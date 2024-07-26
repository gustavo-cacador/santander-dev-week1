package me.dio.dto;


public class UserDTO {
    private Long id;
    private String name;
    private AccountDTO account;
    private CardDTO card;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public AccountDTO getAccount() {
        return account;
    }
    public void setAccount(AccountDTO account) {
        this.account = account;
    }
    public CardDTO getCard() {
        return card;
    }
    public void setCard(CardDTO card) {
        this.card = card;
    }
    

    
}
