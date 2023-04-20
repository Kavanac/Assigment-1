public class Question1{
    public static void main(String[] args) {
        int n=7;
		
		for(int i=0;i<n; i++)
		{
			for(int j=0 ; j<n; j++)
			{
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");//This is I
					
				}
                
				
			}
            System.out.print(" ");

			for(int j=0 ; j<n; j++)
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");//This is N
					
				}
				
			}
            System.out.print(" ");

			for(int j=0 ; j<n; j++)
			{
				if(i==0||i==(n/2)||i==n-1||j==0)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");//This is E
					
				}
				
			}
            System.out.print(" ");

            for(int j=0 ; j<n; j++)
			{
				if((i>=0 &&i<n-1 &&j==0) || (i==n-1 &&j>0&&j<n-1) || (j==n-1 && i>=0 &&i<n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");//This is U
					
				}
				
			}
            System.out.print(" ");

            for(int j=0 ; j<n/2+1; j++)
			{
				if(j==0||j==i+1||i+j==n/2+2||i==(j+n/2))
				{
					System.out.print("*"+" ");
				}
				else
				{
					System.out.print(" "+" ");//This is R
					
				}
				
			}
            System.out.print(" ");

            for(int j=0;j<n;j++){
                if((i==0 && j>0 &&j<n-1) || (i>0 &&i<n-1 &&j==0) || (i==n-1 &&j>0&&j<n-1) || (j==n-1 && i>0 &&i<n-1)){
                System.out.print("*");
                }
                else{
                System.out.print(" ");//This is O
                }
				
			}
            System.out.print(" ");

            for(int j=0;j<n;j++){
                if(j==0||j==n-1||i==j){
                System.out.print("*");
                }
                else{
                System.out.print(" ");//This is for N
                }
				
			}
            System.out.print(" ");
			System.out.println();
		}
    }
}