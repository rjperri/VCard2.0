package com.example.demo.services;

/**
 *
 * @author rjperri
 */
public interface EncryptionService {

    String encryptString(String password);
    boolean checkPassword(String plainPassword, String encryptedPassword);

}
