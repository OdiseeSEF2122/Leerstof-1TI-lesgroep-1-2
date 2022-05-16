package be.odisee.encryptie;

public abstract class EncryptionAlgorithm {

    // Punt komma bij abstract !
    public abstract String encrypt(String input);

    public abstract String decrypt(String output);

}
