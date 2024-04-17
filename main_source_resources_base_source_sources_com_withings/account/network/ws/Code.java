package com.withings.account.network.ws;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004\"\u0004\b\u001e\u0010\u001fR$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Lcom/withings/account/network/ws/Code;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", XHTMLText.CODE, "usedDate", "copy", "(Ljava/lang/String;Ljava/lang/Long;)Lcom/withings/account/network/ws/Code;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCode", "setCode", "(Ljava/lang/String;)V", "Ljava/lang/Long;", "getUsedDate", "setUsedDate", "(Ljava/lang/Long;)V", "<init>", "(Ljava/lang/String;Ljava/lang/Long;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class Code implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<Code> CREATOR = new Creator();
    private String code;
    @SerializedName("used_date")
    private Long usedDate;

    /* compiled from: WsModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Code> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Code createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new Code(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Code[] newArray(int i11) {
            return new Code[i11];
        }
    }

    public Code(String code, Long l5) {
        u.j(code, "code");
        this.code = code;
        this.usedDate = l5;
    }

    public static /* synthetic */ Code copy$default(Code code, String str, Long l5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = code.code;
        }
        if ((i11 & 2) != 0) {
            l5 = code.usedDate;
        }
        return code.copy(str, l5);
    }

    public final String component1() {
        return this.code;
    }

    public final Long component2() {
        return this.usedDate;
    }

    public final Code copy(String code, Long l5) {
        u.j(code, "code");
        return new Code(code, l5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Code)) {
            return false;
        }
        Code code = (Code) obj;
        if (u.e(this.code, code.code) && u.e(this.usedDate, code.usedDate)) {
            return true;
        }
        return false;
    }

    public final String getCode() {
        return this.code;
    }

    public final Long getUsedDate() {
        return this.usedDate;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.code.hashCode() * 31;
        Long l5 = this.usedDate;
        if (l5 == null) {
            hashCode = 0;
        } else {
            hashCode = l5.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final void setCode(String str) {
        u.j(str, "<set-?>");
        this.code = str;
    }

    public final void setUsedDate(Long l5) {
        this.usedDate = l5;
    }

    public String toString() {
        String str = this.code;
        Long l5 = this.usedDate;
        return "Code(code=" + str + ", usedDate=" + l5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.code);
        Long l5 = this.usedDate;
        if (l5 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeLong(l5.longValue());
    }
}
