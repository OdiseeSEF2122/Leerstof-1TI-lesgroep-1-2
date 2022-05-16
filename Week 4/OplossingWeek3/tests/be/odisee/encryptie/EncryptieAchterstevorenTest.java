package be.odisee.encryptie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptieAchterstevorenTest {

    @Test
    void encrypt_GivenHello_ReturnsolleH() {
        // Arrange
        EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();
        String input = "Hello";

        // Act
        String output = encryptor.encrypt(input);

        // Assert
        assertEquals("olleH", output);
    }

    @Test
    void decrypt_GivenolleH_ReturnsHello() {
        // Arrange
        EncryptieAchterstevoren encryptor = new EncryptieAchterstevoren();
        String input = "olleH";

        // Act
        String output = encryptor.decrypt(input);

        // Assert
        assertEquals("Hello", output);
    }
}