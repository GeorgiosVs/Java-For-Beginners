class Woman extends Human{
    String gender;

    public Woman(String name, double height, double weight, int age){
        super(name, height, weight, age);
        this.gender = "Female";
    }
    public void printWomanDetails() {
        System.out.println(name + " is a " + gender);
        printDetails();
    }
}
