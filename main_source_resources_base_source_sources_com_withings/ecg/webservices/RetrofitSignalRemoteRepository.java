package com.withings.ecg.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import nm0.y;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitSignalRemoteRepository.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b0\u00101J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J¦\u0001\u0010$\u001a\u00020#2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\f2\b\u0010\"\u001a\u0004\u0018\u00010\fH\u0096@¢\u0006\u0004\b$\u0010%J \u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b'\u0010\u000bR\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/withings/ecg/webservices/RetrofitSignalRemoteRepository;", "Lcom/withings/ecg/webservices/SignalRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/ecg/webservices/SignalRemoteRepository;", "", NavigationArguments.USER_ID, "signalId", "Lcom/withings/ecg/webservices/GetSignalResponse;", "getSignal", "(JJLqm0/d;)Ljava/lang/Object;", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "lastUpdate", "Lcom/withings/ecg/webservices/GetSignalsResponse;", "getSignals", "(JILjava/lang/Long;Lqm0/d;)Ljava/lang/Object;", "signal", "signalType", "timestamp", "metaFreq", "metaFormat", "metaSize", "metaResolution", "metaChannel", "metaGain", "metaFix", "metaOffset", "deviceId", "duration", "totalSize", "metaFilterBank", "metaWearPosition", "firmwareVersion", "Lcom/withings/ecg/webservices/StoreSignalResponse;", "storeSignal", "(Ljava/lang/String;JIJIIIIIIJIJJJJLjava/lang/Integer;Ljava/lang/Integer;Lqm0/d;)Ljava/lang/Object;", "Lnm0/y;", "deleteSignal", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/ecg/webservices/SignalRetrofit1Api;", "Lcom/withings/ecg/webservices/SignalRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RetrofitSignalRemoteRepository implements SignalRemoteRepository {
    public static final int $stable = 8;
    private final b compatWebservicesFactory;
    private final a<SignalRetrofit1Api, SignalRetrofit2Api> compatWs;

    public RetrofitSignalRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, SignalRetrofit1Api.class, SignalRetrofit2Api.class);
    }

    @Override // com.withings.ecg.webservices.SignalRemoteRepository
    public Object deleteSignal(long j5, long j11, d<? super y> dVar) {
        return a.d(this.compatWs, new RetrofitSignalRemoteRepository$deleteSignal$2(j5, j11), new RetrofitSignalRemoteRepository$deleteSignal$3(j5, j11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.SignalRemoteRepository
    public Object getSignal(long j5, long j11, d<? super GetSignalResponse> dVar) {
        return a.d(this.compatWs, new RetrofitSignalRemoteRepository$getSignal$2(j5, j11), new RetrofitSignalRemoteRepository$getSignal$3(j5, j11, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.SignalRemoteRepository
    public Object getSignals(long j5, int i11, Long l5, d<? super GetSignalsResponse> dVar) {
        return a.d(this.compatWs, new RetrofitSignalRemoteRepository$getSignals$2(j5, i11, l5), new RetrofitSignalRemoteRepository$getSignals$3(j5, i11, l5, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.SignalRemoteRepository
    public Object storeSignal(String str, long j5, int i11, long j11, int i12, int i13, int i14, int i15, int i16, int i17, long j12, int i18, long j13, long j14, long j15, long j16, Integer num, Integer num2, d<? super StoreSignalResponse> dVar) {
        return a.d(this.compatWs, new RetrofitSignalRemoteRepository$storeSignal$2(str, j5, i11, j11, i12, i13, i14, i15, i16, i17, j12, i18, j13, j14, j15, j16, num, num2), new RetrofitSignalRemoteRepository$storeSignal$3(str, j5, i11, j11, i12, i13, i14, i15, i16, i17, j12, i18, j13, j14, j15, j16, num, num2, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.ecg.webservices.SignalRemoteRepository
    public SignalRemoteRepository withSyncContext(String str) {
        return new RetrofitSignalRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitSignalRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
