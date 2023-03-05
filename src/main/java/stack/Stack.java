package stack;

public interface Stack {
    void push(Object obj);
    Object pop();
    int size();
    void clear();
    Object peek();
    boolean contains(Object obj);
    boolean isEmpty();
}
