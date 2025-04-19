abstract class Road {
    abstract void construct();
    abstract void open();
    abstract void maintain();
    abstract void close();
    abstract void expand();
}

class Highway extends Road {
    void construct() { System.out.println("Building a highway."); }
    void open() { System.out.println("Highway is now open."); }
    void maintain() { System.out.println("Maintaining highway lanes."); }
    void close() { System.out.println("Highway closed for repairs."); }
    void expand() { System.out.println("Widening the highway."); }
}

class CityRoad extends Road {
    void construct() { System.out.println("Constructing city road."); }
    void open() { System.out.println("City road accessible to public."); }
    void maintain() { System.out.println("Cleaning and fixing potholes."); }
    void close() { System.out.println("Temporary closure for events."); }
    void expand() { System.out.println("Adding extra lane in city."); }
}
