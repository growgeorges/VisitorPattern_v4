package Implementation;

import API.IVisitable;
import API.IVisitor;

public class Dog extends Mamal {
    private String breed = "Korgy";


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String toString(){
        return "Je suis un chien dont la race est : " + breed;
    }
}
