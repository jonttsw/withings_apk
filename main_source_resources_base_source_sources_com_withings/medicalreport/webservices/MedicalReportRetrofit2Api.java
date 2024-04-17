package com.withings.medicalreport.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.medicalreport.model.MedicalReport;
import fr0.c;
import fr0.e;
import fr0.o;
import kotlin.Metadata;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import qm0.d;
/* compiled from: MedicalReportRetrofit2Api.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001JB\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lcom/withings/medicalreport/webservices/MedicalReportRetrofit2Api;", "", "", NavigationArguments.USER_ID, "", JivePropertiesExtension.ELEMENT, "startDate", "endDate", "", "async", "Lcom/withings/medicalreport/model/MedicalReport;", "generatePdf", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLqm0/d;)Ljava/lang/Object;", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public interface MedicalReportRetrofit2Api {
    @e
    @o("v2/medicalreport?action=generate")
    Object generatePdf(@c("userid") long j5, @c("properties") String str, @c("startdateymd") String str2, @c("enddateymd") String str3, @c("async") boolean z5, d<? super MedicalReport> dVar);
}
