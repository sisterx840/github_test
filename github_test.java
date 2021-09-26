package github_test;
class Claculator{
    int left, right;
    public void setOperands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public void sum(){
        System.out.println(this.left+this.right);

    }
    public void avg(){
        System.out.println((this.left+this.right)/2);

    }

}
/**
 * github_test
 */
public class github_test {
    public static void main(String[] args) {
        Claculator c1 = new Claculator();
        c1.setOperands(10,20);
        c1.sum();
        c1.avg();
    }
    
}