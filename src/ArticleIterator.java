import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArticleIterator implements Iterator<ArticleComponent> {

    private List<ArticleComponent> components = new ArrayList<>();

    // private List<Integer> componentsIndex = new ArrayList<>(); // Indexes

    public ArticleIterator(List<ArticleComponent> components) {
        this.components = components;
        this.index = 0;
    }

    private int index;

      @Override
      public boolean hasNext() {
      
         if(index < components.size()){
            return true;
         }
         return false;
      }

      @Override
      public ArticleComponent next() {
      
         if(this.hasNext()){
            return components.get(index++);
         }
         return null;
      }		



}
    
    

