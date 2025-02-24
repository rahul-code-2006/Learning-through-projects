import java.util.ArrayList;

class gameLogic
{
    //Access to built ships
    
    
    
    // Converts number to alphabet
    static String getAlpha(int alphaNum)
    {
        char []c= "ABCDEFG".toCharArray();
        return Character.toString(c[alphaNum]);
    }
    
    // Checks if the ships are same
    static boolean areTheShipsSame(ship s1, ship s2)
    {
            for(int i =  0; i < s2.length ; i++)
            {
                if(s1.locations.contains(s2.locations.get(i)))
                {
                    return true;
                }
            }
              
        return false;
    }


    // Generate 3 ships

    static ArrayList <ship> buildShips()
    {
        ArrayList <ship> ships = new ArrayList<ship>(3);
        boolean shipSame = true;
        ship s[]=new ship[3];
        
        gameLogic g = new gameLogic();
        
        
        for(int i = 0 ; i < 3;i++)
        {
            s[i]=new ship();
        }
        
        for(int i = 0 ; i < 3 ; i++)
        {
            shipSame = true;
            while(shipSame)
            {
                ships.add(s[i]);
                ships.get(i).setLength();
                ships.get(i).setName(("Ship "+(i+1)));
                ships.get(i).setLocation();
                shipSame=false;
                for(int j = 0 ; j<i;j++)
                {
                    shipSame = gameLogic.areTheShipsSame(ships.get(i), ships.get(j));
                }
                if(shipSame=true)
                {
                    ships.remove(i);
                }
            }
        }

        s = null;

        
        
        

        return ships;
    }
}