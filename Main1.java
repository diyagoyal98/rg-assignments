interface MathUtils {
    static int square(int x) {
        return x * x;
    }

    int add(int a, int b);
}

class Calculator implements MathUtils {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}

class Main1 {
    public static void main(String[] args) {
        
        int result = MathUtils.square(5);
        System.out.println("Square of 5 is: " + result); 
        Calculator calculator = new Calculator();
        int sum = calculator.add(3, 4);
        System.out.println("Sum of 3 and 4 is: " + sum); 
    }
}
