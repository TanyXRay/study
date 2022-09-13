package study.javarush.practicum.generics.generics1;

public class Generic1<T extends Comparable> {
    private Object element;

    public Generic1(T element) {
        this.element = element;
    }

    public T getElement() {
        return (T) element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Generic1{" +
               "element=" + element +
               '}';
    }
}
