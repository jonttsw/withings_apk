package com.withings.medicalreport.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.medicalreport.model.MedicalReport;
import kotlin.Metadata;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
/* compiled from: MedicalReportRetrofit1Api.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b`\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000bH'¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/withings/medicalreport/webservices/MedicalReportRetrofit1Api;", "", "generatePdf", "Lcom/withings/medicalreport/model/MedicalReport;", NavigationArguments.USER_ID, "", JivePropertiesExtension.ELEMENT, "", "startDate", "endDate", "async", "", "medicalreport_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MedicalReportRetrofit1Api {
    @POST("/v2/medicalreport?action=generate")
    @FormUrlEncoded
    MedicalReport generatePdf(@Field("userid") long j5, @Field("properties") String str, @Field("startdateymd") String str2, @Field("enddateymd") String str3, @Field("async") boolean z5);
}
