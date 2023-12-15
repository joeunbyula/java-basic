package access.ex;

public class MaxCounterMain {
    public static void main(String[] args) {
        MaxCounter mc = new MaxCounter(3);
        mc.increment();
        mc.increment();
        mc.increment();
        mc.increment();

        System.out.println("현재 카운터 수 = " + mc.getCount());
    }
}
