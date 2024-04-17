package com.withings.wiscale2.track.ws;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.manualLogging.data.webservice.healthAttribute.WebServiceHealthAttribute;
import com.withings.vasistas.ws.WsVasistasSerie;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: TrackRetrofit2Api.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0007\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJö\u0001\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000e2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b \u0010!Jü\u0001\u0010%\u001a\u00020\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u000e2\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b%\u0010&J0\u0010)\u001a\u00020(2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\"\u001a\u00020\u00022\n\b\u0001\u0010'\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b)\u0010*¨\u0006+À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/track/ws/TrackRetrofit2Api;", "", "", NavigationArguments.USER_ID, "lastUpdate", "", "deviceType", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/wiscale2/track/ws/GetTracksResponse;", "getActivity", "(JJIILqm0/d;)Ljava/lang/Object;", WebServiceHealthAttribute.FIELD_SUBCATEGORY_NAME, "startDate", "endDate", "", "date", "data", RemoteConfigConstants.RequestFieldKey.TIME_ZONE, "attrib", WsVasistasSerie.KEY_MODEL, "deviceId", ConstantsWs.REDOX_DATA_MODEL_NOTE, "manualStartDate", "manualEndDate", "sleepScore", "activityRecognitionVersion", "gpsSummary", "pathLists", "cryptPart", "coverPictureUrl", "brand", "Lcom/withings/wiscale2/track/ws/StoreTrackResponse;", "storeActivity", "(JIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "activityId", "", "blankVasistasFilled", "updateActivity", "(JJLjava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", ECommerceParamNames.REASON, "Lnm0/y;", "deleteActivity", "(JJLjava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface TrackRetrofit2Api {
    @e
    @o("v2/activity?action=delete")
    Object deleteActivity(@c("userid") long j5, @c("activityid") long j11, @c("deletionreason") Integer num, d<? super y> dVar) throws ObjectNotFoundException;

    @e
    @o("v2/activity?action=getbyuserid")
    Object getActivity(@c("userid") long j5, @c("lastupdate") long j11, @c("devicetype") int i11, @c("offset") int i12, d<? super GetTracksResponse> dVar);

    @e
    @o("v2/activity?action=store")
    Object storeActivity(@c("userid") long j5, @c("subcategory") int i11, @c("startdate") long j11, @c("enddate") long j12, @c("date") String str, @c("data") String str2, @c("timezone") String str3, @c("attrib") Integer num, @c("model") Integer num2, @c("deviceid") Integer num3, @c("note") String str4, @c("manual_startdate") Long l5, @c("manual_enddate") Long l6, @c("sleep_score") String str5, @c("actirecver") Integer num4, @c("gps") String str6, @c("pictures") String str7, @c("cryptpart") String str8, @c("cover_picture") String str9, @c("brand") Integer num5, d<? super StoreTrackResponse> dVar) throws AlreadyExistsException;

    @e
    @o("v2/activity?action=update")
    Object updateActivity(@c("userid") long j5, @c("activityid") long j11, @c("subcategory") Integer num, @c("startdate") Long l5, @c("enddate") Long l6, @c("date") String str, @c("data") String str2, @c("attrib") Integer num2, @c("timezone") String str3, @c("note") String str4, @c("manual_startdate") Long l11, @c("manual_enddate") Long l12, @c("blank_vasistas_filled") Boolean bool, @c("sleep_score") String str5, @c("actirecver") Integer num3, @c("gps") String str6, @c("pictures") String str7, @c("cryptpart") String str8, @c("cover_picture") String str9, @c("brand") Integer num4, d<? super StoreTrackResponse> dVar) throws ObjectNotFoundException, AlreadyExistsException;
}
