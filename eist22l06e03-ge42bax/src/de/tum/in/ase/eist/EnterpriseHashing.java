package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {

    public EnterpriseHashing() {
        super(new CryptoSecureHashAlgorithm());
    }

    @Override
    public String hashDocument(String hashdData) {

        return getImplementation().calculateHashCode(hashdData);
    }
}
