package com.withings.wiscale2.track.ws;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: RetrofitTrackRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;", "Lnm0/y;", "<anonymous>", "(Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.track.ws.RetrofitTrackRemoteRepository$deleteActivity$3", f = "RetrofitTrackRemoteRepository.kt", l = {187}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$deleteActivity$3 extends i implements p<TrackRetrofit2Api, d<? super y>, Object> {
    final /* synthetic */ long $activityId;
    final /* synthetic */ Integer $reason;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$deleteActivity$3(long j5, long j11, Integer num, d<? super RetrofitTrackRemoteRepository$deleteActivity$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$activityId = j11;
        this.$reason = num;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitTrackRemoteRepository$deleteActivity$3 retrofitTrackRemoteRepository$deleteActivity$3 = new RetrofitTrackRemoteRepository$deleteActivity$3(this.$userId, this.$activityId, this.$reason, dVar);
        retrofitTrackRemoteRepository$deleteActivity$3.L$0 = obj;
        return retrofitTrackRemoteRepository$deleteActivity$3;
    }

    @Override // ym0.p
    public final Object invoke(TrackRetrofit2Api trackRetrofit2Api, d<? super y> dVar) {
        return ((RetrofitTrackRemoteRepository$deleteActivity$3) create(trackRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j11 = this.$activityId;
            Integer num = this.$reason;
            this.label = 1;
            if (((TrackRetrofit2Api) this.L$0).deleteActivity(j5, j11, num, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}