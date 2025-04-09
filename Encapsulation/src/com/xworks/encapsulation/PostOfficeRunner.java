package com.xworks.encapsulation;

import com.xworks.encapsulation.internal.PostOfficeUser;
import com.xworks.encapsulation.external.PostOfficeViewer;

public class PostOfficeRunner {
    public static void main(String[] args) {
        PostOfficeUser user = new PostOfficeUser();
        user.use();

        PostOfficeViewer viewer = new PostOfficeViewer();
        viewer.display();
    }
}
