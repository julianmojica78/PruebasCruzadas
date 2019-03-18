package com.mycompany.pruebasunitarias;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase Principal que tendra las clases y atributos 
 * @author Julian David Bustos Mojica
 */
public class Principal {
  /**
   * mapa que usaremos para guardar las personas
   */
  Map<Integer, Persona> mapaAbuelo = new HashMap();
  
    public Principal() {
    }
/**
 * Clase Imprimir que recibe un entero llave y el mapa  ansestro y nos retorna el contenedor
 * @param llave
 * @param Ansestro
 * @return Contenedor
 */
    public String  imprimir (int llave , Map Ansestro  ){
    mapaAbuelo.putAll(Ansestro);
    String contenedor = "";
    /**
     * for que recorre el mapaAbuelo
     */
    for (Integer KeyAbuelo : mapaAbuelo.keySet()){
        Persona pAbuelo = mapaAbuelo.get(KeyAbuelo);
        for(Integer KeyPadre : pAbuelo.getHijos().keySet()){
            Persona  pPadre = pAbuelo.getHijos().get(KeyPadre);
            for(Integer KeyHijo : pPadre.getHijos().keySet()){
                Persona pHijo = pPadre.getHijos().get(KeyHijo);
              //if(mapaAbuelo.containsKey(Llave)){
                if(KeyAbuelo == llave ){
    
                contenedor = contenedor.concat(pAbuelo.getNombre());
                contenedor = contenedor.concat(pPadre.getNombre());
                contenedor = contenedor.concat(pHijo.getNombre());
                System.out.println("Abuelo "+pAbuelo.getNombre());
                System.out.println("    padre " + pPadre.getNombre());
                System.out.println("    hijo " +pHijo.getNombre());  
            //}
              }              
                else if(mapaAbuelo.get(KeyAbuelo).getHijos().containsKey(llave)){
                 if(KeyPadre ==llave){
                  
                  contenedor = contenedor.concat(pAbuelo.getNombre());
                  contenedor = contenedor.concat(pPadre.getNombre());
                  contenedor = contenedor.concat(pHijo.getNombre());
                System.out.println("Abuelo "+pAbuelo.getNombre());
                System.out.println("    padre " + pPadre.getNombre());
                System.out.println("    hijo " +pHijo.getNombre());  
                 }   
                }     
                 else if(mapaAbuelo.get(KeyAbuelo).getHijos().get(KeyPadre).getHijos().containsKey(llave)){
                 if(KeyHijo ==llave){
                 contenedor = contenedor.concat(pAbuelo.getNombre());
                 contenedor = contenedor.concat(pPadre.getNombre());
                 contenedor = contenedor.concat(pHijo.getNombre());
                     
                System.out.println("Abuelo "+pAbuelo.getNombre());
                System.out.println("    padre " + pPadre.getNombre());
                System.out.println("    hijo " +pHijo.getNombre());  
                 
                 }   
                }
            }
        }
    }
return contenedor;
} 
   
}
