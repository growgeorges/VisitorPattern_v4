package API;

import Implementation.Book;
import Implementation.Dog;
import Implementation.Human;

public interface IVisitor {
    void visit(IVisitable o);
    void visit(Book book);
    void visit(Dog dog);
    void visit(Human human);
}
