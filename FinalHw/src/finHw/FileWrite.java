package finHw;
import java.util.*;
import java.io.*;
public class FileWrite {
	public FileWrite()throws IOException {
		String fileName, outputfile;
		Scanner keyboard = new Scanner (System.in);
		System.out.println();
		System.out.println("Please enter your Name");
		String line = keyboard.nextLine();
		//display
		System.out.println("Your Name :"+line);
		//close
		System.out.println("Enter Output File Name");
		outputfile = keyboard.nextLine();
		PrintWriter outputFile = new PrintWriter("C:\\Users\\College\\Desktop\\"+outputfile+".txt");
		outputFile.println(line+" You are a Star!!!");
		outputFile.close();
		System.out.println("File Will save In C drive Check for secret message");
	}

}
