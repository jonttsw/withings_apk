package com.withings.wiscale2.track.ws;

import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import ym0.l;
/* compiled from: RetrofitTrackRemoteRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/withings/wiscale2/track/ws/StoreTrackResponse;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit1Api;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RetrofitTrackRemoteRepository$updateActivity$2 extends w implements l<TrackRetrofit1Api, StoreTrackResponse> {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RetrofitTrackRemoteRepository$updateActivity$2(long j5, long j11, Integer num, Long l5, Long l6, String str, String str2, Integer num2, String str3, String str4, Long l11, Long l12, Boolean bool, String str5, Integer num3, String str6, String str7, String str8, String str9, Integer num4) {
        super(1);
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

    @Override // ym0.l
    public final StoreTrackResponse invoke(TrackRetrofit1Api withApiForAccount) {
        u.j(withApiForAccount, "$this$withApiForAccount");
        return withApiForAccount.updateActivity(this.$userid, this.$activityId, this.$subcategory, this.$startDate, this.$endDate, this.$date, this.$data, this.$attrib, this.$timeZone, this.$note, this.$manualStartDate, this.$manualEndDate, this.$blankVasistasFilled, this.$sleepScore, this.$activityRecognitionVersion, this.$gpsSummary, this.$pathLists, this.$cryptPart, this.$coverPictureUrl, this.$brand);
    }
}
