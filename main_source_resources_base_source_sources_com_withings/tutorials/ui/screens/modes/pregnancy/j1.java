package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyMode.kt */
/* loaded from: classes4.dex */
final class j1 extends kotlin.jvm.internal.w implements ym0.l<Double, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ s60.a f45959a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Double> f45960b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(s60.a aVar, k1.r0<Double> r0Var) {
        super(1);
        this.f45959a = aVar;
        this.f45960b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Double d11) {
        double doubleValue = d11.doubleValue();
        this.f45959a.d(Double.valueOf(doubleValue));
        this.f45960b.setValue(Double.valueOf(doubleValue));
        return nm0.y.f85009a;
    }
}
