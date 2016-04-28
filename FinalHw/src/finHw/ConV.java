package finHw;
import java.util.*;
import java.io.*;
public class ConV {
	public ConV() throws IOException{
		String fileName, outputfile;
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Enter a File Name");
		fileName=keyboard.nextLine();
		//open file and create a connection
		File myFile = new File(fileName);
		Scanner InputFile = new Scanner(myFile);
		//read the first line from the file
		String line = InputFile.nextLine();

		//display
		System.out.println("Contents in File :"+line);
		//close
		System.out.println("Enter Output File Name");
		outputfile = keyboard.nextLine();
		PrintWriter outputFile = new PrintWriter(outputfile);
		outputFile.println(line.toUpperCase());
		outputFile.close();
		}

		
	}


