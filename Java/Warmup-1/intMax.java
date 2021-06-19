public int intMax(int a, int b, int c) {
  int l = 0;
  if(a > b){
    l = a;
  } else{
    l = b;
  }
  if(l < c){
    l = c;
  }
  return l;
}
