package atmbankingservice.backend;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class ATM {
    public static List<Client> clients;
    public static List<Person> users;

    public ATM() {
        clients = new ArrayList<Client>();
        users = new ArrayList<Person>();

        LocalDate adminDate = LocalDate.now();

        Person admin = new Person("admin", 'M', adminDate);
        Client adminAccount = new Client("admin", "admin", admin);

        users.add(admin);
        clients.add(adminAccount);
    }

    public Boolean addClient(Client client) {
        for (Client c : clients) {
            if (c.getUsername().equals(client.getUsername())) {
                return false;
            }
        }
        clients.add(client);
        return true;
    }

    public Boolean removeClient(Client client) {
        for (Client c : clients) {
            if (c.getUsername().equals(client.getUsername())) {
                for (Person owner : client.getOwners()) {
                    owner.deleteClient(client);
                }
                clients.remove(client);
                return true;
            }
        }
        return false;
    }

    public Boolean addUser(Person person) {
        for (Person p : users) {
            if (p.getID() == person.getID()) {
                return false;
            }
        }
        users.add(person);
        return true;
    }

    public Boolean removeUser(Person person) throws Exception {
        for (Person p : users) {
            if (p.getID() == person.getID()) {
                for (Client client : person.getClients()) {
                    client.removeOwner(person);
                }
                users.remove(person);
                return true;
            }
        }
        return false;
    }

    public Boolean action(Client client, Double amount, String type) throws Exception {
        Double currentBalance = client.getBalance();

        if (type == "Withdraw") {
            if (amount > currentBalance) {
                return false;
            } else {
                amount = -amount;
            }
        } else if (type != "Deposit") {
            throw new Exception("Unknown action.");
        }

        LocalDate currentDate = LocalDate.now();
        Transaction t = new Transaction(type, currentDate, amount);
        client.changeBalance(t);
        return true;
    }
}
