public boolean startHi(String str) {
  if(str.length() >= 2){
    return str.charAt(0) == 'h' && str.charAt(1) == 'i';
  } else{
    return false;
  }
}
