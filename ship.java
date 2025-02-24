import java.util.ArrayList;

class ship
{
    //Instance var
    String name;
    ArrayList <String> locations = new ArrayList<String>();
    gameLogic g = new gameLogic();
    int length;
    

    // methods
    
    //set name
    void setName(String s)
    {
        name = s;

    }

    void setLength()
    {
        //Set length smth between 3 to 5
        length = ((int)(Math.random()*2))+3;
    }
    
    // set location
    void setLocation()
    {
        
        // alignment if horizontal or vertical
        int alignment = (int)(Math.random()*10);;
        
        
        
        if(alignment<5)
        {
            //horizontal alignment
            int alphaNum = (int)(Math.random()*6);
            String alpha = g.getAlpha(alphaNum);
            int number = (int)(Math.random()*(7-length));
            number++;
            for(int i = 0;i<length;i++)
            {
                locations.add(alpha+number);
                number++;
            }
        }
        
        else
        {
            //vertical alignment
            int number = (int)(Math.random()*6);
            number++;
            int alphaNum = (int)(Math.random()*(7-length));
            String alpha[] = new String[length];
            for(int i = 0; i < length;i++)
            {
                alpha[i]=g.getAlpha(alphaNum);
                alphaNum++;
            }
            for(int i = 0;i<length;i++)
            {
                locations.add(alpha[i]+number);
            }
        }
    
    }
    
    
    
    
}