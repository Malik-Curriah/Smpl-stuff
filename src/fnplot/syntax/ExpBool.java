package fnplot.syntax;

import fnplot.semantics.Visitor;
import fnplot.sys.FnPlotException;
import fnplot.values.FnPlotValue;

public class ExpBool extends Exp{
    FnPlotValue<?> val;

    public ExpBool(FnPlotValue<?> v) {
        val = v;
    }

    public FnPlotValue<?> getVal() {
        return val;
    }

    public <S, T> T visit(Visitor<S, T> v, S arg) throws FnPlotException {
        return v.visitExpBool(this, arg);
    }

    public String toString() {
        return val.toString();
    }

}