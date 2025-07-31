package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {
    private  static  final int  NUMBER_MAX = 1000;

    public PreviewHashing() {
        super(new SimpleHashAlgorithm());
    }

    @Override
    public String hashDocument(String hashData) {

        if (hashData.length() > NUMBER_MAX) {
            throw new IllegalArgumentException();
        } else

            return getImplementation().calculateHashCode(hashData);
    }
}
