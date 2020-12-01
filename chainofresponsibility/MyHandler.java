package chainofresponsibility;

abstract class MyHandler {
    private MyHandler next;
    public void setNext(MyHandler next) {
        this.next = next;
    }
    public MyHandler getNext() {
        return next;
    }
    //处理请求的方法
    public abstract void handleRequest(String request);
}