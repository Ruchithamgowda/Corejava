package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.BadgeUser;
import com.xworks.encapsulation.external.BadgeViewer;

public class BadgeRunner {
    public static void main(String[] args) {
        BadgeUser user = new BadgeUser();
        user.use();

        BadgeViewer viewer = new BadgeViewer();
        viewer.display();
    }
}
