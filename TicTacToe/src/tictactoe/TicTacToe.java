Tic Tac Toe /* -------------TIC-TAC-TOE using Minimax ----------------
http://www.eng.uerj.br/~fariasol/disciplinas/Topicos_B/AGENTS/books/Stuart%20Russell,%20Peter%20Norvig-Artificial%20Intelligence_%20A%20Modern%20Approach-Prentice%20Hall%20(2002)-2nd-ed.pdf
https://www.neverstopbuilding.com/blog/2013/12/13/tic-tac-toe-understanding-the-minimax-algorithm13
https://medium.com/@victorcatalintorac/tic-tac-toe-with-ai-the-ultimate-beginner-guide-part-4-142b6ea534df
https://web.eecs.umich.edu/~akamil/teaching/sp03/minimax.pdf
https://en.wikipedia.org/wiki/Minimax#Pseudocode
https://www.javatpoint.com/java-applet
https://docs.oracle.com/javase/tutorial/uiswing/layout/flow.html
https://classes.soe.ucsc.edu/cmps112/Winter16/presentations/ttt.pdf
https://www.hackerearth.com/blog/artificial-intelligence/minimax-algorithm-alpha-beta-pruning/
https://www.cs.cornell.edu/courses/cs312/2002sp/lectures/rec21.htm
http://web.cs.ucla.edu/~rosen/161/notes/alphabeta.html
https://athena.ecs.csus.edu/~gordonvs/Beijing/Minimax.pdf
https://www.researchgate.net/figure/MiniMax-Algorithm-Pseduo-Code-In-Fig-3-there-is-a-pseudo-code-for-NegaMax-algorithm_fig2_262672371
*/

//package AppletTest;


