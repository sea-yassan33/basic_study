class conditional_branch {
  public static void main(String[] args) {
    if(true){
      System.out.println("条件式がtrueのため、出力されます");
    }

    int x = 6;
    if (x > 2){
      System.out.println("xは2より大きい");
    }
    if (x >8){
      System.out.println("xは8より大きい");
    }

    int number = 11;
    if (number < 10) {
      System.out.println("10より小さい");
    }else if(number < 20){
      System.out.println("10以上、20より小さい");
    }else{
      System.out.println("20以上");
    }

    int n = 0;
    switch(n){
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
      default:
        System.out.println("凶です");
        break;
    }
  }
}
