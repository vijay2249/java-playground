import java.util.List;

class ComsumerExpression{

  public static void main(String[] args){
    List<String> list = new ArrayList<>(List.of("alpha", "brave", "charlie", "delta"));

    for(String s : list){
      System.out.println(s);
    }

    displayDashes(20);

    list.forEach(s -> sysOut(s));
  }
}