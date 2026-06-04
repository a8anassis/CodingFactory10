package gr.aueb.cf.ch17;

public class GenericMain {

    public static void main(String[] args) {
        GenericNode<String> strNode = new GenericNode<>();
        GenericNode<Double> doubleNode = new GenericNode<>();
//        GenericNode<Integer> intNode = new GenericNode<>();
        var intNode = new GenericNode<Integer>();

        strNode.setValue("Hello");
        doubleNode.setValue(1.23);
        intNode.setValue(10);

        String str = strNode.getValue();
    }
}
