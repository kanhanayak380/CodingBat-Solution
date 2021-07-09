public String lastChars(String a, String b) {
  if(a.length() > 1 && b.length() == 0){
    return a.substring(0, 1) + "@";
  }
  if(a.length() == 0 && b.length() > 1){
    return "@" + b.substring(b.length() - 1);
  }
  if(a.length() == 0 && b.length() == 0){
    return "@@";
  }
  return a.substring(0, 1) + b.substring(b.length() - 1);
}
