public class GamingPCFactory implements ComputerFactory {
    public Computer createComputer() {
        return new GamingPC();
    }
}