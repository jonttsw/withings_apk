package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
import java.util.Arrays;
import java.util.List;
/* compiled from: CheckBoxGroup.kt */
/* loaded from: classes3.dex */
public final class c0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckBoxGroup.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f33528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f33529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<Integer> f33530c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<List<Integer>, nm0.y> f33531d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b0 b0Var, k1.r0 r0Var, v1.w wVar, ym0.l lVar) {
            super(0);
            this.f33528a = b0Var;
            this.f33529b = r0Var;
            this.f33530c = wVar;
            this.f33531d = lVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            b0 b0Var = this.f33528a;
            boolean d11 = b0Var.d();
            k1.r0<Boolean> r0Var = this.f33529b;
            List<Integer> list = this.f33530c;
            if (d11) {
                r0Var.setValue(Boolean.TRUE);
                list.clear();
                list.add(Integer.valueOf(b0Var.a()));
            } else if (r0Var.getValue().booleanValue()) {
                r0Var.setValue(Boolean.FALSE);
                list.clear();
                list.add(Integer.valueOf(b0Var.a()));
            } else {
                int a11 = b0Var.a();
                kotlin.jvm.internal.u.j(list, "<this>");
                boolean contains = list.contains(Integer.valueOf(a11));
                Integer valueOf = Integer.valueOf(a11);
                if (contains) {
                    list.remove(valueOf);
                } else {
                    list.add(valueOf);
                }
            }
            this.f33531d.invoke(list);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckBoxGroup.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<Boolean, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b0 f33532a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f33533b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<Integer> f33534c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<List<Integer>, nm0.y> f33535d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(b0 b0Var, k1.r0 r0Var, v1.w wVar, ym0.l lVar) {
            super(1);
            this.f33532a = b0Var;
            this.f33533b = r0Var;
            this.f33534c = wVar;
            this.f33535d = lVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(Boolean bool) {
            bool.getClass();
            b0 b0Var = this.f33532a;
            boolean d11 = b0Var.d();
            k1.r0<Boolean> r0Var = this.f33533b;
            List<Integer> list = this.f33534c;
            if (d11) {
                r0Var.setValue(Boolean.TRUE);
                list.clear();
                list.add(Integer.valueOf(b0Var.a()));
            } else if (r0Var.getValue().booleanValue()) {
                r0Var.setValue(Boolean.FALSE);
                list.clear();
                list.add(Integer.valueOf(b0Var.a()));
            } else {
                int a11 = b0Var.a();
                kotlin.jvm.internal.u.j(list, "<this>");
                boolean contains = list.contains(Integer.valueOf(a11));
                Integer valueOf = Integer.valueOf(a11);
                if (contains) {
                    list.remove(valueOf);
                } else {
                    list.add(valueOf);
                }
            }
            this.f33535d.invoke(list);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CheckBoxGroup.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<b0> f33536a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.l<List<Integer>, nm0.y> f33537b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<Integer> f33538c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f33539d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f33540e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<b0> list, ym0.l<? super List<Integer>, nm0.y> lVar, List<Integer> list2, int i11, int i12) {
            super(2);
            this.f33536a = list;
            this.f33537b = lVar;
            this.f33538c = list2;
            this.f33539d = i11;
            this.f33540e = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f33539d | 1);
            ym0.l<List<Integer>, nm0.y> lVar = this.f33537b;
            List<Integer> list = this.f33538c;
            c0.a(this.f33536a, lVar, list, aVar, g11, this.f33540e);
            return nm0.y.f85009a;
        }
    }

    public static final void a(List<b0> options, ym0.l<? super List<Integer>, nm0.y> onSelectionChange, List<Integer> list, androidx.compose.runtime.a aVar, int i11, int i12) {
        kotlin.collections.i0 i0Var;
        kotlin.jvm.internal.u.j(options, "options");
        kotlin.jvm.internal.u.j(onSelectionChange, "onSelectionChange");
        androidx.compose.runtime.b g11 = aVar.g(-2000706179);
        if ((i12 & 4) != 0) {
            i0Var = kotlin.collections.i0.f76187a;
        } else {
            i0Var = list;
        }
        g11.s(338890664);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            Integer[] numArr = (Integer[]) i0Var.toArray(new Integer[0]);
            Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
            v1.w wVar = new v1.w();
            wVar.addAll(kotlin.collections.l.a0(copyOf));
            g11.n(wVar);
            t11 = wVar;
        }
        v1.w wVar2 = (v1.w) t11;
        Object a11 = com.huawei.hms.health.a.a(g11, 338890752);
        if (a11 == a.C0060a.a()) {
            a11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(a11);
        }
        k1.r0 r0Var = (k1.r0) a11;
        g11.J();
        for (Number number : i0Var) {
            if (options.get(number.intValue()).d()) {
                r0Var.setValue(Boolean.TRUE);
            }
        }
        g11.s(-483455358);
        e.a aVar2 = androidx.compose.ui.e.f8927a;
        androidx.compose.ui.layout.l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        k1.v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            ym0.p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !kotlin.jvm.internal.u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            dq.x.b(0, c11, k1.j1.a(g11), g11, 2058660585);
            g11.s(338890934);
            int i13 = 0;
            for (Object obj : options) {
                int i14 = i13 + 1;
                if (i13 >= 0) {
                    b0 b0Var = (b0) obj;
                    int i15 = i13;
                    o.c(wVar2.contains(Integer.valueOf(b0Var.a())), new a(b0Var, r0Var, wVar2, onSelectionChange), new b(b0Var, r0Var, wVar2, onSelectionChange), b0Var.c(), b0Var.b(), g11, 0, 0);
                    g11.s(287103469);
                    if (i15 != kotlin.collections.x.M(options)) {
                        v0.b(yk.h.o(), g11, 6, 0);
                    }
                    g11.J();
                    i13 = i14;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            androidx.compose.runtime.v a13 = com.withings.authentication.mfa.resolve.components.h.a(g11);
            if (a13 != null) {
                a13.G(new c(options, onSelectionChange, i0Var, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }
}
