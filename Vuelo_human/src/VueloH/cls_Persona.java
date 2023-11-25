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
   
    
    public cls_Personasona(String n, String c){
        this.str_nombre = n;
        this.str_codigo = c;
        
    }
    //SETTERs
    public void setNombre (String nombre) {this.str_nombre  = nombre;}
    public void setDireccion (String direccion) {this.str_direccion  = direccion;}
    
    //GETTERs
    public String getCodigo(){return this.str_codigo;}
    public String getNombre(){return this.str_nombre;}

}
