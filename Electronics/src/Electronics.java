public class Electronics {
        String deviceName;
        String brand;
        double price;
        int warrantyPeriod; // in months
        boolean isSmartDevice;
        double screenSize; // in inches
        String batteryCapacity; // in mAh
        boolean isWireless;
        String processor;
        int ramSize; // in GB

        public Electronics() {
            this("Smartphone", "Samsung", 799.99, 24, true, 6.5, "4500mAh", true, "Snapdragon 8 Gen 2", 8);
        }

        public Electronics(String deviceName, String brand) {
            this(deviceName, brand, 499.99, 12, true, 5.8, "3300mAh", true, "A15 Bionic", 4);
        }

        public Electronics(String deviceName, String brand, double price, int warrantyPeriod) {
            this(deviceName, brand, price, warrantyPeriod, false, 15.6, "No Battery", false, "Intel i7", 16);
        }

        public Electronics(String deviceName, String brand, double price, int warrantyPeriod, boolean isSmartDevice, double screenSize, String batteryCapacity) {
            this(deviceName, brand, price, warrantyPeriod, isSmartDevice, screenSize, batteryCapacity, false, "MediaTek Dimensity", 6);
        }

        public Electronics(String deviceName, String brand, double price, int warrantyPeriod, boolean isSmartDevice, double screenSize, String batteryCapacity, boolean isWireless, String processor, int ramSize) {
            this.deviceName = deviceName;
            this.brand = brand;
            this.price = price;
            this.warrantyPeriod = warrantyPeriod;
            this.isSmartDevice = isSmartDevice;
            this.screenSize = screenSize;
            this.batteryCapacity = batteryCapacity;
            this.isWireless = isWireless;
            this.processor = processor;
            this.ramSize = ramSize;
        }

        public void displayDetails() {
            System.out.println("Device: " + deviceName +
                    "\nBrand: " + brand +
                    "\nPrice: $" + price +
                    "\nWarranty: " + warrantyPeriod + " months" +
                    "\nSmart Device: " + isSmartDevice +
                    "\nScreen Size: " + screenSize + " inches" +
                    "\nBattery Capacity: " + batteryCapacity +
                    "\nWireless: " + isWireless +
                    "\nProcessor: " + processor +
                    "\nRAM Size: " + ramSize + "GB");
            System.out.println("--------------------------------");
        }

        public static void main(String[] args) {
            Electronics e1 = new Electronics();
            Electronics e2 = new Electronics("Laptop", "Dell");
            Electronics e3 = new Electronics("Tablet", "Apple", 999.99, 36);
            Electronics e4 = new Electronics("Smart TV", "Sony", 1499.99, 24, true, 55, "No Battery");
            Electronics e5 = new Electronics("Gaming Console", "PlayStation", 499.99, 12, true, 10, "No Battery", true, "Custom AMD Ryzen", 16);

            e1.displayDetails();
            e2.displayDetails();
            e3.displayDetails();
            e4.displayDetails();
            e5.displayDetails();
        }
    }