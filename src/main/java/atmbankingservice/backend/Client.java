
package atmbankingservice.backend;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Client {
    public String username;

    private static Integer currentID = 0;

    private Boolean loggedIn;

    private Integer accountID;
    public String password;
    private Double balance;
    private List<Person> owners;
    private List<Transaction> associated_transactions;

    public Client(String _username, String _password, Person _owner) {
        currentID++;
        accountID = currentID;

        username = _username;
        password = _password;

        owners = new ArrayList<Person>();
        owners.add(_owner);
        associated_transactions = new ArrayList<Transaction>();
        loggedIn = false;
        balance = 0.0;

        _owner.addClient(this);
    }

    @Override
    public String toString() {
        return String.format("<td>%s</td><td>%d</td><td>%.1f</td>", username, accountID, balance);
    }

    public String getUsername() {
        return username;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public String getPassword() {
        if (loggedIn) {
            return password;
        } else {
            return "*****";
        }
    }

    public Double getBalance() throws Exception {
        if (loggedIn) {
            return balance;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public Integer getID() {
        return accountID;
    }

    public List<Transaction> getTransactions() throws Exception {
        if (loggedIn) {
            Collections.reverse(associated_transactions);
            try {
                return associated_transactions.subList(0, 5);
            } catch (IndexOutOfBoundsException ex) {
                return associated_transactions;
            }
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public void setUsername(String _username) throws Exception {
        if (loggedIn) {
            username = _username;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public void setPassword(String _password) throws Exception {
        if (loggedIn) {
            password = _password;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public Boolean logIn(String _username, String _password) {
        if (username.equals(_username) && password.equals(_password)) {
            loggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public void logOut() throws Exception {
        if (loggedIn) {
            loggedIn = false;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public Boolean addOwner(Person owner) throws Exception {
        if (loggedIn) {
            for (Person p : owners) {
                if (p.isEqual(owner)) {
                    return false;
                }
            }
            owners.add(owner);
            owner.addClient(this);
            return true;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public Boolean removeOwner(Person owner) throws Exception {
        if (loggedIn) {
            for (Person p : owners) {
                if (p.isEqual(owner)) {
                    owners.remove(owner);
                    owner.deleteClient(this);
                    return true;
                }
            }
            return false;
        } else {
            throw new Exception("Not logged in.");
        }
    }

    public void changeBalance(Transaction _transaction) throws Exception {
        if (loggedIn) {
            balance += _transaction.getAmount();
            associated_transactions.add(_transaction);
        } else {
            throw new Exception("Not logged in.");
        }
    }
}
