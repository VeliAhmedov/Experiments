package abstraction.absClassExp;
public class Deduct extends MyTest{

    @Override
    public void calculate(int a, int b) {
        int x = a-b;
        System.out.println("deducted value is "+x);
    }
}
