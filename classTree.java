public class Tree<T> {
    private T data;
    private List<Tree<T>> children;

    public Tree(T data) {
        this.data = data;
        this.children = new ArrayList<>();
    }

    public void addChild(Tree<T> child) {
        children.add(child);
    }
