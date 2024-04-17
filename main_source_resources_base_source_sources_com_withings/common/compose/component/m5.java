package com.withings.common.compose.component;

import androidx.compose.material3.ga;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: UserDropDownMenuWithings.kt */
/* loaded from: classes3.dex */
public final class m5 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.l<Long, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34078a = new kotlin.jvm.internal.w(1);

        @Override // ym0.l
        public final /* bridge */ /* synthetic */ nm0.y invoke(Long l5) {
            l5.longValue();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<p5> f34080b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Integer> f34081c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f34082d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34083e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34084f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, List<p5> list, k1.r0<Integer> r0Var, ym0.l<? super Long, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34079a = eVar;
            this.f34080b = list;
            this.f34081c = r0Var;
            this.f34082d = lVar;
            this.f34083e = i11;
            this.f34084f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34083e | 1);
            k1.r0<Integer> r0Var = this.f34081c;
            ym0.l<Long, nm0.y> lVar = this.f34082d;
            m5.a(this.f34079a, this.f34080b, r0Var, lVar, aVar, g11, this.f34084f);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34085a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k1.r0<Boolean> r0Var) {
            super(0);
            this.f34085a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f34085a.setValue(Boolean.TRUE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.q<r0.a0, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<p5> f34086a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k1.r0<p5> r0Var) {
            super(3);
            this.f34086a = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.a0 a0Var, androidx.compose.runtime.a aVar, Integer num) {
            k1.p1 p1Var;
            r0.a0 OutlinedButton = a0Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(OutlinedButton, "$this$OutlinedButton");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                String b10 = this.f34086a.getValue().b();
                aVar2.s(-892373489);
                p1Var = yk.o.f109338j;
                aVar2.J();
                androidx.compose.ui.text.d0 a11 = ((yk.x) aVar2.D(p1Var)).a();
                aVar2.s(615317871);
                aVar2.J();
                ga.b(b10, null, ((yk.w) aVar2.D(yk.o.g())).i().c(), 0L, null, null, null, 0L, null, d3.g.a(3), 0L, 0, false, 1, 0, null, a11, aVar2, 0, 3072, 56826);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                r0.d0.a(androidx.compose.foundation.layout.e1.n(aVar3, 2), aVar2);
                androidx.compose.ui.e n11 = androidx.compose.foundation.layout.e1.n(aVar3, yk.h.r());
                g2.c a12 = s2.d.a(C1987R.drawable.icon_medium_navigation_downsm, aVar2);
                aVar2.J();
                androidx.compose.material3.a5.a(a12, null, n11, ((yk.w) androidx.camera.camera2.internal.p2.b(aVar2, 615317871)).i().c(), aVar2, 440, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34087a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(k1.r0<Boolean> r0Var) {
            super(0);
            this.f34087a = r0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f34087a.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<p5> f34088a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f34089b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34090c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k1.r0 r0Var, List list, ym0.l lVar) {
            super(3);
            this.f34088a = list;
            this.f34089b = lVar;
            this.f34090c = r0Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h DropdownMenu = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(DropdownMenu, "$this$DropdownMenu");
            if ((intValue & 81) == 16 && aVar2.h()) {
                aVar2.C();
            } else {
                for (p5 p5Var : this.f34088a) {
                    s1.a b10 = s1.b.b(aVar2, -995478824, new n5(p5Var));
                    aVar2.s(-395216700);
                    ym0.l<Long, nm0.y> lVar = this.f34089b;
                    boolean K = aVar2.K(lVar) | aVar2.K(p5Var);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new o5(lVar, p5Var, this.f34090c);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    androidx.compose.material3.a0.b(b10, (ym0.a) t11, null, null, null, false, null, null, null, aVar2, 6, ConstantsWs.WS_STATUS_WRONG_STRIPE_ENV);
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDropDownMenuWithings.kt */
    /* loaded from: classes3.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<p5> f34092b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Integer> f34093c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Long, nm0.y> f34094d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34095e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34096f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(androidx.compose.ui.e eVar, List<p5> list, k1.r0<Integer> r0Var, ym0.l<? super Long, nm0.y> lVar, int i11, int i12) {
            super(2);
            this.f34091a = eVar;
            this.f34092b = list;
            this.f34093c = r0Var;
            this.f34094d = lVar;
            this.f34095e = i11;
            this.f34096f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34095e | 1);
            k1.r0<Integer> r0Var = this.f34093c;
            ym0.l<Long, nm0.y> lVar = this.f34094d;
            m5.a(this.f34091a, this.f34092b, r0Var, lVar, aVar, g11, this.f34096f);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r22, java.util.List<com.withings.common.compose.component.p5> r23, k1.r0<java.lang.Integer> r24, ym0.l<? super java.lang.Long, nm0.y> r25, androidx.compose.runtime.a r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.m5.a(androidx.compose.ui.e, java.util.List, k1.r0, ym0.l, androidx.compose.runtime.a, int, int):void");
    }
}
