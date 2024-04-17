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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/track/ws/StoreTrackResponse;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.track.ws.RetrofitTrackRemoteRepository$storeActivity$3", f = "RetrofitTrackRemoteRepository.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$storeActivity$3 extends i implements p<TrackRetrofit2Api, d<? super StoreTrackResponse>, Object> {
    final /* synthetic */ Integer $activityRecognitionVersion;
    final /* synthetic */ Integer $attrib;
    final /* synthetic */ Integer $brand;
    final /* synthetic */ String $coverPictureUrl;
    final /* synthetic */ String $cryptPart;
    final /* synthetic */ String $data;
    final /* synthetic */ String $date;
    final /* synthetic */ Integer $deviceId;
    final /* synthetic */ long $endDate;
    final /* synthetic */ String $gpsSummary;
    final /* synthetic */ Long $manualEndDate;
    final /* synthetic */ Long $manualStartDate;
    final /* synthetic */ Integer $model;
    final /* synthetic */ String $note;
    final /* synthetic */ String $pathLists;
    final /* synthetic */ String $sleepScore;
    final /* synthetic */ long $startDate;
    final /* synthetic */ int $subcategory;
    final /* synthetic */ String $timeZone;
    final /* synthetic */ long $userId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$storeActivity$3(long j5, int i11, long j11, long j12, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, Long l5, Long l6, String str5, Integer num4, String str6, String str7, String str8, String str9, Integer num5, d<? super RetrofitTrackRemoteRepository$storeActivity$3> dVar) {
        super(2, dVar);
        this.$userId = j5;
        this.$subcategory = i11;
        this.$startDate = j11;
        this.$endDate = j12;
        this.$date = str;
        this.$data = str2;
        this.$timeZone = str3;
        this.$attrib = num;
        this.$model = num2;
        this.$deviceId = num3;
        this.$note = str4;
        this.$manualStartDate = l5;
        this.$manualEndDate = l6;
        this.$sleepScore = str5;
        this.$activityRecognitionVersion = num4;
        this.$gpsSummary = str6;
        this.$pathLists = str7;
        this.$cryptPart = str8;
        this.$coverPictureUrl = str9;
        this.$brand = num5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitTrackRemoteRepository$storeActivity$3 retrofitTrackRemoteRepository$storeActivity$3 = new RetrofitTrackRemoteRepository$storeActivity$3(this.$userId, this.$subcategory, this.$startDate, this.$endDate, this.$date, this.$data, this.$timeZone, this.$attrib, this.$model, this.$deviceId, this.$note, this.$manualStartDate, this.$manualEndDate, this.$sleepScore, this.$activityRecognitionVersion, this.$gpsSummary, this.$pathLists, this.$cryptPart, this.$coverPictureUrl, this.$brand, dVar);
        retrofitTrackRemoteRepository$storeActivity$3.L$0 = obj;
        return retrofitTrackRemoteRepository$storeActivity$3;
    }

    @Override // ym0.p
    public final Object invoke(TrackRetrofit2Api trackRetrofit2Api, d<? super StoreTrackResponse> dVar) {
        return ((RetrofitTrackRemoteRepository$storeActivity$3) create(trackRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        l.b(obj);
        TrackRetrofit2Api trackRetrofit2Api = (TrackRetrofit2Api) this.L$0;
        long j5 = this.$userId;
        int i12 = this.$subcategory;
        long j11 = this.$startDate;
        long j12 = this.$endDate;
        String str = this.$date;
        String str2 = this.$data;
        String str3 = this.$timeZone;
        Integer num = this.$attrib;
        Integer num2 = this.$model;
        Integer num3 = this.$deviceId;
        String str4 = this.$note;
        Long l5 = this.$manualStartDate;
        Long l6 = this.$manualEndDate;
        String str5 = this.$sleepScore;
        Integer num4 = this.$activityRecognitionVersion;
        String str6 = this.$gpsSummary;
        String str7 = this.$pathLists;
        String str8 = this.$cryptPart;
        String str9 = this.$coverPictureUrl;
        Integer num5 = this.$brand;
        this.label = 1;
        Object storeActivity = trackRetrofit2Api.storeActivity(j5, i12, j11, j12, str, str2, str3, num, num2, num3, str4, l5, l6, str5, num4, str6, str7, str8, str9, num5, this);
        if (storeActivity == coroutineSingletons) {
            return coroutineSingletons;
        }
        return storeActivity;
    }
}
