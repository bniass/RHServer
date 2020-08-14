package main;

import service.IEmploye;
import service.IEmployeImpl;
import service.IService;
import service.IServiceImpl;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Main {
    public static void main(String[] args) throws Exception{
        Registry registry = LocateRegistry.createRegistry(5002);
        IService iService = new IServiceImpl();
        registry.bind("serviceRemote", iService);
        IEmploye iEmploye = new IEmployeImpl();
        registry.bind("employeRemote", iEmploye);
        System.out.println("Serveur lancé sur le port 5002");
    }
}
