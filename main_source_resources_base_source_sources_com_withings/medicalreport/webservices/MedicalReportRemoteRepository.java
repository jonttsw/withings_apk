package com.withings.medicalreport.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.medicalreport.model.MedicalReport;
import kotlin.Metadata;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import qm0.d;
/* compiled from: MedicalReportRemoteRepository.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0004\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/medicalreport/webservices/MedicalReportRemoteRepository;", "", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/medicalreport/webservices/MedicalReportRemoteRepository;", "", NavigationArguments.USER_ID, JivePropertiesExtension.ELEMENT, "startDate", "endDate", "Lcom/withings/medicalreport/model/MedicalReport;", "generatePdf", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MedicalReportRemoteRepository {
    Object generatePdf(long j5, String str, String str2, String str3, d<? super MedicalReport> dVar);

    MedicalReportRemoteRepository withSyncContext(String str);
}
