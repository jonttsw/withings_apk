package com.withings.account.network.ws;

import android.os.Parcel;
import android.os.Parcelable;
import bn.d;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/withings/account/network/ws/CodesResponse;", "Landroid/os/Parcelable;", "", "Lcom/withings/account/network/ws/Code;", "component1", "()Ljava/util/List;", "codes", "copy", "(Ljava/util/List;)Lcom/withings/account/network/ws/CodesResponse;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getCodes", "setCodes", "(Ljava/util/List;)V", "<init>", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class CodesResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<CodesResponse> CREATOR = new Creator();
    @SerializedName("codes")
    private List<Code> codes;

    /* compiled from: WsModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CodesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CodesResponse createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Code.CREATOR.createFromParcel(parcel));
            }
            return new CodesResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CodesResponse[] newArray(int i11) {
            return new CodesResponse[i11];
        }
    }

    public CodesResponse(List<Code> codes) {
        u.j(codes, "codes");
        this.codes = codes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CodesResponse copy$default(CodesResponse codesResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = codesResponse.codes;
        }
        return codesResponse.copy(list);
    }

    public final List<Code> component1() {
        return this.codes;
    }

    public final CodesResponse copy(List<Code> codes) {
        u.j(codes, "codes");
        return new CodesResponse(codes);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof CodesResponse) && u.e(this.codes, ((CodesResponse) obj).codes)) {
            return true;
        }
        return false;
    }

    public final List<Code> getCodes() {
        return this.codes;
    }

    public int hashCode() {
        return this.codes.hashCode();
    }

    public final void setCodes(List<Code> list) {
        u.j(list, "<set-?>");
        this.codes = list;
    }

    public String toString() {
        return d.b("CodesResponse(codes=", this.codes, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        List<Code> list = this.codes;
        out.writeInt(list.size());
        for (Code code : list) {
            code.writeToParcel(out, i11);
        }
    }
}
