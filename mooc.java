import java.util.Scanner;

class mooc2_3
{
  Scanner scanner = new Scanner(System.in);
  public void counting()
  {
    int output = 0; 
    int input = Integer.valueOf(scanner.nextLine());
    while (input >= output)
    {
      System.out.println(output);
      output = output + 1;
    }
  }
  public void Counting_to_hundred()
  {
    int input = Integer.valueOf(scanner.nextLine());
    while (input <= 100)
    {
      System.out.println(input);
      input = input + 1;
    }
  }
  public void From_where_to_where()
  {
    System.out.println("Where to?");
    int to = Integer.valueOf(scanner.nextLine());
    System.out.println("Where from?");
    int from = Integer.valueOf(scanner.nextLine());
    for (int i = from; i < to; i++)
    {
      from = from + 1;
      System.out.println(from);
    }
  }
}

  