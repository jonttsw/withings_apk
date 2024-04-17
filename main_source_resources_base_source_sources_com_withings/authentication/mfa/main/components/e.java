package com.withings.authentication.mfa.main.components;

import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.d1;
import androidx.compose.runtime.a;
import androidx.compose.runtime.v;
import com.withings.common.compose.component.o;
import com.withings.wiscale2.C1987R;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nk.a0;
import nm0.y;
import ym0.p;
import ym0.q;
/* compiled from: OthersComponent.kt */
/* loaded from: classes3.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OthersComponent.kt */
    /* loaded from: classes3.dex */
    public static final class a extends w implements q<r0.h, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31674a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<y> aVar) {
            super(3);
            this.f31674a = aVar;
        }

        @Override // ym0.q
        public final y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                androidx.compose.ui.e h11 = x0.h(androidx.compose.ui.e.f8927a, yk.h.o(), 0.0f, 2);
                aVar2.s(1081570742);
                ym0.a<y> aVar3 = this.f31674a;
                boolean K = aVar2.K(aVar3);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new d(aVar3);
                    aVar2.n(t11);
                }
                aVar2.J();
                o.o(androidx.compose.foundation.h.b(h11, false, (ym0.a) t11, 7), null, ay.b.u(C1987R.string.mfa_type_recoveryCode, aVar2), ay.b.u(C1987R.string.mfa_type_recoveryCode_description, aVar2), null, false, false, true, null, null, null, null, null, aVar2, 12582912, 0, 8050);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OthersComponent.kt */
    /* loaded from: classes3.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f31675a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31676b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ym0.a<y> aVar, int i11) {
            super(2);
            this.f31675a = aVar;
            this.f31676b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f31676b | 1);
            e.a(this.f31675a, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(ym0.a<y> onClick, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        u.j(onClick, "onClick");
        androidx.compose.runtime.b g11 = aVar.g(-110188551);
        if ((i11 & 14) == 0) {
            if (g11.w(onClick)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            a0.f(0, 0, 28, 0L, g11, x0.j(androidx.compose.ui.e.f8927a, 0.0f, 0.0f, 0.0f, yk.h.c(), 7), null, ay.b.u(C1987R.string.mfa_settings_otherSection_title, g11));
            d1.a(null, null, null, null, null, s1.b.b(g11, 805916615, new a(onClick)), g11, 196608, 31);
        }
        v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(onClick, i11));
        }
    }
}
