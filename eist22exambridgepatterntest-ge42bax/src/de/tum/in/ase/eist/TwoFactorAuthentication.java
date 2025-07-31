package de.tum.in.ase.eist;

import java.util.Map;

public class TwoFactorAuthentication implements AuthenticationMethod {


    public boolean login(String loginName, Map<LoginRequestType, String> loginRequest) {
        OAuthAuthentication oAuthAuthentication=new OAuthAuthentication();
        TokenBasedAuthentication tokenBasedAuthentication=new TokenBasedAuthentication();
        if (oAuthAuthentication.login(loginName,loginRequest)){
            if(tokenBasedAuthentication.login(loginName)){
                return true;
            }
        }
      return false;


         // TODO
    }
}
