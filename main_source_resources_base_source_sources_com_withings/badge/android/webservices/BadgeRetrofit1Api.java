package com.withings.badge.android.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import xh.d;
/* compiled from: BadgeRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/withings/badge/android/webservices/BadgeRetrofit1Api;", "", "", NavigationArguments.USER_ID, "Lxh/d;", "getBadges", "(J)Lxh/d;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface BadgeRetrofit1Api {
    @POST("/v2/badge?action=getenrichbyuserid")
    @FormUrlEncoded
    d getBadges(@Field("userid") long j5);
}
