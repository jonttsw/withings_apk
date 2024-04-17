package com.withings.wiscale2.track.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitTrackRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/track/ws/GetTracksResponse;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$getActivity$2 extends w implements l<TrackRetrofit1Api, GetTracksResponse> {
    final /* synthetic */ int $deviceType;
    final /* synthetic */ long $lastUpdate;
    final /* synthetic */ int $offset;
    final /* synthetic */ long $userId;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$getActivity$2(long j5, long j11, int i11, int i12) {
        super(1);
        this.$userId = j5;
        this.$lastUpdate = j11;
        this.$deviceType = i11;
        this.$offset = i12;
    }

    @Override // ym0.l
    public final GetTracksResponse invoke(TrackRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.getActivity(this.$userId, this.$lastUpdate, this.$deviceType, this.$offset);
    }
}
