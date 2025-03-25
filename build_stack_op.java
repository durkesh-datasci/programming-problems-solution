import java.util.ArrayList;
import java.util.List;

public class build_stack_op {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> op=new ArrayList<>();
        int k=0;
        for(int numb=1;numb<=n;numb++){
            if(numb==target[k]){
                op.add("Push");
                k++;
            }else{
                op.add("Push");
                op.add("Pop");
            }
            if(k==target.length){
                break;
            }
        }
        return op;
    }
}
