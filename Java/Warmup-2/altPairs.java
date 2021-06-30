public String altPairs(String str) {
  int c = 0;
  String s = "";
  for(int i = 0; i < str.length(); i++){
    if(c > str.length() - 1){
      break;
    }
    s = s + str.charAt(c);
    if(i % 2 == 0){
      c = c + 1;
    } else{
      c = c + 3;
    }
    
  }
  return s;
}
