/**
 * 
 */
package org.osify.khmerfont;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.osify.khmerfont.common.KhmerFontHelper;

/**
 * @author pongsametrey.sok
 *
 */
public class KhmerFontToImageMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	String ch = "សួស្តី ប្រិយ​មិត្ត! ស្វាគមន៍​មក​កាន់​ប្រទេសកម្ពុជា!";
	BufferedImage img = KhmerFontHelper.stringToBufferedImage(ch);
	System.out.println(img);
	File outputfile = new File("c:/tmp/saved-long.png");
	try {
	    ImageIO.write(img, "png", outputfile);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
    
}
