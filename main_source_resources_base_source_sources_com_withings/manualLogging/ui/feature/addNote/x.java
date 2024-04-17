package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class x extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f41622a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<fx.e> f41623b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(k1 k1Var, k1.r0 r0Var) {
        super(0);
        this.f41622a = k1Var;
        this.f41623b = r0Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = v70.a.f103433b;
        v70.a.d("add_manual_logging", "add_manual_logging", kotlin.collections.s0.j(new nm0.j("logging_type", "symptoms"), new nm0.j("logging_value", kotlin.collections.x.R(this.f41623b.getValue(), null, null, null, w.f41601a, 31))), true);
        this.f41622a.W0();
        return nm0.y.f85009a;
    }
}
