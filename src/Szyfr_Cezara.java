public class Szyfr_Cezara {
    private String text;
    public void cipher(int shift){
        String modified_text = "";
        shift %= 26;
        for(int i = 0; i < text.length(); i ++){
            char x = (char) (text.charAt(i) + shift);
            if(x > 'z'){
                x = (char) (text.charAt(i) + shift - 26);
            }
            modified_text += x;
        }
        text = modified_text;
        System.out.println(text);
    }
    public void decipher(int shift){
        shift %= 26;
        shift = 26 - shift;
        cipher(shift);
    }
    public Szyfr_Cezara(String s){
        text = s;
    }
}
