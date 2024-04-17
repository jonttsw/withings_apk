package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
import nm0.y;
import qm0.d;
/* compiled from: SignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H¦@¢\u0006\u0004\b\u0010\u0010\u0011J¦\u0001\u0010$\u001a\u00020#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H¦@¢\u0006\u0004\b'\u0010\u000b¨\u0006(À\u0006\u0003"}, d2 = {"Lcom/withings/ecg/webservices/SignalRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/ecg/webservices/SignalRemoteRepository;", "", NavigationArguments.USER_ID, "signalId", "Lcom/withings/ecg/webservices/GetSignalResponse;", "getSignal", "(JJLqm0/d;)Ljava/lang/Object;", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "lastUpdate", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "getSignals", "(JILjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "signal", "signalType", "timestamp", "metaFreq", "metaFormat", "metaSize", "metaResolution", "metaChannel", "metaGain", "metaFix", "metaOffset", "deviceId", "duration", "totalSize", "metaFilterBank", "metaWearPosition", "firmwareVersion", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "storeSignal", "(Ljava/lang/String;JIJIIIIIIJIJJJJLjava/lang/Integer;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "deleteSignal", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public interface SignalRemoteRepository {
    Object deleteSignal(long j5, long j11, d<? super y> dVar);

    Object getSignal(long j5, long j11, d<? super GetSignalResponse> dVar);

    Object getSignals(long j5, int i11, Long l5, d<? super GetSignalsResponse> dVar);

    Object storeSignal(String str, long j5, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, long j14, long j15, long j16, Integer num, Integer num2, d<? super StoreSignalResponse> dVar);

    SignalRemoteRepository withSyncContext(String str);
}
