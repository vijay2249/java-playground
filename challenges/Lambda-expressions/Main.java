import java.util.function.Consumer;
import java.util.Arrays;

class Main{
  public static void main(String[] args){
    Consumer<String> printWords = new Consumer<String>(){
      @Override
      public void accept(String sentence){
        String[] parts = sentence.split(" ");
        for(String part: parts){
          System.out.println(part);
        }
      }
    };

    Consumer<String> words = sentence -> {
      String[] parts = sentence.split(" ");
      Arrays.asList(parts).forEach(s -> System.out::println);
    };

    printWords.accept("Hello there, my friend. How are you?");
    words.accept("Hello there, my friend. How are you?");

    Function<String, String> everySecondCharOut = source ->{
      StringBuilder returnVal = new StringBuilder();
      for(int i=0;i<source.length();i++){
        if(i%2==1){
          returnVal.append(source.charAt(i));
        }
      }
      return returnVal.toStrin();
    };

    Supplier<String> s = () -> "This is return string"; 
    System.out.println(s.get());

  }

  public static String everySecondChar(String source){
    StringBuilder returnVal = new StringBuilder();
    for(int i=0;i<source.length();i++){
      if(i%2==1){
        returnVal.append(source.charAt(i));
      }
    }
    return returnVal.toStrin();
  }

  public static String everySecondCharacter(Function<String, String> f, source){
    return f.apply(source);
  }

  public static String everySecondCharacter(UnaryOperator<String> f, source){
    return f.apply(source);
  }
}