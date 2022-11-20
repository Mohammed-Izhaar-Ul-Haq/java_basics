class Marker {
    String color;
    int price;
    String brand;
    static int a; // common for all
    
    // constructor overloading
    Marker() { // no-argument constructor --> compiler create this by default if there is no constructor in the class

    }

    Marker(int price, String color, String brand) { // parameterized costructor
        this.color = color;
        this.price = price;
        this.brand = brand;
    }

    public void write() {
        System.out.println("Marker is running");
    }
}