class  
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
import java.util.Scanner ;

class MatrixDisplay 
{
public static void main(String[] args) 
	{
Scanner in = new Scanner(System.in);
System.out.println("Enter no.of rows");
int rows = in.nextInt();
System.out.println("Enter no.of cols");
int cols = in.nextInt();

int[][] matrix = new int[rows][cols];

System.out.println("Enter the elements of Matrix");

for(int i=0;i<rows;i++) {
for(int j=0;j<cols;j++){
matrix[i][j] = in.nextInt();
}
}

for(int i=0;i<rows;i++) {
for(int j=0;j<cols;j++){
 System.out.print(matrix[i][j] + " ");
 } 
System.out.println(); 
}
 in.close(); 
} 
}
