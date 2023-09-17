public class Container<T> {
    private T obj;

    public void setObj(T obj){
        this.obj = obj;
    }

    public T getObj(){
        return this.obj;
    }

    public T removeObj(){
        T temp = this.obj;
        obj=null;

        return temp;
    }
}
