package be.odisee.encryptie;

public class EncryptieAchterstevoren {

    public String encrypt(String input){
        String result = "";
        for(int i = 0; i < input.length(); i++){
            result = input.charAt(i) + result;
        }
        return result;
    }

    public String decrypt(String input){
        return encrypt(input);
    }
}
