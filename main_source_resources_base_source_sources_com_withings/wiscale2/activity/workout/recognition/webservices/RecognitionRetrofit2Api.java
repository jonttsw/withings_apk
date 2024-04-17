package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import qm0.d;
/* compiled from: RecognitionRetrofit2Api.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0004H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", "algoVersion", "algoFormat", "forceGlobal", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", "getClassifierForUser", "(JIIILqm0/d;)Ljava/lang/Object;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface RecognitionRetrofit2Api {
    @e
    @o("v2/classifier?action=getbyuserid")
    Object getClassifierForUser(@c("userid") long j5, @c("actirecver") int i11, @c("actirecfmt") int i12, @c("forceglobal") int i13, d<? super WsClassifier.Response> dVar);
}
