import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalQuantity {
    Map<Integer,String> obj = new HashMap<>();
    Map<Integer,String> stock = new HashMap<>();

    public void setObj(Map<Integer, String> obj) {
        this.obj = obj;
    }

    public Map<Integer, String> getObj() {
        return obj;
    }

    public void setStock(Map<Integer, String> stock) {
        this.stock = stock;
    }

    public Map<Integer, String> getStock() {
        return stock;
    }


}
