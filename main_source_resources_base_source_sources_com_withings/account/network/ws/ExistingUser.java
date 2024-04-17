package com.withings.account.network.ws;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.internal.healthdata.IpcUtil;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsModels.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000e\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/withings/account/network/ws/ExistingUser;", "Landroid/os/Parcelable;", "Lcom/withings/account/network/ws/AccountUser;", "", "describeContents", "()I", "Landroid/os/Parcel;", IpcUtil.KEY_PARCEL, "flags", "Lnm0/y;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "providerToken", "Ljava/lang/String;", "getProviderToken", "()Ljava/lang/String;", "sessionId", "getSessionId", "", "accountId", "J", "getAccountId", "()J", "loginMethod", "getLoginMethod", "authToken", "getAuthToken", "", "requireSecureSession", "Z", "getRequireSecureSession", "()Z", "isSecure", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZ)V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class ExistingUser extends AccountUser implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ExistingUser> CREATOR = new Creator();
    @SerializedName("accountid")
    private final long accountId;
    @SerializedName("auth_token")
    private final String authToken;
    @SerializedName("is_secure")
    private final boolean isSecure;
    @SerializedName("login_method")
    private final String loginMethod;
    @SerializedName("token")
    private final String providerToken;
    @SerializedName("require_secure_session")
    private final boolean requireSecureSession;
    @SerializedName(ConstantsWs.JSON_SESSION_KEY_SESSIONID)
    private final String sessionId;

    /* compiled from: WsModels.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ExistingUser> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExistingUser createFromParcel(Parcel parcel) {
            u.j(parcel, "parcel");
            return new ExistingUser(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExistingUser[] newArray(int i11) {
            return new ExistingUser[i11];
        }
    }

    public ExistingUser(String str, String sessionId, long j5, String str2, String authToken, boolean z5, boolean z11) {
        u.j(sessionId, "sessionId");
        u.j(authToken, "authToken");
        this.providerToken = str;
        this.sessionId = sessionId;
        this.accountId = j5;
        this.loginMethod = str2;
        this.authToken = authToken;
        this.requireSecureSession = z5;
        this.isSecure = z11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getAccountId() {
        return this.accountId;
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final String getLoginMethod() {
        return this.loginMethod;
    }

    public final String getProviderToken() {
        return this.providerToken;
    }

    public final boolean getRequireSecureSession() {
        return this.requireSecureSession;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final boolean isSecure() {
        return this.isSecure;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        u.j(out, "out");
        out.writeString(this.providerToken);
        out.writeString(this.sessionId);
        out.writeLong(this.accountId);
        out.writeString(this.loginMethod);
        out.writeString(this.authToken);
        out.writeInt(this.requireSecureSession ? 1 : 0);
        out.writeInt(this.isSecure ? 1 : 0);
    }
}
