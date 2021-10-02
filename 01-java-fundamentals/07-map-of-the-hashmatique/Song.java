import java.util.*;

import javax.print.DocFlavor.STRING;
class Song
{
    public static void main(String[] args) {
    HashMap<String,String> band=new HashMap<>();
    band.put("See you again","It's been a long day without you, my friend");
    band.put("Closer","Hey, I was doing just fine before I met you");
    band.put("Shape of you","The club isn't the best place to find a lover");
    band.put("Sorry", "You gotta go and get angry at all of my honesty");
   Set<String> keys=band.keySet();
   for(String key: keys)
   {
       System.out.println(key+": "+band.get(key));
     
   }
        
    }
}