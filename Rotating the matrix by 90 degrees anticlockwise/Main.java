import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
		Scanner sc=new Scanner(System.in);     
    	int row=sc.nextInt();
    	int col=sc.nextInt();
    	int a[][]=new int[row][col];
    	for(int i=0;i<row;i++)
          for(int j=0;j<col;j++)
            a[i][j]=sc.nextInt();
    	int mat[][]=new int[row][col];int k=row-1;int l=col-1;
    	for(int i=0;i<=col-1;i++){
        	for(int j=row-1;j>=0;j--)
            {
            	mat[k][l]=a[j][i];
              	l--;
              	if(l<0)
                {
                	l=col-1;
                  	k--;
                }
            }
        
        }
    	for(int i=0;i<row;i++)
        {
        	for(int j=0;j<col;j++){
            	System.out.print(mat[i][j]+" ");
            }
          	System.out.println();
        }
  }
}
