import java.util.Scanner;
public class NaughtsandCrosses {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String[] board={"1","2","3","4","5","6","7","8","9"};
		int[] pick={10,10,10,10,10,10,10,10,10};
		int current;
		int[] row= new int[8];
		int turn=0;
		back:{
		while(true){
			System.out.println(board[0]+" "+board[1]+" "+board[2]);
			System.out.println(board[3]+" "+board[4]+" "+board[5]);
			System.out.println(board[6]+" "+board[7]+" "+board[8]);
			System.out.print("Pick a spot: ");
			current=in.nextInt();
			for(int i=0;i<board.length; i++){
				if(current-1==i){
					board[i]="O";
					pick[i]=1;
				}
			}
			if(pick[0]+pick[1]+pick[2]==3||pick[3]+pick[4]+pick[5]==3||pick[6]+pick[7]+pick[8]==3||pick[0]+pick[3]+pick[6]==3||pick[1]+pick[4]+pick[7]==3||pick[2]+pick[5]+pick[8]==3||pick[0]+pick[4]+pick[8]==3||pick[2]+pick[4]+pick[6]==3){
				System.out.println(board[0]+" "+board[1]+" "+board[2]);
				System.out.println(board[3]+" "+board[4]+" "+board[5]);
				System.out.println(board[6]+" "+board[7]+" "+board[8]);
				System.out.println("Player wins!");
				break back;
				
			}
			if(pick[0]!=10&&pick[1]!=10&&pick[2]!=10&&pick[3]!=10&&pick[4]!=10&&pick[5]!=10&&pick[6]!=10&&pick[7]!=10&&pick[8]!=10){
				System.out.println(board[0]+" "+board[1]+" "+board[2]);
				System.out.println(board[3]+" "+board[4]+" "+board[5]);
				System.out.println(board[6]+" "+board[7]+" "+board[8]);
				System.out.println("It's a draw!");
				break back;
			}
			row[0]=pick[0]+pick[1]+pick[2];
			row[1]=pick[3]+pick[4]+pick[5];
			row[2]=pick[6]+pick[7]+pick[8];
			row[3]=pick[0]+pick[3]+pick[6];
			row[4]=pick[1]+pick[4]+pick[7];
			row[5]=pick[2]+pick[5]+pick[8];
			row[6]=pick[0]+pick[4]+pick[8];
			row[7]=pick[2]+pick[4]+pick[6];
			if (row[0]==8){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[1]==10){
					pick[1]=-1;
					board[1]="X";		
				}
				else if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";		
				}
			}
			else if (row[1]==8){
				if(pick[3]==10){
					pick[3]=-1;
					board[3]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[5]==10){
					pick[5]=-1;
					board[5]="X";		
				}
			}
			else if (row[2]==8){
				if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";
				}
				else if(pick[7]==10){
					pick[7]=-1;
					board[7]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[3]==8){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[3]==10){
					pick[3]=-1;
					board[3]="X";		
				}
				else if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";		
				}
			}
			else if (row[4]==8){
				if(pick[1]==10){
					pick[1]=-1;
					board[1]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[7]==10){
					pick[7]=-1;
					board[7]="X";		
				}
			}
			else if (row[5]==8){
				if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";
				}
				else if(pick[5]==10){
					pick[5]=-1;
					board[5]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[6]==8){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[7]==8){
				if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";		
				}
			}
			else if (row[0]==12){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[1]==10){
					pick[1]=-1;
					board[1]="X";		
				}
				else if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";		
				}
			}
			else if (row[1]==12){
				if(pick[3]==10){
					pick[3]=-1;
					board[3]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[5]==10){
					pick[5]=-1;
					board[5]="X";		
				}
			}
			else if (row[2]==12){
				if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";
				}
				else if(pick[7]==10){
					pick[7]=-1;
					board[7]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[3]==12){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[3]==10){
					pick[3]=-1;
					board[3]="X";		
				}
				else if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";		
				}
			}
			else if (row[4]==12){
				if(pick[1]==10){
					pick[1]=-1;
					board[1]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[7]==10){
					pick[7]=-1;
					board[7]="X";		
				}
			}
			else if (row[5]==12){
				if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";
				}
				else if(pick[5]==10){
					pick[5]=-1;
					board[5]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[6]==12){
				if(pick[0]==10){
					pick[0]=-1;
					board[0]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[8]==10){
					pick[8]=-1;
					board[8]="X";		
				}
			}
			else if (row[7]==12){
				if(pick[2]==10){
					pick[2]=-1;
					board[2]="X";
				}
				else if(pick[4]==10){
					pick[4]=-1;
					board[4]="X";		
				}
				else if(pick[6]==10){
					pick[6]=-1;
					board[6]="X";		
				}
			}
			else if(turn==0&&(pick[1]==1||pick[3]==1)){
				pick[0]=-1;
				board[0]="X";
			}
			else if(turn==0&&(pick[5]==1||pick[7]==1)){
				pick[8]=-1;
				board[8]="X";
			}
			else if(pick[4]==10){
				pick[4]=-1;
				board[4]="X";
			}
			else if(pick[0]==1&&pick[8]==1){
				pick[1]=-1;
				board[1]="X";
			}
			else if(pick[2]==1&&pick[6]==1){
				pick[1]=-1;
				board[1]="X";
			}
			else if(pick[0]==10){
				pick[0]=-1;
				board[0]="X";
			}
			else if(pick[2]==10){
				pick[2]=-1;
				board[2]="X";
			}
			else if(pick[6]==10){
				pick[6]=-1;
				board[6]="X";
			}
			else if(pick[8]==10){
				pick[8]=-1;
				board[8]="X";
			}
			else if(pick[1]==10){
				pick[1]=-1;
				board[1]="X";
			}
			else if(pick[3]==10){
				pick[3]=-1;
				board[3]="X";
			}
			else if(pick[5]==10){
				pick[5]=-1;
				board[5]="X";
			}
			else if(pick[7]==10){
				pick[7]=-1;
				board[7]="X";
			}
			turn++;
			if(pick[0]+pick[1]+pick[2]==-3||pick[3]+pick[4]+pick[5]==-3||pick[6]+pick[7]+pick[8]==-3||pick[0]+pick[3]+pick[6]==-3||pick[1]+pick[4]+pick[7]==-3||pick[2]+pick[5]+pick[8]==-3||pick[0]+pick[4]+pick[8]==-3||pick[2]+pick[4]+pick[6]==-3){
				System.out.println(board[0]+" "+board[1]+" "+board[2]);
				System.out.println(board[3]+" "+board[4]+" "+board[5]);
				System.out.println(board[6]+" "+board[7]+" "+board[8]);
				System.out.println("AI wins!");
				break back;
			}
			if(pick[0]!=10&&pick[1]!=10&&pick[2]!=10&&pick[3]!=10&&pick[4]!=10&&pick[5]!=10&&pick[6]!=10&&pick[7]!=10&&pick[8]!=10){
				System.out.println(board[0]+" "+board[1]+" "+board[2]);
				System.out.println(board[3]+" "+board[4]+" "+board[5]);
				System.out.println(board[6]+" "+board[7]+" "+board[8]);
				System.out.println("It's a draw!");
				break back;
			}
			
		}

	}
	}

}