package com.withings.webservices.legacy.withings.model.program;

import com.google.gson.annotations.SerializedName;
import com.withings.webservices.legacy.withings.model.ImagesP4;
import java.io.Serializable;
import java.util.List;
/* loaded from: classes4.dex */
public class WsProgram implements Serializable {
    public int cohortId;
    @SerializedName("enddate")
    public String endDate;
    @SerializedName("groups")
    public List<WsGroups> groups;
    @SerializedName("p4")
    public ImagesP4 images;
    public List<WsMenuItem> menu;
    public String name;
    @SerializedName("programid")
    public int programId;
    public List<String> roles;
    @SerializedName("startdate")
    public String startDate;
    public String status;
    public String timezone;
    public List<Long> users;

    /* loaded from: classes4.dex */
    public static class WsGroups {
        @SerializedName("invitation_hash")
        public String invitationHash;
        public String name;
    }

    /* loaded from: classes4.dex */
    public static class WsMenuItem {
        public String icon;
        @SerializedName("trad_key")
        public String tradKey;
        public String url;
    }
}
