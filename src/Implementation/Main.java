package Implementation;

import API.IVisitor;

public class Main {

    public static void main(String[] args){

        IVisitor monVisiteur = new VisitorImpl();

        Mamal mamal1 = new Human();
        Mamal mamal2 = new Dog();
        Book book1 = new Book();

        mamal1.accept(monVisiteur);
        mamal2.accept(monVisiteur);
        book1.accept(monVisiteur);

    }
}
