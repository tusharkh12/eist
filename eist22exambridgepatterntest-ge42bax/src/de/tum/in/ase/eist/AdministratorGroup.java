package de.tum.in.ase.eist;

import java.util.Map;

public class AdministratorGroup extends Group {
    public AdministratorGroup( BiometricAuthentication biometricAuthentication) {
        super(biometricAuthentication);

    }


    @Override
    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return super.getAuthenticationMethod().login(loginName,request);
    }
}
