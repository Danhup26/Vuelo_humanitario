/*1. Elaborar un programa en java usando pilas que permita el registro de un vuelo 
en el que de registrar la información de los pasajeros e ir organizando el abordaje de manera automática. 

Tenemos ancianos jóvenes y niños los cuales abordan en un espacio diferente en el avión

- Los niños para poder abordar su edad debe estar entre 2 a 12 años
- Jóvenes de 15 a 25 años
- Ancianos 60 a 80 años
*/

package VueloH;

public class cls_Persona {
        private String str_nombre;
        private int int_edad;
   
    
    public cls_Persona(String nombre, int edad){
        this.str_nombre = nombre;
        this.int_edad = edad;
        
    }
    //SETTERs
    public void setStr_nombre (String str_nombre) {this.str_nombre  = str_nombre;}
    public void setInt_edad (int int_edad) {this.int_edad  = int_edad;}
    
    //GETTERs
    public int getInt_edad(){return this.int_edad;}
    public String getNombre(){return this.str_nombre;}

}
