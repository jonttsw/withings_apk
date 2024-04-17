package com.withings.wiscale2.vascularage;

import android.content.Context;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.core.models.User;
/* compiled from: VascularAgeScreen.kt */
/* loaded from: classes5.dex */
final class n0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f62429a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User.Names f62430b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Context context, User.Names names) {
        super(0);
        this.f62429a = context;
        this.f62430b = names;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
        User.Names names = this.f62430b;
        String first = names.getFirst();
        String last = names.getLast();
        aVar.getClass();
        Context context = this.f62429a;
        context.startActivity(MedicalReportActivity.a.a(context, first, last));
        return nm0.y.f85009a;
    }
}
