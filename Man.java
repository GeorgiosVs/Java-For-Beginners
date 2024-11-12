class Man extends Human {
    String gender;

    public Man(String name, double height, double weight, int age) {
        super(name, height, weight, age);
        this.gender = "Male";
    }
    public void printManDetails() {
        System.out.println(name + " is a " + gender);
        printDetails();
    }
}
