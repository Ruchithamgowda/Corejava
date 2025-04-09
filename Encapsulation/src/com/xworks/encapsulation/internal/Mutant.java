package com.xworks.encapsulation.internal;

public class Mutant {
    private String name;
    private String power;
    private int level;
    private boolean hero;
    private double score;

    void setName(String name) { this.name = name; }
    void setPower(String power) { this.power = power; }
    void setLevel(int level) { this.level = level; }
    void setHero(boolean hero) { this.hero = hero; }
    void setScore(double score) { this.score = score; }

    public String getName() { return name; }
    public String getPower() { return power; }
    public int getLevel() { return level; }
    public boolean isHero() { return hero; }
    public double getScore() { return score; }

    public void mutate() {
        System.out.println(name + " has mutated using power: " + power);
}

}
