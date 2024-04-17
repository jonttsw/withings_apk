package com.withings.wiscale2.activity.workout.recognition.webservices;

import com.withings.wiscale2.activity.workout.recognition.webservices.WsClassifier;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitRecognitionRemoteRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/WsClassifier$Response;", "Lcom/withings/wiscale2/activity/workout/recognition/webservices/RecognitionRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.activity.workout.recognition.webservices.RetrofitRecognitionRemoteRepository$getClassifierForUser$3", f = "RetrofitRecognitionRemoteRepository.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class RetrofitRecognitionRemoteRepository$getClassifierForUser$3 extends i implements p<RecognitionRetrofit2Api, d<? super WsClassifier.Response>, Object> {
    final /* synthetic */ int $algoFormat;
    final /* synthetic */ int $algoVersion;
    final /* synthetic */ int $forceGlobal;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitRecognitionRemoteRepository$getClassifierForUser$3(long j5, int i11, int i12, int i13, d<? super RetrofitRecognitionRemoteRepository$getClassifierForUser$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$algoVersion = i11;
        this.$algoFormat = i12;
        this.$forceGlobal = i13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitRecognitionRemoteRepository$getClassifierForUser$3 retrofitRecognitionRemoteRepository$getClassifierForUser$3 = new RetrofitRecognitionRemoteRepository$getClassifierForUser$3(this.$userId, this.$algoVersion, this.$algoFormat, this.$forceGlobal, dVar);
        retrofitRecognitionRemoteRepository$getClassifierForUser$3.L$0 = obj;
        return retrofitRecognitionRemoteRepository$getClassifierForUser$3;
    }

    @Override // ym0.p
    public final Object invoke(RecognitionRetrofit2Api recognitionRetrofit2Api, d<? super WsClassifier.Response> dVar) {
        return ((RetrofitRecognitionRemoteRepository$getClassifierForUser$3) create(recognitionRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            long j5 = this.$userId;
            int i12 = this.$algoVersion;
            int i13 = this.$algoFormat;
            int i14 = this.$forceGlobal;
            this.label = 1;
            obj = ((RecognitionRetrofit2Api) this.L$0).getClassifierForUser(j5, i12, i13, i14, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
