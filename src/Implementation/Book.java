package Implementation;

import API.IVisitable;
import API.IVisitor;

public class Book implements IVisitable {
    private String coverColor = "Blue";


    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String toString(){
        return "Je suis un book dont la couleur de ma couverture est : " + coverColor;
    }


}
