package com.withings.library.timeline.data;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes4.dex */
public class DeviceTimelineItem extends TimelineItem {
    public static final Parcelable.Creator<DeviceTimelineItem> CREATOR = new Object();

    /* renamed from: l  reason: collision with root package name */
    protected boolean f40641l;

    /* loaded from: classes4.dex */
    final class a implements Parcelable.Creator<DeviceTimelineItem> {
        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.library.timeline.data.TimelineItem, com.withings.library.timeline.data.DeviceTimelineItem] */
        @Override // android.os.Parcelable.Creator
        public final DeviceTimelineItem createFromParcel(Parcel parcel) {
            ?? timelineItem = new TimelineItem(parcel);
            boolean z5 = true;
            timelineItem.f40641l = true;
            if (parcel.readInt() != 1) {
                z5 = false;
            }
            timelineItem.f40641l = z5;
            return timelineItem;
        }

        @Override // android.os.Parcelable.Creator
        public final DeviceTimelineItem[] newArray(int i11) {
            return new DeviceTimelineItem[i11];
        }
    }

    @Override // com.withings.library.timeline.data.TimelineItem, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.withings.library.timeline.data.TimelineItem, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.f40641l ? 1 : 0);
    }
}
