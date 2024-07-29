package programs.TwentyTwo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaPrograminFile {

	public static int countOccurence(String str,char ch) {
		char[] chr=str.toCharArray();
		int count=0;
		for(int i=0;i<chr.length;i++) {
			if(chr[i]==ch)
				count++;
		}
		return count;
	}
	
	public static  int checkNoOfProgramInFile(BufferedReader bis) throws IOException {
		int program=0;
		int count=0;
		String line=bis.readLine();
		while(line!=null) {
			//System.out.println(line);
			if(count==0&&line.contains("class")||count==0&&line.contains("interface")) 
				program++;

			count+=countOccurence(line, '{')-countOccurence(line, '}');
			line=bis.readLine();
		}
		return program;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bis=new BufferedReader(new FileReader("Sample.java"));
		int program=checkNoOfProgramInFile(bis);
		System.out.println(program+" prgrams in the File");
		bis.close();

	}

}
