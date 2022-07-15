package com.example.deepJava.exceptions;

/**
 * Crearemos nuestra propia excepcion en la cual si la Transaccion no esta en mayusculas es incorrecto
 *
 *
 */

class ProfileIdIncorrectException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ProfileIdIncorrectException(String e) {
        super(e);
    }
}

public class OurExceptions {
    static void createTransaction(String profileId) {
        if (!profileId.toUpperCase().equals(profileId)) {
            throw new ProfileIdIncorrectException("profileId must be in upper case");
        }
        System.out.println("Transaction created");
    }
    public static void main(String[] args) {
        try {
            createTransaction("COMOSERPROaGRAMADOR.COM"); // Deben ser en mayusculas para que salga correcto
        } catch(ProfileIdIncorrectException e) {
            System.out.println("ERROR :" + e.getMessage());
        }
    }
}
