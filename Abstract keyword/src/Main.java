public class Main {
    public static void main(String[] args) {
        Dream d1 = new ScientistDream();
        d1.imagine(); d1.pursue();

        Polygon p1 = new Square();
        p1.draw(); System.out.println("Area: " + p1.getArea());

        Job j1 = new EngineerJob();
        j1.work();

        Road r1 = new CityRoad();
        r1.open();

        Projects pr1 = new SoftwareProject();
        pr1.execute();
    }
}
