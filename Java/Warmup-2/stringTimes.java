public String stringTimes(String str, int n) {
  String s = "";
  while(n > 0){
    s = s + str;
    n--;
  }
  return s;
}
