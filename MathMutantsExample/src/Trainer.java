package mutants;

public class Trainer {
    public void train() {
        Hero hero = new Hero();

        // Set values
        hero.setPower("Invisibility");
        hero.setStrength("High");
        hero.setSpeech("Can communicate with animals");
        hero.setOrigin("Venus");
        hero.setCodeName("ShadowStar");

        // Print values using getters
        System.out.println("Hero Training Details:");
        System.out.println("Code Name: " + hero.getCodeName());
        System.out.println("Power: " + hero.getPower());
        System.out.println("Strength: " + hero.getStrength());
        System.out.println("Speech: " + hero.getSpeech());
        System.out.println("Origin: " + hero.getOrigin());
    }
}
