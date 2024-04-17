package com.withings.common.compose.component;

import androidx.compose.material.w7;
import androidx.compose.material3.ga;
import androidx.compose.ui.e;
import androidx.compose.ui.node.g;
/* compiled from: ConsentCard.kt */
/* loaded from: classes3.dex */
public abstract class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34721a;

    /* compiled from: ConsentCard.kt */
    /* loaded from: classes3.dex */
    public static final class a extends t0 {

        /* compiled from: ConsentCard.kt */
        /* renamed from: com.withings.common.compose.component.t0$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0453a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f34722a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0453a(String str) {
                super(2);
                this.f34722a = str;
            }

            @Override // ym0.p
            public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
                androidx.compose.runtime.a aVar2 = aVar;
                if ((num.intValue() & 11) == 2 && aVar2.h()) {
                    aVar2.C();
                } else {
                    e.a aVar3 = androidx.compose.ui.e.f8927a;
                    androidx.compose.ui.e f11 = androidx.compose.foundation.layout.x0.f(aVar3, yk.h.a());
                    aVar2.s(693286680);
                    androidx.compose.ui.layout.l0 i11 = w7.i(androidx.compose.foundation.layout.e.g(), aVar2, -1323940314);
                    int G = aVar2.G();
                    k1.v0 l5 = aVar2.l();
                    androidx.compose.ui.node.g.D.getClass();
                    ym0.a a11 = g.a.a();
                    s1.a c11 = androidx.compose.ui.layout.y.c(f11);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a11);
                        } else {
                            aVar2.m();
                        }
                        ym0.p c12 = com.google.protobuf.t.c(aVar2, i11, aVar2, l5);
                        if (aVar2.e() || !kotlin.jvm.internal.u.e(aVar2.t(), Integer.valueOf(G))) {
                            l0.q.a(G, aVar2, G, c12);
                        }
                        c11.invoke(k1.j1.a(aVar2), aVar2, 0);
                        aVar2.s(2058660585);
                        ga.b("•", androidx.compose.foundation.layout.x0.h(aVar3, yk.h.b(), 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar2, 54, 0, 131068);
                        nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, this.f34722a);
                        defpackage.d.j(aVar2);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String value) {
            super(new s1.a(true, 1803972624, new C0453a(value)));
            kotlin.jvm.internal.u.j(value, "value");
        }
    }

    /* compiled from: ConsentCard.kt */
    /* loaded from: classes3.dex */
    public static final class b extends t0 {

        /* compiled from: ConsentCard.kt */
        /* loaded from: classes3.dex */
        static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f34723a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(2);
                this.f34723a = str;
            }

            @Override // ym0.p
            public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
                androidx.compose.runtime.a aVar2 = aVar;
                if ((num.intValue() & 11) == 2 && aVar2.h()) {
                    aVar2.C();
                } else {
                    nk.a.g(0, 0, 0, 61, 0L, aVar2, null, null, this.f34723a);
                }
                return nm0.y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String value) {
            super(new s1.a(true, -1713599036, new a(value)));
            kotlin.jvm.internal.u.j(value, "value");
        }
    }

    private t0() {
        throw null;
    }

    public t0(s1.a aVar) {
        this.f34721a = aVar;
    }

    public final ym0.p<androidx.compose.runtime.a, Integer, nm0.y> a() {
        return this.f34721a;
    }
}
