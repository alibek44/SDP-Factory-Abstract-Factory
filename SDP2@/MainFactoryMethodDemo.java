public class MainFactoryMethodDemo {
    public static void main(String[] args) {
        ComputerFactory laptopFactory = new LaptopFactory();
        Client laptopClient = new Client(laptopFactory);
        Computer laptop = laptopClient.getComputer();
        laptop.printComputer();

        ComputerFactory gamingFactory = new GamingPCFactory();
        Client gamingClient = new Client(gamingFactory);
        Computer gaming = gamingClient.getComputer();
        gaming.printComputer();
    }
}