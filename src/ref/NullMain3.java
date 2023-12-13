package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data); //null

        //System.out.println("bigData.data.value = " + bigData.data.value);
        //멤버변수에서 참조형은 초기값이 null이기 때문에 NullPointerException

        //위에 널포인터익셉션을 안나게 하려면 참조값을 넣어주면된다..!
        BigData bigData1 = new BigData();
        bigData1.data = new Data();
        System.out.println("bigData1 = " + bigData1.data.value);
    }
}
