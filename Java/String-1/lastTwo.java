public String lastTwo(String str) {
  if(str.length() > 2){
    return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
  } else if(str.length() == 2){
    return str.charAt(1) + "" + str.charAt(0);
  } else{
    return str;
  }
}
