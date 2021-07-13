public String withoutX2(String str) {
  if(str.length() >= 2 && str.charAt(1) == 'x'){
    str = str.charAt(0) + str.substring(2);
  }
  if(str.length() > 0 && str.charAt(0) == 'x'){
    str = str.substring(1);
  }
  return str;
}
