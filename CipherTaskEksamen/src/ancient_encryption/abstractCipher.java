package ancient_encryption;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kim Christensen
 */
public class abstractCipher implements CipherInterface{
    
    public int findCharIndex(char ch){
        int index = -1;
        for(int i = 0; i < ALPHABETH.length;i++){
            if(ALPHABETH[i] == ch){
                index = i;
                break;
            } 
        }
        return index;
    }

    @Override
    public String encrypt(String original) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String decrypt(String encrypted) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
