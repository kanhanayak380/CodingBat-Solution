public String frontTimes(String str, int n) {
  String s = "";
  if(str.length() >= 3){
    while(n > 0){
      s = s + str.substring(0, 3);
      n--;
    }
  } else{
    while(n > 0){
      s = s + str;
      n--;
    }
  }
  return s;
}
