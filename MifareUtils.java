
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;

public class MifareUtils 
{
    public final int MIFARE_1K_SECTOR_COUNT = 16;
    public final int MIFARE_1K_PER_SECTOR_BLOCK_COUNT = 4;
    public ArrayList<String> COMMON_MIFARE_CLASSIC_1K_KEYS = new ArrayList<String>();
    public ArrayList<String> COMMON_MIFARE_CLASSIC_1K_CONTENT = new ArrayList<String>();

    public MifareUtils() throws IOException
    {
        HexUtils util = new HexUtils();
        COMMON_MIFARE_CLASSIC_1K_CONTENT = util.readFromHex("100inhalt.mfd");
        extractKeys(COMMON_MIFARE_CLASSIC_1K_CONTENT);
      
    }
    
    //ArrayList<String>
    public void extractKeys(ArrayList<String> cont)
    {
        StringBuffer buf = new StringBuffer();
        int mainIndex = 0;
        int keyIndex =0;
        boolean flag=true;
        
        while(flag)
        {
            if( mainIndex > MIFARE_1K_SECTOR_COUNT*3 && mainIndex < MIFARE_1K_SECTOR_COUNT*4   )
            {
                System.out.println(cont.get(mainIndex));
            
            }
            
        
        }
        
    
    
    
        //return null;
    }
    
    
    
    
    public static void main(String[] args) throws IOException 
    {
        MifareUtils xx = new MifareUtils();
        
        
        
        
    }

     
    
    
    
    
}
