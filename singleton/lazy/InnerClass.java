package singleton.lazy;

public class InnerClass {
    private static class LazyInstance {
        private static final InnerClass INSTANCE = new InnerClass();
    }

    public static InnerClass getInstance() {
        return LazyInstance.INSTANCE;
    }
}
