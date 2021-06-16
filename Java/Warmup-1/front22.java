public String front22(String str) {
  if(str.length() < 2){
    return str + str + str;
  } else{
    String s = str.charAt(0) + "" + str.charAt(1);
    return s + str + s;
  }
}
