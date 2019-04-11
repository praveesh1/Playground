import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int row=sc.nextInt();
    int col=sc.nextInt();
    int a[][]=new int[row][col];
    for(int i=0;i<row;i++)
      for(int j=0;j<col;j++)
        a[i][j]=sc.nextInt();
    int mat[][]=new int[50][50];
    for(int i=0;i<row;i++)
      for(int j=0;j<col;j++)
        mat[j][i]=a[i][j];
    for(int i=0;i<row;i++){
    	for(int j=0;j<col;j++){
        	System.out.print(mat[i][j]+" ");
        }
      	System.out.println();
    }
  }
}