package Lab06.people;

public class BankEmployee extends Person implements PeopleService {

    private String bankName;

    public BankEmployee(String firstname, String surname, String bankName) {
        super(firstname, surname);
        this.bankName = bankName;
    }

    @Override
    public void displayInfo() {
        System.out.printf("Bank employee [firstname: %s, surname: %s, bank name: %s] \n",
                this.getFirstname(), this.getSurname(), bankName);
    }

    @Override
    public String getWholeInfo() {
        return this.getFirstname() + this.getSurname() + this.bankName;
    }
}
