package com.example.problema_1;

import java.math.BigInteger;

public class NumeroEntero {
    private BigInteger valor;

    public NumeroEntero(String numero) {
        this.valor = new BigInteger(numero);
    }

    public NumeroEntero dividir(NumeroEntero otroNumero) {
        if (otroNumero.esCero()) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        BigInteger resultado = this.valor.divide(otroNumero.getValor());
        return new NumeroEntero(resultado.toString());
    }

    public boolean esCero() {
        return this.valor.equals(BigInteger.ZERO);
    }

    public BigInteger getValor() {
        return this.valor;
    }
}

