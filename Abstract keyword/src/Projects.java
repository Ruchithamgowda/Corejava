abstract class Projects {
    abstract void plan();
    abstract void execute();
    abstract void monitor();
    abstract void deliver();
    abstract void close();
}

class SoftwareProject extends Projects {
    void plan() { System.out.println("Planning software modules."); }
    void execute() { System.out.println("Writing and testing code."); }
    void monitor() { System.out.println("Tracking bugs and issues."); }
    void deliver() { System.out.println("Delivering final software."); }
    void close() { System.out.println("Project archived."); }
}

class ConstructionProject extends Projects {
    void plan() { System.out.println("Designing blueprint."); }
    void execute() { System.out.println("Starting construction."); }
    void monitor() { System.out.println("Supervising site work."); }
    void deliver() { System.out.println("Handing over building."); }
    void close() { System.out.println("Final documentation completed."); }
}
