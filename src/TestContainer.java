public class TestContainer {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.setObj("Hello");

        System.out.println(container.getObj());

        //Another Container of Integers:
        Container<Integer> intContainer = new Container<>();
        intContainer.setObj(15);
        System.out.println(intContainer.getObj());
    }
}