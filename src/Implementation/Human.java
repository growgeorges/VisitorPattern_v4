package Implementation;

import API.IVisitable;
import API.IVisitor;

public class Human extends Mamal {
    private String name = "Yanni";

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    public String toString(){
        return "Je suis un humain dont le nom est : " + name;
    }
}
