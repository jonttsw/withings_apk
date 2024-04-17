package com.withings.features.platform.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.material3.d;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformFeature.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b.\u0010/J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0012\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0004J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0004J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010!R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b#\u0010\u0004R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010\u0007R(\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010\u000b\"\u0004\b(\u0010)R\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u000e\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/withings/features/platform/model/PlatformFeature;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "", "Lcom/withings/features/platform/model/Owner;", "component3", "()Ljava/util/List;", "", "component4", "()Z", "featureId", "name", "owners", "synced", "copy", "(ILjava/lang/String;Ljava/util/List;Z)Lcom/withings/features/platform/model/PlatformFeature;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getFeatureId", "Ljava/lang/String;", "getName", "Ljava/util/List;", "getOwners", "setOwners", "(Ljava/util/List;)V", "Z", "getSynced", "setSynced", "(Z)V", "<init>", "(ILjava/lang/String;Ljava/util/List;Z)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PlatformFeature implements Parcelable {
    public static final Parcelable.Creator<PlatformFeature> CREATOR = new Creator();
    @SerializedName("featureid")
    private final int featureId;
    private final String name;
    private List<? extends Owner> owners;
    private boolean synced;

    /* compiled from: PlatformFeature.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<PlatformFeature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformFeature createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList.add(parcel.readSerializable());
            }
            return new PlatformFeature(readInt, readString, arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlatformFeature[] newArray(int i11) {
            return new PlatformFeature[i11];
        }
    }

    public PlatformFeature(int i11, String str, List<? extends Owner> owners, boolean z5) {
        u.j(owners, "owners");
        this.featureId = i11;
        this.name = str;
        this.owners = owners;
        this.synced = z5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlatformFeature copy$default(PlatformFeature platformFeature, int i11, String str, List list, boolean z5, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = platformFeature.featureId;
        }
        if ((i12 & 2) != 0) {
            str = platformFeature.name;
        }
        if ((i12 & 4) != 0) {
            list = platformFeature.owners;
        }
        if ((i12 & 8) != 0) {
            z5 = platformFeature.synced;
        }
        return platformFeature.copy(i11, str, list, z5);
    }

    public final int component1() {
        return this.featureId;
    }

    public final String component2() {
        return this.name;
    }

    public final List<Owner> component3() {
        return this.owners;
    }

    public final boolean component4() {
        return this.synced;
    }

    public final PlatformFeature copy(int i11, String str, List<? extends Owner> owners, boolean z5) {
        u.j(owners, "owners");
        return new PlatformFeature(i11, str, owners, z5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformFeature)) {
            return false;
        }
        PlatformFeature platformFeature = (PlatformFeature) obj;
        if (this.featureId == platformFeature.featureId && u.e(this.name, platformFeature.name) && u.e(this.owners, platformFeature.owners) && this.synced == platformFeature.synced) {
            return true;
        }
        return false;
    }

    public final int getFeatureId() {
        return this.featureId;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Owner> getOwners() {
        return this.owners;
    }

    public final boolean getSynced() {
        return this.synced;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.featureId) * 31;
        String str = this.name;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.synced) + e.b(this.owners, (hashCode2 + hashCode) * 31, 31);
    }

    public final void setOwners(List<? extends Owner> list) {
        u.j(list, "<set-?>");
        this.owners = list;
    }

    public final void setSynced(boolean z5) {
        this.synced = z5;
    }

    public String toString() {
        int i11 = this.featureId;
        String str = this.name;
        List<? extends Owner> list = this.owners;
        boolean z5 = this.synced;
        StringBuilder a11 = d.a("PlatformFeature(featureId=", i11, ", name=", str, ", owners=");
        a11.append(list);
        a11.append(", synced=");
        a11.append(z5);
        a11.append(")");
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.featureId);
        out.writeString(this.name);
        List<? extends Owner> list = this.owners;
        out.writeInt(list.size());
        for (Owner owner : list) {
            out.writeSerializable(owner);
        }
        out.writeInt(this.synced ? 1 : 0);
    }
}
