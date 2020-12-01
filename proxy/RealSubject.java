package proxy;



class RealSubject implements MySubject {
    public void Request() {
        System.out.println("访问真实主题方法...");
    }
}
