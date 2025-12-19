class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}
    
public String rot13(String str) {
  String bld = "";  
  int ascii;
  for (int i = 0; i < str.length(); i++) {
    ascii = (int) str.charAt(i);
    ascii += 13;
    bld += (char) ascii;
  }
return bld;
}
   
public String derot13(String str) {
  String bld = "";  
  int ascii;
  for (int i = 0; i < str.length(); i++) {
    ascii = (int) str.charAt(i);
    ascii -= 13;
    bld += (char) ascii;
  }
return bld;
}

     //Level 2 spliting the word in half and switiching the places of the word
  
  public static String encode(String txt){
    String bld="";
    double mid = (txt.length()-1) /2.0;
    bld += txt.substring((int) Math.floor(mid), txt.length());
    bld += txt.substring(0, (int) Math.floor(mid));
     
    return bld;
  }
  
  public static String decode(String txt){
    String bld="";
    double mid =( (txt.length()-1) /2.0)+1;
    bld += txt.substring((int) Math.ceil(mid), txt.length());
    bld += txt.substring(0, (int) Math.ceil(mid));
     
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
  void init(){

    // This example we are substituting all lower case
    // letters to another lower case letter.
    char[] sub = new char[5];
    sub[0] = 'a';
    sub[1] = 'e';
    sub[2] = 'i';
    sub[3] = 'o';
    sub[4] = 'u';

    char[] sub2 = new char[5];
    sub2[0] = '\u4655';  // rwa
    sub2[1] = '\u4658';  // Si
    sub2[2] = '\u4680';  // QWA
    sub2[3] = '\u4711';  //  BWA
    sub2[4] = '\u4744';  // XWA

    char[] sub3 = new char[22];
    sub3[1] ='b';
    sub3[2] ='c';
    sub3[3] ='d';
    sub3[4] ='f';
    sub3[5] ='g';
    sub3[6] ='h';
    sub3[7] ='j';
    sub3[8] ='k';
    sub3[9] ='l';
    sub3[10] ='m';
    sub3[11] ='n';
    sub3[12] ='p';
    sub3[13] ='q';
    sub3[14] ='r';
    sub3[15] ='s';
    sub3[16] ='t';
    sub3[17] ='v';
    sub3[18] ='w';
    sub3[19] ='x';
    sub3[20] ='y';
    sub3[21] ='z';


    char[] sub4 = new char[22];
    sub4[1] ='\u5037';
    sub4[2] ='\u5076';
    sub4[3] ='\u5089';
    sub4[4] ='\u5083';
    sub4[5] ='\u5093';
    sub4[6] ='\u5096';
    sub4[7] ='\u5097';
    sub4[8] ='\u5105';
    sub4[9] ='\u5106';
    sub4[10] ='\u5030';
    sub4[11] ='\u5060';
    sub4[12] ='\u5073';
    sub4[13] ='\u5103';
    sub4[14] ='\u5099';
    sub4[15] ='\u5098';
    sub4[16] ='\u5084';
    sub4[17] ='\u5072';
    sub4[18] ='\u5064';
    sub4[19] ='\u5055';
    sub4[20] ='\u5044';
    sub4[21] ='\u5038';
    
    String input = "Hello there!";
    String lvl1 = rot13(input);
    String lvl2 = encode(lvl1);
    String lvl3 = substitutionWrapper(lvl2, sub, sub2, sub3, sub4);
    
    print("Encoded: "+ lvl3);
    
    String delvl1 = substitutionWrapper(lvl3, sub4, sub3, sub2, sub);
    String delvl2 = decode(delvl1);
    String delvl3 = derot13(delvl2);
    print("Decoded: "+delvl3);
  }
}