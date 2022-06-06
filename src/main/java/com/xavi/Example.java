package com.xavi;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.RetryForever;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        CuratorFramework client = CuratorFrameworkFactory.newClient("localhost:22181,localhost:32181", 20000, 50000, new RetryForever(1000));
        System.out.println("Starting...");
        client.start();
        System.out.println("Connecting...");
        client.blockUntilConnected();
        System.out.println("Closing...");
        client.close();

    }
}
