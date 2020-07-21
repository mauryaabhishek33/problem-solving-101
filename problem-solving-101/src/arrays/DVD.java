/**
 * 
 */
package arrays;

/**
 * @author maury
 * A simple definition of DVD
 */
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
		
		
}
