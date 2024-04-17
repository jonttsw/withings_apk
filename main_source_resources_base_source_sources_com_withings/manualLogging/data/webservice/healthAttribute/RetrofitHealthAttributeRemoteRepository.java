package com.withings.manualLogging.data.webservice.healthAttribute;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitHealthAttributeRemoteRepository.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\u000b\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u000fJ\"\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/RetrofitHealthAttributeRemoteRepository;", "Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRemoteRepository;", "", "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "getAccountsHealthAttributes", "(Ljava/lang/Long;ILqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "getUsersHealthAttributes", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "getUsersMedicines", "getSymptoms", "medicineName", "Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse;", "createMedicine", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit1Api;", "Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit2Api;", "compatWs", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitHealthAttributeRemoteRepository implements HealthAttributeRemoteRepository {
    private final b compatWebservicesFactory;
    private final a<HealthAttributeRetrofit1Api, HealthAttributeRetrofit2Api> compatWs;

    public RetrofitHealthAttributeRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        this.compatWs = compatWebservicesFactory.a(str, HealthAttributeRetrofit1Api.class, HealthAttributeRetrofit2Api.class);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public Object createMedicine(long j5, String str, d<? super CreateMedicineResponse> dVar) {
        return a.d(this.compatWs, new RetrofitHealthAttributeRemoteRepository$createMedicine$2(j5, str), new RetrofitHealthAttributeRemoteRepository$createMedicine$3(j5, str, null), null, false, dVar, ConstantsWs.WS_STATUS_WRONGBATTERYLVL);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public Object getAccountsHealthAttributes(Long l5, int i11, d<? super GetHealthAttributeResponse> dVar) {
        return a.d(this.compatWs, new RetrofitHealthAttributeRemoteRepository$getAccountsHealthAttributes$2(l5, i11), new RetrofitHealthAttributeRemoteRepository$getAccountsHealthAttributes$3(l5, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public Object getSymptoms(Long l5, int i11, d<? super GetHealthAttributeResponse> dVar) {
        return a.d(this.compatWs, new RetrofitHealthAttributeRemoteRepository$getSymptoms$2(l5, i11), new RetrofitHealthAttributeRemoteRepository$getSymptoms$3(l5, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public Object getUsersHealthAttributes(long j5, Long l5, int i11, d<? super GetHealthAttributeResponse> dVar) {
        return a.d(this.compatWs, new RetrofitHealthAttributeRemoteRepository$getUsersHealthAttributes$2(j5, l5, i11), new RetrofitHealthAttributeRemoteRepository$getUsersHealthAttributes$3(j5, l5, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public Object getUsersMedicines(long j5, Long l5, int i11, d<? super GetHealthAttributeResponse> dVar) {
        return a.d(this.compatWs, new RetrofitHealthAttributeRemoteRepository$getUsersMedicines$2(j5, l5, i11), new RetrofitHealthAttributeRemoteRepository$getUsersMedicines$3(j5, l5, i11, null), null, false, dVar, 124);
    }

    @Override // com.withings.manualLogging.data.webservice.healthAttribute.HealthAttributeRemoteRepository
    public HealthAttributeRemoteRepository withSyncContext(String str) {
        return new RetrofitHealthAttributeRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitHealthAttributeRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
