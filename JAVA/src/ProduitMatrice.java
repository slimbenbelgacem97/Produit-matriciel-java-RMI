/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author boulbaba
 */
public class ProduitMatrice extends UnicastRemoteObject implements Matrice_Interface {

	
    
    public ProduitMatrice() throws RemoteException {
		super();
		
	}

	@Override
    public ArrayList<int[][]> bloc_mat(int[][] mat ) throws RemoteException {
    	
    	ArrayList<int[][]> blocs = new ArrayList<>();
    	
       int lignes = mat.length;
        int cols = mat[0].length;
        System.out.println(mat.length +"                  "+ cols);
        int[][] submat1 ={{14,13},{12,11}};
        /*for(int i=0;i<lignes/2;i++){
            for(int j=0;j<cols/2;j++) {
            	
                submat1[i][j]= mat[i][j];
                }
        }*/
       
        blocs.add(submat1);
        int[][] submat2 = {{24,23},{22,21}};
        /*for(int i=0;i<lignes/2;i++){
            for(int j=cols/2;j<=cols;j++)
                submat2[i][j]= mat[i][j];
        }*/
        blocs.add(submat2);
        int[][] submat3 = {{34,33},{32,31}};
        /*for(int i=lignes/2;i<=lignes;i++){
            for(int j=0;j<cols/2;j++)
                submat3[i][j]= mat[i][j];
        }*/
        blocs.add(submat3);
        int[][] submat4 = {{44,43},{42,41}};
        /*for(int i=lignes/2;i<=lignes;i++){
            for(int j=cols/2;j<=cols;j++)
                submat4[i][j]= mat[i][j];
        }*/
        blocs.add(submat4);
        
    	return blocs;
    	
    	//return null;
    }
    
 
    @Override
    public int[][] produitMat(int[][] mat1, int[][] mat2) throws RemoteException {
    	int[][] C = new int[3][3]; 
    	for(int i=0;i<2;i++){
            for(int j=0;j<2;j++)
                C[i][j]+=(mat1[i][j] * mat2[j][i]);
        }
        return C;
    }

	
    
    
    // ma partie===================================
  //  public  Matrice produit
    
}
