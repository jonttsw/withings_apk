package com.withings.common.compose.component;

import android.content.Context;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.node.g;
import coil.size.Scale;
import ga.f;
/* compiled from: ImageCard.kt */
/* loaded from: classes3.dex */
public final class m2 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCard.kt */
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.q<r0.h, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f34060a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f34061b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(float f11, String str, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar) {
            super(3);
            this.f34060a = f11;
            this.f34061b = str;
            this.f34062c = pVar;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.h hVar, androidx.compose.runtime.a aVar, Integer num) {
            r0.h Card = hVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(Card, "$this$Card");
            if ((intValue & 81) == 16 && aVar2.h()) {
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
                    androidx.compose.ui.e a13 = androidx.compose.foundation.layout.w0.a(androidx.compose.foundation.layout.e1.e(aVar3, 1.0f), this.f34060a);
                    f.a aVar4 = new f.a((Context) aVar2.D(androidx.compose.ui.platform.u0.d()));
                    aVar4.d(this.f34061b);
                    aVar4.n(Scale.f23222b);
                    n0.z.a(x9.n.a(aVar4.b(), aVar2, 8), null, a13, null, f.a.a(), 0.0f, null, aVar2, 24624, 104);
                    androidx.compose.material.l3.b(this.f34062c, aVar2, 0);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ImageCard.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34063a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f34064b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f34065c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.p<androidx.compose.runtime.a, Integer, nm0.y> f34066d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f34067e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f34068f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.ui.e eVar, float f11, String str, ym0.p<? super androidx.compose.runtime.a, ? super Integer, nm0.y> pVar, int i11, int i12) {
            super(2);
            this.f34063a = eVar;
            this.f34064b = f11;
            this.f34065c = str;
            this.f34066d = pVar;
            this.f34067e = i11;
            this.f34068f = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34067e | 1);
            String str = this.f34065c;
            ym0.p<androidx.compose.runtime.a, Integer, nm0.y> pVar = this.f34066d;
            m2.a(this.f34063a, this.f34064b, str, pVar, aVar, g11, this.f34068f);
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.e r16, float r17, java.lang.String r18, ym0.p<? super androidx.compose.runtime.a, ? super java.lang.Integer, nm0.y> r19, androidx.compose.runtime.a r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.compose.component.m2.a(androidx.compose.ui.e, float, java.lang.String, ym0.p, androidx.compose.runtime.a, int, int):void");
    }
}
