package lu.space.api.exercieAPI.model;


import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NonNull
    private Long owner;
    @NonNull
    private String currency;
    @NonNull
    private BigDecimal balance;

    public Account() {
    }

    public Account(Long owner, String currency, BigDecimal balance) {
        this.owner = owner;
        this.currency = currency;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", owner=" + owner +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                '}';
    }
}
