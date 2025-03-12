/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaed_2a_oscar;

import java.util.TreeSet;

/**
 * Esta clase representa un curso que contiene una lista de alumnos. Los alumnos
 * se almacenan en un TreeSet, lo que garantiza que estén ordenados y no haya
 * duplicados.
 *
 * @author Óscar Ezquerro Sá
 */
public class Curso {

    // Nombre del curso
    private String nombre;

    // Conjunto de alumnos del curso, almacenados en un TreeSet
    private TreeSet<Persona> listaAlumnos;

    protected String getNombre() {
        return nombre;
    }

    /**
     * Constructor de la clase Curso
     *
     * @param nombre Nombre del curso
     */
    public Curso(String nombre) {
        this.nombre = nombre;
        listaAlumnos = new TreeSet<>();
    }

    /**
     * Genera una representación en cadena del curso, mostrando la lista de
     * alumnos
     *
     * @return Una cadena formateada con el nombre del curso y la lista de
     * alumnos
     */
    @Override
    public String toString() {
        String s = "--------------------" + nombre + "-----------------\n";
        s += "NumExp\tNIF\t\tNombre\t\tApellidos\n";
        s += "-------------------------------------------------\n";
        for (Persona listaAlumno : listaAlumnos) {
            s += listaAlumno + "\n";
        }
        return s;
    }

    /**
     * Método que añade un Alumno a la lista de alumnos del curso
     * 
     * @param p Objeto de tipo Persona que representa al alumno a añadir.
     */
    public void aniadirAlumno(Persona p) {
        listaAlumnos.add(p);
    }
}

