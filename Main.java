public class Main{

  private static int y = 0;
  public static String hanoi(int nDisks, int fromPeg, int toPeg){
    y++;
    if(nDisks == 1){
      return "Disk from tower " + fromPeg + " to tower " + toPeg + ";";
    }
    else{
      String sol1, sol2, sol3;
      int helpPeg = 6 - fromPeg - toPeg;

      sol1 = hanoi(nDisks - 1, fromPeg, helpPeg);
      sol2 = "Disk from tower " + fromPeg + " to tower " + toPeg + ";";
      sol3 = hanoi(nDisks - 1, helpPeg, toPeg);

      return sol1 + sol2 + sol3;
    }
  }
  public static void main (String[] args){
    int nDisks = 4;
    String StepsToSolution = hanoi(nDisks, 1, 3);
    Instructions n = new Instructions();
    n.instructions();
    System.out.println("The minimum amount of steps needed to solve this is " + y + " steps.");
    for(String step : StepsToSolution.split(";")){
      System.out.println(step);
    }
    Output m = new Output();
    m.output();
    Trophy b = new Trophy();
    b.printTrophy();
  }
}