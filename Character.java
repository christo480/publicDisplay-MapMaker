public class Character extends Entity
{
//VARIABLES
  private String name;
  private String[] skill;
  private int mov;
  private int HP;
  private boolean isAlive;
  private String pChar;
  private int charID;
  
  public Character(int id)
  {
   canFly=false;
   canMove=true;
   canAct=true;
   charID = id;
   if(charID == 0)// game characters are created by comparing id to id stored in database
    {
      name= "Zack";
      skill= new String[]{"Bullet Volley","Activate S.T. Suit","Flash Dash","Flash Punch"};
      mov= 5;
      isAlive=true;
      pChar="|ZO";
      
      
    }
  }
 
//METHODS
  //Getters
  public String getpChar()
  {
   return pChar;
  }
  public int getID()
  {
   return charID;
  }
  public int getR()
  {
   return r;
  }
  public int getC()
  {
   return c;
  }
  public int getMov()
  {
   return mov;
  }
  public boolean getcanMove()
  {
   return canMove;
  }
  //Setters
  public void setR(int newR)
  {
   r=newR;
  }
  public void setC(int newC)
  {
   c=newC;
  }
  
}
