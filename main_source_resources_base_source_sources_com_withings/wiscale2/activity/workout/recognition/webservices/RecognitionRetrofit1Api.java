package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import kotlin.Metadata;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: RecognitionRetrofit1Api.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u0007H'¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit1Api;", "", "getClassifierForUser", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", NavigationArguments.USER_ID, "", "algoVersion", "", "algoFormat", "forceGlobal", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RecognitionRetrofit1Api {
    @POST("/v2/classifier?action=getbyuserid")
    @FormUrlEncoded
    WsClassifier.Response getClassifierForUser(@Field("userid") long j5, @Field("actirecver") int i11, @Field("actirecfmt") int i12, @Field("forceglobal") int i13);
}
