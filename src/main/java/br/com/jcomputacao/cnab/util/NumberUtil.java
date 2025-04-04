/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.jcomputacao.cnab.util;

/**
 *
 * @author ADM
 */
public class NumberUtil {

    public static Double asDouble(Object o) {
        if (o == null) {
            return 0d;
        }
        if (o instanceof Number) {
            Number n = (Number) o;
            return n.doubleValue();
        }
        throw new UnsupportedOperationException("cast not aplayed");
    }
}
