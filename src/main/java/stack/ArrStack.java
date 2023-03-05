package stack;

public class ArrStack implements Stack{
    private Object[] array;
    private int size;

    public ArrStack(){
        array = new Object[10];
        size = 0;
    }





    @Override
    public void push(Object obj) {
        array[size] = obj;
        size++;

    }

    @Override
    public Object pop() {
        if (isEmpty()){
            throw new IllegalArgumentException("Stack is empty");
        }
        Object result = array[size-1];
        size--;
        return result;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;

    }

    @Override
    public Object peek() {
        return array[size-1];
    }

    @Override
    public boolean contains(Object obj) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(obj)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        else return false;
    }
}
