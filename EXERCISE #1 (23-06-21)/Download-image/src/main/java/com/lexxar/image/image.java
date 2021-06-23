package com.lexxar.image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.net.ssl.HttpsURLConnection;

public class image {

	private static final String HTTPS_URL = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/1b/FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg/1024px-FC_Bayern_M%C3%BCnchen_logo_%282017%29.svg.png";
	private static final String LOCAL_URL = "C://Users/Jiube/Desktop/ImageFromJava/";
	
	public static void main(String[] args) {
		
		URL url = null;
		HttpsURLConnection connection = null;
		BufferedImage imageBufered = null;
		File file = null;
		
		try {
			url = new URL(HTTPS_URL);
			connection = (HttpsURLConnection) url.openConnection();
			file = File.createTempFile("tmp", "FC_Bayern_M.png", new File(LOCAL_URL));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (InputStream inputStream = connection.getInputStream();) {
			
			ImageInputStream imageInput = ImageIO.createImageInputStream(inputStream);
			imageBufered = ImageIO.read(imageInput);
			ImageIO.write(imageBufered, "png", file);
			System.out.println(file.getPath());
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
