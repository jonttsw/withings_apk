package com.withings.wiscale2.track.ws;

import com.google.gson.annotations.SerializedName;
import com.withings.wiscale2.track.data.Track;
import org.jivesoftware.smackx.disco.packet.DiscoverItems;
import org.joda.time.DateTime;
/* loaded from: classes5.dex */
public class StoreTrackResponse {
    @SerializedName("delete")
    private Track deletedTrack;

    /* renamed from: id  reason: collision with root package name */
    private long f61735id;
    @SerializedName("storetime")
    private DateTime storeTime;
    @SerializedName("updatetime")
    private DateTime updateTime;
    @SerializedName(DiscoverItems.Item.UPDATE_ACTION)
    private Track updatedTrack;

    public Track getDeletedTrack() {
        return this.deletedTrack;
    }

    public long getId() {
        return this.f61735id;
    }

    public DateTime getStoreTime() {
        return this.storeTime;
    }

    public DateTime getUpdateTime() {
        return this.updateTime;
    }

    public Track getUpdatedTrack() {
        return this.updatedTrack;
    }

    public void setDeletedTrack(Track track) {
        this.deletedTrack = track;
    }

    public void setId(long j5) {
        this.f61735id = j5;
    }

    public void setStoreTime(DateTime dateTime) {
        this.storeTime = dateTime;
    }

    public void setUpdateTime(DateTime dateTime) {
        this.updateTime = dateTime;
    }

    public void setUpdatedTrack(Track track) {
        this.updatedTrack = track;
    }
}
