package com.withings.tutorials.ui.screens.modes.pregnancy;
/* compiled from: PregnancyModeActivity.kt */
/* loaded from: classes4.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PregnancyModeActivity f45966a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f45967b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1.o1<Boolean> f45968c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.o1<s60.a> f45969d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k1.o1 o1Var, k1.o1 o1Var2, r8.n nVar, PregnancyModeActivity pregnancyModeActivity) {
        super(1);
        this.f45966a = pregnancyModeActivity;
        this.f45967b = nVar;
        this.f45968c = o1Var;
        this.f45969d = o1Var2;
    }

    @Override // ym0.l
    public final nm0.y invoke(String str) {
        String currentDestination = str;
        kotlin.jvm.internal.u.j(currentDestination, "currentDestination");
        PregnancyModeActivity.E3(this.f45966a, currentDestination, this.f45967b, this.f45968c.getValue(), this.f45969d.getValue());
        return nm0.y.f85009a;
    }
}
