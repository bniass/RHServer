package service;

import model.Service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class IServiceImpl extends UnicastRemoteObject implements IService {
    public IServiceImpl() throws RemoteException {
    }

    @Override
    public List<Service> findAll() throws RemoteException{
        System.out.println("findALl de Service est appelé");
        return null;
    }
}
