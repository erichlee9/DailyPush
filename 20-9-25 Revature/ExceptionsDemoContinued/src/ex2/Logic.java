package ex2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Logic {//this is that clss
	
	public void openFile(String fileName) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(fileName);
	}

	
	public int divide(int x, int y) {
		return x/y;
	}
}