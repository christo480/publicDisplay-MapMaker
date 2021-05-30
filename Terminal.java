import java.util.*;
import java.math.*;
public class Terminal // Manages user interaction
{

    ArrayList<Entity> Objects_List;
    ArrayList<Character> Characters_List;
    ArrayList<Map> Map_List;

    public void add(Entity newEntity)
    {
        Objects_List.add(newEntity);
    }
    public void add(Character newCharacter)
    {
        Characters_List.add(newCharacter);
    }
    public void add(Map newMap)
    {
        Map_List.add(newMap);
    }
    public void remove(Entity newEntity)
    {
        Objects_List.remove(newEntity);
    }
    public void remove(Character newCharacter)
    {
        Characters_List.remove(newCharacter);
    }
    public void remove(Map newMap)
    {
        Map_List.remove(newMap);
    }
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Map test = new Map(10,10);
        Character Zack = new Character(0);//ID number creates character. No two characters share the same ID number
        test.add(Zack,0,0);    
        test.printMap();
        
        while(Zack.getcanMove())
        {
        System.out.println("Input coordinates");
        System.out.println("Input X");
        int xMov =input.nextInt();
        System.out.println("Input y");
        int yMov =input.nextInt();
        if(Math.sqrt(Math.pow(xMov-Zack.getR(),2) + Math.pow(yMov-Zack.getC(),2))<=Zack.getMov())
        {
            test.move(Zack,xMov,yMov);
            test.printMap();
        }      
        else
        {
            System.out.println("Invalid Location. "+ Zack.getName()+ " cannot move that far.");
        }

        
        
        }
        
  }
}
