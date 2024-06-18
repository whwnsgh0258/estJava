package Day0618.inherit;

public class Product <T,M>{
    private T kind;
    private M model;

    public M getModel() {
        return model;
    }

    public T getKind() {
        return kind;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
