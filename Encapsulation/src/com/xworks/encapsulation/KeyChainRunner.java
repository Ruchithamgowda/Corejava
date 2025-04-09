package com.xworks.encapsulation;

    import com.xworks.encapsulation.internal.KeyChainUser;
import com.xworks.encapsulation.external.KeyChainViewer;

    public class KeyChainRunner {
        public static void main(String[] args) {
            KeyChainUser user = new KeyChainUser();
            user.test();

            KeyChainViewer viewer = new KeyChainViewer();
            viewer.display();
        }
    }