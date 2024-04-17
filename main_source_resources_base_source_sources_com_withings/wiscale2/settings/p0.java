package com.withings.wiscale2.settings;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class p0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60232a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<i> f60233b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60234c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60235d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60236e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60237f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p0(k1.r0<Boolean> r0Var, k1.o1<? extends i> o1Var, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<String> r0Var2, k1.r0<String> r0Var3) {
        super(2);
        this.f60232a = r0Var;
        this.f60233b = o1Var;
        this.f60234c = k4Var;
        this.f60235d = settingsViewModel;
        this.f60236e = r0Var2;
        this.f60237f = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            wk.i.a(null, false, s1.b.b(aVar2, -1704262906, new o0(this.f60232a, this.f60233b, this.f60234c, this.f60235d, this.f60236e, this.f60237f)), null, aVar2, 432, 9);
        }
        return nm0.y.f85009a;
    }
}
