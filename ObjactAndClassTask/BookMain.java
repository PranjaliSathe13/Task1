//Task 1: Create a class Book take three fields (bookId, bookName, authorName) of scope private.Take another class //as BookMain and create a record of 10 such books.
import java.lang.*;
class Book{

private int bookId;
private String bookName;
private String authorName;

Book(int bookId,String bookName,String authorName){
this.bookId=bookId;
this.bookName=bookName;
this.authorName=authorName;
}
public int getBookId(){
return this.bookId;
}

public String getBookName(){
return this.bookName;
}

public String getAuthorName(){
return this.authorName;
}

}

class BookMain{
public static void main(String arg[]){
Book[] books=new Book[10];
int bookId;
books[0] = new Book(1,"Boook1","Author1");
books[1] = new Book(2,"Boook2","Author2");
books[2] = new Book(3,"Boook3","Author3");
books[3] = new Book(4,"Boook4","Author4");
books[4] = new Book(5,"Boook5","Author5");
books[5] = new Book(6,"Boook6","Author6");
books[6] = new Book(7,"Boook7","Author7");
books[7] = new Book(8,"Boook8","Author8");
books[8] = new Book(9,"Boook9","Author9");
books[9] = new Book(10,"Boook10","Author10");
for(int i=0;i<books.length;i++)
{
System.out.println("ID:"+books[i].getBookId());
System.out.println("Book Name:"+books[i].getBookName());
System.out.println("Author Name:"+books[i].getAuthorName());
}
/*
 
Scanner sc=new Scanner(System.in);
System.out.println("Enter Book Id to fetch Details:");
bookId=sc.nextInt();
this.fetchBookDetails(bookId);
}
public static void fetchBookDetails(int i)
{
System.out.println("ID:"+books[i].getBookId());
System.out.println("Book Name:"+books[i].getBookName());
System.out.println("Author Name:"+books[i].getAuthorName());
*/
}
}