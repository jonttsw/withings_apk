package com.withings.zendesk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.y1;
import androidx.compose.material3.d;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
/* compiled from: ZendeskDevice.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0004J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0004J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0007R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b \u0010\u0007¨\u0006#"}, d2 = {"Lcom/withings/zendesk/models/ZendeskDevice;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "modelId", "category", DataLayout.Section.ELEMENT, "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/withings/zendesk/models/ZendeskDevice;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getModelId", "Ljava/lang/String;", "getCategory", "getSection", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ZendeskDevice implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ZendeskDevice> CREATOR = new Creator();
    private final String category;
    private final int modelId;
    private final String section;

    /* compiled from: ZendeskDevice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ZendeskDevice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskDevice createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new ZendeskDevice(parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskDevice[] newArray(int i11) {
            return new ZendeskDevice[i11];
        }
    }

    public ZendeskDevice(int i11, String category, String section) {
        u.j(category, "category");
        u.j(section, "section");
        this.modelId = i11;
        this.category = category;
        this.section = section;
    }

    public static /* synthetic */ ZendeskDevice copy$default(ZendeskDevice zendeskDevice, int i11, String str, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = zendeskDevice.modelId;
        }
        if ((i12 & 2) != 0) {
            str = zendeskDevice.category;
        }
        if ((i12 & 4) != 0) {
            str2 = zendeskDevice.section;
        }
        return zendeskDevice.copy(i11, str, str2);
    }

    public final int component1() {
        return this.modelId;
    }

    public final String component2() {
        return this.category;
    }

    public final String component3() {
        return this.section;
    }

    public final ZendeskDevice copy(int i11, String category, String section) {
        u.j(category, "category");
        u.j(section, "section");
        return new ZendeskDevice(i11, category, section);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZendeskDevice)) {
            return false;
        }
        ZendeskDevice zendeskDevice = (ZendeskDevice) obj;
        if (this.modelId == zendeskDevice.modelId && u.e(this.category, zendeskDevice.category) && u.e(this.section, zendeskDevice.section)) {
            return true;
        }
        return false;
    }

    public final String getCategory() {
        return this.category;
    }

    public final int getModelId() {
        return this.modelId;
    }

    public final String getSection() {
        return this.section;
    }

    public int hashCode() {
        return this.section.hashCode() + d.c(this.category, Integer.hashCode(this.modelId) * 31, 31);
    }

    public String toString() {
        int i11 = this.modelId;
        String str = this.category;
        return y1.e(d.a("ZendeskDevice(modelId=", i11, ", category=", str, ", section="), this.section, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.modelId);
        out.writeString(this.category);
        out.writeString(this.section);
    }
}
