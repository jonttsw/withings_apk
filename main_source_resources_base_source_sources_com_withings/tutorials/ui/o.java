package com.withings.tutorials.ui;

import android.content.Context;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import androidx.compose.runtime.l0;
import androidx.compose.ui.platform.u0;
import com.withings.device.Device;
import java.util.List;
import k1.o1;
import k1.r0;
import kotlinx.coroutines.flow.Flow;
/* compiled from: DeviceIntroductionActivity.kt */
/* loaded from: classes4.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DeviceIntroductionActivity f44774a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(DeviceIntroductionActivity deviceIntroductionActivity) {
        super(2);
        this.f44774a = deviceIntroductionActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        String str;
        String str2;
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            DeviceIntroductionActivity deviceIntroductionActivity = this.f44774a;
            r0 c11 = h6.b.c(DeviceIntroductionActivity.B3(deviceIntroductionActivity).p0(), aVar2);
            r0 a11 = h6.b.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).z0(), null, aVar2, 56);
            r0 a12 = h6.b.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).m0(), null, aVar2, 56);
            Flow<List<o60.d>> q02 = DeviceIntroductionActivity.B3(deviceIntroductionActivity).q0();
            kotlin.collections.i0 i0Var = kotlin.collections.i0.f76187a;
            r0 a13 = h6.b.a(q02, i0Var, aVar2, 56);
            r0 a14 = h6.b.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).t0(), i0Var, aVar2, 56);
            aVar2.s(1415434998);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = l0.e(new n(c11, a14, deviceIntroductionActivity));
                aVar2.n(t11);
            }
            o1 o1Var = (o1) t11;
            aVar2.J();
            r0 a15 = l0.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).A0(), i0Var, null, aVar2, 2);
            r0 a16 = l0.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).B0(), Boolean.TRUE, null, aVar2, 2);
            aVar2.s(1415435615);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = l0.e(new l(deviceIntroductionActivity, o1Var));
                aVar2.n(t12);
            }
            o1 o1Var2 = (o1) t12;
            Object j5 = w7.j(aVar2, 1415435944);
            if (j5 == a.C0060a.a()) {
                j5 = l0.e(new k(c11));
                aVar2.n(j5);
            }
            aVar2.J();
            Context context = (Context) aVar2.D(u0.d());
            r0 a17 = h6.b.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).y0(), null, aVar2, 56);
            androidx.lifecycle.d0 d0Var = (androidx.lifecycle.d0) aVar2.D(u0.f());
            k1.y.f((List) a13.getValue(), new a(context, a13, (o1) j5, null), aVar2);
            k1.y.c(d0Var, new c(d0Var, context), aVar2);
            l70.v vVar = (l70.v) a17.getValue();
            if (vVar != null) {
                Device device = (Device) c11.getValue();
                if (device != null) {
                    str = device.getName();
                } else {
                    str = null;
                }
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                f fVar = new f(deviceIntroductionActivity, context);
                List list = (List) a15.getValue();
                g gVar = new g(deviceIntroductionActivity, context, null);
                boolean booleanValue = ((Boolean) l0.a(DeviceIntroductionActivity.B3(deviceIntroductionActivity).r0(), Boolean.FALSE, null, aVar2, 2).getValue()).booleanValue();
                i iVar = new i(c11, a11, deviceIntroductionActivity);
                boolean booleanValue2 = ((Boolean) a16.getValue()).booleanValue();
                boolean booleanValue3 = ((Boolean) o1Var2.getValue()).booleanValue();
                j jVar = new j(deviceIntroductionActivity);
                d70.d.a(str2, (Integer) a12.getValue(), DeviceIntroductionActivity.z3(deviceIntroductionActivity), (List) o1Var.getValue(), new e(context, c11), (List) a13.getValue(), fVar, list, gVar, booleanValue, iVar, booleanValue2, booleanValue3, vVar, jVar, aVar2, 151261184, 4096, 0);
            }
        }
        return nm0.y.f85009a;
    }
}
