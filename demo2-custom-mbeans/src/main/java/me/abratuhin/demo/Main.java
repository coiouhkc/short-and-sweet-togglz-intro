package me.abratuhin.demo;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class Main {
    public static void main(String[] args)
            throws Exception {

        MBeanServer mbs = ManagementFactory.getPlatformMBeanServer();
        ObjectName name = new ObjectName("me.abratuhin.demo:type=Features");
        Features mbean = new Features();
        mbs.registerMBean(mbean, name);

        while (true) {
            System.out.println(mbean.getName());
            Thread.sleep(1_000L);
        }
    }
}
