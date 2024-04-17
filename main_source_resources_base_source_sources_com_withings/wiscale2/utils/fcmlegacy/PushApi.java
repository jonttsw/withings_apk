package com.withings.wiscale2.utils.fcmlegacy;

import com.huawei.hms.support.feature.result.CommonConstant;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: PushApi.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011JM\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000b\u0010\fJ9\u0010\u000e\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/utils/fcmlegacy/PushApi;", "", "", CommonConstant.KEY_ACCESS_TOKEN, ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", NavigationArguments.USER_ID, "consumer", "", "appli", ConstantsWs.CONFIDENTIAL_IE_FIELDS_SECRET, "registerPush", "(Ljava/lang/String;Ljava/lang/String;JJILjava/lang/String;)Ljava/lang/Object;", "relationId", "unregisterPushId", "(JIILjava/lang/String;)Ljava/lang/Object;", "Companion", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface PushApi {
    public static final a Companion = a.f62160a;
    public static final String DEFAULT_SECRET = "nmw";

    /* compiled from: PushApi.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f62160a = new Object();
    }

    @POST("/push?action=create")
    @FormUrlEncoded
    Object registerPush(@Field("accesstoken") String str, @Field("context") String str2, @Field("relation") long j5, @Field("consumer") long j11, @Field("appli") int i11, @Field("secret") String str3);

    @POST("/push?action=delete")
    @FormUrlEncoded
    Object unregisterPushId(@Field("relation") long j5, @Field("consumer") int i11, @Field("appli") int i12, @Field("secret") String str);
}
