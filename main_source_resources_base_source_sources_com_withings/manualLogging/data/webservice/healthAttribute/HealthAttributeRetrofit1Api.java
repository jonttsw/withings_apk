package com.withings.manualLogging.data.webservice.healthAttribute;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import kotlin.Metadata;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Query;
/* compiled from: HealthAttributeRetrofit1Api.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J#\u0010\b\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ#\u0010\u000e\u001a\u00020\t2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\rJ-\u0010\u000f\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\u0010J-\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000b\u001a\u00020\fH'¢\u0006\u0002\u0010\u0010¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/withings/manualLogging/data/webservice/healthAttribute/HealthAttributeRetrofit1Api;", "", "createMedicine", "Lcom/withings/manualLogging/data/webservice/healthAttribute/CreateMedicineResponse;", NavigationArguments.USER_ID, "", "medicineName", "", "getAccountsHealthAttributes", "Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "lastUpdate", GetHealthAttributeResponse.FIELD_OFFSET_NAME, "", "(Ljava/lang/Long;I)Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "getSymptoms", "getUsersHealthAttributes", "(JLjava/lang/Long;I)Lcom/withings/manualLogging/data/webservice/healthAttribute/GetHealthAttributeResponse;", "getUsersMedicines", "manual-logging-data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HealthAttributeRetrofit1Api {
    @POST("/v2/healthattribute?action=createmedicine")
    CreateMedicineResponse createMedicine(@Query("userid") long j5, @Query("name") String str);

    @GET("/v2/healthattribute?action=getbytype")
    GetHealthAttributeResponse getAccountsHealthAttributes(@Query("lastupdate") Long l5, @Query("offset") int i11);

    @GET("/v2/healthattribute?action=getbytype&type=2")
    GetHealthAttributeResponse getSymptoms(@Query("lastupdate") Long l5, @Query("offset") int i11);

    @GET("/v2/healthattribute?action=getbytype")
    GetHealthAttributeResponse getUsersHealthAttributes(@Query("userid") long j5, @Query("lastupdate") Long l5, @Query("offset") int i11);

    @GET("/v2/healthattribute?action=getbytype&type=1")
    GetHealthAttributeResponse getUsersMedicines(@Query("userid") long j5, @Query("lastupdate") Long l5, @Query("offset") int i11);
}
