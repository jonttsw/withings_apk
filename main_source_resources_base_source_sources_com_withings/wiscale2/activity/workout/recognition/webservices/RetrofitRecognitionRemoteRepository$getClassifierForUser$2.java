package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitRecognitionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class RetrofitRecognitionRemoteRepository$getClassifierForUser$2 extends w implements l<RecognitionRetrofit1Api, WsClassifier.Response> {
    final /* synthetic */ int $algoFormat;
    final /* synthetic */ int $algoVersion;
    final /* synthetic */ int $forceGlobal;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRecognitionRemoteRepository$getClassifierForUser$2(long j5, int i11, int i12, int i13) {
        super(1);
        this.$userId = j5;
        this.$algoVersion = i11;
        this.$algoFormat = i12;
        this.$forceGlobal = i13;
    }

    @Override // ym0.l
    public final WsClassifier.Response invoke(RecognitionRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getClassifierForUser(this.$userId, this.$algoVersion, this.$algoFormat, this.$forceGlobal);
    }
}
