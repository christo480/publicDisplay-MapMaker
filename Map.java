import java.util.*;
public class Map
{
  int[] size;
  int playersOnMap;
  boolean isDestroyed;
  Space[][] mapSpace;
  Scanner input = new Scanner(System.in);
  static int players;
  
  
  public Map(int xSize, int ySize)
  {
    size = new int[2];
    size[0]=xSize;
    size[1]=ySize;
    players =0;
    isDestroyed = false;
    mapSpace = new Space[size[0]][size[1]];
    for(int r=0;r<size[0];r++)
    {
      for(int c=0;c<size[1];c++)
      {
        mapSpace[r][c]=new Space(r,c,true);
      }
    }
  }
  public void printMap()
  {
  for(int r=0;r<size[0];r++)
  {
    for(int c=0;c<size[1];c++)
    {  
      System.out.print(mapSpace[r][c].getprintChar());
    }
    System.out.println();
  }
  }
  public void genMap()
  {
    for(int r=0;r<size[0];r++)
    {
      for(int c=0;c<size[1];c++)
      {
        mapSpace[r][c]=new Space(r,c,true);
      }
    }
  }
  public void destroy()
  {
    isDestroyed =true;
  }
  public void add(Entity newE ,int r,int c)
  {
    mapSpace[r][c].add(newE);
  }
  public void add(Character newC ,int r,int c)
  {
    mapSpace[r][c].add(newC);
    playersOnMap++;
  }
  public void remove(Entity newE ,int r,int c)
  {
    mapSpace[r][c].remove(newE);
  }
  public void remove(Character newC ,int r,int c)
  {
    mapSpace[r][c].remove(newC);
    playersOnMap--;
  }
  public Character findID(int id)
  {
   for(int r=0;r<size[0];r++)
   {
      for(int c=0;r<size[1];c++)
      {
        ArrayList<Character> onSpace = mapSpace[r][c].getonSpace();
        for(int i =0;i<onSpace.size();i++)
        {
         if(onSpace.get(i).getID()!=-1 && onSpace.get(i).getID()==id)
         {
          return onSpace.get(i); 
         }
        }
      }
   }
   return null;
  }
  public void move(Character x)
  {
     mapSpace[x.getR()][x.getC()].remove(x);
     mapSpace[x.getR()][x.getC()].add(x);
    
  }
    
    
}
