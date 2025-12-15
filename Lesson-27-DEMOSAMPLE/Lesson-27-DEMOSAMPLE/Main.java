class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

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

    char[] sub3 = new char[21];
    sub[1] ='b';
    sub[2] ='c';
    sub[3] ='d';
    sub[4] ='f';
    sub[5] ='g';
    sub[6] ='h';
    sub[7] ='j';
    sub[8] ='k';
    sub[9] ='l';
    sub[10] ='m';
    sub[11] ='n';
    sub[12] ='p';
    sub[13] ='q';
    sub[14] ='r';
    sub[15] ='s';
    sub[16] ='t';
    sub[17] ='v';
    sub[18] ='w';
    sub[19] ='x';
    sub[20] ='y';
    sub[21] ='z';


    char[] sub4 = new char[21];
    sub[1] ='\u5037';
    sub[2] ='\u5076';
    sub[3] ='\u5089';
    sub[4] ='\u5083';
    sub[5] ='\u5093';
    sub[6] ='\u5096';
    sub[7] ='\u5097';
    sub[8] ='\u5105';
    sub[9] ='\u5106';
    sub[10] ='\u5030';
    sub[11] ='\u5060';
    sub[12] ='\u5073';
    sub[13] ='\u5103';
    sub[14] ='\u5099';
    sub[15] ='\u5098';
    sub[16] ='\u5084';
    sub[17] ='\u5072';
    sub[18] ='\u5064';
    sub[19] ='\u5055';
    sub[20] ='\u5044';
    sub[21] ='\u5038';
    
    // Encoding message
    String file = Input.readFile("test.txt");

    //substituion
    String encodedMsg1 = subEncryption(file,sub,sub2);
    //Input.writeFile("Encode1.txt",encodedMsg1);

    // caesar cipher
    String encodedMsg2 = encode(encodedMsg1);
    //Input.writeFile("Encode2.txt",encodedMsg2);

    // reverse
    String encodedMsg3 = reverse(encodedMsg2);
    Input.writeFile("Encode3.txt",encodedMsg3);

    
    // decoding message
    String file2 = Input.readFile("Encode1.txt");
    
    String decodedMsg1 = reverse(file2);
    //Input.writeFile("Decode1.txt", decodedMsg1);
    
    String decodedMsg2 = decode(decodedMsg1);
    //Input.writeFile("Decode2.txt", decodedMsg2);
    
     String decodedMsg3 = subEncryption(decodedMsg2, sub2, sub);
    //Input.writeFile("Decode1.txt", decodedMsg3);
    
    
  }
  // Level 1 shifting to the 13th letter
  public String rot13(String str) {
  String bld = “”;  
  int ascii;
  for (int i = 0; i < str.length(); i++) {
    ascii = (int) str.charAt(i)
    ascii += 13;
    bld += (char) ascii;
  }
return bld
}
  
  //Level 2 spliting the word in half and switiching the places of the word 
  String encode(String txt){
    String bld="";
    
     
    return bld;
  }

  
  String decode(String txt){
    String bld="";
   
    return bld;
  }

  // Level 3 Substituion encoding
  String subEncryption(String s, char[] sub, char[] sub2,char[]sub3,char[]sub4){
    String bld="";
   
    return bld;
  }
  
  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}