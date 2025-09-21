public class OfficeComputerFactory implements ComputerFactory {
    @Override
    public Screen createScreen() { return new OfficeScreen(); }

    @Override
    public Keyboard createKeyboard() { return new OfficeKeyboard(); }
}