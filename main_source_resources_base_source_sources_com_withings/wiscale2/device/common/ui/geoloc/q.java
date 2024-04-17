package com.withings.wiscale2.device.common.ui.geoloc;

import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material3.a9;
import androidx.compose.material3.f8;
import androidx.compose.material3.g8;
import androidx.compose.material3.i1;
import androidx.compose.material3.j1;
import androidx.compose.material3.y7;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.lifecycle.h1;
import b70.t0;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.input.InputFieldType;
import com.withings.common.compose.component.n1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.geoloc.a0;
import java.util.ArrayList;
import java.util.List;
import k1.r0;
import k1.v0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import qk.ad;
import qk.z9;
/* compiled from: WeatherAirQualityScreen.kt */
/* loaded from: classes5.dex */
public final class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53880a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ym0.a<nm0.y> aVar) {
            super(2);
            this.f53880a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                aVar2.s(561771469);
                ym0.a<nm0.y> aVar4 = this.f53880a;
                boolean K = aVar2.K(aVar4);
                Object t11 = aVar2.t();
                if (K || t11 == a.C0060a.a()) {
                    t11 = new p(aVar4);
                    aVar2.n(t11);
                }
                aVar2.J();
                n1.b(z9.f93230a, androidx.compose.foundation.h.b(aVar3, false, (ym0.a) t11, 7), ((i1) aVar2.D(j1.e())).D(), 0, aVar2, 0, 8);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f53881a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f53882b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, ym0.l lVar) {
            super(2);
            this.f53881a = lVar;
            this.f53882b = str;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                aVar2.s(561771739);
                ym0.l<String, nm0.y> lVar = this.f53881a;
                boolean K = aVar2.K(lVar);
                String str = this.f53882b;
                boolean K2 = K | aVar2.K(str);
                Object t11 = aVar2.t();
                if (K2 || t11 == a.C0060a.a()) {
                    t11 = new r(str, lVar);
                    aVar2.n(t11);
                }
                aVar2.J();
                n1.b(ad.f92849a, androidx.compose.foundation.h.b(aVar3, false, (ym0.a) t11, 7), ((i1) aVar2.D(j1.e())).D(), 0, aVar2, 0, 8);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f53883a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.l<? super String, nm0.y> lVar) {
            super(1);
            this.f53883a = lVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String it = str;
            kotlin.jvm.internal.u.j(it, "it");
            this.f53883a.invoke(it);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f53884a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53885b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f53886c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, nm0.y> f53887d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f53888e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(String str, ym0.a<nm0.y> aVar, ym0.l<? super String, nm0.y> lVar, ym0.l<? super Boolean, nm0.y> lVar2, int i11) {
            super(2);
            this.f53884a = str;
            this.f53885b = aVar;
            this.f53886c = lVar;
            this.f53887d = lVar2;
            this.f53888e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f53888e | 1);
            ym0.l<String, nm0.y> lVar = this.f53886c;
            ym0.l<Boolean, nm0.y> lVar2 = this.f53887d;
            q.a(this.f53884a, this.f53885b, lVar, lVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class e extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f53889a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53890b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(a0 a0Var, ym0.a<nm0.y> aVar) {
            super(0);
            this.f53889a = a0Var;
            this.f53890b = aVar;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            a0 a0Var = this.f53889a;
            a0Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), null, null, new d0(a0Var, null), 3, null);
            this.f53890b.invoke();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<String, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f53891a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(a0 a0Var) {
            super(1);
            this.f53891a = a0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(String str) {
            String inputTextLocation = str;
            kotlin.jvm.internal.u.j(inputTextLocation, "inputTextLocation");
            a0 a0Var = this.f53891a;
            a0Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), null, null, new e0(a0Var, inputTextLocation, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f53892a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(a0 a0Var) {
            super(1);
            this.f53892a = a0Var;
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            int intValue = num.intValue();
            a0 a0Var = this.f53892a;
            a0Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), null, null, new c0(a0Var, intValue, null), 3, null);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53893a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f53894b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53895c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53896d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f53897e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<nm0.y> aVar, a0 a0Var, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, int i11) {
            super(2);
            this.f53893a = aVar;
            this.f53894b = a0Var;
            this.f53895c = aVar2;
            this.f53896d = aVar3;
            this.f53897e = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f53897e | 1);
            ym0.a<nm0.y> aVar2 = this.f53895c;
            ym0.a<nm0.y> aVar3 = this.f53896d;
            q.c(this.f53893a, this.f53894b, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53898a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ym0.a<nm0.y> aVar) {
            super(2);
            this.f53898a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                c5.a(0L, 0L, ay.b.u(C1987R.string._LOCALISATION_, aVar2), false, null, null, null, null, false, this.f53898a, aVar2, 0, 507);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53899a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ym0.a<nm0.y> aVar) {
            super(2);
            this.f53899a = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                com.withings.common.compose.component.l.a(x0.h(x0.j(androidx.compose.ui.e.f8927a, 0.0f, yk.h.a(), 0.0f, yk.h.a(), 5), yk.h.b(), 0.0f, 2), "Save", null, false, null, null, false, this.f53899a, aVar2, 48, 124);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class k extends kotlin.jvm.internal.w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f53900a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53901b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f53902c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<a0.a> f53903d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ok.a f53904e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ List<com.withings.common.compose.component.e0> f53905f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f53906g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53907h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, ym0.a aVar, ym0.l lVar, List list, ok.a aVar2, ArrayList arrayList, int i11, ym0.l lVar2) {
            super(3);
            this.f53900a = str;
            this.f53901b = aVar;
            this.f53902c = lVar;
            this.f53903d = list;
            this.f53904e = aVar2;
            this.f53905f = arrayList;
            this.f53906g = i11;
            this.f53907h = lVar2;
        }

        @Override // ym0.q
        public final nm0.y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w paddingValues = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            kotlin.jvm.internal.u.j(paddingValues, "paddingValues");
            if ((intValue & 14) == 0) {
                if (aVar2.K(paddingValues)) {
                    i11 = 4;
                } else {
                    i11 = 2;
                }
                intValue |= i11;
            }
            if ((intValue & 91) == 18 && aVar2.h()) {
                aVar2.C();
            } else {
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                androidx.compose.ui.e e11 = x0.e(e1.d(aVar3), paddingValues);
                aVar2.s(-483455358);
                l0 a11 = androidx.compose.material.v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(e11);
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
                    aVar2.s(-748563833);
                    ym0.l<String, nm0.y> lVar = this.f53902c;
                    boolean K = aVar2.K(lVar);
                    Object t11 = aVar2.t();
                    if (K || t11 == a.C0060a.a()) {
                        t11 = new s(lVar);
                        aVar2.n(t11);
                    }
                    aVar2.J();
                    t tVar = t.f53925a;
                    q.a(this.f53900a, this.f53901b, (ym0.l) t11, tVar, aVar2, 3072);
                    aVar2.s(-478687127);
                    if (!this.f53903d.isEmpty()) {
                        x0.a d11 = ((f8) aVar2.D(g8.a())).d();
                        a9.a(x0.f(androidx.compose.ui.input.nestedscroll.a.a(e1.e(aVar3, 1.0f), this.f53904e.a(), null), yk.h.b()), d11, 0L, 0L, 0.0f, 0.0f, null, s1.b.b(aVar2, -645344296, new v(this.f53905f, this.f53907h, this.f53906g)), aVar2, 12582912, 124);
                    }
                    androidx.compose.material.v.b(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f53908a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<a0.a> f53909b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f53910c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53911d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53912e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53913f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, nm0.y> f53914g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.l<Integer, nm0.y> f53915h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f53916i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(String str, List<a0.a> list, int i11, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, ym0.a<nm0.y> aVar3, ym0.l<? super String, nm0.y> lVar, ym0.l<? super Integer, nm0.y> lVar2, int i12) {
            super(2);
            this.f53908a = str;
            this.f53909b = list;
            this.f53910c = i11;
            this.f53911d = aVar;
            this.f53912e = aVar2;
            this.f53913f = aVar3;
            this.f53914g = lVar;
            this.f53915h = lVar2;
            this.f53916i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f53916i | 1);
            ym0.l<String, nm0.y> lVar = this.f53914g;
            ym0.l<Integer, nm0.y> lVar2 = this.f53915h;
            q.b(this.f53908a, this.f53909b, this.f53910c, this.f53911d, this.f53912e, this.f53913f, lVar, lVar2, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f53917a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(a0 a0Var) {
            super(0);
            this.f53917a = a0Var;
        }

        @Override // ym0.a
        public final nm0.y invoke() {
            this.f53917a.F0();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WeatherAirQualityScreen.kt */
    /* loaded from: classes5.dex */
    public static final class n extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f53918a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53919b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f53920c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f53921d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(a0 a0Var, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
            super(2);
            this.f53918a = a0Var;
            this.f53919b = aVar;
            this.f53920c = aVar2;
            this.f53921d = i11;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f53921d | 1);
            ym0.a<nm0.y> aVar2 = this.f53919b;
            ym0.a<nm0.y> aVar3 = this.f53920c;
            q.e(this.f53918a, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public static final void a(String inputText, ym0.a<nm0.y> onCurrentLocationClicked, ym0.l<? super String, nm0.y> onValueInputTextChange, ym0.l<? super Boolean, nm0.y> onFocusChanged, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        boolean z5;
        androidx.compose.runtime.b bVar;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(inputText, "inputText");
        kotlin.jvm.internal.u.j(onCurrentLocationClicked, "onCurrentLocationClicked");
        kotlin.jvm.internal.u.j(onValueInputTextChange, "onValueInputTextChange");
        kotlin.jvm.internal.u.j(onFocusChanged, "onFocusChanged");
        androidx.compose.runtime.b g11 = aVar.g(1306160188);
        if ((i11 & 14) == 0) {
            if (g11.K(inputText)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onCurrentLocationClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onValueInputTextChange)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.w(onFocusChanged)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
            bVar = g11;
        } else {
            androidx.compose.ui.e f11 = x0.f(androidx.compose.ui.e.f8927a, yk.h.b());
            String u11 = ay.b.u(C1987R.string.location_searchBar_placeholder, g11);
            InputFieldType inputFieldType = InputFieldType.f33876d;
            s1.a b10 = s1.b.b(g11, -435872071, new a(onCurrentLocationClicked));
            s1.a b11 = s1.b.b(g11, -150736168, new b(inputText, onValueInputTextChange));
            g11.s(-1295342051);
            if ((i12 & ConstantsWs.HWFAILURE_ZERO) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object t11 = g11.t();
            if (z5 || t11 == a.C0060a.a()) {
                t11 = new c(onValueInputTextChange);
                g11.n(t11);
            }
            g11.J();
            bVar = g11;
            fk.q.d(f11, inputFieldType, null, inputText, null, u11, b10, b11, false, 0, null, null, false, (ym0.l) t11, onFocusChanged, bVar, ((i12 << 9) & 7168) | 14155824, (i12 << 3) & 57344, 7956);
        }
        androidx.compose.runtime.v o02 = bVar.o0();
        if (o02 != null) {
            o02.G(new d(inputText, onCurrentLocationClicked, onValueInputTextChange, onFocusChanged, i11));
        }
    }

    public static final void b(String inputLocation, List<a0.a> locationListResult, int i11, ym0.a<nm0.y> onCurrentLocationClicked, ym0.a<nm0.y> onBackBottomSheetClicked, ym0.a<nm0.y> onSaveNewAddressClicked, ym0.l<? super String, nm0.y> onValueInputTextChange, ym0.l<? super Integer, nm0.y> onLocationSelected, androidx.compose.runtime.a aVar, int i12) {
        kotlin.jvm.internal.u.j(inputLocation, "inputLocation");
        kotlin.jvm.internal.u.j(locationListResult, "locationListResult");
        kotlin.jvm.internal.u.j(onCurrentLocationClicked, "onCurrentLocationClicked");
        kotlin.jvm.internal.u.j(onBackBottomSheetClicked, "onBackBottomSheetClicked");
        kotlin.jvm.internal.u.j(onSaveNewAddressClicked, "onSaveNewAddressClicked");
        kotlin.jvm.internal.u.j(onValueInputTextChange, "onValueInputTextChange");
        kotlin.jvm.internal.u.j(onLocationSelected, "onLocationSelected");
        androidx.compose.runtime.b g11 = aVar.g(1317857371);
        ok.a o11 = ah.u.o(g11);
        List<a0.a> list = locationListResult;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list, 10));
        for (a0.a aVar2 : list) {
            arrayList.add(new com.withings.common.compose.component.e0(aVar2.b(), null, locationListResult.indexOf(aVar2), null, null, 26));
        }
        y7.b(ah.k.m(e1.d(androidx.compose.ui.e.f8927a)), s1.b.b(g11, 631472663, new i(onBackBottomSheetClicked)), s1.b.b(g11, 394854838, new j(onSaveNewAddressClicked)), null, null, 0, 0L, 0L, null, s1.b.b(g11, -1208569556, new k(inputLocation, onCurrentLocationClicked, onValueInputTextChange, locationListResult, o11, arrayList, i11, onLocationSelected)), g11, 805306800, 504);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new l(inputLocation, locationListResult, i11, onCurrentLocationClicked, onBackBottomSheetClicked, onSaveNewAddressClicked, onValueInputTextChange, onLocationSelected, i12));
        }
    }

    public static final void c(ym0.a<nm0.y> onCurrentLocationClicked, a0 viewModel, ym0.a<nm0.y> onBackBottomSheetClicked, ym0.a<nm0.y> onSaveNewAddressClicked, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(onCurrentLocationClicked, "onCurrentLocationClicked");
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onBackBottomSheetClicked, "onBackBottomSheetClicked");
        kotlin.jvm.internal.u.j(onSaveNewAddressClicked, "onSaveNewAddressClicked");
        androidx.compose.runtime.b g11 = aVar.g(-1258341394);
        b((String) androidx.compose.runtime.l0.b(viewModel.t0(), g11).getValue(), (List) androidx.compose.runtime.l0.b(viewModel.A0(), g11).getValue(), ((Number) androidx.compose.runtime.l0.b(viewModel.z0(), g11).getValue()).intValue(), onCurrentLocationClicked, onBackBottomSheetClicked, new e(viewModel, onSaveNewAddressClicked), new f(viewModel), new g(viewModel), g11, ((i11 << 9) & 7168) | 64 | ((i11 << 6) & 57344));
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(onCurrentLocationClicked, viewModel, onBackBottomSheetClicked, onSaveNewAddressClicked, i11));
        }
    }

    public static final void d(int i11, androidx.compose.runtime.a aVar, String currentLocation, ym0.a onClickLocalize, ym0.a onBackClicked, ym0.a onDoneClicked) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        kotlin.jvm.internal.u.j(onClickLocalize, "onClickLocalize");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        kotlin.jvm.internal.u.j(onDoneClicked, "onDoneClicked");
        kotlin.jvm.internal.u.j(currentLocation, "currentLocation");
        androidx.compose.runtime.b g11 = aVar.g(1276798963);
        if ((i11 & 14) == 0) {
            if (g11.w(onClickLocalize)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onDoneClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 7168) == 0) {
            if (g11.K(currentLocation)) {
                i13 = ModuleCopy.f28574b;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170 && g11.h()) {
            g11.C();
        } else {
            t0.c(ay.b.u(C1987R.string.weatherAirQuality_tutorial_title, g11), s2.d.a(2131232884, g11), onBackClicked, s1.b.b(g11, 484463434, new w(onDoneClicked)), null, yk.h.a(), null, s1.b.b(g11, 287557686, new y(currentLocation, onClickLocalize)), g11, ((i12 << 3) & ConstantsWs.HWFAILURE_ZERO) | 12586048, 80);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new z(onClickLocalize, onBackClicked, onDoneClicked, currentLocation, i11));
        }
    }

    public static final void e(a0 viewModel, ym0.a<nm0.y> onClickLocalize, ym0.a<nm0.y> onBackClicked, androidx.compose.runtime.a aVar, int i11) {
        kotlin.jvm.internal.u.j(viewModel, "viewModel");
        kotlin.jvm.internal.u.j(onClickLocalize, "onClickLocalize");
        kotlin.jvm.internal.u.j(onBackClicked, "onBackClicked");
        androidx.compose.runtime.b g11 = aVar.g(-847659347);
        r0 b10 = androidx.compose.runtime.l0.b(viewModel.q0(), g11);
        m mVar = new m(viewModel);
        String b11 = ((a0.a) b10.getValue()).b();
        int i12 = i11 >> 3;
        d((i12 & 14) | (i12 & 112), g11, b11, onClickLocalize, onBackClicked, mVar);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new n(viewModel, onClickLocalize, onBackClicked, i11));
        }
    }
}
