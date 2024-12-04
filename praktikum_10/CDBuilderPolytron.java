package praktikum_10;

public class CDBuilderPolytron {

    public CDType buildPolytronCD() {
        CDType cds = new CDType();
        cds.addItem(new Polytron());
        return cds;
    }
}