


		import java.util.Scanner;
public class presidentSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int i=0;

				String [] president = new String[10];

				Scanner sc = new Scanner (System.in);

				String temp= "";
				String pres;
			
				

				for (i=0; i<10 ; i++)
				{
					president[i] = sc.next();
					pres = president[i];
				
					
				}
			

				for (i = 0 ; i < 10 ; i ++)
				{
					for (int j = 0 ; j < 9 ; j++)
					{
						if (president[j].compareToIgnoreCase(president[j + 1]) < 0)
						{
							temp = president[j];
									president[j] = president[j + 1];
									president[j + 1] = temp;
						}
					}
				}
		 
System.out.println("Presidents in alphabetical order ");


for ( i=0; i<president.length; i++ )
	
	System.out.print( president[i] + " " );

System.out.println();
			}

		}



