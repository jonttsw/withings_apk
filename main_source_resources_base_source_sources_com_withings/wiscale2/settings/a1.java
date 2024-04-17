package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class a1 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59854a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f59855b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f59856c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f59857d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f59858e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1.r0 r0Var, k1.r0 r0Var2, k1.r0 r0Var3, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel) {
        super(2);
        this.f59854a = r0Var;
        this.f59855b = r0Var2;
        this.f59856c = k4Var;
        this.f59857d = settingsViewModel;
        this.f59858e = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._CONTINUE_APP_, aVar2), null, this.f59854a.getValue().booleanValue(), null, null, this.f59855b.getValue().booleanValue(), new z0(this.f59856c, this.f59857d, this.f59858e), aVar2, 0, 53);
        }
        return nm0.y.f85009a;
    }
}
