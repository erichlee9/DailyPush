package NameLoops;

public class ProductPrinter {

	public static void main(String[] args) {
	
			String[] firstnames= {"Adam","Alexis","Dennis","Jose","Jessica","Meghan","Memphis","Nicky","Sarah","William"};
			String[] middlenames= {"Lee","Evan","Larae","Denise"};
			String[] lastnames= {"Adamson","Bond","Brown","Johnson","Gallagher","Smith","Thompson","Perez","Snow","Tran"};
			
			
			for (int i = 0; i < firstnames.length; i++) {
				for (int j = 0; j < middlenames.length; j++) {
					for (int j2 = 0; j2 < lastnames.length; j2++) {
						System.out.print(firstnames[i]+" "+middlenames[j]+" "+lastnames[j2]+"\n"); //discovered syso print doesn't change line, forced it with \n
						System.out.println(firstnames[i]+" "+middlenames[j]+" "+lastnames[j2]);
					}
					
				}
			}
			

	}

}
