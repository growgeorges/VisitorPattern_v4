package Implementation;

import API.IVisitable;
import API.IVisitor;

public class VisitorImpl implements IVisitor {


    @Override
    public void visit(IVisitable o) {
        System.out.println("not implemented yet.");
    }

    @Override
    public void visit(Book book) {
        System.out.println(book);
    }

    @Override
    public void visit(Dog dog) {
        System.out.println(dog);
    }

    @Override
    public void visit(Human human) {
        System.out.println(human);
    }
}
