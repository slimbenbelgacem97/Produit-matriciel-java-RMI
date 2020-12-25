/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author boulbaba
 */
public class Factory  extends UnicastRemoteObject implements Factory_interface {
    
    public Factory() throws RemoteException{
        super();
    }
    @Override
    public ProduitMatrice newMatrice() throws RemoteException {
        return new ProduitMatrice();
    }
    
}
