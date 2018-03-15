package fr.unistra.fizzbuzz;

public class ProblemSolver
{
  public Int2String conv;
  public Displayer disp;
  
  public void solve(int max)
  {
    for(int i = 0; i<max; i++)
    {
      disp.display(conv.convert(i));
    }
    
  }
}
