/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctmatisse;

import com.matisse.MtDatabase;
import com.matisse.MtException;

/**
 *
 * @author Librada Justicia Ruiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MtDatabase baseDatos = new MtDatabase("localhost", "copiadoctorado");
        try{
            baseDatos.open();
            baseDatos.startTransaction();
            insertarObjetos(baseDatos);
        }
        catch(MtException mte){
            System.out.println("MtException: " + mte.getMessage());
        }
        finally{
            if (baseDatos.isTransactionInProgress()){
                baseDatos.commit();
            }
            baseDatos.close();
        }
    }
    
    private static void insertarObjetos(com.matisse.MtDatabase db){
        //Crear objeto departamento
        Departamento departamento = new Departamento(db);
        departamento.setNombre("Acceso a Datos");
        
        //Crear objeto tesis
        Tesis tesis = new Tesis(db);
        tesis.setTitulo("Matisse 2021");
        tesis.setTema("Tarea 04");
        
        //Crear objeto profesor
        Profesor profesor = new Profesor(db);
        profesor.setNombre("Librada Justicia Ruiz");
        profesor.setEmail("ljr@universidad.es");
        profesor.setIngreso(2021);
        
        //Crear relacion
        profesor.setPertenece(departamento);
        profesor.appendDirige(tesis);
        
    }
    
}
