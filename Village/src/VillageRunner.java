public class VillageRunner {
        public static void main(String[] args) {
            village[] villages = new village[3];
            villages[0] = new village("Rajanabelaguli", 1200, "Mysore");
            villages[1] = new village("Ramanathpura", 51720, "Hassan");
            villages[2] = new village("Bettadapura", 22567, "Mysore");

            for (village village : villages) {
                village.displayVillage();
            }
        }
    }