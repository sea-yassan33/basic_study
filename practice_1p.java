class practice_1p {
  public static void main(String[] args) {
    int[] numbers = {1, 4, 6, 9, 13, 16};

    int oddSum = 0;
    int evenSum = 0;

    for(int i=0; i < numbers.length; i++){
      if (numbers[i] % 2 == 0){
        evenSum += numbers[i];
      }else{
        oddSum += numbers[i];
      }
    }
    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}
