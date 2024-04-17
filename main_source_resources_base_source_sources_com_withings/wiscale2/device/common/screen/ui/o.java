package com.withings.wiscale2.device.common.screen.ui;

import android.content.Context;
import androidx.compose.material.w7;
import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.device.common.screen.ui.y1;
import java.util.ArrayList;
import java.util.List;
import sc0.b;
/* compiled from: ScreenSelectionActivity.kt */
/* loaded from: classes5.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ScreenSelectionActivity f53403a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ScreenSelectionActivity screenSelectionActivity) {
        super(2);
        this.f53403a = screenSelectionActivity;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            ScreenSelectionActivity screenSelectionActivity = this.f53403a;
            k1.r0 a11 = androidx.compose.runtime.l0.a(ScreenSelectionActivity.D3(screenSelectionActivity).U0(), y1.c.f53487a, null, aVar2, 2);
            k1.r0 a12 = androidx.compose.runtime.l0.a(ScreenSelectionActivity.D3(screenSelectionActivity).V0(), Boolean.FALSE, null, aVar2, 2);
            aVar2.s(-454519702);
            Object t11 = aVar2.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                aVar2.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            Object j5 = w7.j(aVar2, -454519610);
            if (j5 == a.C0060a.a()) {
                j5 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                aVar2.n(j5);
            }
            k1.r0 r0Var2 = (k1.r0) j5;
            Object j11 = w7.j(aVar2, -454519486);
            if (j11 == a.C0060a.a()) {
                j11 = androidx.compose.runtime.l0.f(null, androidx.compose.runtime.v0.f8878a);
                aVar2.n(j11);
            }
            k1.r0 r0Var3 = (k1.r0) j11;
            aVar2.J();
            Context context = (Context) aVar2.D(androidx.compose.ui.platform.u0.d());
            y1 y1Var = (y1) a11.getValue();
            boolean booleanValue = ((Boolean) a12.getValue()).booleanValue();
            aVar2.s(-454519203);
            Object t12 = aVar2.t();
            if (t12 == a.C0060a.a()) {
                t12 = new e(r0Var2);
                aVar2.n(t12);
            }
            ym0.p<? super sc0.b, ? super List<b.a>, nm0.y> pVar = (ym0.p) t12;
            Object j12 = w7.j(aVar2, -454519025);
            if (j12 == a.C0060a.a()) {
                j12 = new f(r0Var3);
                aVar2.n(j12);
            }
            aVar2.J();
            g gVar = new g(context, r0Var);
            this.f53403a.z3(y1Var, booleanValue, pVar, (ym0.p) j12, gVar, aVar2, 265600);
            String str = (String) r0Var.getValue();
            aVar2.s(-454518708);
            if (str != null) {
                aVar2.s(1751616046);
                Object t13 = aVar2.t();
                if (t13 == a.C0060a.a()) {
                    t13 = new h(r0Var);
                    aVar2.n(t13);
                }
                aVar2.J();
                w1.f(str, (ym0.a) t13, aVar2, 48);
                nm0.y yVar = nm0.y.f85009a;
            }
            aVar2.J();
            nm0.j jVar = (nm0.j) r0Var2.getValue();
            aVar2.s(-454518536);
            if (jVar != null) {
                sc0.b bVar = (sc0.b) jVar.a();
                String e11 = bVar.e();
                List<b.a> list = (List) jVar.b();
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
                for (b.a aVar3 : list) {
                    arrayList.add(aVar3.b());
                }
                aVar2.s(1751616368);
                Object t14 = aVar2.t();
                if (t14 == a.C0060a.a()) {
                    t14 = new i(r0Var2);
                    aVar2.n(t14);
                }
                aVar2.J();
                w1.a(e11, arrayList, (ym0.a) t14, new j(screenSelectionActivity, bVar, r0Var2), aVar2, 448);
                nm0.y yVar2 = nm0.y.f85009a;
            }
            aVar2.J();
            nm0.j jVar2 = (nm0.j) r0Var3.getValue();
            aVar2.s(-454518011);
            if (jVar2 != null) {
                sc0.b bVar2 = (sc0.b) jVar2.a();
                String e12 = bVar2.e();
                String b10 = ((b.a) jVar2.b()).b();
                aVar2.s(1751616877);
                Object t15 = aVar2.t();
                if (t15 == a.C0060a.a()) {
                    t15 = new k(r0Var3);
                    aVar2.n(t15);
                }
                aVar2.J();
                w1.g(e12, b10, (ym0.a) t15, new l(screenSelectionActivity, bVar2, r0Var3), aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
                nm0.y yVar3 = nm0.y.f85009a;
            }
            aVar2.J();
            k1.y.f("observe bodyCompositionAlert", new m(screenSelectionActivity, context, r0Var, null), aVar2);
            k1.y.f("observe maxScreenLimit", new n(screenSelectionActivity, context, r0Var, null), aVar2);
        }
        return nm0.y.f85009a;
    }
}
