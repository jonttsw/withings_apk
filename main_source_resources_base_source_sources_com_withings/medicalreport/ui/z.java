package com.withings.medicalreport.ui;

import android.app.Application;
import androidx.lifecycle.h1;
import com.withings.crmlegacy.ws.CrmApi;
import com.withings.medicalreport.webservices.MedicalReportRemoteRepository;
import com.withings.webservices.legacy.Webservices;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: PdfPreviewViewModel.kt */
/* loaded from: classes4.dex */
public final class z extends androidx.lifecycle.b {

    /* renamed from: a  reason: collision with root package name */
    private final Webservices f42311a;

    /* renamed from: b  reason: collision with root package name */
    private final MedicalReportRemoteRepository f42312b;

    /* renamed from: c  reason: collision with root package name */
    private androidx.lifecycle.f f42313c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f42314d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j5, String str, DateTime startDate, DateTime endDate, Application application, Webservices webservices, MedicalReportRemoteRepository medicalReportRemoteRepository) {
        super(application);
        kotlin.jvm.internal.u.j(startDate, "startDate");
        kotlin.jvm.internal.u.j(endDate, "endDate");
        kotlin.jvm.internal.u.j(webservices, "webservices");
        kotlin.jvm.internal.u.j(medicalReportRemoteRepository, "medicalReportRemoteRepository");
        this.f42311a = webservices;
        this.f42312b = medicalReportRemoteRepository;
        this.f42313c = androidx.lifecycle.h.a(h1.a(this).getCoroutineContext().plus(Dispatchers.getIO()), new y(str, startDate, endDate, this, j5, "[\"1\", \"2\", \"3\", \"4\", \"6\", \"7\", \"5\", \"8\"]", null), 2);
        this.f42314d = nm0.h.b(new x(this));
    }

    public static final CrmApi f0(z zVar) {
        Object value = zVar.f42314d.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (CrmApi) value;
    }

    public final androidx.lifecycle.f j0() {
        return this.f42313c;
    }
}
