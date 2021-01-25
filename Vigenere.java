public class Vigenere {

    public static String encode(String ptext, String key){
        String ctext = "";
        for (int i = 0; i < ptext.length(); i++){
            int x = (ptext.charAt(i) + key.charAt(i)) % 26;
            //System.out.println(x);
            x += 'A';
            //System.out.println(x);
            ctext += (char)(x);
        }
        return ctext; 
    }

    public static String decode(String ctext, String key){
        String ptext = "";
        for (int i = 0; i < ctext.length(); i++){
            int x = (ctext.charAt(i) - key.charAt(i) + 26) % 26;
            //System.out.println(x);
            x+='A';
            //System.out.println(x);
            ptext += (char)(x);
        }
        return ptext;
    }

    public static void main(String args[]){
        String ptext = "";
        String ctext = "";
        String mode = args[0];
        //System.out.println(mode);
        String key = args[2];

        if (mode.contains("encode")){
            ptext = args[1];
            while(key.length() < ptext.length()){
                key+=key;
            }
            //System.out.println(ptext);
            System.out.println(encode(ptext, key));
        }
        else if (mode.contains("decode")){
            ctext = args[2];
            while(key.length() < ctext.length()){
                key+=key;
            }
            System.out.println(decode(ctext, key));
        } 
        
    }
}