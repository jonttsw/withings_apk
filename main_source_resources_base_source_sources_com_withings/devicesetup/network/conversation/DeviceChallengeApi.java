package com.withings.devicesetup.network.conversation;

import androidx.fragment.app.o;
import com.google.gson.annotations.SerializedName;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.WsAuthFailedException;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: DeviceChallengeApi.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0016J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0083\u0001\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\t2\b\b\u0001\u0010\u000e\u001a\u00020\r2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0012\u001a\u00020\rH'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lcom/withings/devicesetup/network/conversation/DeviceChallengeApi;", "", "", "mac", "Lcom/withings/devicesetup/network/conversation/DeviceChallengeApi$a;", "getRandom", "(Ljava/lang/String;)Lcom/withings/devicesetup/network/conversation/DeviceChallengeApi$a;", "challenge", "hash", "", "hashMethod", "duration", "currentfw", "", ConstantsWs.JSON_SESSION_KEY_MFGID, "batterylvl", "featureMask", "enrich", "last_used_network", "Lcom/withings/webservices/legacy/withings/model/session/DeviceSession;", "getDeviceSession", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;I)Lcom/withings/webservices/legacy/withings/model/session/DeviceSession;", "a", "device-setup-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface DeviceChallengeApi {

    /* compiled from: DeviceChallengeApi.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        @SerializedName("challenge")

        /* renamed from: a  reason: collision with root package name */
        private final String f37714a;

        public final String a() {
            return this.f37714a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && u.e(this.f37714a, ((a) obj).f37714a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f37714a.hashCode();
        }

        public final String toString() {
            return o.d("RandomResponse(challenge=", this.f37714a, ")");
        }
    }

    @POST("/session?action=new")
    @FormUrlEncoded
    DeviceSession getDeviceSession(@Field("auth") String str, @Field("challenge") String str2, @Field("hash") String str3, @Field("hashmethod") long j5, @Field("duration") String str4, @Field("currentfw") long j11, @Field("mfgid") int i11, @Field("batterylvl") Integer num, @Field("feature_mask") Integer num2, @Field("enrich") String str5, @Field("last_used_network") int i12) throws WsAuthFailedException;

    @POST("/v2/device?action=challenge")
    @FormUrlEncoded
    a getRandom(@Field("mac_address") String str);
}
