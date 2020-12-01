package command;


class ConcreteCommand implements Command {
    private MyReceiver receiver;
    ConcreteCommand() {
        receiver = new MyReceiver();
    }
    @Override
    public void execute() {
        receiver.action();
    }
}