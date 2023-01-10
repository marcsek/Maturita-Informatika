public class Maturita10{
  public static void main(String[] args){
    Maturita10.tableOutput();
  }
  
  public static void tableOutput(){
    for(int i = 33; i <= 122; i++){
      System.out.printf("%3d    :     %s %n", i, (char) i);
    }
  }
}
