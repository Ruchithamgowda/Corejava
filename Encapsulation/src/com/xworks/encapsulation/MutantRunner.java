package com.xworks.encapsulation;

import com.xworks.encapsulation.external.MutantViewer;
import com.xworks.encapsulation.internal.MutantUser;

public class MutantRunner {

    public static void main(String[] args) {
        MutantUser user = new MutantUser();
        user.test();

        MutantViewer viewer = new MutantViewer();
        viewer.display();
}
}
