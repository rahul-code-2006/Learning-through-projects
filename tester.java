import java.util.ArrayList;

class tester
{
    public static void main(String [] args)
    {
        boolean shipSame = true;
        ship s[]=new ship[3];
        for(int i = 0 ; i < 3;i++)
        {
            s[i]=new ship();
        }
        
        
        ArrayList <ship> ships = new ArrayList<ship>(3);
        gameLogic g = new gameLogic();

        for(int i = 0 ; i < 3 ; i++)
        {
            shipSame = true;
            while(shipSame)
            {
                ships.add(s[i]);
                ships.get(i).setLength();
                ships.get(i).setName(("Ship"+i));
                ships.get(i).setLocation();
                shipSame=false;
                for(int j = 0 ; j<i;j++)
                {
                    shipSame = g.areTheShipsSame(ships.get(i), ships.get(j));
                }
            }
        }

        for(int i = 0 ; i < 3 ; i++)
        {
            System.out.println(ships.get(i).locations);
        }
    }
}