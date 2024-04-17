package com.withings.user.core.models;

import androidx.camera.camera2.internal.k0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
/* compiled from: WsUserDeletion.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/withings/user/core/models/WsUserDeletion;", "", "token", "", "requestId", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getToken", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WsUserDeletion {
    @SerializedName("resquestid")
    private final String requestId;
    @SerializedName("token")
    private final String token;

    public WsUserDeletion() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ WsUserDeletion copy$default(WsUserDeletion wsUserDeletion, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = wsUserDeletion.token;
        }
        if ((i11 & 2) != 0) {
            str2 = wsUserDeletion.requestId;
        }
        return wsUserDeletion.copy(str, str2);
    }

    public final String component1() {
        return this.token;
    }

    public final String component2() {
        return this.requestId;
    }

    public final WsUserDeletion copy(String str, String str2) {
        return new WsUserDeletion(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WsUserDeletion)) {
            return false;
        }
        WsUserDeletion wsUserDeletion = (WsUserDeletion) obj;
        if (u.e(this.token, wsUserDeletion.token) && u.e(this.requestId, wsUserDeletion.requestId)) {
            return true;
        }
        return false;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        int hashCode;
        String str = this.token;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = hashCode * 31;
        String str2 = this.requestId;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        return k0.c("WsUserDeletion(token=", this.token, ", requestId=", this.requestId, ")");
    }

    public WsUserDeletion(String str, String str2) {
        this.token = str;
        this.requestId = str2;
    }

    public /* synthetic */ WsUserDeletion(String str, String str2, int i11, m mVar) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}
