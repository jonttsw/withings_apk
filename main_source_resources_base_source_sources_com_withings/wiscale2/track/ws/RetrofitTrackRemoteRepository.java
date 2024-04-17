package com.withings.wiscale2.track.ws;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.wiscale2.track.data.Track;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import q00.f;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitTrackRemoteRepository.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u00100\u001a\u00020/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b7\u00108J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0096@¢\u0006\u0004\b\r\u0010\u000eJÎ\u0001\u0010#\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b#\u0010$JÔ\u0001\u0010)\u001a\u00020\"2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b)\u0010*J*\u0010-\u001a\u00020,2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R \u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000204028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/withings/wiscale2/track/ws/RetrofitTrackRemoteRepository;", "Lcom/withings/wiscale2/track/ws/TrackRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/wiscale2/track/ws/TrackRemoteRepository;", "", NavigationArguments.USER_ID, "lastUpdate", "", "deviceType", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/wiscale2/track/ws/GetTracksResponse;", "getActivity", "(JJIILqm0/d;)Ljava/lang/Object;", WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, "startDate", "endDate", "date", "data", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "attrib", WsVasistasSerie.KEY_MODEL, "deviceId", ConstantsWs.REDOX_DATA_MODEL_NOTE, "manualStartDate", "manualEndDate", "sleepScore", "activityRecognitionVersion", "gpsSummary", "pathLists", "cryptPart", "coverPictureUrl", "brand", "Lcom/withings/wiscale2/track/ws/StoreTrackResponse;", "storeActivity", "(JIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "userid", "activityId", "", "blankVasistasFilled", "updateActivity", "(JJLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", ECommerceParamNames.REASON, "Lnm0/y;", "deleteActivity", "(JJLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit1Api;", "Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RetrofitTrackRemoteRepository implements TrackRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<TrackRetrofit1Api, TrackRetrofit2Api> compatWs;

    public RetrofitTrackRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        f a11 = compatWebservicesFactory.a(str, TrackRetrofit1Api.class, TrackRetrofit2Api.class);
        this.compatWs = a11;
        a11.j(Track.class, new TrackDeserializer());
    }

    @Override // com.withings.wiscale2.track.ws.TrackRemoteRepository
    public Object deleteActivity(long j5, long j11, Integer num, d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitTrackRemoteRepository$deleteActivity$2(j5, j11, num), new RetrofitTrackRemoteRepository$deleteActivity$3(j5, j11, num, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.track.ws.TrackRemoteRepository
    public Object getActivity(long j5, long j11, int i11, int i12, d<? super GetTracksResponse> dVar) {
        return a.d(this.compatWs, new RetrofitTrackRemoteRepository$getActivity$2(j5, j11, i11, i12), new RetrofitTrackRemoteRepository$getActivity$3(j5, j11, i11, i12, null), null, false, dVar, 124);
    }

    @Override // com.withings.wiscale2.track.ws.TrackRemoteRepository
    public Object storeActivity(long j5, int i11, long j11, long j12, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, Long l5, Long l6, String str5, Integer num4, String str6, String str7, String str8, String str9, Integer num5, d<? super StoreTrackResponse> dVar) {
        return a.d(this.compatWs, new RetrofitTrackRemoteRepository$storeActivity$2(j5, i11, j11, j12, str, str2, str3, num, num2, num3, str4, l5, l6, str5, num4, str6, str7, str8, str9, num5), new RetrofitTrackRemoteRepository$storeActivity$3(j5, i11, j11, j12, str, str2, str3, num, num2, num3, str4, l5, l6, str5, num4, str6, str7, str8, str9, num5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.track.ws.TrackRemoteRepository
    public Object updateActivity(long j5, long j11, Integer num, Long l5, Long l6, String str, String str2, Integer num2, String str3, String str4, Long l11, Long l12, Boolean bool, String str5, Integer num3, String str6, String str7, String str8, String str9, Integer num4, d<? super StoreTrackResponse> dVar) {
        return a.d(this.compatWs, new RetrofitTrackRemoteRepository$updateActivity$2(j5, j11, num, l5, l6, str, str2, num2, str3, str4, l11, l12, bool, str5, num3, str6, str7, str8, str9, num4), new RetrofitTrackRemoteRepository$updateActivity$3(j5, j11, num, l5, l6, str, str2, num2, str3, str4, l11, l12, bool, str5, num3, str6, str7, str8, str9, num4, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.wiscale2.track.ws.TrackRemoteRepository
    public TrackRemoteRepository withSyncContext(String str) {
        return new RetrofitTrackRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitTrackRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
