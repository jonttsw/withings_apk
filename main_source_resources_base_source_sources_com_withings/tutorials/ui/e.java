package com.withings.tutorials.ui;

import android.content.Context;
import android.content.Intent;
import com.withings.device.Device;
import k1.o1;
import k1.r0;
import u60.e;
import zg.c;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<o60.f, Intent> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o1<Device> f44739a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Context f44740b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, r0 r0Var) {
        super(1);
        this.f44739a = r0Var;
        this.f44740b = context;
    }

    @Override // ym0.l
    public final Intent invoke(o60.f fVar) {
        o60.f setupCardData = fVar;
        kotlin.jvm.internal.u.j(setupCardData, "setupCardData");
        Device value = this.f44739a.getValue();
        if (value == null) {
            return null;
        }
        u60.e a11 = setupCardData.a();
        kotlin.jvm.internal.u.j(a11, "<this>");
        Context context = this.f44740b;
        kotlin.jvm.internal.u.j(context, "context");
        boolean e11 = kotlin.jvm.internal.u.e(a11, e.a.f101517c);
        c.a aVar = c.a.f110626a;
        if (e11) {
            return aVar.g(context, value, false);
        }
        if (!kotlin.jvm.internal.u.e(a11, e.b.f101518c)) {
            return null;
        }
        return aVar.h(context, value, false);
    }
}
