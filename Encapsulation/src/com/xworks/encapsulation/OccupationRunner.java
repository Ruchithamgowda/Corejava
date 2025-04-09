package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.OccupationUser;
import com.xworks.encapsulation.external.OccupationViewer;

public class OccupationRunner {
    public static void main(String[] args) {
        OccupationUser user = new OccupationUser();
        user.use();

        OccupationViewer viewer = new OccupationViewer();
        viewer.display();
    }
}