import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import javax.swing.AbstractButton;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class TicTacToe extends Applet implements ActionListener {
	
	public static final int SIZE=10;
	public static final int MAX=Integer.MIN_VALUE;
	public static final int MIN=Integer.MAX_VALUE;
	
	int count, player, computer, player_2, move, x;
	Boolean game_over=true, comp_flag, player_flag;
	
	int grid[]=new int[SIZE]; 
	int track1[]=new int[100];
	int track2[]=new int[100];
	int winner[]=new int[3];
	
	//void init_arrays(){	}
	
	
	//Initialize all the variables and arrays
	public void initialize_game(){
	  int i;
	  count=1;
	  player=2;
	  player_2=1;
	  computer=1;
	  game_over=false;
	  x=0;
	  
	  for(i=0; i<SIZE; i++)
	  {
		if(i<3)
			winner[i] = 0;
		grid[i]=-5;
	  }
	  end_msg.setFont(new Font("Courier", Font.ITALIC, 18));
	  end_msg.setForeground(Color.BLACK);
	  end_msg.setText("Game started!");
	}
	
	//Console's sake
	/*public void start_game(){                                       //USED WHEN ON CONSOLE; instead of Applet
		int i, j, k=1, choice;
		System.out.println ("\nEnter your preference: ");
		Scanner reader = new Scanner(System.in);
		choice = reader.nextInt();
	  	for(j=0; j<3; j++)
	  	{
	  		for(i=0; i<3; i++)
	  			System.out.print("| "+ k++ +"  |");
	  			System.out.print("\n");
	  	}
	  	count = 1;
	  	if(choice==1) 
	  	{
	  		comp_flag=false;
	  	}
	  	else if(choice==2)
	  	{
		  comp_flag = true;
		  computer_turn ();
	  	}
	  	else if(choice==3)
	  		System.exit (1);
	  	else
		  System.out.println ("\nEnter your preference: ");
	}*/
	
	//Block and win; not needed in Minimax
	//int find_position (int turn){return 0;}

	//Computer does not wait for a best move if there is a winning move
	public int find_winning_position() {
		int i, value = -3, position=-1;
		for(i=1;i < SIZE; i+=3)  
		      if (grid[i] + grid[i + 1] + grid[i + 2] == value) 
		      {
		    	  if(grid[i]==-5)
		    		  position=i;
		    	  else if(grid[i+1]==-5)
		    		  position=i+1;
		    	  else if(grid[i+2]==-5)
		    		  position=i+2;
		    	  return position;
		      }
		  for (i=1; i<= 3; i++)   
		      if (grid[i] + grid[i + 3] + grid[i + 6] == value) 
		      {
		    	  if(grid[i]==-5)
		    		  position=i;
		    	  else if(grid[i+3]==-5)
		    		  position=i+3;
		    	  else if(grid[i+6]==-5)
		    		  position=i+6;
		    	  return position;
		      }
		  if (grid[1] + grid[5] + grid[9] == value)
		  {
			  if(grid[1]==-5)
	    		  position=1;
	    	  else if(grid[5]==-5)
	    		  position=5;
	    	  else if(grid[9]==-5)
	    		  position=9;
	    	  return position;
		  }
		  if (grid[3] + grid[5] + grid[7] == value)
		  {
			  if(grid[3]==-5)
	    		  position=3;
	    	  else if(grid[5]==-5)
	    		  position=5;
	    	  else if(grid[7]==-5)
	    		  position=7;
	    	  return position;
		  }
		  return position;
		}
		
	//Keep track of the end game
	int check_win(int turn){
	  int i, value;
	  if (turn == 1)
	    value = 3;
	  else
	    value = 6;
	  for(i=1;i < SIZE; i+=3)  
	      if (grid[i] + grid[i + 1] + grid[i + 2] == value) 
	      {
	    	  winner[0]=i;
	    	  winner[1]=i+1;
	    	  winner[2]=i+2;
	    	  return 1;
	      }
	  for (i=1; i<= 3; i++)   
	      if (grid[i] + grid[i + 3] + grid[i + 6] == value) 
	      {
	    	  winner[0]=i;
	    	  winner[1]=i+3;
	    	  winner[2]=i+6;
	    	  return 1;
	      }
	  if (grid[1] + grid[5] + grid[9] == value)
	  {
		  winner[0]=1;
    	  winner[1]=5;
    	  winner[2]=9;
    	  return 1;
	  }
	  if (grid[3] + grid[5] + grid[7] == value)
	  {
		  winner[0]=3;
    	  winner[1]=5;
    	  winner[2]=7;
    	  return 1;
	  }
	  return 0;
	}

	//Gotta keep count of moves
	public void increment_rounds(int block_no, int current_player){
		if(count==1)
			  reset_button.setVisible(true);
		grid[block_no]=current_player;
		count++;
		if((comp_flag||!player_flag)&& current_player==1)
			updateGridBlock(block_no);
		check_draw();
	}
	
	
	//Human tries
	public void player_turn(int block_no){
		if(player_flag && check_win(player_2)==1) 
		{
			System.out.print ("\nPlayer 1 Wins!!\n\n");
			end_msg.setFont(new Font("Courier", Font.ITALIC, 24));
	    	end_msg.setForeground(Color.RED);
			end_msg.setText("PlayerX  won! Start again?");
			game_over=true;
			winningBlocks();
			return;
		}
		else if(check_win(player)==1)
		{
			System.out.print ("\nPlayer 2 Wins!!\n\n");
			end_msg.setFont(new Font("Courier", Font.ITALIC, 24));
	    	end_msg.setForeground(Color.RED);
			end_msg.setText("PlayerO  won! Start again?");
			game_over=true;
			winningBlocks();
			return;
		}
		//System.exit (0);  
		if(check_draw ()==1)
			return;
		//System.exit (0);
		System.out.print ("Your Move: " + block_no);
		//Scanner reader = new Scanner(System.in);      //USED WHEN ON CONSOLE
		//block_no=reader.nextInt();
		while(grid[block_no] != -5)                     //USED WHEN ON CONSOLE
		{
			System.out.println("Position taken");
			System.out.print ("Your Move: ");
			//block_no=reader.nextInt();
		} 
		
		if(player_flag && count%2==1)
			increment_rounds(block_no, player_2);
		else
			increment_rounds(block_no, player);
		display();
		
		if(player_flag && check_win(player_2)==1) 
		{
			System.out.print ("\nPlayer 1 Wins!!\n\n");
			end_msg.setFont(new Font("Courier", Font.ITALIC, 24));
	    	end_msg.setForeground(Color.RED);
			end_msg.setText("PlayerX  won! Start again?");
			game_over=true;
			winningBlocks();
			return;
			}
		else if(check_win(player)==1)
		{
			System.out.print ("\nPlayer 2 Wins!!\n\n");
			end_msg.setFont(new Font("Courier", Font.ITALIC, 24));
	    	end_msg.setForeground(Color.RED);
			end_msg.setText("PlayerO won! Start again?");
			game_over=true;
			winningBlocks();
			return;
		}
		else if(!player_flag)	  
			computer_turn ();
	}

	//Computer destroys
	public void computer_turn(){
		if(check_draw ()==1)
			return;  
		//System.exit(0);
		
		//int max_depth=3; //int block_no=-1;
		//score=-2, i, cur;                            //USED WHEN ON CONSOLE & when Block and win attempt
		/*if(count==1 && comp_flag==1) {
		block_no=(int) ((Math.random())%9 + 1);
		increment_rounds(block_no, computer);
		System.out.println("HERE! Computer's move: " + block_no);
		if (find_position (computer)!=0) increment_rounds
	  	else if (find_position (player)!=0)	  	else	*/
		if(count > 3 && (move = find_winning_position())>0) 
			System.out.println("Computer winning move: " + move);
		else
			callMiniMax();
		increment_rounds(move, computer);
		display ();
		if (check_win(computer)==1) 
		{
			System.out.print ("\nTerminal wins!!\n\n");
			end_msg.setFont(new Font("Courier", Font.ITALIC, 24));
	    	end_msg.setForeground(Color.RED);
			end_msg.setText("Computer won! Start again?");
			game_over=true;
			winningBlocks();
			return;
			//System.exit(1);
		}   //else //player_turn ();
	}
	
	//Get the best position
	public int getPosition() {
		int temp_max=MAX;
		int temp_count=-1;
		for(int i=0; i<x;i++) 
			if(temp_max<=track2[i]) 
			{
				temp_max=track2[i];
				temp_count=i;
			}
		System.out.print("CHECKING - Track max: " + temp_max);
		return track1[temp_count];
	}
	
	//Call to the Minimax
	public void callMiniMax() {
		int max_depth=0, temp_count=SIZE-1, temp_max, block_no;
		for(int i=0; i<SIZE; i++) 
			if(grid[i]>0)
				temp_count--;
		temp_max = getMinMax(temp_count, max_depth, computer);
		//temp_max = alphaBetaPruning(temp_count, max_depth, computer, MAX, MIN);
		System.out.println("Here Computer's move: " + move);
		block_no=getPosition();
		System.out.println(" track move: " + block_no + " final x:  " + x + " final max: " + temp_max);
	}
	
	//how minimax works
	public int getMinMax(int count_left, int max_depth, int turn){
		int score=-1;
		if(check_win(computer)!=0)
			return +1;
		else if(check_win(player)!=0)
			return -1;
		if(count_left<=0)
			return 0;
		int min=MIN, max=MAX;
		//System.out.println("Inside minmax");
		for(int i=1; i<SIZE; i++) 
		{
			if(grid[i]==-5)
			{
				if(turn==computer) 
				{       													//MAX block 
				//increment_rounds(i, 1);
					grid[i]=1;
					count_left--;
					score=getMinMax(count_left, max_depth+1, player);
					
					if(max<=score)
						max=score;
				
					if(score>-1||(i==SIZE-1 && max<=-1))
					{	if(max_depth==0)
						{
							track1[x]=i;
							track2[x++]=max;
							move=i;
						}
					}
					grid[i]=-5;
					count_left++;
					if(score==1)
						break;
				}
				else if(turn==player) 
				{
					grid[i]=2;     											//MIN Block
					count_left--;
					score=getMinMax(count_left, max_depth+1, computer);
					if(min>=score)
							min=score;
					grid[i]=-5;
					count_left++;
					if(min < 0) 
						break;
				}
				if(max_depth==0) 
					System.out.println("BoxNumber" + i + " Score " + score);
			}
		}		
		if(turn==computer)
			return max;
		else
			return min;
	}

	/*	
	 						//TRYING alpha-beta pruning
	int alphaBetaPruning(int count_left, int max_depth, int turn, int alpha, int beta) {	
	//	
		if(beta<=alpha)
		{
			System.out.println("Depth" + max_depth);
			if(turn==computer)
				return MAX;
			else
				return MIN;
		}
	}*/

	//Checks for draw
	public int check_draw (){
		if (count >= SIZE)
		{
			end_msg.setFont(new Font("Courier", Font.PLAIN, 18));
	    	end_msg.setForeground(Color.RED);
			System.out.print ("\nGame Draw\n\n");
			end_msg.setText("Game Draw! Start again?");
			game_over=true;
			for(int i=0; i<3; i++)
				winner[i]=0;
			winningBlocks();
			return 1;
			//System.exit (0);
	    }
		return 0;
	}

	//Displays on console														//USED WHEN ON CONSOLE
	void display(){
		int j, i, k=1;
		System.out.print ("\n--!---!---!---!---!---!---!--\n");
		System.out.print ("-!---!---!---!---!---!---!--\n\n");
		char c;
		for (j = 0; j < 3; j++) 
		{
			for(i=0;i<3;i++) 
			{
				if(comp_flag||player_flag) 
				{
					if (grid[k] == 1)
						c ='X';
					else if(grid[k]==2)
						c='O';
					else
						c=' ';
				}
				else 
				{
					if (grid[k] == 1)
						c ='O';
					else if(grid[k]==2)
						c='X';
					else
						c=' ';
				}
				
				System.out.print("| "+ c + "  |" );
				k++;
			}  
			System.out.println();
		}
		System.out.println();
	}
  
	////USED WHEN ON CONSOLE; instead of Applet
	//public static void main(String[] args) throws Exception{              ////USED WHEN ON CONSOLE
		//Scanner reader = new Scanner(System.in);
		//TicTacToe e= new TicTacToe();
		//System.out.print("\nWELCOME!\n1 : Start with X\n2 : Let the terminal star\n3 : Exit");
		//e.init_arrays(); //e.start_game (); //}
 
	//
	public void paint (Graphics g) {
	      //g.drawString ("\nWELCOME!", 25, 50);
	}
   
	//Highlights the winning blocks
	public void winningBlocks() {
		int temp_no;
		char c;
		for(int i=0; i<SIZE-1; i++) 
		{ 	
				for(int j=0; j<3; j++)
					if(winner[j]==i+1 ) 
					{
				//c=box[temp_no-1].getLabel().charAt(0);
						box[i].setEnabled(true);
						box[i].setForeground(Color.RED);
						break;
					}
					else 
					{
						//box[i].setForeground(Color.BLACK);
						box[i].setEnabled(false);
					}
			//box[temp_no-1].setLabel();
		}
	}
	
	//Clear winning blocks
	public void clearWinningBlocks() {
		int temp_no;
		if(winner[0]!=0)
			for(int i=0; i<3; i++) 
			{
				temp_no=winner[i];
				box[temp_no-1].setForeground(Color.BLACK);
			}
	}
  
	//Update Computer's move
	public void updateGridBlock(int button_no) {
		if(comp_flag) 
			box[button_no-1].setLabel("X");
			//box[button_no-1].setEnabled(false);
		else 
		  box[button_no-1].setLabel("O");
		  //box[button_no-1].setEnabled(false);
	}
    
	//Arrange or set swing components wrt applet window
	public void setComponents() {
		board_msg1.setSize(400, 60);
		board_msg1.setLocation(0, 100);
		end_msg.setSize(400, 60);
		end_msg.setLocation(0, 180);
		
		board_msg1.setFont(new Font("Courier", Font.BOLD, 20));
		end_msg.setFont(new Font("Courier", Font.ITALIC, 18));
		
		comp_button.setFont(new Font("Courier", Font.PLAIN, 15));
		human_button.setFont(new Font("Courier", Font.PLAIN, 15));
		human2_button.setFont(new Font("Courier", Font.PLAIN, 15));
		reset_button.setFont(new Font("Courier", Font.PLAIN, 15));		
		
		comp_button.setSize(200, 20);
		//comp_button.setLocation(200, 60);
		human_button.setSize(150, 50);
		//human_button.setLocation(250, 50);
		human2_button.setSize(150, 50);
		//human2_button.setLocation(400, 50);
		reset_button.setSize(150, 30);
		reset_button.setLocation(200, 425);
		
		msgBoard.setSize(600,150);
		msgBoard.setLocation(100, 500);
		topButton.setSize(600,50);
		topButton.setLocation(50, 50);
		//msgBoard.setBackground(Color.gray); 
		
		gridBox.setSize(300,300);
		gridBox.setLocation(200, 100);
		//gridBox.setBackground(Color.gray); 
	}
	
	
	//When applet
	public void init() {
		gridBox=new Panel(new GridLayout(3,3));
		msgBoard=new Panel(new GridLayout(2,1));
		topButton=new Panel(new FlowLayout(FlowLayout.CENTER));
	   
		box = new Button[9];
		for(int i=0; i<SIZE-1;i++)
			box[i]=new Button(String.valueOf(i+1));
	 
		comp_button = new Button("Computer vs Human");
		human_button = new Button("Human vs Computer");
		human2_button = new Button("Human vs Human");
		reset_button = new Button("Reset/Clear");
		
	    board_msg1 = new Label("Let's begin\n!");
	    end_msg = new Label("");
		
	    setComponents();
		
		add(topButton);
		add(msgBoard);
		
		//msgBoard.add(board_msg1);
		//comp_button.setLayout(new BorderLayout());
		topButton.add(comp_button);
		topButton.add(human_button);
		topButton.add(human2_button);
		
		msgBoard.add(board_msg1);
		msgBoard.add(end_msg);
		
		reset_button.addActionListener(this);
		comp_button.addActionListener(this);
		human_button.addActionListener(this);
		human2_button.addActionListener(this);
		//reset_button.setVisible(true);
		add(gridBox);
		displayPanel();
		//topButton.setLocation(null);
		// this.setLayout(new FlowLayout(FlowLayout.CENTER));
		setLayout(null);  
		setSize(750,750);
	}
	
	//Display the X-O grid
	public void displayPanel() {
	   	for(int i=0; i<SIZE-1;i++) 
	   	{
	   		box[i].setFont(new Font("Courier", Font.BOLD, 20));
	   		gridBox.add(box[i]);
	   		box[i].addActionListener(this);
	   	}
	   	add(reset_button);
	   	reset_button.setVisible(false); 	
	}
	
	//Reset the Grid boxes label to numbers
    public void resetPanel() {
    	for(int i=0; i<SIZE-1;i++) 
    		box[i].setLabel(String.valueOf(i+1));
    }
    
    //Change the Grid Boxes label to NULL" "
	public void setButtonLabels() {
		for(int i=0; i<SIZE-1;i++)
		{
			box[i].setEnabled(true);
			box[i].setLabel(" ");
			box[i].setFont(new Font("Courier", Font.BOLD, 30));
		}
	}
   
	//Called when each time a button is pressed
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == human_button) 
		{
			board_msg1.setText("Human vs Computer");
			System.out.println("Human starts");
			comp_flag=false;
			player_flag=false;
			setButtonLabels();
			clearWinningBlocks();
			initialize_game();	
		}
		else if (e.getSource() == human2_button) 
		{
			board_msg1.setText("PlayerX vs PlayerO");
			System.out.println("Human vs Human starts");
			comp_flag=false;
			player_flag=true;
			setButtonLabels();
			clearWinningBlocks();
			initialize_game();
			
		}
		else if(e.getSource() == comp_button)
		{
			board_msg1.setText("Computer vs Human");
			System.out.println("Computer starts");
			comp_flag=true;
			player_flag=false;
			setButtonLabels();
			clearWinningBlocks();
			initialize_game();
			computer_turn();
		}
		else if(e.getSource() == reset_button)
		{
			board_msg1.setText("Start again ?");
			System.out.println("Reset");
			comp_flag=false;
			player_flag=false;
			game_over=true;
			setButtonLabels();
			clearWinningBlocks();
			//initialize_game();
			reset_button.setVisible(false);
			end_msg.setFont(new Font("Courier", Font.ITALIC, 18));
			end_msg.setForeground(Color.BLACK);
			end_msg.setText(" ");
			resetPanel();
		}
		else  
		{
			if(!game_over) 
			{
				Object source = e.getSource();
				Button temp = (Button)source;
				//System.out.println(temp);
				if(temp.getLabel()==" ") 
				{
					//int temp_no=Character.getNumericValue(temp.getLabel().charAt(0));
					//System.out.println(temp_no);
					int temp_no = 0;
					for(int i=0; i<SIZE-1; i++)
						if(temp==box[i])
							temp_no=i+1;
					end_msg.setFont(new Font("Courier", Font.PLAIN, 18));
					end_msg.setForeground(Color.BLACK);
					end_msg.setText("Game in progress!"); 
					if(player_flag)
					{
						 if(count%2==1)
							 temp.setLabel("X");
							 //temp.setEnabled(false);
						 else
							 temp.setLabel("O");
							 //temp.setEnabled(false);
					 }
					 else if(!comp_flag && count%2==1)
						 temp.setLabel("X");
						 //temp.setEnabled(false);
					 else
						 temp.setLabel("O");
						 //temp.setEnabled(false);
					 player_turn(temp_no);
					  
				}
				else if((temp.getLabel()!="X" && temp.getLabel()!="O") || temp.getLabel()!=" ")
				{
					end_msg.setFont(new Font("Courier", Font.PLAIN, 18));
					end_msg.setForeground(Color.BLACK);
					end_msg.setText("Already taken!");
				}
				
			}
			else if(game_over) 
			{
				end_msg.setFont(new Font("Courier", Font.PLAIN, 18));	
				end_msg.setForeground(Color.BLACK);
				end_msg.setText("Gotta select an option first!");
			}	
		}
	}
	
	Panel gridBox, msgBoard, topButton;
	Label board_msg1, end_msg;
	Button[] box;
	Button comp_button, human_button, human2_button, reset_button;
}
- from cs.indstate.edu~bdhome+TicTacToe.Java - 737 lines of code - 040422a