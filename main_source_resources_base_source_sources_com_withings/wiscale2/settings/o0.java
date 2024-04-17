package com.withings.wiscale2.settings;

import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.settings.i;
/* compiled from: Password.kt */
/* loaded from: classes5.dex */
final class o0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f60215a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.o1<i> f60216b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.platform.k4 f60217c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ SettingsViewModel f60218d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60219e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f60220f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public o0(k1.r0<Boolean> r0Var, k1.o1<? extends i> o1Var, androidx.compose.ui.platform.k4 k4Var, SettingsViewModel settingsViewModel, k1.r0<String> r0Var2, k1.r0<String> r0Var3) {
        super(2);
        this.f60215a = r0Var;
        this.f60216b = o1Var;
        this.f60217c = k4Var;
        this.f60218d = settingsViewModel;
        this.f60219e = r0Var2;
        this.f60220f = r0Var3;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            com.withings.common.compose.component.l.a(null, ay.b.u(C1987R.string._NEXT_, aVar2), null, this.f60215a.getValue().booleanValue(), null, null, kotlin.jvm.internal.u.e(this.f60216b.getValue(), i.c.f60039a), new n0(this.f60217c, this.f60218d, this.f60219e, this.f60220f), aVar2, 0, 53);
        }
        return nm0.y.f85009a;
    }
}
