package com.withings.manualLogging.ui.feature.addNote;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41528a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f41529b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41530c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f41531d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(AddManualLogActivity addManualLogActivity, k1.r0<Boolean> r0Var, k1 k1Var, int i11) {
        super(2);
        this.f41528a = addManualLogActivity;
        this.f41529b = r0Var;
        this.f41530c = k1Var;
        this.f41531d = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f41531d | 1);
        k1.r0<Boolean> r0Var = this.f41529b;
        k1 k1Var = this.f41530c;
        AddManualLogActivity.z3(this.f41528a, r0Var, k1Var, aVar, g11);
        return nm0.y.f85009a;
    }
}
