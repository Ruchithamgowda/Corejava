class Zip {
    String brand;
    String type;
    String material;
    int length;
    String color;
    boolean isWaterResistant;
    boolean isRustProof;
    String usageType;
    double price;
    int durability;
    String closureType;
    boolean isTwoWay;
    boolean isInvisible;
    boolean isLockable;
    int teethCount;
    String teethMaterial;
    boolean hasAutoLock;
    String countryOfOrigin;
    int warranty;
    boolean isEcoFriendly;

    public Zip(String brand, String type, String material, int length, String color, boolean isWaterResistant, boolean isRustProof,
               String usageType, double price, int durability, String closureType, boolean isTwoWay, boolean isInvisible,
               boolean isLockable, int teethCount, String teethMaterial, boolean hasAutoLock, String countryOfOrigin,
               int warranty, boolean isEcoFriendly) {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.length = length;
        this.color = color;
        this.isWaterResistant = isWaterResistant;
        this.isRustProof = isRustProof;
        this.usageType = usageType;
        this.price = price;
        this.durability = durability;
        this.closureType = closureType;
        this.isTwoWay = isTwoWay;
        this.isInvisible = isInvisible;
        this.isLockable = isLockable;
        this.teethCount = teethCount;
        this.teethMaterial = teethMaterial;
        this.hasAutoLock = hasAutoLock;
        this.countryOfOrigin = countryOfOrigin;
        this.warranty = warranty;
        this.isEcoFriendly = isEcoFriendly;
    }

    public void display() {
        System.out.println("Zip Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " cm");
        System.out.println("Color: " + color);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Rust Proof: " + isRustProof);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Price: Rs." + price);
        System.out.println("Durability: " + durability + " years");
        System.out.println("Closure Type: " + closureType);
        System.out.println("Two-Way: " + isTwoWay);
        System.out.println("Invisible: " + isInvisible);
        System.out.println("Lockable: " + isLockable);
        System.out.println("Teeth Count: " + teethCount);
        System.out.println("Teeth Material: " + teethMaterial);
        System.out.println("Has Auto Lock: " + hasAutoLock);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Eco-Friendly: " + isEcoFriendly);
        System.out.println();
    }
}


