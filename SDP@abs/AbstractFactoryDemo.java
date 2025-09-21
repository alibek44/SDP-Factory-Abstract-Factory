public class AbstractFactoryDemo {
    public static void main(String[] args) {
        ComputerFactory officeFactory = new OfficeComputerFactory();
        Screen officeScreen = officeFactory.createScreen();
        Keyboard officeKeyboard = officeFactory.createKeyboard();
        officeScreen.display();
        officeKeyboard.type();

        System.out.println();

        ComputerFactory gamingFactory = new GamingComputerFactory();
        Screen gamingScreen = gamingFactory.createScreen();
        Keyboard gamingKeyboard = gamingFactory.createKeyboard();
        gamingScreen.display();
        gamingKeyboard.type();
    }
}