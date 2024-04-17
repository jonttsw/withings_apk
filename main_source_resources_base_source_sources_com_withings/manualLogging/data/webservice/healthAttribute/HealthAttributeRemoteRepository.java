package com.withings.manualLogging.data.webservice.healthAttribute;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import qm0.d;
/* compiled from: HealthAttributeRemoteRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0010\u0010\u000fJ&\u0010\u0011\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0011\u0010\fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRemoteRepository;", "", "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "getAccountsHealthAttributes", "(Ljava/lang/Long;ILqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "getUsersHealthAttributes", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "getUsersMedicines", "getSymptoms", "medicineName", "Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse;", "createMedicine", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface HealthAttributeRemoteRepository {

    /* compiled from: HealthAttributeRemoteRepository.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getAccountsHealthAttributes$default(HealthAttributeRemoteRepository healthAttributeRemoteRepository, Long l5, int i11, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                l5 = null;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return healthAttributeRemoteRepository.getAccountsHealthAttributes(l5, i11, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccountsHealthAttributes");
    }

    static /* synthetic */ Object getSymptoms$default(HealthAttributeRemoteRepository healthAttributeRemoteRepository, Long l5, int i11, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                l5 = null;
            }
            if ((i12 & 2) != 0) {
                i11 = 0;
            }
            return healthAttributeRemoteRepository.getSymptoms(l5, i11, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSymptoms");
    }

    static /* synthetic */ Object getUsersMedicines$default(HealthAttributeRemoteRepository healthAttributeRemoteRepository, long j5, Long l5, int i11, d dVar, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                l5 = null;
            }
            Long l6 = l5;
            if ((i12 & 4) != 0) {
                i11 = 0;
            }
            return healthAttributeRemoteRepository.getUsersMedicines(j5, l6, i11, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUsersMedicines");
    }

    Object createMedicine(long j5, String str, d<? super CreateMedicineResponse> dVar);

    Object getAccountsHealthAttributes(Long l5, int i11, d<? super GetHealthAttributeResponse> dVar);

    Object getSymptoms(Long l5, int i11, d<? super GetHealthAttributeResponse> dVar);

    Object getUsersHealthAttributes(long j5, Long l5, int i11, d<? super GetHealthAttributeResponse> dVar);

    Object getUsersMedicines(long j5, Long l5, int i11, d<? super GetHealthAttributeResponse> dVar);

    HealthAttributeRemoteRepository withSyncContext(String str);
}
