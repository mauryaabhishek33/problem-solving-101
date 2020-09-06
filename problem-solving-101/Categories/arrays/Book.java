/**
 * 
 */
package arrays;

/**
 * @author maury
 *
 */
class Book implements Comparable<Object>{
String title;
public Book(String t) {
title = t;
}

@Override
public int compareTo(Object o) {
	Book book = (Book) o ;
	return (title.compareTo(book.title));
}

@Override
public String toString() {
	return "Book [title=" + title + ", hashCode()=" + hashCode() + "]";
}
}
