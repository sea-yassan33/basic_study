class array_study {
  public static void main(String[] args) {
    String[] names = {"ジェイムス","キャサリン","キャンベル"};
    System.out.println(names[0]);
    System.out.println(names[2]);

    String[] languages = {"Ruby", "PHP", "Python"};
    System.out.println(languages[1]);
    languages[1]="Java";
    System.out.println(languages[1]);

    for(int i= 0; i < languages.length; i++){
      System.out.println(languages[i]);
    }
    // 拡張for文
    for(String language:languages){
      System.out.println(language);
    }
  }
}
