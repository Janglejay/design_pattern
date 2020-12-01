package visitor;

interface Element {
    void accept(Visitor visitor);
}