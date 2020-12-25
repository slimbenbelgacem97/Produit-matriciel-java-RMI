/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author boulbaba
 */
public interface Factory_interface extends Remote {
    
  abstract public Matrice_Interface newMatrice() throws RemoteException;  
}
