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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/track/ws/GetTracksResponse;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.track.ws.RetrofitTrackRemoteRepository$getActivity$3", f = "RetrofitTrackRemoteRepository.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$getActivity$3 extends i implements p<TrackRetrofit2Api, d<? super GetTracksResponse>, Object> {
    final /* synthetic */ int $deviceType;
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$getActivity$3(long j5, long j11, int i11, int i12, d<? super RetrofitTrackRemoteRepository$getActivity$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$lastUpdate = j11;
        this.$deviceType = i11;
        this.$offset = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitTrackRemoteRepository$getActivity$3 retrofitTrackRemoteRepository$getActivity$3 = new RetrofitTrackRemoteRepository$getActivity$3(this.$userId, this.$lastUpdate, this.$deviceType, this.$offset, dVar);
        retrofitTrackRemoteRepository$getActivity$3.L$0 = obj;
        return retrofitTrackRemoteRepository$getActivity$3;
    }

    @Override // ym0.p
    public final Object invoke(TrackRetrofit2Api trackRetrofit2Api, d<? super GetTracksResponse> dVar) {
        return ((RetrofitTrackRemoteRepository$getActivity$3) create(trackRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
            long j11 = this.$lastUpdate;
            int i12 = this.$deviceType;
            int i13 = this.$offset;
            this.label = 1;
            obj = ((TrackRetrofit2Api) this.L$0).getActivity(j5, j11, i12, i13, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return obj;
    }
}
