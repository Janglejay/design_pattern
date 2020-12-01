package chainofresponsibility;


public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {
        //组装责任链
        MyHandler handler1 = new ConcreteHandler1();
        MyHandler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);
        //提交请求
        handler1.handleRequest("two");
    }
}
