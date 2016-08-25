package ssa;

import java.util.Random;

public class SimulatedBowling {

	public int getPinsKnockedDown() {

		Random rand = new Random();
		int result = rand.nextInt(11);
		return result;
	}

	public void bowl() {

		int[][] bowling = new int[3][10];
		int totalScore = 0;
		int grandTotal = 0;
		

		System.out.print("Frames" + "    ");

		for (int idx = 0; idx < 10; idx++) {
			System.out.print((idx + 1) + "\t");
		}
		    System.out.print("Total");
		for (int game = 0; game < bowling.length; game++) {// outer loop of the 2 dimensional array
															

			System.out.print("\n\nGame " + (game + 1) + "    ");
			totalScore = 0; //reinitialize the total score before entering the inner loop to evaluate another game
			// inner loop
			
			for (int frame = 0; frame < bowling[0].length; frame++) {//inner loop of the 2 dimensional array

				int firstRoll = getPinsKnockedDown();
				// evaluate first roll to see if a second roll is needed
				if (firstRoll < 10) {
					int secondRoll = getPinsKnockedDown();
					if (secondRoll >= (10-firstRoll)) {
						bowling[game][frame] = 12;//This would be equivalent to a spare
					} else {
						bowling[game][frame] = firstRoll;
					}
				} else {
					
					bowling[game][frame] = 15; //This would be equivalent to a strike
				}
				//print each score of the frame while still within the inner loop
				System.out.print(bowling[game][frame] + "\t");
				totalScore += bowling[game][frame];  //tally the scores from each frame within a game
				
			}
			System.out.print(" " + totalScore);  //print total score to console
			grandTotal += totalScore;
		}
		
		System.out.println("\n\nTotal Series" + "\t\t\t\t\t\t\t\t\t\t"   + grandTotal);  //print total score to console
		
		System.out.println("\n\n");
		System.out.println("  YOU SCORED A  " +grandTotal + "! HAVE YOU CONSIDERED THE OLYMPICS??     ");       
		System.out.println("           T             THUMBS UP CHAMP!!!\n                       ");       
		System.out.println("                        ////////////////       ");
		System.out.println("                      //                //     ");
		System.out.println("                    //                   //    ");
		System.out.println("                  //                      //   ");
		System.out.println("                //                         //  ");
		System.out.println("               //        ////   ////        // ");
		System.out.println("**************//         ////   ///         // ");
		System.out.println("**********//////        ////    ////        // ");
		System.out.println("****    //  ////                            // ");
		System.out.println("****  //    ////                            // ");
		System.out.println("**    //   ////                             // ");
		System.out.println("    ////////////                            // ");
		System.out.println("  ///          /     //////////////////     // ");
		System.out.println("  //      ///////    //             //     //  ");
		System.out.println(" //             //    ///          //     //   ");
		System.out.println(" //       ////////      //////////       //    ");
		System.out.println(" //           /  //                    //      ");
		System.out.println(" /////////////    //                //         ");
		System.out.println("                    ////////////////            ");
		
	}
}

