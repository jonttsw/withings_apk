package com.withings.webservices.legacy.withings.model.timeline;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
/* loaded from: classes4.dex */
public class Timeline {
    @SerializedName("modified")
    private DateTime modified;
    private List<WsTimelineItem> timeline = new ArrayList();

    public List<WsTimelineItem> getItems() {
        return this.timeline;
    }

    public DateTime getModified() {
        return this.modified;
    }
}
