class Human {
    String name;
    double height;
    double weight;
    int age;

    public Human(String name, double height, double weight, int age) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
    public void printDetails() {
        System.out.println("Name: " + name + ", Height: " + height + ", Weight: " + weight + ", Age: " + age);
    }

}
