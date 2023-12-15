package access.ex;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if(count == max)  {
            System.out.println("최대값에 도달하였습니다. 최대 값 : "+max);
            return;
        }
        System.out.println("count 1 증가");
        count += 1;
    }
    public int getCount() {
        return count;
    }
}
