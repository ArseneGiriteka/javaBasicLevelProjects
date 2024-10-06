public class Dog{
    private int size;

    public void setSize(int s){
        if(s>=9){
            size = s;
        }
    }

    public int getSize(){
        return size;
    }

    public void bark(){
        if(size>60){
            System.out.println(" :woof woof woof");
        }
        if(size>14){
            System.out.println(" :ruff ruff ruff");
        }
        if(size<9){
            System.out.println(" :yip yip yip");
        }
    }
}