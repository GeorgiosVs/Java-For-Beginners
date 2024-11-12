public class Main {
    public static void main(String[] args) {
        Man m = new Man("Alex", 180, 75, 30);
        Woman w = new Woman("Jane", 165, 60, 26);

        m.printManDetails();
        w.printWomanDetails();

        System.out.println("Both " + m.name + " and " + w.name + " are humans.");
    }
}