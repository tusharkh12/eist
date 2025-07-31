package de.tum.in.ase.eist;

import java.util.Map;

public class TutorsGroup extends Group {
    public TutorsGroup(TwoFactorAuthentication twoFactorAuthentication) {
        super(twoFactorAuthentication);

    }



    @Override
    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return super.getAuthenticationMethod().login(loginName,request);
    }
    // TODO
}
