package spkio.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageUtils {
	
	public static byte[] scale(byte[] fileData, int width, int height, String formatName) throws IOException {
		
        ByteArrayInputStream in = new ByteArrayInputStream(fileData);

        BufferedImage img = ImageIO.read(in);
        if (height == 0) {
            height = (width * img.getHeight()) / img.getWidth(); 
        }
        if (width == 0) {
        	width = (height * img.getWidth()) / img.getHeight();
        }
        Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage imageBuff = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        imageBuff.getGraphics().drawImage(scaledImage, 0, 0, new Color(0,0,0), null);

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();

        ImageIO.write(imageBuff, formatName, buffer);

        return buffer.toByteArray();
        
    }
	
}
