package service;

import model.Employe;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class IEmployeImpl extends UnicastRemoteObject implements IEmploye {

    public IEmployeImpl() throws RemoteException {

    }

    @Override
    public void add(Employe employe) throws RemoteException {
        System.out.println("add est appelé");
    }

    @Override
    public List<Employe> findAll() throws RemoteException {
        System.out.println("findAll est appelé");
        return null;
    }

    @Override
    public List<Employe> findAllByService(int i) throws RemoteException {
        System.out.println("findByServiceId est appelé");
        return null;
    }
}
