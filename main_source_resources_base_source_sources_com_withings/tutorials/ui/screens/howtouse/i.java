package com.withings.tutorials.ui.screens.howtouse;

import androidx.compose.runtime.a;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HowToUse.kt */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f45435a = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUse.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.tutorials.ui.screens.howtouse.HowToUse$Screen$1$1", f = "HowToUse.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ nm0.y f45436a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45437b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nm0.y yVar, int i11, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f45436a = yVar;
            this.f45437b = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f45436a, this.f45437b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            if (this.f45436a == null) {
                x70.b.p(new IllegalStateException("Screens not implemented for Feature Tag (57) with device model ID " + this.f45437b));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HowToUse.kt */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Long f45439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f45440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45441d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f45442e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ r8.n f45443f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45444g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f45445h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f45446i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Long l5, long j5, int i11, String str, r8.n nVar, ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i12) {
            super(2);
            this.f45439b = l5;
            this.f45440c = j5;
            this.f45441d = i11;
            this.f45442e = str;
            this.f45443f = nVar;
            this.f45444g = aVar;
            this.f45445h = aVar2;
            this.f45446i = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f45446i | 1);
            ym0.a<nm0.y> aVar2 = this.f45444g;
            ym0.a<nm0.y> aVar3 = this.f45445h;
            i.this.a(this.f45439b, this.f45440c, this.f45441d, this.f45442e, this.f45443f, aVar2, aVar3, aVar, g11);
            return nm0.y.f85009a;
        }
    }

    public final void a(Long l5, long j5, int i11, String str, r8.n navController, ym0.a<nm0.y> onBack, ym0.a<nm0.y> onDone, androidx.compose.runtime.a aVar, int i12) {
        nm0.y yVar;
        boolean z5;
        kotlin.jvm.internal.u.j(navController, "navController");
        kotlin.jvm.internal.u.j(onBack, "onBack");
        kotlin.jvm.internal.u.j(onDone, "onDone");
        androidx.compose.runtime.b g11 = aVar.g(458849457);
        if (i11 != 10) {
            switch (i11) {
                case 15:
                case 18:
                    g11.s(2087174538);
                    int i13 = i12 >> 9;
                    a0.f45366a.b(str, navController, onBack, onDone, g11, (i13 & 14) | 24640 | (i13 & ConstantsWs.HWFAILURE_ZERO) | (i13 & 7168));
                    g11.J();
                    yVar = nm0.y.f85009a;
                    break;
                case 16:
                    g11.s(2087174653);
                    int i14 = i12 >> 9;
                    d0.f45391a.b(str, navController, onBack, onDone, g11, (i14 & 14) | 24640 | (i14 & ConstantsWs.HWFAILURE_ZERO) | (i14 & 7168));
                    g11.J();
                    yVar = nm0.y.f85009a;
                    break;
                case 17:
                    g11.s(2087174768);
                    int i15 = i12 >> 9;
                    g0.f45416a.b(str, navController, onBack, onDone, g11, (i15 & 14) | 24640 | (i15 & ConstantsWs.HWFAILURE_ZERO) | (i15 & 7168));
                    g11.J();
                    yVar = nm0.y.f85009a;
                    break;
                default:
                    g11.s(277910570);
                    g11.J();
                    yVar = null;
                    break;
            }
        } else {
            g11.s(2087174356);
            int i16 = i12 >> 3;
            w.f45488a.e(l5, j5, str, navController, onBack, onDone, g11, 1576960 | (i12 & 14) | (i12 & 112) | (i16 & ConstantsWs.HWFAILURE_ZERO) | (57344 & i16) | (i16 & 458752));
            g11.J();
            yVar = nm0.y.f85009a;
        }
        g11.s(2087174886);
        boolean K = g11.K(yVar);
        if ((((i12 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.c(i11)) || (i12 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = K | z5;
        Object t11 = g11.t();
        if (z11 || t11 == a.C0060a.a()) {
            t11 = new a(yVar, i11, null);
            g11.n(t11);
        }
        g11.J();
        k1.y.f(yVar, (ym0.p) t11, g11);
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new b(l5, j5, i11, str, navController, onBack, onDone, i12));
        }
    }
}
