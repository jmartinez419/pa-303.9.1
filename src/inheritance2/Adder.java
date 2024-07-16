package inheritance2;

public class Adder  extends Arithmetic{
    @Override
    int add(int num1, int num2) {
        return super.add(num1, num2);
    }
}
