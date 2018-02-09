/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ancient_encryption;

/**
 *
 * @author Kim Christensen
 */
public class AtbashCipher extends abstractCipher {
    char[] messageCharArray;
    int counter = 1;
    String alphabet = ALPHABETH.toString();
    String encryptedMessage = "";
    @Override
    public String encrypt(String message){
        messageCharArray = message.toCharArray();
        int length = messageCharArray.length;
        int[] messageIntArray = new int[messageCharArray.length];
        for(int i = 0; i < length; i++){
            if(Character.isLetter(messageCharArray[i])){
                messageIntArray[i] = findCharIndex(messageCharArray[i]);
                encryptedMessage+= messageCharArray[i];
                System.out.println(messageIntArray[i]);
            }
        }
        for(int i = 0; i < length; i++){
            int temp;
            if(counter != length){
            messageIntArray[i] = messageCharArray[length-counter];
            counter++;
            }
        }
        return encryptedMessage;
    }
}
