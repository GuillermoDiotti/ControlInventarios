
import java.util.Arrays;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author guillermodiotti
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] mat = {
            {9, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 5, 16, 22},
            {10, 13, 14, 17, 24}
        };

        int[][] nueva = new int[mat.length][mat[0].length];
        boolean iguales = true;
        for (int i = 0; i < mat.length; i++) {
            int[] fil = new int[mat[0].length];
            for (int j = 0; j < mat[0].length; j++) {
                fil[j] = mat[i][j];
            }
            Arrays.sort(fil);
            for (int j = 0; j < fil.length; j++) {
                nueva[i][j] = fil[j];
                
            }
        }
        
        for (int j = 0; j < mat[0].length; j++) {
            int[] col = new int[mat.length];
            for (int i = 0; i < mat.length; i++) {
                col[i] = mat[i][j];
            }
            Arrays.sort(col);
            for (int k = 0; k < col.length; k++) {
                nueva[k][j] = col[k];    
            }
        }
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] != nueva[i][j]){
                    iguales = false;
                }
                
            }
            
        }
        System.out.println(iguales);
        System.out.println("");
        for (int i = 0; i < nueva.length; i++) {
            for (int j = 0; j < nueva[0].length; j++) {
                System.out.print(mat[i][j]+"  ");
                
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 0; i < nueva.length; i++) {
            for (int j = 0; j < nueva[0].length; j++) {
                System.out.print(nueva[i][j]+"  ");
                
            }
            System.out.println("");
        }
    }

    public static int proceso(String nombre1, String nombre2) {
        boolean tiene = false;
        boolean seguir = false;
        ArchivoLectura arch1 = new ArchivoLectura(nombre1);
        ArchivoLectura arch2 = new ArchivoLectura(nombre2);
        int res = 0;
        String name1 = "";
        String name2 = "";
        while (arch1.hayMasLineas()) {
            name1 = arch1.linea();
            seguir = false;
            tiene = false;
            if (name1.equals(name2)) {
                tiene = true;
            }
            while (arch2.hayMasLineas() && !seguir) {
                name2 = arch2.linea();
                if (!name1.equals(name2)) {
                    seguir = true;
                } else {
                    tiene = true;
                }
            }
            if (!tiene) {
                res++;
            }
        }
        arch1.cerrar();
        arch2.cerrar();
        return res;
    }
}
