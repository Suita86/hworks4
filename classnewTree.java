public class classnewTree {
    Tree<String> familyTree = new Tree<>("John");
    familyTree.addChild(new Tree<>("Mary"));
    familyTree.addChild(new Tree<>("Bob"));
    
    Tree<Dog> dogTree = new Tree<>(new Dog("Rex"));
    dogTree.addChild(new Tree<>(new Dog("Max")));
    dogTree.addChild(new Tree<>(new Dog("Buddy")));
    
}
