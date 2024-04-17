package com.withings.nervehealth.ui;

import android.content.Context;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class t extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42772a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f42773b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(NerveHealthActivity nerveHealthActivity, Context context) {
        super(0);
        this.f42772a = nerveHealthActivity;
        this.f42773b = context;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        androidx.activity.result.b bVar;
        NerveHealthViewModel K3;
        NerveHealthViewModel K32;
        NerveHealthActivity nerveHealthActivity = this.f42772a;
        bVar = nerveHealthActivity.f42370s;
        ch.d dVar = nerveHealthActivity.f42360i;
        if (dVar != null) {
            ah.d s11 = dVar.s();
            K3 = nerveHealthActivity.K3();
            String l5 = K3.a1().l();
            kotlin.jvm.internal.u.i(l5, "getFirstName(...)");
            K32 = nerveHealthActivity.K3();
            String s12 = K32.a1().s();
            kotlin.jvm.internal.u.i(s12, "getLastName(...)");
            s11.getClass();
            bVar.a(ah.d.f(this.f42773b, l5, s12));
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("intentBuilder");
        throw null;
    }
}
