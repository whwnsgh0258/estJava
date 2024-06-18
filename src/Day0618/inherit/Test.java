package Day0618.inherit;

public class Test {
    public static void main(String[] args) {
        ChildProduct <Tv,String,String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("smart Tv");
        product.setCompany("삼성");

        StorageImpl<Tv> TvStorage = new StorageImpl<>(100);
        TvStorage.add(new Tv(), 0);

        System.out.println(product.getCompany());
        System.out.println(product.getModel());
        System.out.println(product.getKind());
        System.out.println(TvStorage.get(0));
    }
}
