package state;


abstract class State {
    public abstract void Handle(MyContext context);
}