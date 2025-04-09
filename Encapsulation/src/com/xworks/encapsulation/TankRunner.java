package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.TankUser;
import com.xworks.encapsulation.external.TankViewer;

public class TankRunner {
    public static void main(String[] args) {
        TankUser user = new TankUser();
        user.test();

        TankViewer viewer = new TankViewer();
        viewer.display();
    }
}
