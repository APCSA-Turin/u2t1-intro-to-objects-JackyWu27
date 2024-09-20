public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jeremy", 4, 14);
        cat1.introduce();
        cat1.printCatInfo();
        Cat cat2 = new Cat("Woof", 10, 15.5);
        cat2.printCatInfo();
        cat2.introduce();
    }
}
