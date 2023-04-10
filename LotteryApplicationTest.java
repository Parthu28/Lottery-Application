import java.util.Scanner;

public class LotteryApplicationTest {
public static void main( String [ ] args) {

 final int NUMBER_OF_LOTTERY_NUMBERS = 5;
 int userLotteryNumber;
 int [ ]  userLotteryNumbers = new int[ NUMBER_OF_LOTTERY_NUMBERS ];
 int [ ] matchNumbers = new int[ NUMBER_OF_LOTTERY_NUMBERS ];
 int [ ] lotteryNumbers = new int [ NUMBER_OF_LOTTERY_NUMBERS ];
 int numberOfMatchNumbers = 0;

 Scanner keyboard = new Scanner(System.in);
 LotteryApplication worldLottery = new LotteryApplication( NUMBER_OF_LOTTERY_NUMBERS );

 for( int currentNumberIndex = 0; currentNumberIndex < NUMBER_OF_LOTTERY_NUMBERS; currentNumberIndex++ ){   //user's lottery numbers:
	 System.out.println("Please enter lottery number " + (currentNumberIndex + 1) );
     userLotteryNumber = keyboard.nextInt();
      userLotteryNumbers[ currentNumberIndex ] = userLotteryNumber;
}
  worldLottery.getUserLotteryNumbers( userLotteryNumbers );  //get user's lottery numbers:
  matchNumbers = worldLottery.matchLotteryNumbers();         // match user's and computer's lottery numbers:
  lotteryNumbers = worldLottery.getLotteryNumbers();

  System.out.println("Today's lottery number are:");        // computer's lottery number:
  for( int  currentNumberIndex = 0; currentNumberIndex < lotteryNumbers.length; currentNumberIndex++ ){
  System.out.print(lotteryNumbers[ currentNumberIndex ] + ", ");
}
  System.out.println();

  System.out.println("Your numbers are:");          // user's lottery number:
  for( int  currentNumberIndex = 0; currentNumberIndex < userLotteryNumbers.length; currentNumberIndex++ ){
  System.out.print(userLotteryNumbers[ currentNumberIndex ] + ", ");
}
System.out.println();

  System.out.println("Matched numbers:");
  for( int currentMatchIndex = 0; currentMatchIndex < matchNumbers.length; currentMatchIndex++ ) {   //match lottery numbers:
   if(matchNumbers[ currentMatchIndex ] != -1){
  System.out.println( matchNumbers[ currentMatchIndex ] + " ( Slot " + (currentMatchIndex + 1) + "), ");
   numberOfMatchNumbers = numberOfMatchNumbers + 1;

   }
}

 if( numberOfMatchNumbers ==  NUMBER_OF_LOTTERY_NUMBERS ){    // If user's lottery numbers match:
	  System.out.println("You're a GRAND PRIZE WINNER. You matched all numbers and won $1 million dollars.");
	  }else if( numberOfMatchNumbers == 1){
		    System.out.println("You matched " + numberOfMatchNumbers + " number ");
  }else{
	  System.out.println("You matched " + numberOfMatchNumbers + " numbers ");
 }
 }
 }