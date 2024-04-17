package com.withings.manualLogging.data.webservice.healthAttribute;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import fr0.f;
import fr0.o;
import fr0.t;
import kotlin.Metadata;
import qm0.d;
/* compiled from: HealthAttributeRetrofit2Api.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\f\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\f\u0010\u000bJ&\u0010\r\u001a\u00020\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\r\u0010\bJ$\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit2Api;", "", "", "lastUpdate", "", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "getAccountsHealthAttributes", "(Ljava/lang/Long;ILqm0/d;)Ljava/lang/Object;", NavigationArguments.USER_ID, "getUsersHealthAttributes", "(JLjava/lang/Long;ILqm0/d;)Ljava/lang/Object;", "getUsersMedicines", "getSymptoms", "", "medicineName", "Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse;", "createMedicine", "(JLjava/lang/String;Lqm0/d;)Ljava/lang/Object;", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface HealthAttributeRetrofit2Api {
    @o("v2/healthattribute?action=createmedicine")
    Object createMedicine(@t("userid") long j5, @t("name") String str, d<? super CreateMedicineResponse> dVar);

    @f("v2/healthattribute?action=getbytype")
    Object getAccountsHealthAttributes(@t("lastupdate") Long l5, @t("offset") int i11, d<? super GetHealthAttributeResponse> dVar);

    @f("v2/healthattribute?action=getbytype&type=2")
    Object getSymptoms(@t("lastupdate") Long l5, @t("offset") int i11, d<? super GetHealthAttributeResponse> dVar);

    @f("v2/healthattribute?action=getbytype")
    Object getUsersHealthAttributes(@t("userid") long j5, @t("lastupdate") Long l5, @t("offset") int i11, d<? super GetHealthAttributeResponse> dVar);

    @f("v2/healthattribute?action=getbytype&type=1")
    Object getUsersMedicines(@t("userid") long j5, @t("lastupdate") Long l5, @t("offset") int i11, d<? super GetHealthAttributeResponse> dVar);
}
