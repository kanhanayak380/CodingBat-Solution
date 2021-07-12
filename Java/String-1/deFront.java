public String deFront(String str) {    
    if(str.length() >= 2){
      if(str.charAt(0) == 'a' && str.charAt(1) == 'b'){
        return str.substring(0);
      } else if(str.charAt(1) == 'b'){
        return str.substring(1);
      } else if(str.charAt(0) == 'a' && str.charAt(1) != 'b'){
        return str.charAt(0) + str.substring(2);
      } else{
        return str.substring(2);
      }
  }
  return "";
}
