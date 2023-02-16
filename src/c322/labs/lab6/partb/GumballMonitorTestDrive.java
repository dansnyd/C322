package c322.labs.lab6.partb;

import java.rmi.*;

public class GumballMonitorTestDrive {
    public static void main(String[] args) {
        String[] location = {"rmi://gumball1.c322.com",
                "rmi://gumball2.c322.com",
                "rmi://gumball3.c322.com"};

        if (args.length >= 0)
        {
            location = new String[1];
            location[0] = "rmi://" + args[0] + ".c322.com";
        }

        GumballMonitor[] monitor = new GumballMonitor[location.length];


        for (int i=0;i < location.length; i++) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location[i]);
                monitor[i] = new GumballMonitor(machine);
                System.out.println(monitor[i]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        for (int i=0; i < monitor.length; i++) {
            monitor[i].report();
        }
    }
}
