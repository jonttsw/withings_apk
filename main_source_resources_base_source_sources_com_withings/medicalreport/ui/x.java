package com.withings.medicalreport.ui;

import com.withings.crmlegacy.ws.CrmApi;
import com.withings.webservices.legacy.Webservices;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PdfPreviewViewModel.kt */
/* loaded from: classes4.dex */
public final class x extends kotlin.jvm.internal.w implements ym0.a<CrmApi> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z f42296a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar) {
        super(0);
        this.f42296a = zVar;
    }

    @Override // ym0.a
    public final CrmApi invoke() {
        Webservices webservices;
        webservices = this.f42296a.f42311a;
        return (CrmApi) webservices.getApiForAccount(CrmApi.class);
    }
}
