package com.withings.account.network.ws;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/withings/account/network/ws/RequestDeletionResponse;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "token", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RequestDeletionResponse implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<RequestDeletionResponse> CREATOR = new Creator();
    @SerializedName("token")
    private final String token;

    /* compiled from: WsModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<RequestDeletionResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestDeletionResponse createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new RequestDeletionResponse(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RequestDeletionResponse[] newArray(int i11) {
            return new RequestDeletionResponse[i11];
        }
    }

    public RequestDeletionResponse(String str) {
        this.token = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getToken() {
        return this.token;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.token);
    }
}
