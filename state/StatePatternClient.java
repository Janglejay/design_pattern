package state;

public class StatePatternClient {
    public static void main(String[] args) {
        MyContext context = new MyContext();    //创建环境
        context.Handle();    //处理请求
        context.Handle();
        context.Handle();
        context.Handle();
    }
}
