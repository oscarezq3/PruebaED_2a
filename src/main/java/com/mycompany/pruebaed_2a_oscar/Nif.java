/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pruebaed_2a_oscar;

/**
 * Esta clase representa un Número de Identificación Fiscal (NIF) en España. Un
 * NIF consta de un número y una letra de control, que se calcula a partir del
 * número.
 *
 * La clase incluye métodos para calcular la letra correspondiente, modificar el
 * NIF y compararlo con otros objetos.
 *
 * @author Óscar Ezquerro Sá
 */
public class Nif {

    // Número del NIF
    private int numero;
    // Letra del NIF asociada al número
    private char letra;

    //CONSTANTE: no accesible - compartido por todo - no modificable
    private static final char[] LETRAS
            = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
                'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
                'C', 'K', 'E'};

    /**
     * Calcula la letra correspondiente a un número de NIF.
     *
     * @param numero Número del NIF.
     * @return Letra correspondiente según la tabla de letras del NIF.
     */
    private static char calcularLetra(int numero) {
        return LETRAS[numero % 23];
    }

    protected Nif() {
        this.numero = 0;
        this.letra = ' ';
    }

    protected Nif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Devuelve una representación en cadena del NIF en el formato
     * "Número-Letra".
     */
    @Override
    public String toString() {
        return numero + "-" + letra;
    }

    protected void setNif(int numero) {
        this.numero = numero;
        this.letra = calcularLetra(numero);
    }

    /**
     * Compara este NIF con otro objeto para verificar si son iguales. Dos NIF
     * son iguales si tienen el mismo número y la misma letra.
     *
     * @param obj Objeto con el que se compara.
     * @return true si ambos NIF son iguales, false en caso contrario.
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return this.letra == other.letra;
    }
}

