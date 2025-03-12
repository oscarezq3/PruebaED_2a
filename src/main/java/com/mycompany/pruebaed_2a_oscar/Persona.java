/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaed_2a_oscar;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

/**
 * La clase Persona representa a una persona con un NIF, nombre, género y fecha
 * de nacimiento. Implementa la interfaz Comparable para ordenar las personas
 * según su NIF.
 *
 * Se incluyen métodos para calcular la edad, modificar los atributos y comparar
 * objetos Persona.
* 
* @author: Óscar Ezquerro Sá
 */
public class Persona implements Comparable<Persona> {

    // NIF de la persona
    private Nif nif;
    // Nombre completo de la persona
    private String nombre;
    // Género de la persona ('M' para masculino, 'F' para femenino, 'X' para otro)
    private char genero;
    // Fecha de nacimiento
    private LocalDate nacimiento;

    /**
     * Constructor por defecto. Inicializa los atributos con valores
     * predeterminados.
     */
    public Persona() {
        nif = new Nif();
        nombre = "";
        genero = ' ';
        nacimiento = LocalDate.of(1990, 1, 1);
    }

    /**
     * Constructor que recibe solo el número de NIF.
     *
     * @param nif Número del NIF.
     */
    public Persona(int nif) {
        this();
        this.nif = new Nif(nif);
    }

    /**
     * Constructor que inicializa todos los atributos de la persona.
     *
     * @param nif Número del NIF.
     * @param nombre Nombre completo de la persona.
     * @param genero Género de la persona ('M', 'F' o 'X').
     * @param dia Día de nacimiento.
     * @param mes Mes de nacimiento.
     * @param ano Año de nacimiento.
     */
    public Persona(int nif, String nombre, char genero,
            int dia, int mes, int ano) {
        this.nif = new Nif(nif);
        this.nombre = nombre;
        this.genero = genero;
        this.nacimiento
                = LocalDate.of(ano, mes, dia);
    }

    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return Period.between(nacimiento, LocalDate.now()).getYears();
    }

    /**
     * Representación en cadena de la persona, mostrando su NIF, nombre y edad.
     * Si el nombre contiene un espacio, lo divide en dos partes (nombre y
     * apellido).
     *
     * @return Cadena con los datos formateados de la persona.
     */
    @Override
    public String toString() {
        if (nombre.split(" ").length > 1) {
            return nif + "\t" + nombre.split(" ")[0]
                    + '\t' + nombre.split(" ")[1] + "\t\t" + getEdad();
        } else {
            return nif + "\t" + nombre + "\t\t\t" + getEdad();
        }
    }

    /**
     * Compara dos objetos Persona por su NIF.
     *
     * @param a Persona con la que se compara.
     * @return true si los NIF son iguales, false en caso contrario.
     */
    public boolean equals(Persona a) {
        if (a == null) {
            return false;
        }
        return a.nif.toString().equals(this.nif.toString());
    }

    /**
     * Compara dos objetos de cualquier tipo para verificar si son iguales.
     *
     * @param obj Objeto con el que se compara.
     * @return true si ambos objetos son de la misma clase y tienen el mismo
     * NIF.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;

        return Objects.equals(this.nif, other.nif);
    }

    /**
     * Implementación del método compareTo para ordenar personas por su NIF.
     *
     * @param o Persona con la que se compara.
     * @return Valor negativo si esta persona tiene un NIF menor, 0 si son
     * iguales, y positivo si es mayor.
     */
    @Override
    public int compareTo(Persona o) {
        return this.nif.toString().compareTo(o.nif.toString());
    }

}
