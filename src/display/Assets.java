package display;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 16, height = 16;
	
	public static BufferedImage player, grass, dirt, stone0, stone1;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(imageLoader.loadImage("/textures/spreadsheet.png"));
		
		player = sheet.crop(0, height, width, height);
		dirt = sheet.crop(width, 0, width, height);
		grass = sheet.crop(0, 0, width, height);
		stone0 = sheet.crop(width*2, 0, width, height);
		stone1 = sheet.crop(width*3, 0, width, height);
	}
	
}
