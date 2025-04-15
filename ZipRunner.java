class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip("YKK", "Coil", "Nylon", 30, "Black", true, true, "Jackets", 50, 5, "Slider", true,
                false, true, 50, "Plastic", true, "Japan", 2, true);
        zip1.display();

        Zip zip2 = new Zip("SBS", "Metal", "Brass", 40, "Silver", false, true, "Jeans", 75, 7, "Button Lock", false,
                false, true, 60, "Metal", false, "China", 3, false);
        zip2.display();
    }
}

