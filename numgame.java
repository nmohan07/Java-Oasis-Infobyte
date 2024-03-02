import java.util.*;
class Game {
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getnoOfGuesses(){
        return noOfGuesses;
    }
    public void setnoOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rand=new Random();

        this.number=rand.nextInt(100);

    }
    void takeUserInput(){
        System.out.println("Guess the Number");
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();

    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("Yes you have Guessed it Right! ,it was %d /n You Guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too Low ......");
        }
        else if(inputNumber>number){
            System.out.println("Too High......");
        }
        return false;


    }



}
public class numgame {

    public static void main(String[] args) {
        boolean b=false;
        while(!b){
            Game g =new Game();
            g.takeUserInput();
            b= g.isCorrectNumber();
        }

    }
}