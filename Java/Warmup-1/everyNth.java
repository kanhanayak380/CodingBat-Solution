public String everyNth(String str, int n) {
  int c = 0;
  String s = "";
  while(c < str.length()){
    s = s + str.charAt(c);
    c = c + n;
  }
  return s;
}
