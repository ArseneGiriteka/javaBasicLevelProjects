class Dog{
    String name;
    public static void main(String[] args){
        Dog dog_one = new Dog();
        dog_one.bark();
        dog_one.name = "Rex";

        Dog[] myDogs =new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog_one;

        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Last dog names is ");
        System.out.println(myDogs[2].name);

        int x=0;
        while(x<myDogs.length){
            myDogs[x].bark();
            x=x+1;
        }
    }

    public void bark(){
        System.out.println(name+" says ruff ruff");
    }
}