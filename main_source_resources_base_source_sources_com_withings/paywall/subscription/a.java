package com.withings.paywall.subscription;

import ah.o;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.camera.camera2.internal.p2;
import androidx.compose.foundation.layout.c1;
import androidx.compose.foundation.layout.e;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.h6;
import androidx.compose.material.r3;
import androidx.compose.material.v;
import androidx.compose.material3.g9;
import androidx.compose.material3.ga;
import androidx.compose.material3.o7;
import androidx.compose.material3.y7;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.platform.u0;
import androidx.lifecycle.h1;
import com.google.protobuf.t;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.paywall.b0;
import com.withings.paywall.s;
import com.withings.paywall.subscription.f;
import com.withings.wiscale2.C1987R;
import dq.x;
import java.util.Iterator;
import java.util.List;
import k1.j1;
import k1.v0;
import kotlin.collections.s0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import l0.q;
import l0.r;
import n0.y0;
import n0.z;
import nk.g0;
import nm0.y;
import r0.d0;
import x1.b;
import x1.d;
import ym0.p;
/* compiled from: SubscriptionScreen.kt */
/* loaded from: classes4.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* renamed from: com.withings.paywall.subscription.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0592a extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43643a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0592a(int i11) {
            super(2);
            this.f43643a = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            a.a(aVar, o.g(this.f43643a | 1));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class b extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43644a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g2.c f43645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.text.b f43646c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43647d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43648e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(androidx.compose.ui.e eVar, g2.c cVar, androidx.compose.ui.text.b bVar, int i11, int i12) {
            super(2);
            this.f43644a = eVar;
            this.f43645b = cVar;
            this.f43646c = bVar;
            this.f43647d = i11;
            this.f43648e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43647d | 1);
            g2.c cVar = this.f43645b;
            androidx.compose.ui.text.b bVar = this.f43646c;
            a.b(this.f43644a, cVar, bVar, aVar, g11, this.f43648e);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class c extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f43649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11) {
            super(2);
            this.f43649a = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            a.d(aVar, o.g(this.f43649a | 1));
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class d extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f43650a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f43651b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f43652c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f43650a = eVar;
            this.f43651b = i11;
            this.f43652c = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43651b | 1);
            int i11 = this.f43652c;
            a.e(this.f43650a, aVar, g11, i11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionScreenKt$SubscriptionScreen$1", f = "SubscriptionScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {
        e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new kotlin.coroutines.jvm.internal.i(2, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            s.c();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public /* synthetic */ class f extends kotlin.jvm.internal.s implements ym0.l<String, y> {
        f(SubscriptionViewModel subscriptionViewModel) {
            super(1, subscriptionViewModel, SubscriptionViewModel.class, "onSelectionChange", "onSelectionChange(Ljava/lang/String;)V", 0);
        }

        @Override // ym0.l
        public final /* bridge */ /* synthetic */ y invoke(String str) {
            m(str);
            return y.f85009a;
        }

        public final void m(String p02) {
            u.j(p02, "p0");
            SubscriptionViewModel subscriptionViewModel = (SubscriptionViewModel) this.receiver;
            subscriptionViewModel.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(subscriptionViewModel), null, null, new com.withings.paywall.subscription.g(subscriptionViewModel, p02, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class g extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.c f43653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SubscriptionViewModel f43654b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Activity f43655c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(f.c cVar, SubscriptionViewModel subscriptionViewModel, Activity activity) {
            super(0);
            this.f43653a = cVar;
            this.f43654b = subscriptionViewModel;
            this.f43655c = activity;
        }

        @Override // ym0.a
        public final y invoke() {
            Object obj;
            String str;
            f.c cVar = this.f43653a;
            Iterator<T> it = cVar.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (u.e(((b0) obj).getId(), cVar.b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj instanceof b0.a) {
                str = "yearly";
            } else {
                str = "monthly";
            }
            v70.a.e("paywall_flow", "paywall_flow", s0.j(new nm0.j("flow_step_name", "choose_renewal_duration"), new nm0.j("renewal_duration", str)), false, 8);
            SubscriptionViewModel subscriptionViewModel = this.f43654b;
            subscriptionViewModel.getClass();
            Activity activity = this.f43655c;
            u.j(activity, "activity");
            BuildersKt__Builders_commonKt.launch$default(h1.a(subscriptionViewModel), null, null, new com.withings.paywall.subscription.h(subscriptionViewModel, activity, null), 3, null);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.paywall.subscription.SubscriptionScreenKt$SubscriptionScreen$4$1", f = "SubscriptionScreen.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(ym0.a<y> aVar, qm0.d<? super h> dVar) {
            super(2, dVar);
            this.f43656a = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new h(this.f43656a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((h) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f43656a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SubscriptionViewModel f43657a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43658b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<Boolean, y> f43659c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f43660d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f43661e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(SubscriptionViewModel subscriptionViewModel, ym0.a<y> aVar, ym0.l<? super Boolean, y> lVar, int i11, int i12) {
            super(2);
            this.f43657a = subscriptionViewModel;
            this.f43658b = aVar;
            this.f43659c = lVar;
            this.f43660d = i11;
            this.f43661e = i12;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43660d | 1);
            ym0.a<y> aVar2 = this.f43658b;
            ym0.l<Boolean, y> lVar = this.f43659c;
            a.f(this.f43657a, aVar2, lVar, aVar, g11, this.f43661e);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class j extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43662a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(ym0.a<y> aVar) {
            super(2);
            this.f43662a = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                String u11 = ay.b.u(C1987R.string.purchase_paywall_title, aVar2);
                float c11 = ok.b.c();
                ok.b.b(null, u11, null, null, null, 0L, 0L, 0L, s1.b.b(aVar2, 1814763002, new com.withings.paywall.subscription.c(this.f43662a)), null, null, null, ah.u.o(aVar2), false, 0.0f, c11, aVar2, 100663296, 512, 28413);
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class k extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f43663a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Intent f43664b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43665c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(Context context, Intent intent, ym0.a<y> aVar) {
            super(2);
            this.f43663a = context;
            this.f43664b = intent;
            this.f43665c = aVar;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                aVar2.s(-483455358);
                e.a aVar3 = androidx.compose.ui.e.f8927a;
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
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
                    p c12 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    androidx.compose.ui.e b10 = androidx.compose.foundation.h.b(x0.h(e1.e(aVar3, 1.0f), 0.0f, yk.h.d(), 1), false, new com.withings.paywall.subscription.d(this.f43663a, this.f43664b), 7);
                    String u11 = ay.b.u(C1987R.string.purchase_paywall_subscription_terms_title, aVar2);
                    aVar2.J();
                    nk.u.c(0, 0, 0, 44, 0L, aVar2, b10, g0.a(((yk.w) p2.b(aVar2, 615317871)).i().h(), u11), d3.g.a(3));
                    wk.i.a(null, false, s1.b.b(aVar2, -793091837, new com.withings.paywall.subscription.e(this.f43665c)), null, aVar2, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 11);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class l extends w implements ym0.q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<b0> f43666a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43667b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f43668c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(List<? extends b0> list, String str, ym0.l<? super String, y> lVar) {
            super(3);
            this.f43666a = list;
            this.f43667b = str;
            this.f43668c = lVar;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            int i11;
            r0.w paddingValues = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(paddingValues, "paddingValues");
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
                androidx.compose.ui.e c11 = y0.c(e1.d(x0.e(aVar3, paddingValues)), y0.b(aVar2), false, 14);
                aVar2.s(-483455358);
                l0 a11 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a12 = g.a.a();
                s1.a c12 = androidx.compose.ui.layout.y.c(c11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a12);
                    } else {
                        aVar2.m();
                    }
                    p c13 = t.c(aVar2, a11, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        q.a(G, aVar2, G, c13);
                    }
                    c12.invoke(j1.a(aVar2), aVar2, 0);
                    aVar2.s(2058660585);
                    a.e(x0.g(aVar3, yk.h.d(), yk.h.r()), aVar2, 0, 0);
                    a.c(64, 0, aVar2, x0.g(aVar3, yk.h.d(), yk.h.r()), this.f43667b, this.f43666a, this.f43668c);
                    defpackage.d.j(aVar2);
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SubscriptionScreen.kt */
    /* loaded from: classes4.dex */
    public static final class m extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<b0> f43669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f43670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.l<String, y> f43671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43672d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f43673e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f43674f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(List<? extends b0> list, String str, ym0.l<? super String, y> lVar, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f43669a = list;
            this.f43670b = str;
            this.f43671c = lVar;
            this.f43672d = aVar;
            this.f43673e = aVar2;
            this.f43674f = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f43674f | 1);
            ym0.a<y> aVar2 = this.f43672d;
            ym0.a<y> aVar3 = this.f43673e;
            a.g(this.f43669a, this.f43670b, this.f43671c, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(1237088814);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            l0 a11 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                ga.b("** Error : Check your internet connection or if you're logged in play store**", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, g11, 6, 0, 131070);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new C0592a(i11));
        }
    }

    public static final void b(androidx.compose.ui.e eVar, g2.c imagePainter, androidx.compose.ui.text.b text, androidx.compose.runtime.a aVar, int i11, int i12) {
        e.a aVar2;
        u.j(imagePainter, "imagePainter");
        u.j(text, "text");
        androidx.compose.runtime.b g11 = aVar.g(1357986183);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        d.b i13 = b.a.i();
        g11.s(693286680);
        e.a aVar3 = androidx.compose.ui.e.f8927a;
        l0 a11 = c1.a(androidx.compose.foundation.layout.e.g(), i13, g11);
        g11.s(-1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a12 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar3);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a12);
            } else {
                g11.m();
            }
            p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            z.a(imagePainter, null, null, null, null, 0.0f, null, g11, 56, 124);
            d0.a(e1.r(aVar2, yk.h.b()), g11);
            nk.a.e(0, (i11 >> 3) & 112, 29, 0L, g11, null, text, null);
            androidx.compose.runtime.v b11 = h6.b(g11);
            if (b11 != null) {
                b11.G(new b(aVar2, imagePainter, text, i11, i12));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void c(int i11, int i12, androidx.compose.runtime.a aVar, androidx.compose.ui.e eVar, String str, List subscriptionPlans, ym0.l onSelectionChange) {
        e.a aVar2;
        u.j(subscriptionPlans, "subscriptionPlans");
        u.j(onSelectionChange, "onSelectionChange");
        androidx.compose.runtime.b g11 = aVar.g(-2024359743);
        if ((i12 & 1) != 0) {
            aVar2 = androidx.compose.ui.e.f8927a;
        } else {
            aVar2 = eVar;
        }
        g11.s(-483455358);
        l0 b10 = android.support.v4.media.session.c.b(androidx.compose.foundation.layout.e.h(), g11, -1323940314);
        int G = g11.G();
        v0 l5 = g11.l();
        androidx.compose.ui.node.g.D.getClass();
        ym0.a a11 = g.a.a();
        s1.a c11 = androidx.compose.ui.layout.y.c(aVar2);
        if (g11.i() instanceof k1.d) {
            g11.A();
            if (g11.e()) {
                g11.F(a11);
            } else {
                g11.m();
            }
            p b11 = com.withings.authentication.e.b(g11, b10, g11, l5);
            if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                androidx.camera.camera2.internal.l0.d(G, g11, G, b11);
            }
            x.b(0, c11, j1.a(g11), g11, 2058660585);
            nk.a.d(null, ay.b.u(C1987R.string.purchase_paywall_subscription_title, g11), 0L, null, 0, 0, null, g11, 0, 125);
            d0.a(e1.n(androidx.compose.ui.e.f8927a, yk.h.c()), g11);
            f20.d.a((i11 & ConstantsWs.HWFAILURE_ZERO) | 64 | (i11 & 7168), 1, g11, null, str, subscriptionPlans, onSelectionChange);
            androidx.compose.runtime.v b12 = h6.b(g11);
            if (b12 != null) {
                b12.G(new com.withings.paywall.subscription.b(i11, i12, aVar2, str, subscriptionPlans, onSelectionChange));
                return;
            }
            return;
        }
        a3.g.s();
        throw null;
    }

    public static final void d(androidx.compose.runtime.a aVar, int i11) {
        androidx.compose.runtime.b g11 = aVar.g(-78623750);
        if (i11 == 0 && g11.h()) {
            g11.C();
        } else {
            androidx.compose.ui.e d11 = e1.d(androidx.compose.ui.e.f8927a);
            l0 a11 = r3.a(g11, 733328855, false, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(d11);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                o7.a(0.0f, 0, 0, 31, 0L, 0L, g11, null);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(i11));
        }
    }

    public static final void e(androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        androidx.compose.runtime.b g11 = aVar.g(805704522);
        int i15 = i12 & 1;
        if (i15 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(eVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i13 & 11) == 2 && g11.h()) {
            g11.C();
        } else {
            if (i15 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            int i16 = androidx.compose.foundation.layout.e.f4229i;
            e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.r());
            g11.s(-483455358);
            l0 a11 = com.withings.authentication.e.a(o11, g11, -1323940314);
            int G = g11.G();
            v0 l5 = g11.l();
            androidx.compose.ui.node.g.D.getClass();
            ym0.a a12 = g.a.a();
            s1.a c11 = androidx.compose.ui.layout.y.c(eVar);
            if (g11.i() instanceof k1.d) {
                g11.A();
                if (g11.e()) {
                    g11.F(a12);
                } else {
                    g11.m();
                }
                p b10 = com.withings.authentication.e.b(g11, a11, g11, l5);
                if (g11.e() || !u.e(g11.t(), Integer.valueOf(G))) {
                    androidx.camera.camera2.internal.l0.d(G, g11, G, b10);
                }
                x.b(0, c11, j1.a(g11), g11, 2058660585);
                b(null, s2.d.a(C1987R.drawable.ic_conversion_his, g11), new androidx.compose.ui.text.b(ay.b.u(C1987R.string.purchase_paywall_item1, g11), null, 6), g11, 64, 1);
                b(null, s2.d.a(C1987R.drawable.ic_conversion_missions, g11), new androidx.compose.ui.text.b(ay.b.u(C1987R.string.purchase_paywall_item2, g11), null, 6), g11, 64, 1);
                b(null, s2.d.a(C1987R.drawable.ic_conversion_insights, g11), new androidx.compose.ui.text.b(ay.b.u(C1987R.string.purchase_paywall_item3, g11), null, 6), g11, 64, 1);
                g9.a(g11);
            } else {
                a3.g.s();
                throw null;
            }
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new d(eVar, i11, i12));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Type inference failed for: r1v6, types: [ym0.p, kotlin.coroutines.jvm.internal.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(com.withings.paywall.subscription.SubscriptionViewModel r10, ym0.a<nm0.y> r11, ym0.l<? super java.lang.Boolean, nm0.y> r12, androidx.compose.runtime.a r13, int r14, int r15) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.paywall.subscription.a.f(com.withings.paywall.subscription.SubscriptionViewModel, ym0.a, ym0.l, androidx.compose.runtime.a, int, int):void");
    }

    public static final void g(List<? extends b0> subscriptionPlans, String selectedPlan, ym0.l<? super String, y> onSelectionChange, ym0.a<y> navigateUp, ym0.a<y> onSubscribeClicked, androidx.compose.runtime.a aVar, int i11) {
        u.j(subscriptionPlans, "subscriptionPlans");
        u.j(selectedPlan, "selectedPlan");
        u.j(onSelectionChange, "onSelectionChange");
        u.j(navigateUp, "navigateUp");
        u.j(onSubscribeClicked, "onSubscribeClicked");
        androidx.compose.runtime.b g11 = aVar.g(269445023);
        Context context = (Context) g11.D(u0.d());
        y7.b(null, s1.b.b(g11, -1599115941, new j(navigateUp)), s1.b.b(g11, 86783994, new k(context, HMWebActivity.f35395c.b(context, null, C1987R.string._TERMS_AND_CONDITIONS_URL_), onSubscribeClicked)), null, null, 0, 0L, 0L, null, s1.b.b(g11, 279385456, new l(subscriptionPlans, selectedPlan, onSelectionChange)), g11, 805306800, 505);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new m(subscriptionPlans, selectedPlan, onSelectionChange, navigateUp, onSubscribeClicked, i11));
        }
    }
}
