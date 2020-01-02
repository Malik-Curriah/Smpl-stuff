package fnplot.values;
import fnplot.sys.FnPlotException;
import static fnplot.values.FnPlotValue.make;

public class FnPlotString extends FnPlotValue<FnPlotString> {
    String val;

    public FnPlotString(String s){
        this.val = s;
    }

    public FnPlotType getType(){
        return FnPlotType.STRING;
    }

    public String getVal(){
        return this.val;
    }

    public String toString() {
        return String.valueOf(val);
    }
}