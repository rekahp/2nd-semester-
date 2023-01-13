package HorseACtivity;

import java.util.ArrayList;

/**********************************************************************
 * Sample solution for Activity 3.7.4
 **********************************************************************/
public class RandomPermRunner
{
  public static void main(String[] args)
  {
    ArrayList <String> Horses = new ArrayList<String>();
    ArrayList<String> randHorses = new ArrayList<String>();
    int[] randNums = RandomPermutation.next(10);
    System.out.println(java.util.Arrays.toString(randNums));

  
    Horses.add("Trigger");
    Horses.add("Silver");
    Horses.add("Lady");
    Horses.add("Patches");
    Horses.add("Duke");
    Horses.add("Major");
    Horses.add("Misty");
    Horses.add("Buddy");
    Horses.add("Autumn");
    Horses.add("Spirit");

    for(int rand: randNums){
      randHorses.add(Horses.get(rand-1));
    }
    System.out.println(randHorses);
    
    for(int i = 0; i < randHorses.size(); i = i + 2)
    {
      try{
        System.out.println(randHorses.get(i) + " and " + randHorses.get(i + 1));
      } catch(Exception e){
        System.out.println(randHorses.get(i) + " doesn't have a pair");
      }
    }


  }
}

