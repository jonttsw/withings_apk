package com.withings.webservices.legacy.withings.model.amazon;

import java.util.List;
/* loaded from: classes4.dex */
public class BucketInfo {
    private String accesskeyid;
    private String secretaccesskey;
    private String sessiontoken;
    private List<Integer> users;

    public String getAccesskeyid() {
        return this.accesskeyid;
    }

    public String getSecretaccesskey() {
        return this.secretaccesskey;
    }

    public String getSessiontoken() {
        return this.sessiontoken;
    }

    public List<Integer> getUsers() {
        return this.users;
    }

    public void setAccesskeyid(String str) {
        this.accesskeyid = str;
    }

    public void setSecretaccesskey(String str) {
        this.secretaccesskey = str;
    }

    public void setSessiontoken(String str) {
        this.sessiontoken = str;
    }

    public void setUsers(List<Integer> list) {
        this.users = list;
    }
}
