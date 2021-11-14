/**
 * 
 */

package arrays;


/**
 * @author maury
 * A simple definition of DVD
 */
//The actual code for creating an Array to hold DVD's.
//DVD[] dvdCollection = new DVD[15];
public class DVD {
		public String name;
		public int releaseYear;
		public String director;
		/**
		 * @param name
		 * @param releaseYear
		 * @param director
		 */
		public DVD(String name, int releaseYear, String director) {
			super();
			this.name = name;
			this.releaseYear = releaseYear;
			this.director = director;
		}
		
		@Override
		public String toString() {
			return "DVD [name=" + name + ", releaseYear=" + releaseYear + ", director=" + director + "]";
		}
		
		public static void main(String[] args) {
			DVD[] dvdCollection = new DVD[15];
			
			// Firstly, we need to actually create a DVD object for The Avengers.
			DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");

			// Next, we'll put it into the 8th place of the Array. Remember, because we
			// started numbering from 0, the index we want is 7.
			dvdCollection[7] = avengersDVD;
			DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
			DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
			DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");

			// Put "The Incredibles" into the 4th place: index 3.
			dvdCollection[3] = incrediblesDVD;

			// Put "Finding Dory" into the 10th place: index 9.
			dvdCollection[9] = findingDoryDVD;

			// Put "The Lion King" into the 3rd place: index 2.
			dvdCollection[2] = lionKingDVD;
			DVD starWarsDVD = new DVD("Star Wars", 1977, "George Lucas");
			dvdCollection[3] = starWarsDVD;
			// Print out what's in indexes 7, 10, and 3.
			System.out.println(dvdCollection[7]);
			System.out.println(dvdCollection[10]);
			System.out.println(dvdCollection[3]);

			// Will print:

			// The Avengers, directed by Joss Whedon, released in 2012
			// null
			// Star Wars, directed by George Lucas, released in 1977
			
			//Writing Items into an Array with a Loop
			int[] squareNumbers = new int[10];

			// Go through each of the Array indexes, from 0 to 9.
			for (int i = 0; i < 10; i++) {
			    // We need to be careful with the 0-indexing. The next square number
			    // is given by (i + 1) * (i + 1).
			    // Calculate it and insert it into the Array at index i.
			    int square = (i + 1) * (i + 1);
			    squareNumbers[i] = square;
			}
			//Reading Items from an Array with a Loop
			// Go through each of the Array indexes, from 0 to 9.
			for (int i = 0; i < 10; i++) {
			    // Access and print what's at the i'th index.
			    System.out.println(squareNumbers[i]);
			}

			// Will print:
			// 1
			// 4
			// 9
			// 16
			// 25
			// 36
			// 49
			// 64
			// 81
			// 100
			// For each VALUE in the Array.
			for (int square : squareNumbers) {
			    // Print the current value of square.
			    System.out.println(square);
			}
			// Prints exactly the same as the previous example.

		}
}
