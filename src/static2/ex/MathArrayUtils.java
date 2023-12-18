package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다!
    }
    
    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static Double average(int[] values) {
//        int sum = 0;
//        for (int value : values) {
//            sum += value;
//        }
//        return (double) (sum / values.length);

        return (double) (sum(values) / values.length);
    }

    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if(max < value) {
                max = value;
            }
        }
        return max;
    }

    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if(min > value) {
                min = value;
            }
        }
        return min;
    }
}
