package cn;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
/**
 * º”‘ÿÕº∆¨
 * @author Dell
 *
 */

public class Gameutil {
	public static Image getImage(String path){
		URL u=Gameutil.class.getClassLoader().getResource(path);
		BufferedImage img= null;
		try {
			img=ImageIO.read(u);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return img;
	} 
}
