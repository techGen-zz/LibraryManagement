package com.manamement.library;

public class CheckImage {
	
	@SuppressWarnings("unused")
	private boolean check(String filePath) {
		if(filePath!=null)
		{
		if(filePath.endsWith(".jpeg")||filePath.endsWith(".gif")||filePath.endsWith(".jpg")||filePath.endsWith(".JPEG")||filePath.endsWith(".GIF")||filePath.endsWith(".JPG"))
		{
		return true;
		}
		return false;
		}
		return false;
		}

}
