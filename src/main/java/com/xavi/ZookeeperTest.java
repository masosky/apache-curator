package com.xavi;

import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.server.DumbWatcher;

public class ZookeeperTest {
    public static void main(String[] args) {
        try {
            DumbWatcher dumbWatcher = new DumbWatcher();
            ZooKeeper client = new ZooKeeper("localhost:22181,localhost:32181", 500000, dumbWatcher);
            long sessionId = client.getSessionId();
            System.out.println("SessionId: " + sessionId);
            ZooKeeper.States state = client.getState();
            System.out.println("State: " + state);
            //client.create("")
            client.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
