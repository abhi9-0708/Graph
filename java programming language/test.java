class Numbers {

    int item1, item2;
    Numbers (int i1, int i2) {
    item1 = i1; item2 = i2;
    }
    public void swap(Numbers n) {
    int temp = item1;
    item1 = item2;
    item2 = temp;
    }

}
public class test {
public static void main(String args[]) {

int num1 = 2;
int num2 = 3;
Numbers num = new Numbers (num1, num2);
System.out.println("Items before swap: "+num.item1+" and "+num.item2);
num.swap( num );
System.out.println("Items after swap: "+num.item1+" and "+num.item2);

}
}
