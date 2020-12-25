/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author boulbaba
 */
public class Client {
	public static int[][] lire_matrice(int l, int c) throws Exception
	{
	DataInputStream saisie = new DataInputStream(System.in);

	int t[][], i, j ;

	t = new int [l][c] ;

	for (i = 0 ; i < t.length ; i = i + 1 )
	   for (j = 0 ; j < t[0].length ; j = j + 1 ) 
		{
	        System.out.print(" [" + (i+1) + "," + (j+1) + "]:") ;
	        String chaine = saisie.readLine();
	        Integer nombre = new Integer(chaine);
	        t[i][j] = nombre.intValue(); 
	        }
	          
	return t ;
	}



	public static void affiche_matrice (int t[][])
	{
	int i, j;
	int space;
	String s;

	System.out.println();
	for (i = 0 ; i < t.length ; i = i + 1 )
	   { 
	   for (j = 0 ; j < t[0].length ; j = j + 1 ) 

		{
	        s = Integer.toString(t[i][j]);
	        if(j == 0)
	          System.out.print(" | ") ;
	        System.out.print(t[i][j]+ " ") ;
	        for(space = s.length(); space < 7; space++)
	             System.out.print(" ");
	        }
	   System.out.print(" | ") ;
	   System.out.println();
	   }       
	}
	
    public static void main(String[] args) throws Exception{
        try {
        	DataInputStream saisie = new DataInputStream(System.in);
        	int  produit[][],  mat1[][], mat2[][], lig, col;
        	
        	System.out.println("Saisie de la matrice 1: ");
            System.out.print("Nombre de ligne:");
            Integer nombre = new Integer(saisie.readLine());
            lig = nombre.intValue();

            System.out.print("Nombre de colonne:");
            nombre = new Integer(saisie.readLine());
            col = nombre.intValue();
            mat1 = new int[lig][col];
            mat1 = lire_matrice(lig,col);
            
            System.out.println("Saisie de la matrice 2: ");

            System.out.print("Nombre de ligne:");
            nombre = new Integer(saisie.readLine());
            lig = nombre.intValue();

            System.out.print("Nombre de colonne:");
            nombre = new Integer(saisie.readLine());
            col = nombre.intValue();
            mat2 = new int[lig][col];
            mat2 = lire_matrice(lig,col);
        	
        	
            Factory_interface fab;
            fab = (Factory_interface) Naming.lookup ("rmi://localhost:5004/f1");
            Matrice_Interface mat =  fab.newMatrice();
           // mat.produitMat(mat1,mat2);
            //if(null == mat.bloc_mat()) System.out.println("oky");
          // affiche_matrice(mat.produitMat(mat1,mat2));
           for (int i = 0; i <4; i++) {
            	affiche_matrice(mat.bloc_mat(mat1).get(i));
            	
				
			}
           /*if(mat.bloc_mat(mat1)==null)
        	   System.out.println("hhhhhhhhhhhhhhhhhhhh");*/
            
            
            
            
            
            
            
            
            
            
            
            
            } catch (NotBoundException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
