package com.withings.nervehealth.ui;

import com.withings.periodsbar.Period;
import org.joda.time.DateTime;
/* compiled from: NerveHealthActivity.kt */
/* loaded from: classes4.dex */
final class l extends kotlin.jvm.internal.w implements ym0.l<nm0.j<? extends Period, ? extends DateTime>, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NerveHealthActivity f42733a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(NerveHealthActivity nerveHealthActivity) {
        super(1);
        this.f42733a = nerveHealthActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(nm0.j<? extends Period, ? extends DateTime> jVar) {
        nm0.j<? extends Period, ? extends DateTime> jVar2 = jVar;
        kotlin.jvm.internal.u.j(jVar2, "<name for destructuring parameter 0>");
        com.withings.wiscale2.device.hwa08.postinstall.b0.V(this.f42733a, jVar2.a(), jVar2.b());
        return nm0.y.f85009a;
    }
}
