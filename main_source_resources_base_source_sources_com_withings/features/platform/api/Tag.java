package com.withings.features.platform.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import dp0.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: PlatformTagApi.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000f\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b)\u0010*J\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ4\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J \u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\tR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\u000bR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010\u000e¨\u0006+"}, d2 = {"Lcom/withings/features/platform/api/Tag;", "Landroid/os/Parcelable;", "", "tagName", "", "getFeatureId", "(Ljava/lang/String;)Ljava/lang/Integer;", "", "component1", "()J", "component2", "()Ljava/lang/String;", "", "component3", "()Ljava/util/List;", "ownerId", "ownerType", "tags", "copy", "(JLjava/lang/String;Ljava/util/List;)Lcom/withings/features/platform/api/Tag;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getOwnerId", "Ljava/lang/String;", "getOwnerType", "Ljava/util/List;", "getTags", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Tag implements Parcelable {
    public static final Parcelable.Creator<Tag> CREATOR = new Creator();
    @SerializedName("ownerid")
    private final long ownerId;
    @SerializedName("ownertype")
    private final String ownerType;
    private final List<String> tags;

    /* compiled from: PlatformTagApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Tag> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tag createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Tag(parcel.readLong(), parcel.readString(), parcel.createStringArrayList());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Tag[] newArray(int i11) {
            return new Tag[i11];
        }
    }

    public Tag(long j5, String ownerType, List<String> tags) {
        u.j(ownerType, "ownerType");
        u.j(tags, "tags");
        this.ownerId = j5;
        this.ownerType = ownerType;
        this.tags = tags;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Tag copy$default(Tag tag, long j5, String str, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j5 = tag.ownerId;
        }
        if ((i11 & 2) != 0) {
            str = tag.ownerType;
        }
        if ((i11 & 4) != 0) {
            list = tag.tags;
        }
        return tag.copy(j5, str, list);
    }

    public final long component1() {
        return this.ownerId;
    }

    public final String component2() {
        return this.ownerType;
    }

    public final List<String> component3() {
        return this.tags;
    }

    public final Tag copy(long j5, String ownerType, List<String> tags) {
        u.j(ownerType, "ownerType");
        u.j(tags, "tags");
        return new Tag(j5, ownerType, tags);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        if (this.ownerId == tag.ownerId && u.e(this.ownerType, tag.ownerType) && u.e(this.tags, tag.tags)) {
            return true;
        }
        return false;
    }

    public final Integer getFeatureId(String tagName) {
        u.j(tagName, "tagName");
        if (j.r(tagName, "ce_medical", false)) {
            return 1;
        }
        if (j.r(tagName, "apnea", false)) {
            return 2;
        }
        return null;
    }

    public final long getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerType() {
        return this.ownerType;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        return this.tags.hashCode() + d.c(this.ownerType, Long.hashCode(this.ownerId) * 31, 31);
    }

    public String toString() {
        long j5 = this.ownerId;
        String str = this.ownerType;
        List<String> list = this.tags;
        return "Tag(ownerId=" + j5 + ", ownerType=" + str + ", tags=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeLong(this.ownerId);
        out.writeString(this.ownerType);
        out.writeStringList(this.tags);
    }
}
