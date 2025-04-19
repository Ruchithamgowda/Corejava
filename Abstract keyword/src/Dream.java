abstract class Dream {
    abstract void imagine();
    abstract void pursue();
    abstract void achieve();
    abstract void fail();
    abstract void learn();
}

class ScientistDream extends Dream {
    void imagine() { System.out.println("Imagining a scientific breakthrough."); }
    void pursue() { System.out.println("Conducting experiments."); }
    void achieve() { System.out.println("Publishing a research paper."); }
    void fail() { System.out.println("Experiment failed."); }
    void learn() { System.out.println("Learning from failed experiments."); }
}

class ArtistDream extends Dream {
    void imagine() { System.out.println("Visualizing a masterpiece."); }
    void pursue() { System.out.println("Painting passionately."); }
    void achieve() { System.out.println("Artwork displayed in gallery."); }
    void fail() { System.out.println("Work not appreciated."); }
    void learn() { System.out.println("Improving creative techniques."); }
}
