package stosyiinne;

import java.util.*;

public class StosyIInne 
{
    public static void main(String[] args) 
    {
        Stack<String> stos = new Stack<String>();
        
        stos.push("lala1");
        stos.push("lala2");
        stos.push("lala3");
        stos.push("lala4");
        
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        
        String nazwa = stos.peek();
        
        if(nazwa.equals("lala1"))
            stos.pop();
        else
            System.out.println("nie ma takiego elementu");
        
        Vector<String> wektor = new Vector<String>();
        
        wektor.add("lala");
        
        wektor.get(0);
        
        HashMap a;
        Hashtable b;
    }
    
}
