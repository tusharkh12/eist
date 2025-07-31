package de.tum.in.ase.eist;

import java.net.URL;
import java.util.Set;

public class SchoolProxy implements ConnectionInterface {
    private final Set<String> denylistedHosts;
    private final URL redirectPage;
    private final Set<Integer> teacherIDs;
    private boolean authorized;
    private final NetworkConnection networkConnection;

    public SchoolProxy(Set<String> denylistedHosts, URL redirectedPage, Set<Integer> teacherIDs) {
        this.denylistedHosts = denylistedHosts;
        this.redirectPage = redirectedPage;
        this.teacherIDs = teacherIDs;
      //  this.authorized = false;
        this.networkConnection = new NetworkConnection();
    }


    @Override
    public void connect(URL url) {
        if (denylistedHosts.contains(url.getHost())) {
            System.err.println("Connection to " + url + " was rejected!");
            System.out.println(redirectPage);
        } else
            networkConnection.connect(url);

    }

    @Override
    public void disconnect() {
        networkConnection.disconnect();


    }

    @Override
    public boolean isConnected() {
        return networkConnection.isConnected();
    }

    public void login(int teacherID) {
        if (teacherIDs.contains(teacherID)) {
            networkConnection.connect(redirectPage);
            authorized = true;
        }

    }

    public void logout() {
        // teacherIDs.isEmpty();
        authorized = false;

    }

    public boolean isAuthorized() {
        return authorized;
    }

    public void setAuthorized(boolean authorized) {
        this.authorized = false;
    }
    // TODO: Implement the SchoolProxy

}
