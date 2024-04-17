package com.withings.wiscale2.track.ws;

import com.withings.library.authentication.api.ConstantsWs;
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
@e(c = "com.withings.wiscale2.track.ws.RetrofitTrackRemoteRepository$updateActivity$3", f = "RetrofitTrackRemoteRepository.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$updateActivity$3 extends i implements p<TrackRetrofit2Api, d<? super StoreTrackResponse>, Object> {
    final /* synthetic */ long $activityId;
    final /* synthetic */ Integer $activityRecognitionVersion;
    final /* synthetic */ Integer $attrib;
    final /* synthetic */ Boolean $blankVasistasFilled;
    final /* synthetic */ Integer $brand;
    final /* synthetic */ String $coverPictureUrl;
    final /* synthetic */ String $cryptPart;
    final /* synthetic */ String $data;
    final /* synthetic */ String $date;
    final /* synthetic */ Long $endDate;
    final /* synthetic */ String $gpsSummary;
    final /* synthetic */ Long $manualEndDate;
    final /* synthetic */ Long $manualStartDate;
    final /* synthetic */ String $note;
    final /* synthetic */ String $pathLists;
    final /* synthetic */ String $sleepScore;
    final /* synthetic */ Long $startDate;
    final /* synthetic */ Integer $subcategory;
    final /* synthetic */ String $timeZone;
    final /* synthetic */ long $userid;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$updateActivity$3(long j5, long j11, Integer num, Long l5, Long l6, String str, String str2, Integer num2, String str3, String str4, Long l11, Long l12, Boolean bool, String str5, Integer num3, String str6, String str7, String str8, String str9, Integer num4, d<? super RetrofitTrackRemoteRepository$updateActivity$3> dVar) {
        super(2, dVar);
        this.$userid = j5;
        this.$activityId = j11;
        this.$subcategory = num;
        this.$startDate = l5;
        this.$endDate = l6;
        this.$date = str;
        this.$data = str2;
        this.$attrib = num2;
        this.$timeZone = str3;
        this.$note = str4;
        this.$manualStartDate = l11;
        this.$manualEndDate = l12;
        this.$blankVasistasFilled = bool;
        this.$sleepScore = str5;
        this.$activityRecognitionVersion = num3;
        this.$gpsSummary = str6;
        this.$pathLists = str7;
        this.$cryptPart = str8;
        this.$coverPictureUrl = str9;
        this.$brand = num4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        RetrofitTrackRemoteRepository$updateActivity$3 retrofitTrackRemoteRepository$updateActivity$3 = new RetrofitTrackRemoteRepository$updateActivity$3(this.$userid, this.$activityId, this.$subcategory, this.$startDate, this.$endDate, this.$date, this.$data, this.$attrib, this.$timeZone, this.$note, this.$manualStartDate, this.$manualEndDate, this.$blankVasistasFilled, this.$sleepScore, this.$activityRecognitionVersion, this.$gpsSummary, this.$pathLists, this.$cryptPart, this.$coverPictureUrl, this.$brand, dVar);
        retrofitTrackRemoteRepository$updateActivity$3.L$0 = obj;
        return retrofitTrackRemoteRepository$updateActivity$3;
    }

    @Override // ym0.p
    public final Object invoke(TrackRetrofit2Api trackRetrofit2Api, d<? super StoreTrackResponse> dVar) {
        return ((RetrofitTrackRemoteRepository$updateActivity$3) create(trackRetrofit2Api, dVar)).invokeSuspend(y.f85009a);
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
        long j5 = this.$userid;
        long j11 = this.$activityId;
        Integer num = this.$subcategory;
        Long l5 = this.$startDate;
        Long l6 = this.$endDate;
        String str = this.$date;
        String str2 = this.$data;
        Integer num2 = this.$attrib;
        String str3 = this.$timeZone;
        String str4 = this.$note;
        Long l11 = this.$manualStartDate;
        Long l12 = this.$manualEndDate;
        Boolean bool = this.$blankVasistasFilled;
        String str5 = this.$sleepScore;
        Integer num3 = this.$activityRecognitionVersion;
        String str6 = this.$gpsSummary;
        String str7 = this.$pathLists;
        String str8 = this.$cryptPart;
        String str9 = this.$coverPictureUrl;
        Integer num4 = this.$brand;
        this.label = 1;
        Object updateActivity = trackRetrofit2Api.updateActivity(j5, j11, num, l5, l6, str, str2, num2, str3, str4, l11, l12, bool, str5, num3, str6, str7, str8, str9, num4, this);
        if (updateActivity == coroutineSingletons) {
            return coroutineSingletons;
        }
        return updateActivity;
    }
}
