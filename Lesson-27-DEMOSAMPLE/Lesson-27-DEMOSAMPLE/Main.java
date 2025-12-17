
public String rot13(String str) {
  String bld = “”;  
  int ascii;
  for (int i = 0; i < str.length(); i++) {
    ascii = (int) str.charAt(i);
    ascii += 13;
    bld += (char) ascii;
  }
return bld;
}
    
      //Level 2 spliting the word in half and switiching the places of the word 
  public static String encode(String txt){
    String bld="";
    bld += txt.substring((txt.length()-1)/2, txt.length());
    bld += txt.substring(0, (txt.length()-1)/2);
     
    return bld;
  }
  // check
char replaceChar(char ch, char[] sub, char[] sub2){
    char newChar = ch;    
    for (int i = 0; i < sub.length; i++) {
        if(sub[i] == ch){
            newChar = sub2[i];
        }
    }

    return newChar;
}
  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2){
    String bld="";
    for (int i = 0; i < s.length(); i++) {
    bld += replaceChar(s.charAt(i), sub, sub2);
    }
    return bld;
  }
  


String substitutionWrapper(String s, char[] sub, char[] sub2, char[] sub3, char sub4[]) {
    return subEncryption(subEncryption(s, sub, sub2),sub3, sub4);


}