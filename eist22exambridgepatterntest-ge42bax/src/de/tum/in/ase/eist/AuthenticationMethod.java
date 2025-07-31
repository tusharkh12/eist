package de.tum.in.ase.eist;

import java.util.Map;

public interface AuthenticationMethod {
    public boolean login(String loginName, Map<LoginRequestType, String> loginRequest);
}
