/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.rmi.Remote;
import java.rmi.RemoteException;



/**
 *
 * @author boulbaba
 */
public interface Matrice_Interface extends Remote {


    
   abstract public ArrayList<int[][]> bloc_mat(int[][] mat)throws RemoteException;
   abstract public int[][] produitMat(int[][] m1, int[][] m2) throws RemoteException;
}
