import java.io.*;
class MakeDirectory{
	public static void main(String args[]){
		File f=new File("d:/a/b/c/d/xyz/danish/new/dani");
		boolean b=f.mkdir();
		System.out.println("Last folder created: "+b);
		
	}
}