package com.withings.webservices.legacy.withings.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
/* loaded from: classes4.dex */
public class Sharing {
    @SerializedName("alter_id")
    public int alterId = -1;
    public int approval;
    @SerializedName("clientid")
    public int clientId;
    public int delete;
    @SerializedName("firstname")
    public String firstName;

    /* renamed from: id  reason: collision with root package name */
    public int f46861id;
    @SerializedName("lastname")
    public String lastName;
    public String mail;
    public int modify;
    public int read;
    @SerializedName("serverid")
    public int serverId;
    public int type;

    /* loaded from: classes4.dex */
    public static class List {
        public ArrayList<Sharing> sharings;
    }

    public String toString() {
        return this.mail;
    }
}
