package state;


public class ConcreteStateA extends State {
    @Override
    public void Handle(MyContext context) {
        System.out.println("当前状态是 A.");
        context.setState(new ConcreteStateB());
    }

}
