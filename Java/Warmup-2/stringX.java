public String stringX(String str) {
  if(str.length() > 1){
    str = str.charAt(0) + str.substring(1, str.length() - 1).replace("x", "") + str.charAt(str.length() - 1);
  }
  return str;
}
