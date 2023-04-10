	import java.util.Random;

public class LotteryApplication {

 private int [ ] lotteryNumbers;
 private int [ ] userLotteryNumbers;

 public void getUserLotteryNumbers( int [ ] givenUserLotteryNumbers ) {    //user lottery numbers:
	  userLotteryNumbers = givenUserLotteryNumbers;
  }

  public int [ ] getLotteryNumbers( ) {
  	return lotteryNumbers;
}

  public int [ ] matchLotteryNumbers() {    // to match lottery numbers:
	  int [ ] matchNumbers = new int [ lotteryNumbers.length ];

	  for( int currentMatchIndex = 0; currentMatchIndex < matchNumbers.length; currentMatchIndex++ ) {   // check lottery numbers:
		  matchNumbers[ currentMatchIndex ] = -1;
}

	  for( int currentNumberIndex = 0; currentNumberIndex < userLotteryNumbers.length; currentNumberIndex++ ) {
		  if (userLotteryNumbers[ currentNumberIndex ] == lotteryNumbers [ currentNumberIndex ] ) {
			  matchNumbers[ currentNumberIndex ] = userLotteryNumbers [ currentNumberIndex ];
  }
 }
 return matchNumbers;
}
    public LotteryApplication(int numberOfLotteryNumbers) {
	 Random random = new Random();

	 lotteryNumbers = new int [ numberOfLotteryNumbers ];

	 for(int index = 0; index < lotteryNumbers.length; index++ ) {
	  lotteryNumbers [ index ] = random.nextInt( (9) + 1 );   // 0 to 9:
	 }
   }
 }



