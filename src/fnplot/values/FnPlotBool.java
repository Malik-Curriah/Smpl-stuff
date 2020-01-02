import fnplot.sys.FnPlotException;
import static fnplot.values.FnPlotValue.make;

public class FnPlotBool extends FnPlotValue<FnPlotBool>{
    boolean val;
    public FnPlotBool(boolean b){
        this.val = b;
    }

    public FnPlotType getType(){
        return FnPlotType.BOOL;
    }

    public boolean getVal(){
        return this.val;
    }

    public FnPlotBool or(FnPlotValue<FnPlotBool> arg){
        return make(val || arg.boolVal() );
    }

    public FnPlotBool and(FnPlotValue<FnPlotBool> arg){
        return make(val && arg.boolVal());
    }

    public FnPlotBool not(){
        return make(!val);
    }

    public String toString() {
        return String.valueOf(val);
    }
}