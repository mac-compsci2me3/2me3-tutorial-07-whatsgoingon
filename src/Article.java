import java.util.ArrayList;
import java.util.List;  

public class Article extends ArticleComponent {
    private List<ArticleComponent> components = new ArrayList<>();

    public ArticleIterator iterator(){
        // returns an instance of ArticleIterator initialized with the list of components in an article
        return new ArticleIterator(components);
    }

    public void addComponent(ArticleComponent component) {
        components.add(component);
    }

    public void removeComponent(ArticleComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Displaying Article:");
        for (ArticleComponent component : components) {
            component.display();
        }
    }

}