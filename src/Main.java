

abstract class Book{
    String title;
    String author;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
  abstract String getCategory();
    public String toString(){

       return "tytuł" + title + "author " + author + "category " + getCategory();
   }
}
interface Readable{
   public static String read(){
       return "czytasz ksiazke";
   }

}
class FantasyBook extends Book implements Readable{

    public FantasyBook(String title, String author) {
        super(title, author);
    }

    @Override
    String getCategory() {
        return "Fantasy";
    }
}
class ScienceBook extends Book implements Readable{

    public ScienceBook(String title, String author) {
        super(title, author);
    }

    @Override
    String getCategory() {

        return "Nauka";
    }
}



public class Main {
    public static void main(String[] args) {
      String[] books ={"harry potter","krotka historia czasu"};
    for(String book : books){
        System.out.println(book);

    }



}}