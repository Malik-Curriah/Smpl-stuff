package fnplot.syntax;

import fnplot.semantics.Visitor;
import fnplot.sys.FnPlotException;

public class ExpNot extends Exp {

    Exp exp;

    public ExpNot(Exp e) {
        this.exp = e;
    }

    public Exp getExp() {
        return exp;
    }

    @Override
    public <S, T> T visit(Visitor<S, T> v, S arg) throws FnPlotException {
        return v.visitExpNot(this, arg);
    }

    @Override
    public String toString() {
        return "not" + exp1.toString();
    }
}