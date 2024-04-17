package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.webservices.legacy.common.exception.AlreadyExistsException;
import com.withings.webservices.legacy.common.exception.InvalidParamsException;
import com.withings.webservices.legacy.common.exception.ObjectNotFoundException;
import fr0.c;
import fr0.e;
import fr0.f;
import fr0.o;
import fr0.t;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: SignalRetrofit2Api.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J$\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\f\u0010\rJÊ\u0001\u0010!\u001a\u00020 2\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u00022\b\b\u0001\u0010\u0012\u001a\u00020\b2\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010\u0014\u001a\u00020\b2\b\b\u0001\u0010\u0015\u001a\u00020\b2\b\b\u0001\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\u00022\b\b\u0001\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\u00022\b\b\u0001\u0010\u001b\u001a\u00020\u00022\b\b\u0001\u0010\u001c\u001a\u00020\u00022\b\b\u0001\u0010\u001d\u001a\u00020\u00022\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u00020#2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b$\u0010\u0007¨\u0006%À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/SignalRetrofit2Api;", "", "", NavigationArguments.USER_ID, "signalId", "Lcom/withings/ecg/webservices/GetSignalResponse;", "getSignal", "(JJLqm0/d;)Ljava/lang/Object;", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "lastUpdate", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "getSignals", "(JILjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "", "signal", "signalType", "timestamp", "metaFreq", "metaFormat", "metaSize", "metaResolution", "metaChannel", "metaGain", "metaFix", "metaOffset", "deviceId", "duration", "totalSize", "metaFilterBank", "metaWearPosition", "firmwareVersion", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "storeSignal", "(Ljava/lang/String;JIJIIIIIIJIJJJJLjava/lang/Integer;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "deleteSignal", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SignalRetrofit2Api {
    @e
    @o("v2/signal?action=delete")
    Object deleteSignal(@c("userid") long j5, @c("signalid") long j11, d<? super y> dVar) throws ObjectNotFoundException;

    @f("v2/signal?action=get")
    Object getSignal(@t("userid") long j5, @t("signalid") long j11, d<? super GetSignalResponse> dVar);

    @f("v2/signal?action=list")
    Object getSignals(@t("userid") long j5, @t("offset") int i11, @t("lastupdate") Long l5, d<? super GetSignalsResponse> dVar);

    @e
    @o("v2/signal?action=store")
    Object storeSignal(@c("signal") String str, @c("userid") long j5, @c("signaltype") int i11, @c("timestamp") long j11, @c("metafreq") int i12, @c("metaformat") int i13, @c("metasize") int i14, @c("metaresolution") int i15, @c("metachannel") int i16, @c("metagain") int i17, @c("metaqfix") long j12, @c("metaoffset") int i18, @c("deviceid") long j13, @c("metaduration") long j14, @c("metatotalsize") long j15, @c("metafilterbank") long j16, @c("metawearposition") Integer num, @c("fw") Integer num2, d<? super StoreSignalResponse> dVar) throws AlreadyExistsException, InvalidParamsException;
}
