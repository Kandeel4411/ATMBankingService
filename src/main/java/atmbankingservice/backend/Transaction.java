package atmbankingservice.backend;

import java.time.LocalDate;

public class Transaction {
    public String type;
    public LocalDate date;

    private Double amount;

    public Transaction(String _type, LocalDate _date, Double _amount) {
        type = _type;
        date = _date;
        amount = _amount;
    }

    @Override
    public String toString() {
        return String.format("<td>%s</td><td>%s</td><td>%.1f</td>", type, getDate(), amount);
    }

    public String getType() {
        return type;
    }

    public String getDate() {
        return date.toString();
    }

    public Double getAmount() {
        return amount;
    }

    public void setType(String _type) {
        type = _type;
    }

    public void setDate(LocalDate _date) {
        date = _date;
    }

    public void setAmount(Double _amount) {
        amount = _amount;
    }
}