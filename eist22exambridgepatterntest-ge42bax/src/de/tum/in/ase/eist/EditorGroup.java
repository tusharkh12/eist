package de.tum.in.ase.eist;

import java.util.Map;

public class EditorGroup extends Group{
    public EditorGroup(OAuthAuthentication oAuthAuthentication) {
        super(oAuthAuthentication);
    }

    @Override
    public boolean checkLogin(String loginName, Map<LoginRequestType, String> request) {
        return super.getAuthenticationMethod().login(loginName,request);
    }
    // TODO
}
