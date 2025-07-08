import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Library {
    private List<String> books;

         public Library(){
             books = new ArrayList<>();
         }
         public List<String> getLibrary(){
             return new ArrayList<>(books);
         }
         public void addBook(String title){
             if(books.contains(title)){
                 books.add(title);
                 sortBooks();
             }
         }
         public void addBookPosition(String title, int position){
             if(books.contains(title) && position >= 0 && position <= books.size()){
                books.add(position, title);
                sortBooks();
             }
         }
         public String getBook(int position){
             if(position >= 0 && position <= books.size()){
               return books.get(position);
             }
             return null;
         }
         public void removeBook(String title){
             books.remove(title);
         }
         private void sortBooks(){
             Collections.sort(books);
         }
         private int getBookCount(){
             return books.size();
         }
        }


