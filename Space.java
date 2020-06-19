import java.math.*;
import java.io.*;
import java.util.*;
public class Space
{
// VARIABLES
  int row;
  int col;
  ArrayList<Entity> atSpace;
  ArrayList<Character> onSpace;
  int mVal;
  String type;
  String printChar ="|";
  
  public Space(int r, int c, boolean makeRandom)
  {
    row=r;
    col=c;
    atSpace = new ArrayList<Entity>();
    onSpace = new ArrayList<Character>();
    if(makeRandom)
    {
      rGen();
    }
  }
//METHODS
  
  //Getters
  public String getprintChar()
  {
   String entities="";
   String characters="";
   for(int i =0;i<onSpace.size();i++)
   {
    characters+=onSpace.get(i).getpChar();
   }
   return printChar+characters;
  }
  public ArrayList<Entity> getatSpace()
  {
   return atSpace; 
  }
  public ArrayList<Character> getonSpace()
  {
   return onSpace; 
  }
  
  public void addprintChar(String x)
  {
    printChar += x;
  
  }
  
  
  public void rGen()// randomly generates a number and sets Space type based on it
  {
    String[] Types = {"Forest","Plains"};
    int val= (int)(Math.random()*Types.length);
    setType(val);
    if(type.equals("Forest"))
    {
      mVal=1;
      addprintChar("F");
    }
    else if(type.equals("Plains"))
    {
      mVal=0;
      addprintChar("P");
    }
     
  }
  public void setType(int val)//Determines type by val
  {
   if(val==0)
    {
      type="Forest";
    }
    else if(val==1)
    {
      type="Plains";
    }
     
  }
  public int findEntity(Entity x)
  {
   for(int i =0;i<atSpace.size();i++)
   {
    if(atSpace.get(i).equals(x))
    {
      return i;
    }
   }
   return -1;
  }
   public int findCharacter(Character x)
  {
   for(int i =0;i<onSpace.size();i++)
   {
    if(atSpace.get(i).equals(x))
    {
      return i;
    }
   }
   return -1;
  }
  public void add(Entity x) // Adds Entity to atSpace arrayList
  {
   if(findEntity(x)==-1)
   {
    x.setR(row);
    x.setC(col);
    atSpace.add(x);
   }
  }
  public void add(Character x) // Adds Character to onSpace arrayList
  {
   if(findEntity(x)==-1)
   {
    x.setR(row);
    x.setC(col);
    onSpace.add(x);
   }
  }
  public void remove(Entity x) // Removes Entity to atSpace arrayList
  {
    atSpace.remove(x);
  }
  public void remove(Character x) // Removes Character to onSpace arrayList
  {
    onSpace.remove(x);
  }

}//end of class
