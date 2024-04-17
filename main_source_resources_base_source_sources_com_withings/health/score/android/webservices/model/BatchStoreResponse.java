package com.withings.health.score.android.webservices.model;

import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import androidx.glance.appwidget.protobuf.g;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: ScoresWs.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/withings/health/score/android/webservices/model/BatchStoreResponse;", "", RemoteConfigConstants.RequestFieldKey.APP_ID, "", XHTMLText.CODE, "", "message", "(Ljava/lang/String;ILjava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getCode", "()I", "getMessage", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "android_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BatchStoreResponse {
    @SerializedName(HiAnalyticsConstant.HaKey.BI_KEY_APPID)
    private final String appId;
    private final int code;
    private final String message;

    public BatchStoreResponse(String appId, int i11, String message) {
        u.j(appId, "appId");
        u.j(message, "message");
        this.appId = appId;
        this.code = i11;
        this.message = message;
    }

    public static /* synthetic */ BatchStoreResponse copy$default(BatchStoreResponse batchStoreResponse, String str, int i11, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = batchStoreResponse.appId;
        }
        if ((i12 & 2) != 0) {
            i11 = batchStoreResponse.code;
        }
        if ((i12 & 4) != 0) {
            str2 = batchStoreResponse.message;
        }
        return batchStoreResponse.copy(str, i11, str2);
    }

    public final String component1() {
        return this.appId;
    }

    public final int component2() {
        return this.code;
    }

    public final String component3() {
        return this.message;
    }

    public final BatchStoreResponse copy(String appId, int i11, String message) {
        u.j(appId, "appId");
        u.j(message, "message");
        return new BatchStoreResponse(appId, i11, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatchStoreResponse)) {
            return false;
        }
        BatchStoreResponse batchStoreResponse = (BatchStoreResponse) obj;
        if (u.e(this.appId, batchStoreResponse.appId) && this.code == batchStoreResponse.code && u.e(this.message, batchStoreResponse.message)) {
            return true;
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return this.message.hashCode() + h.a(this.code, this.appId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.appId;
        int i11 = this.code;
        return y1.e(g.b("BatchStoreResponse(appId=", str, ", code=", i11, ", message="), this.message, ")");
    }
}
