package fnplot.values;
import fnplot.sys.FnPlotException;
import static fnplot.values.FnPlotValue.make;

public class FnPlotChar extends FnPlotValue<FnPlotChar>{
    char val;

    public FnPlotChar(char c){
        this.val = c;
    }

    public FnPlotType getType(){
        return FnPlotType.CHAR;
    }

    public char getVal(){
        return this.val;
    }

    public String toString(){
        return "\"" + this.val + "\"";
    }
}