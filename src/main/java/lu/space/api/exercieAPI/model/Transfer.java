package lu.space.api.exercieAPI.model;


import lombok.Data;

import java.math.BigDecimal;
@Data
public class Transfer {

    private long source;
    private long target;
    private BigDecimal amount;

    public Transfer() {
    }

    public Transfer(long source, long target, BigDecimal amount) {
        this.source = source;
        this.target = target;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Transfer{" +
                "source=" + source +
                ", target=" + target +
                ", amount=" + amount +
                '}';
    }
}
