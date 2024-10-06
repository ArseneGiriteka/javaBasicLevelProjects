public class DogTestDrive {
    public static void main(String[] args) {
        Dog dog_one = new Dog();
        Dog dog_two = new Dog();
        Dog dog_three = new Dog();

        dog_one.setSize(70);
        dog_one.bark();
        dog_two.setSize(30);
        dog_two.bark();
        dog_three.setSize(5);
        dog_three.bark();
    }
}
