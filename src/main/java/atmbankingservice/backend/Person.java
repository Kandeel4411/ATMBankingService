package atmbankingservice.backend;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;

public class Person {
    public String name;
    public Character gender;

    private LocalDate birthDate;
    private List<Client> associated_clients;

    private static Integer currentID = 0;
    private Integer personID;

    public Person(String _name, Character _gender, LocalDate _birthDate) {
        name = _name;
        gender = _gender;
        birthDate = _birthDate;

        currentID++;
        personID = currentID;
        associated_clients = new ArrayList<Client>();
    }

    @Override
    public String toString() {
        return String.format("<td>%s</td><td>%d</td><td>%c</td>", name, getAge(), gender);
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public Integer getID() {
        return personID;
    }

    public Integer getAge() {
        LocalDate now = LocalDate.now();
        Period diff = Period.between(birthDate, now);
        return diff.getYears();
    }

    public List<Client> getClients() {
        return associated_clients;
    }

    public void setName(String _name) {
        name = _name;
    }

    public void setGender(Character _gender) {
        gender = _gender;
    }

    public void setBirthday(LocalDate _birthDate) {
        birthDate = _birthDate;
    }

    public void addClient(Client client) {
        associated_clients.add(client);
    }

    public void deleteClient(Client client) {
        associated_clients.remove(client);
    }

    public Boolean isEqual(Person p) {
        if (personID == p.getID()) {
            return true;
        } else {
            return false;
        }
    }
}