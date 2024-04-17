package com.withings.core.ui;

import ah.o;
import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.j;
import androidx.compose.runtime.l0;
import androidx.compose.ui.platform.u0;
import k1.m;
import k1.p1;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import l70.v;
import l70.w;
import nm0.y;
import ym0.p;
/* compiled from: LocalMeasureFormatter.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final p1 f35379a = new m(a.f35380a);

    /* compiled from: LocalMeasureFormatter.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<jm.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f35380a = new w(0);

        @Override // ym0.a
        public final jm.a invoke() {
            throw new IllegalStateException("No MeasureFormatter provided".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalMeasureFormatter.kt */
    /* renamed from: com.withings.core.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0466b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p<androidx.compose.runtime.a, Integer, y> f35381a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f35382b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0466b(int i11, p pVar) {
            super(2);
            this.f35381a = pVar;
            this.f35382b = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f35382b | 1);
            b.a(this.f35381a, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(p<? super androidx.compose.runtime.a, ? super Integer, y> content, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        u.j(content, "content");
        androidx.compose.runtime.b g11 = aVar.g(-1265446803);
        if ((i11 & 14) == 0) {
            if (g11.w(content)) {
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
            g11.s(226226087);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = w.a.a();
                g11.n(t11);
            }
            g11.J();
            r0 a11 = l0.a(((l70.w) t11).get(), null, null, g11, 2);
            if (((v) a11.getValue()) != null) {
                j.a(f35379a.c(new jm.a((Context) g11.D(u0.d()), (v) a11.getValue())), content, g11, ((i12 << 3) & 112) | 8);
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0466b(i11, content));
        }
    }

    public static final p1 b() {
        return f35379a;
    }
}
