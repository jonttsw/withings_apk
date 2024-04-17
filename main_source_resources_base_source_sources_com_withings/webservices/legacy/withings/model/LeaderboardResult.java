package com.withings.webservices.legacy.withings.model;

import com.google.gson.annotations.SerializedName;
import java.util.List;
/* loaded from: classes4.dex */
public class LeaderboardResult {
    @SerializedName("leaderboard")
    public List<LeaderboardWSEntrie> list;

    /* loaded from: classes4.dex */
    public static class LeaderboardWSEntrie {
        public String firstname;
        public String lastname;

        /* renamed from: p4  reason: collision with root package name */
        public ImagesP4 f46860p4;
        public long userid;
        public int value;
    }
}
