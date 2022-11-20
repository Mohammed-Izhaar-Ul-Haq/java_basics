class MarkerDriver {
    public static void main(String[] args) {
        Marker m = new Marker( 355, "fhhdf", "uure"); // reference variable
        m.a = 26;
        // m.color = "blue";
        // m.price = 34;
        // m.brand = "camlin";
        System.out.println(m.color);
        System.out.println(m.price);
        System.out.println(m.brand);
        System.out.println(m.a);
    
        System.out.println("");
        m.write();

        Marker m1 = new Marker();
        m1.color = "red";
        System.out.println(m1.color);
        System.out.println(m1.price);
        System.out.println(m1.a); // it is static so it takes the value 26

    }
}
