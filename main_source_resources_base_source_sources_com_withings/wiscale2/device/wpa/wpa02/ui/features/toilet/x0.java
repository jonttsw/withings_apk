package com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet;

import androidx.lifecycle.h1;
import k1.o1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import se0.a;
/* compiled from: Wpa02ToiletInstallationActivity.kt */
/* loaded from: classes5.dex */
final class x0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Wpa02ToiletInstallationActivity f55462a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r8.n f55463b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o1<se0.a> f55464c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity, r8.n nVar, k1.r0 r0Var) {
        super(2);
        this.f55462a = wpa02ToiletInstallationActivity;
        this.f55463b = nVar;
        this.f55464c = r0Var;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            o1<se0.a> o1Var = this.f55464c;
            se0.a value = o1Var.getValue();
            boolean e11 = kotlin.jvm.internal.u.e(value, a.c.f96923a);
            Wpa02ToiletInstallationActivity wpa02ToiletInstallationActivity = this.f55462a;
            if (e11) {
                aVar2.s(677153765);
                j0.a(new p0(wpa02ToiletInstallationActivity), aVar2, 0);
                aVar2.J();
            } else if (value instanceof a.d) {
                aVar2.s(677153924);
                aVar2.J();
                se0.a value2 = o1Var.getValue();
                kotlin.jvm.internal.u.h(value2, "null cannot be cast to non-null type com.withings.wiscale2.device.wpa.wpa02.ui.features.toilet.model.ToiletDeviceState.Permission");
                Wpa02ToiletInstallationActivity.E3(wpa02ToiletInstallationActivity, ((a.d) value2).d());
            } else if (kotlin.jvm.internal.u.e(value, a.e.f96925a)) {
                aVar2.s(677154092);
                h0.a(this.f55463b, Wpa02ToiletInstallationActivity.D3(wpa02ToiletInstallationActivity), Wpa02ToiletInstallationActivity.C3(wpa02ToiletInstallationActivity), new q0(wpa02ToiletInstallationActivity), aVar2, 584);
                aVar2.J();
            } else if (kotlin.jvm.internal.u.e(value, a.C1615a.f96912a)) {
                aVar2.s(677154442);
                j.a(aVar2, 0);
                aVar2.J();
            } else if (value instanceof a.b) {
                aVar2.s(677154566);
                k D3 = Wpa02ToiletInstallationActivity.D3(wpa02ToiletInstallationActivity);
                D3.getClass();
                BuildersKt__Builders_commonKt.launch$default(h1.a(D3), Dispatchers.getIO(), null, new q(D3, null), 2, null);
                a.b bVar = (a.b) value;
                oe0.b.a(bVar.b(), new r0(wpa02ToiletInstallationActivity), bVar.c(new s0(wpa02ToiletInstallationActivity), new t0(wpa02ToiletInstallationActivity), new u0(wpa02ToiletInstallationActivity)), bVar.a(new v0(wpa02ToiletInstallationActivity), new w0(wpa02ToiletInstallationActivity)), aVar2, 0);
                aVar2.J();
            } else {
                aVar2.s(677155585);
                aVar2.J();
            }
        }
        return nm0.y.f85009a;
    }
}
