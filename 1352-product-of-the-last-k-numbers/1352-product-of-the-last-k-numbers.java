import java.util.*;
class ProductOfNumbers {
    ArrayList<Integer> obj;
    public ProductOfNumbers() {
        obj= new ArrayList<>();
    }
    public void add(int num) {
        obj.add(num);
    }
    public int getProduct(int k) {
        int product = 1;
        for (int i = obj.size() - k; i < obj.size(); i++) {
            product *= obj.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */