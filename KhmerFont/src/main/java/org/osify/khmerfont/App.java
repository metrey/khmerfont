package org.osify.khmerfont;

import java.io.File;
import java.io.IOException;

import org.apache.fontbox.cff.Type1FontFormatter;
import org.apache.fontbox.ttf.HeaderTable;
import org.apache.fontbox.ttf.PostScriptTable;
import org.apache.fontbox.ttf.TTFParser;
import org.apache.fontbox.ttf.TTFTable;
import org.apache.fontbox.ttf.TrueTypeFont;

import sun.font.TrueTypeGlyphMapper;


/**
 * Hello world!
 *
 */
public class App 
{

    final static String FILE_NAME = "E:\\Work\\Java\\Mine\\Spring\\KhmerFont\\src\\main\\resources\\data\\Kh-Battambang.ttf";    
    
    public static void main( String[] args )
    {
        
      TTFParser parser = new TTFParser();
      try {
          
        TrueTypeFont font = parser.parseTTF(new File(FILE_NAME));
        PostScriptTable postScriptTable = font.getPostScript();
        for (String phName : postScriptTable.getGlyphNames()) {
            System.out.println(phName);    
        }
        
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
      
    }
}
