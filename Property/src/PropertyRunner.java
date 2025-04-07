public class PropertyRunner {
        public static void main(String[] args) {

            Property[] properties = new Property[3];

            properties[0] = new Property("Manjanna", "New York", 2500000);
            properties[1] = new Property("Arjun", "Mysore", 350000);
            properties[2] = new Property("Radha", "K R Nagara", 220000);

            for (Property property : properties) {
                property.displayProperty();
            }
        }
    }