import java.util.ArrayList;
import java.util.Scanner;

class battleship
{
    public static void main(String [] args)
    {
        //Declaring variables
        
        
        user us = new user();
        Scanner sc = new Scanner(System.in);
        ArrayList <ship> ships = gameLogic.buildShips();
        

        //User makes a guess
        loop:
        while(true)
        {
            System.out.println("Make your guess :");
            us.getGuess(sc);
            boolean hit=false; 
            
            //Check guess
            innerloop:
            for(int j = 0 ; j < ships.size() ; j++)
            {
                int index = ships.get(j).locations.indexOf(us.guess);
                    if(index >= 0)
                    {
                        ships.get(j).locations.remove(index);
                        hit = true;
                        if(ships.get(j).locations.isEmpty())
                        {
                            
                            String name = ships.get(j).name;
                            ships.remove(j);
                            if(ships.isEmpty())
                            {
                                System.out.println("KILLED "+ name);
                                System.out.println("You won!");
                                break loop;
                            }
                            else
                            {
                                System.out.println("KILLED "+ name);
                                break innerloop;
                            }
                        }
                        else
                        {
                            System.out.println("HIT!");
                            break innerloop;
                        }

                    }
                
            }
            if(hit==false)
            {
                System.out.println("Miss");
            }
            
            
        }
    }
}