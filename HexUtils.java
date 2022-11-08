
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HexUtils 
{
    private static final char[] HEX_CHARS = "0123456789ABCDEF".toCharArray();
    
    public HexUtils()
    {
    
    
    }
    
    public static byte[] hexStringToBytes(String s) 
    {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }
    
    public static String bytesToHexString(byte[] bytes) 
    {
        char[] hexChars = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int v = bytes[i] & 0xFF;
            hexChars[i * 2] = HEX_CHARS[v >>> 4];
            hexChars[i * 2 + 1] = HEX_CHARS[v & 0x0F];
        }
        return new String(hexChars);
    }
     
     
    public static ArrayList readFromHex(String filename) throws FileNotFoundException, IOException
    {
           ArrayList<String> content = new ArrayList<String>();
           FileInputStream in = new FileInputStream(filename);
           int read;
           while((read = in.read()) != -1)
           {
               content.add(Integer.toHexString(read));
           }
           
           return content;
     }
  
     
}
    

