public boolean hasBad(String str) {
  if((str.length() >= 3 && str.substring(0, 3).equals("bad")) 
  || (str.length() > 3 && str.substring(1, 4).equals("bad"))){
    return true;
  }
  return false;
}
