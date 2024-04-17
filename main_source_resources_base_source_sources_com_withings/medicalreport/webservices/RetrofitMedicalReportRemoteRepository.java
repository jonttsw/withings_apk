package com.withings.medicalreport.webservices;

import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.medicalreport.model.MedicalReport;
import com.withings.medicalreport.model.MedicalReportDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;
import q00.f;
import qm0.d;
import s00.a;
import s00.b;
/* compiled from: RetrofitMedicalReportRemoteRepository.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0004\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withings/medicalreport/webservices/RetrofitMedicalReportRemoteRepository;", "Lcom/withings/medicalreport/webservices/MedicalReportRemoteRepository;", "", "syncContext", "withSyncContext", "(Ljava/lang/String;)Lcom/withings/medicalreport/webservices/MedicalReportRemoteRepository;", "", NavigationArguments.USER_ID, JivePropertiesExtension.ELEMENT, "startDate", "endDate", "Lcom/withings/medicalreport/model/MedicalReport;", "generatePdf", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lqm0/d;)Ljava/lang/Object;", "Ls00/b;", "compatWebservicesFactory", "Ls00/b;", "Ls00/a;", "Lcom/withings/medicalreport/webservices/MedicalReportRetrofit1Api;", "Lcom/withings/medicalreport/webservices/MedicalReportRetrofit2Api;", "compatWS", "Ls00/a;", "<init>", "(Ls00/b;Ljava/lang/String;)V", "medicalreport_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class RetrofitMedicalReportRemoteRepository implements MedicalReportRemoteRepository {
    public static final int $stable = 8;
    private final a<MedicalReportRetrofit1Api, MedicalReportRetrofit2Api> compatWS;
    private final b compatWebservicesFactory;

    public RetrofitMedicalReportRemoteRepository(b compatWebservicesFactory, String str) {
        u.j(compatWebservicesFactory, "compatWebservicesFactory");
        this.compatWebservicesFactory = compatWebservicesFactory;
        f a11 = compatWebservicesFactory.a(str, MedicalReportRetrofit1Api.class, MedicalReportRetrofit2Api.class);
        this.compatWS = a11;
        a11.j(MedicalReport.class, new MedicalReportDeserializer());
    }

    @Override // com.withings.medicalreport.webservices.MedicalReportRemoteRepository
    public Object generatePdf(long j5, String str, String str2, String str3, d<? super MedicalReport> dVar) {
        return BuildersKt.withContext(Dispatchers.getIO(), new RetrofitMedicalReportRemoteRepository$generatePdf$2(this, j5, str, str2, str3, null), dVar);
    }

    @Override // com.withings.medicalreport.webservices.MedicalReportRemoteRepository
    public MedicalReportRemoteRepository withSyncContext(String str) {
        return new RetrofitMedicalReportRemoteRepository(this.compatWebservicesFactory, str);
    }

    public /* synthetic */ RetrofitMedicalReportRemoteRepository(b bVar, String str, int i11, m mVar) {
        this(bVar, (i11 & 2) != 0 ? null : str);
    }
}
