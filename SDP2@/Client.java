public class Client {
    private final Computer computer;

    public Client(ComputerFactory factory) {
        this.computer = factory.createComputer();
    }

    public Computer getComputer() {
        return computer;
    }
}