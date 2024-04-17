package com.withings.device.details.scale;

import android.content.Context;
import com.withings.device.Device;
import zg.c;
/* compiled from: ScaleDetailFragment.kt */
/* loaded from: classes3.dex */
final class p extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h0 f37007a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k f37008b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(h0 h0Var, k kVar) {
        super(0);
        this.f37007a = h0Var;
        this.f37008b = kVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        h0 h0Var = this.f37007a;
        boolean b10 = h0Var.b();
        k kVar = this.f37008b;
        if (!b10) {
            kVar.F1();
        } else {
            Context requireContext = kVar.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            Device a11 = h0Var.a();
            kVar.startActivity(c.a.e(requireContext, a11, a11.getModelId(), null, false, true));
        }
        return nm0.y.f85009a;
    }
}
