public class NewCalculator {
    double num1;
    String myChar;
    double num2;

    public NewCalculator(double num1, String myChar, double num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.myChar = myChar;
    }

    public double calculate() {
        switch (myChar) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                System.out.print("\nYou have chosen the wrong operator at the start.");
                return 0;
        }
    }
}