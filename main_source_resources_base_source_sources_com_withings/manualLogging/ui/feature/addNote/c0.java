package com.withings.manualLogging.ui.feature.addNote;
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
final class c0 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1 f40741a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(k1 k1Var) {
        super(0);
        this.f40741a = k1Var;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        int i11 = v70.a.f103433b;
        v70.a.d("add_manual_logging", "add_manual_logging", kotlin.collections.s0.i(new nm0.j("logging_type", "medicine")), true);
        this.f40741a.W0();
        return nm0.y.f85009a;
    }
}
