public String stringSplosion(String str) {
  String s = "";
  for(int i = 0; i < str.length(); i++){
    for(int j = 0; j <= i; j ++){
      s = s + str.charAt(j);
    }
  }
  return s;
}
