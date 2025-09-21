public class GamingComputerFactory implements ComputerFactory {
    public Screen createScreen() { return new GamingScreen(); }
    public Keyboard createKeyboard() { return new GamingKeyboard(); }
}