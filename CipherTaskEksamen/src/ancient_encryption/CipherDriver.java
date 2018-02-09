package ancient_encryption;

/**
 *
 * @author erso 
 *  Udleveret driver klasse til opgave 2, VOP eksamen 10 juni 2016
 */
public class CipherDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CipherInterface cipher;

        String message = "Her har vi en Meddelelse, som er hemmelig!";
        System.out.println("Original: \n" + message);
        System.out.println("Testing char thing");
        char s = 's';
        String test2 = "hej med dig";
        AtbashCipher test = new AtbashCipher();
        System.out.println(test.findCharIndex(s));
        System.out.println(test.encrypt("hej"));
        
        

        // Fjern ud-kommenteringen, når AtbashCipher skal testes
//        cipher = new AtbashCipher();
//        String enc = cipher.encrypt(message);
//        System.out.println("Atbash: \n" + enc);
//        System.out.println(cipher.decrypt(enc));

        // Fjern ud-kommenteringen, når CeasarCipher skal testes
//        cipher = new CeasarCipher(13);
//        enc = cipher.encrypt(message);
//        System.out.println("Ceasar 13: \n" + enc);
//        System.out.println(cipher.decrypt(enc));

    }

}
