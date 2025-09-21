public class LaptopFactory implements ComputerFactory {
    public Computer createComputer() {
        return new Laptop();
    }
}