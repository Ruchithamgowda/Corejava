abstract class Job {
    abstract void apply();
    abstract void interview();
    abstract void work();
    abstract void getSalary();
    abstract void resign();
}

class EngineerJob extends Job {
    void apply() { System.out.println("Applying for software engineer job."); }
    void interview() { System.out.println("Attending technical interview."); }
    void work() { System.out.println("Writing clean code."); }
    void getSalary() { System.out.println("Receiving monthly salary."); }
    void resign() { System.out.println("Resigning gracefully."); }
}

class DoctorJob extends Job {
    void apply() { System.out.println("Applying for hospital position."); }
    void interview() { System.out.println("Attending medical panel."); }
    void work() { System.out.println("Treating patients."); }
    void getSalary() { System.out.println("Receiving consultation fees."); }
    void resign() { System.out.println("Handing over to new doctor."); }
}
