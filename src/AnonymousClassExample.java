/**
 * Created by zach on 2/22/16.
 */
public class AnonymousClassExample {
    public static void main(String[] args) {
        Reptile alligator = new Reptile() {
            @Override
            public void makeSound() {
                System.out.println("Croak");
            }
        };
        alligator.name = "Alligator";

        alligator.makeSound();
    }
}
