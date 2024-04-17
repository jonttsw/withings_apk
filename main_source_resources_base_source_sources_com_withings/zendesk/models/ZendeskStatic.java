package com.withings.zendesk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ZendeskStatic.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0005J4\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0005R\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b \u0010\u0005¨\u0006#"}, d2 = {"Lcom/withings/zendesk/models/ZendeskStatic;", "Landroid/os/Parcelable;", "", "Lcom/withings/zendesk/models/ZendeskDevice;", "component1", "()Ljava/util/List;", "Lcom/withings/zendesk/models/ZendeskLabel;", "component2", "devices", "labels", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/withings/zendesk/models/ZendeskStatic;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getDevices", "getLabels", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ZendeskStatic implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ZendeskStatic> CREATOR = new Creator();
    private final List<ZendeskDevice> devices;
    private final List<ZendeskLabel> labels;

    /* compiled from: ZendeskStatic.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ZendeskStatic> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskStatic createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            u.j(parcel, "parcel");
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(ZendeskDevice.CREATOR.createFromParcel(parcel));
                }
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                for (int i12 = 0; i12 != readInt2; i12++) {
                    arrayList2.add(ZendeskLabel.CREATOR.createFromParcel(parcel));
                }
            }
            return new ZendeskStatic(arrayList, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskStatic[] newArray(int i11) {
            return new ZendeskStatic[i11];
        }
    }

    public ZendeskStatic() {
        this(null, null, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZendeskStatic copy$default(ZendeskStatic zendeskStatic, List list, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = zendeskStatic.devices;
        }
        if ((i11 & 2) != 0) {
            list2 = zendeskStatic.labels;
        }
        return zendeskStatic.copy(list, list2);
    }

    public final List<ZendeskDevice> component1() {
        return this.devices;
    }

    public final List<ZendeskLabel> component2() {
        return this.labels;
    }

    public final ZendeskStatic copy(List<ZendeskDevice> list, List<ZendeskLabel> list2) {
        return new ZendeskStatic(list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZendeskStatic)) {
            return false;
        }
        ZendeskStatic zendeskStatic = (ZendeskStatic) obj;
        if (u.e(this.devices, zendeskStatic.devices) && u.e(this.labels, zendeskStatic.labels)) {
            return true;
        }
        return false;
    }

    public final List<ZendeskDevice> getDevices() {
        return this.devices;
    }

    public final List<ZendeskLabel> getLabels() {
        return this.labels;
    }

    public int hashCode() {
        int hashCode;
        List<ZendeskDevice> list = this.devices;
        int i11 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i12 = hashCode * 31;
        List<ZendeskLabel> list2 = this.labels;
        if (list2 != null) {
            i11 = list2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        List<ZendeskDevice> list = this.devices;
        List<ZendeskLabel> list2 = this.labels;
        return "ZendeskStatic(devices=" + list + ", labels=" + list2 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        List<ZendeskDevice> list = this.devices;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ZendeskDevice zendeskDevice : list) {
                zendeskDevice.writeToParcel(out, i11);
            }
        }
        List<ZendeskLabel> list2 = this.labels;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list2.size());
        for (ZendeskLabel zendeskLabel : list2) {
            zendeskLabel.writeToParcel(out, i11);
        }
    }

    public ZendeskStatic(List<ZendeskDevice> list, List<ZendeskLabel> list2) {
        this.devices = list;
        this.labels = list2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ ZendeskStatic(java.util.List r2, java.util.List r3, int r4, kotlin.jvm.internal.m r5) {
        /*
            r1 = this;
            r5 = r4 & 1
            kotlin.collections.i0 r0 = kotlin.collections.i0.f76187a
            if (r5 == 0) goto L7
            r2 = r0
        L7:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            r3 = r0
        Lc:
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.zendesk.models.ZendeskStatic.<init>(java.util.List, java.util.List, int, kotlin.jvm.internal.m):void");
    }
}
