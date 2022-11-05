package Lab06.people;

public class Client extends Person implements PeopleService {

    private String bankName;

    public Client(String firstname, String surname, String bankName) {
        super(firstname, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Client [firstname: %s, surname: %s, bank name: %s] \n",
                this.getFirstname(), this.getSurname(), bankName);
    }

    @Override
    public String getWholeInfo() {
        return this.getFirstname() + this.getSurname() + this.bankName;
    }
}
