public String front3(String str) {
  String s = "";
  if(str.length() <= 3){
    s = str + str + str;
  } else{
    s = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3);
  }
  return s;
}
