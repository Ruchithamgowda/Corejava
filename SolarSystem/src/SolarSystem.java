public class SolarSystem {
        String planetName;
        double distanceFromSun;
        double orbitalPeriod;
        double diameter;
        boolean hasRings;
        boolean hasMoons;
        int numberOfMoons;
        boolean supportsLife;
        String atmosphereComposition;
        double gravity;

        public SolarSystem() {
            this("Earth", 149.6, 365.25, 12742, false, true, 1, true, "Nitrogen, Oxygen", 9.8);
        }

        public SolarSystem(String planetName, double distanceFromSun) {
            this(planetName, distanceFromSun, 88, 4879, false, false, 0, false, "Carbon Dioxide", 3.7);
        }

        public SolarSystem(String planetName, double distanceFromSun, double orbitalPeriod, double diameter) {
            this(planetName, distanceFromSun, orbitalPeriod, diameter, true, true, 79, false, "Hydrogen, Helium", 24.8);
        }

        public SolarSystem(String planetName, double distanceFromSun, double orbitalPeriod, double diameter, boolean hasRings, boolean hasMoons, int numberOfMoons) {
            this(planetName, distanceFromSun, orbitalPeriod, diameter, hasRings, hasMoons, numberOfMoons, false, "Methane, Hydrogen", 8.7);
        }

        public SolarSystem(String planetName, double distanceFromSun, double orbitalPeriod, double diameter, boolean hasRings, boolean hasMoons, int numberOfMoons, boolean supportsLife, String atmosphereComposition, double gravity) {
            this.planetName = planetName;
            this.distanceFromSun = distanceFromSun;
            this.orbitalPeriod = orbitalPeriod;
            this.diameter = diameter;
            this.hasRings = hasRings;
            this.hasMoons = hasMoons;
            this.numberOfMoons = numberOfMoons;
            this.supportsLife = supportsLife;
            this.atmosphereComposition = atmosphereComposition;
            this.gravity = gravity;
        }

        public void displayDetails() {
            System.out.println("Planet: " + planetName +
                    "\nDistance from Sun: " + distanceFromSun + " million km" +
                    "\nOrbital Period: " + orbitalPeriod + " days" +
                    "\nDiameter: " + diameter + " km" +
                    "\nHas Rings: " + hasRings +
                    "\nHas Moons: " + hasMoons +
                    "\nNumber of Moons: " + numberOfMoons +
                    "\nSupports Life: " + supportsLife +
                    "\nAtmosphere: " + atmosphereComposition +
                    "\nGravity: " + gravity + " m/s²");
            System.out.println("--------------------------------");
        }

        public static void main(String[] args) {
            SolarSystem s1 = new SolarSystem();
            SolarSystem s2 = new SolarSystem("Mercury", 57.9);
            SolarSystem s3 = new SolarSystem("Jupiter", 778.5, 4333, 139820);
            SolarSystem s4 = new SolarSystem("Saturn", 1434, 10759, 116460, true, true, 83);
            SolarSystem s5 = new SolarSystem("Neptune", 4495, 60182, 49244, true, true, 14, false, "Hydrogen, Helium, Methane", 11.0);

            s1.displayDetails();
            s2.displayDetails();
            s3.displayDetails();
            s4.displayDetails();
            s5.displayDetails();
        }
    }