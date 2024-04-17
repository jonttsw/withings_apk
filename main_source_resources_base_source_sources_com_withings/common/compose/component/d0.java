package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import com.withings.common.compose.component.l2;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
/* compiled from: CheckButtonFilled.kt */
/* loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckButtonFilled.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f33632a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f33633b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k1.r0 r0Var, ym0.l lVar) {
            super(0);
            this.f33632a = lVar;
            this.f33633b = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            k1.r0<Boolean> r0Var = this.f33633b;
            r0Var.setValue(Boolean.valueOf(!d0.b(r0Var)));
            this.f33632a.invoke(Boolean.valueOf(d0.b(r0Var)));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckButtonFilled.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f33634a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f33635b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f33636c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f33637d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33638e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, boolean z5, boolean z11, ym0.l<? super Boolean, nm0.y> lVar, int i11) {
            super(2);
            this.f33634a = str;
            this.f33635b = z5;
            this.f33636c = z11;
            this.f33637d = lVar;
            this.f33638e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33638e | 1);
            boolean z5 = this.f33636c;
            ym0.l<Boolean, nm0.y> lVar = this.f33637d;
            d0.a(this.f33634a, this.f33635b, z5, lVar, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String text, boolean z5, boolean z11, ym0.l<? super Boolean, nm0.y> onCheckClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        kotlin.jvm.internal.u.j(text, "text");
        kotlin.jvm.internal.u.j(onCheckClicked, "onCheckClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1729374509);
        if ((i11 & 14) == 0) {
            if (g11.K(text)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i12 = i17 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.a(z5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i12 |= i16;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.a(z11)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onCheckClicked)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            g11.s(-606053502);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(Boolean.valueOf(z11), androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            ColorStyle colorStyle = ColorStyle.f33324c;
            if (((Boolean) r0Var.getValue()).booleanValue()) {
                i13 = C1987R.drawable.ic_rounded_ok_filled;
            } else {
                i13 = C1987R.drawable.ic_rounded_empty;
            }
            l2.b bVar = new l2.b(s2.d.a(i13, g11));
            g11.s(-606053376);
            if ((i12 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object t12 = g11.t();
            if (z12 || t12 == a.C0060a.a()) {
                t12 = new a(r0Var, onCheckClicked);
                g11.n(t12);
            }
            g11.J();
            l.a(null, text, bVar, z5, colorStyle, null, false, (ym0.a) t12, g11, ((i12 << 3) & 112) | 25088 | ((i12 << 6) & 7168), 97);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(text, z5, z11, onCheckClicked, i11));
        }
    }

    public static final boolean b(k1.r0 r0Var) {
        return ((Boolean) r0Var.getValue()).booleanValue();
    }
}
