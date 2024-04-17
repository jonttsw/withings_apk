package com.withings.zendesk.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.v0;
import androidx.compose.material3.d;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ZendeskLabel.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0004J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\u0007R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b\"\u0010\u0007R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b#\u0010\u0007¨\u0006&"}, d2 = {"Lcom/withings/zendesk/models/ZendeskLabel;", "Landroid/os/Parcelable;", "", "component1", "()I", "", "component2", "()Ljava/lang/String;", "component3", "component4", ConstantsWs.REDOX_DATA_MODEL_ORDER, "zendeskLabel", "wordingKey", "glyphName", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/withings/zendesk/models/ZendeskLabel;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getOrder", "Ljava/lang/String;", "getZendeskLabel", "getWordingKey", "getGlyphName", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ZendeskLabel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ZendeskLabel> CREATOR = new Creator();
    private final String glyphName;
    private final int order;
    private final String wordingKey;
    private final String zendeskLabel;

    /* compiled from: ZendeskLabel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<ZendeskLabel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskLabel createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new ZendeskLabel(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ZendeskLabel[] newArray(int i11) {
            return new ZendeskLabel[i11];
        }
    }

    public ZendeskLabel(int i11, String zendeskLabel, String wordingKey, String glyphName) {
        u.j(zendeskLabel, "zendeskLabel");
        u.j(wordingKey, "wordingKey");
        u.j(glyphName, "glyphName");
        this.order = i11;
        this.zendeskLabel = zendeskLabel;
        this.wordingKey = wordingKey;
        this.glyphName = glyphName;
    }

    public static /* synthetic */ ZendeskLabel copy$default(ZendeskLabel zendeskLabel, int i11, String str, String str2, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = zendeskLabel.order;
        }
        if ((i12 & 2) != 0) {
            str = zendeskLabel.zendeskLabel;
        }
        if ((i12 & 4) != 0) {
            str2 = zendeskLabel.wordingKey;
        }
        if ((i12 & 8) != 0) {
            str3 = zendeskLabel.glyphName;
        }
        return zendeskLabel.copy(i11, str, str2, str3);
    }

    public final int component1() {
        return this.order;
    }

    public final String component2() {
        return this.zendeskLabel;
    }

    public final String component3() {
        return this.wordingKey;
    }

    public final String component4() {
        return this.glyphName;
    }

    public final ZendeskLabel copy(int i11, String zendeskLabel, String wordingKey, String glyphName) {
        u.j(zendeskLabel, "zendeskLabel");
        u.j(wordingKey, "wordingKey");
        u.j(glyphName, "glyphName");
        return new ZendeskLabel(i11, zendeskLabel, wordingKey, glyphName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZendeskLabel)) {
            return false;
        }
        ZendeskLabel zendeskLabel = (ZendeskLabel) obj;
        if (this.order == zendeskLabel.order && u.e(this.zendeskLabel, zendeskLabel.zendeskLabel) && u.e(this.wordingKey, zendeskLabel.wordingKey) && u.e(this.glyphName, zendeskLabel.glyphName)) {
            return true;
        }
        return false;
    }

    public final String getGlyphName() {
        return this.glyphName;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getWordingKey() {
        return this.wordingKey;
    }

    public final String getZendeskLabel() {
        return this.zendeskLabel;
    }

    public int hashCode() {
        return this.glyphName.hashCode() + d.c(this.wordingKey, d.c(this.zendeskLabel, Integer.hashCode(this.order) * 31, 31), 31);
    }

    public String toString() {
        int i11 = this.order;
        String str = this.zendeskLabel;
        return v0.d(d.a("ZendeskLabel(order=", i11, ", zendeskLabel=", str, ", wordingKey="), this.wordingKey, ", glyphName=", this.glyphName, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeInt(this.order);
        out.writeString(this.zendeskLabel);
        out.writeString(this.wordingKey);
        out.writeString(this.glyphName);
    }
}
