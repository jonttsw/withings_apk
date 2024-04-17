package com.withings.manualLogging.ui.feature.addNote;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import com.withings.common.compose.component.ButtonSize;
import com.withings.common.compose.component.ColorStyle;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.wiscale2.C1987R;
import x1.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AddManualLogActivity.kt */
/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k1.r0<String> f41475a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AddManualLogActivity f41476b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k1 f41477c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f41478d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(k1.r0<String> r0Var, AddManualLogActivity addManualLogActivity, k1 k1Var, k1.r0<Boolean> r0Var2) {
        super(2);
        this.f41475a = r0Var;
        this.f41476b = addManualLogActivity;
        this.f41477c = k1Var;
        this.f41478d = r0Var2;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            aVar2.s(-483455358);
            e.a aVar3 = androidx.compose.ui.e.f8927a;
            androidx.compose.ui.layout.l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
            int G = aVar2.G();
            k1.v0 l5 = aVar2.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
            if (aVar2.i() instanceof k1.d) {
                aVar2.A();
                if (aVar2.e()) {
                    aVar2.F(a12);
                } else {
                    aVar2.m();
                }
                ym0.p c12 = com.google.protobuf.t.c(aVar2, a11, aVar2, l5);
                if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                    l0.q.a(G, aVar2, G, c12);
                }
                l0.r.c(0, c11, k1.j1.a(aVar2), aVar2, 2058660585);
                InputFieldType inputFieldType = InputFieldType.f33876d;
                int i11 = AddManualLogActivity.f40697k;
                k1.r0<String> r0Var = this.f41475a;
                String value = r0Var.getValue();
                if (value == null) {
                    value = "";
                }
                String str = value;
                aVar2.s(-1367788854);
                boolean K = aVar2.K(r0Var);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new h(r0Var);
                    aVar2.n(t11);
                }
                aVar2.J();
                fk.q.d(null, inputFieldType, null, str, null, "0123456789", null, null, false, 0, null, null, false, (ym0.l) t11, i.f41465a, aVar2, 196656, 24576, 8149);
                HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(b.a.j());
                String string = this.f41476b.getString(C1987R.string.partner_deactivate);
                ButtonSize buttonSize = ButtonSize.f33304f;
                ColorStyle colorStyle = ColorStyle.f33323b;
                kotlin.jvm.internal.u.g(string);
                com.withings.common.compose.component.l.c(horizontalAlignElement, string, null, false, colorStyle, buttonSize, false, new j(this.f41477c, this.f41478d), aVar2, 221184, 76);
                defpackage.d.j(aVar2);
            } else {
                a3.g.s();
                throw null;
            }
        }
        return nm0.y.f85009a;
    }
}
