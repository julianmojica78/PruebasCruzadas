package com.mycompany.pruebasunitarias;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase Persona donde declaramos clases y atributos que vamos a usar
 * @author Julian David Bustos Mojica
 */
public class Persona {
    /**
     * atributo que contiene la identificacion
     */
    private int identificacion;
    /**
     * atributo que contiene el nombre
     */
    private String nombre;
    /**
     * atributo que contiene el mapa 
     */
    private Map<Integer,Persona> hijos = new HashMap();

    /**
     * Constructor donde inicializamos las varibles
     * @param identificacion
     * @param nombre 
     */
    public Persona(int identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }
    /**
     * retorna el valor de la varibale identificacion
     * @return identificacion
     */
    public int getIdentificacion() {
        return identificacion;
    }
    /**
     * modifica el atributo de identificacion
     * @param identificacion 
     */
    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }
    /**
     * Retorna el valor de la variable Nombre
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el valor del atributo de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Retorna los valores del mapa hijos
     * @return hijos
     */
    public Map<Integer, Persona> getHijos() {
        return hijos;
    }
    /**
     * modifica el atributo de mapa hijos
     * @param hijos 
     */
    public void setHijos(Map<Integer, Persona> hijos) {
        this.hijos = hijos;
    }
}
