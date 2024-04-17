package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial;

import ah.o;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.x0;
import androidx.compose.material.t5;
import androidx.compose.material.v;
import androidx.compose.material3.i1;
import androidx.compose.runtime.a;
import androidx.compose.ui.e;
import androidx.compose.ui.layout.l0;
import androidx.compose.ui.node.g;
import com.google.protobuf.t;
import com.withings.common.compose.component.a3;
import com.withings.common.compose.component.c5;
import com.withings.common.compose.component.v4;
import com.withings.common.compose.component.videoplayer.ResizeMode;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionViewModel;
import d2.f0;
import k1.j1;
import k1.r0;
import k1.v0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import l0.r;
import nm0.y;
import ym0.l;
import ym0.p;
import ym0.q;
/* compiled from: FirstEcgVideoInstructionScreen.kt */
/* loaded from: classes5.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.FirstEcgVideoInstructionScreenKt$FirstEcgVideoInstructionScreen$1", f = "FirstEcgVideoInstructionScreen.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0701a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f51962a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ FirstEcgVideoInstructionViewModel f51963b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ l<Boolean, y> f51964c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: FirstEcgVideoInstructionScreen.kt */
        /* renamed from: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.tutorial.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0702a<T> implements FlowCollector {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l<Boolean, y> f51965a;

            /* JADX WARN: Multi-variable type inference failed */
            C0702a(l<? super Boolean, y> lVar) {
                this.f51965a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, qm0.d dVar) {
                this.f51965a.invoke(Boolean.valueOf(((FirstEcgVideoInstructionViewModel.a) obj).a()));
                return y.f85009a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0701a(FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel, l<? super Boolean, y> lVar, qm0.d<? super C0701a> dVar) {
            super(2, dVar);
            this.f51963b = firstEcgVideoInstructionViewModel;
            this.f51964c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new C0701a(this.f51963b, this.f51964c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            ((C0701a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
            return CoroutineSingletons.f76214a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f51962a;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                MutableSharedFlow<FirstEcgVideoInstructionViewModel.a> k02 = this.f51963b.k0();
                C0702a c0702a = new C0702a(this.f51964c);
                this.f51962a = 1;
                if (k02.collect(c0702a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51966a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(r0<Boolean> r0Var) {
            super(0);
            this.f51966a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f51966a.setValue(Boolean.TRUE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class c extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51967a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(r0<Boolean> r0Var) {
            super(0);
            this.f51967a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f51967a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class d extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ym0.a<y> aVar) {
            super(0);
            this.f51968a = aVar;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f51968a.invoke();
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class e extends w implements ym0.a<y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r0<Boolean> f51969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(r0<Boolean> r0Var) {
            super(0);
            this.f51969a = r0Var;
        }

        @Override // ym0.a
        public final y invoke() {
            this.f51969a.setValue(Boolean.FALSE);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class f extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ FirstEcgVideoInstructionViewModel f51970a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51971b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51972c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l<Boolean, y> f51973d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f51974e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(FirstEcgVideoInstructionViewModel firstEcgVideoInstructionViewModel, ym0.a<y> aVar, ym0.a<y> aVar2, l<? super Boolean, y> lVar, int i11) {
            super(2);
            this.f51970a = firstEcgVideoInstructionViewModel;
            this.f51971b = aVar;
            this.f51972c = aVar2;
            this.f51973d = lVar;
            this.f51974e = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51974e | 1);
            ym0.a<y> aVar2 = this.f51972c;
            l<Boolean, y> lVar = this.f51973d;
            a.a(this.f51970a, this.f51971b, aVar2, lVar, aVar, g11);
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class g extends w implements q<r0.w, androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51975a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51976b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51977c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ym0.a aVar, ym0.a aVar2, boolean z5) {
            super(3);
            this.f51975a = z5;
            this.f51976b = aVar;
            this.f51977c = aVar2;
        }

        @Override // ym0.q
        public final y invoke(r0.w wVar, androidx.compose.runtime.a aVar, Integer num) {
            long j5;
            int i11;
            r0.w innerPadding = wVar;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            u.j(innerPadding, "innerPadding");
            if ((intValue & 14) == 0) {
                if (aVar2.K(innerPadding)) {
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
                androidx.compose.ui.e d11 = e1.d(aVar3);
                l0 b10 = defpackage.c.b(aVar2, 733328855, false, aVar2, -1323940314);
                int G = aVar2.G();
                v0 l5 = aVar2.l();
                androidx.compose.ui.node.g.D.getClass();
                ym0.a a11 = g.a.a();
                s1.a c11 = androidx.compose.ui.layout.y.c(d11);
                if (aVar2.i() instanceof k1.d) {
                    aVar2.A();
                    if (aVar2.e()) {
                        aVar2.F(a11);
                    } else {
                        aVar2.m();
                    }
                    p c12 = t.c(aVar2, b10, aVar2, l5);
                    if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G))) {
                        l0.q.a(G, aVar2, G, c12);
                    }
                    r.c(0, c11, j1.a(aVar2), aVar2, 2058660585);
                    aVar2.s(-1810015135);
                    boolean z5 = this.f51975a;
                    boolean a12 = aVar2.a(z5);
                    Object t11 = aVar2.t();
                    if (a12 || t11 == a.C0060a.a()) {
                        t11 = Integer.valueOf((int) C1987R.string.hwa10_ecgExplanationTutorial_video_URL);
                        aVar2.n(t11);
                    }
                    int intValue2 = ((Number) t11).intValue();
                    aVar2.J();
                    aVar2.s(-1810014763);
                    boolean a13 = aVar2.a(z5);
                    Object t12 = aVar2.t();
                    if (a13 || t12 == a.C0060a.a()) {
                        t12 = Integer.valueOf((int) C1987R.drawable.hwa10_ecg_static);
                        aVar2.n(t12);
                    }
                    int intValue3 = ((Number) t12).intValue();
                    aVar2.J();
                    pk.a.a(e1.d(aVar3), ay.b.u(intValue2, aVar2), s2.d.a(intValue3, aVar2), ResizeMode.f34885b, aVar2, 3590, 0);
                    androidx.compose.ui.e e11 = x0.e(e1.d(aVar3), innerPadding);
                    aVar2.s(-483455358);
                    l0 a14 = v.a(androidx.compose.foundation.layout.e.h(), aVar2, -1323940314);
                    int G2 = aVar2.G();
                    v0 l6 = aVar2.l();
                    ym0.a a15 = g.a.a();
                    s1.a c13 = androidx.compose.ui.layout.y.c(e11);
                    if (aVar2.i() instanceof k1.d) {
                        aVar2.A();
                        if (aVar2.e()) {
                            aVar2.F(a15);
                        } else {
                            aVar2.m();
                        }
                        p c14 = t.c(aVar2, a14, aVar2, l6);
                        if (aVar2.e() || !u.e(aVar2.t(), Integer.valueOf(G2))) {
                            l0.q.a(G2, aVar2, G2, c14);
                        }
                        c13.invoke(j1.a(aVar2), aVar2, 0);
                        aVar2.s(2058660585);
                        j5 = f0.f63265i;
                        c5.a(j5, 0L, null, false, null, x.V(new a3.b(this.f51976b)), null, null, false, this.f51977c, aVar2, 6, 478);
                        v4.e(null, ay.b.u(C1987R.string.hwa09_ecgExplanationTutorial_video_title, aVar2), null, 0, 0, 0, aVar2, 0, 61);
                        androidx.compose.material3.d.b(aVar2);
                    } else {
                        a3.g.s();
                        throw null;
                    }
                } else {
                    a3.g.s();
                    throw null;
                }
            }
            return y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FirstEcgVideoInstructionScreen.kt */
    /* loaded from: classes5.dex */
    public static final class h extends w implements p<androidx.compose.runtime.a, Integer, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f51978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51979b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ym0.a<y> f51980c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f51981d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(boolean z5, ym0.a<y> aVar, ym0.a<y> aVar2, int i11) {
            super(2);
            this.f51978a = z5;
            this.f51979b = aVar;
            this.f51980c = aVar2;
            this.f51981d = i11;
        }

        @Override // ym0.p
        public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = o.g(this.f51981d | 1);
            ym0.a<y> aVar2 = this.f51979b;
            ym0.a<y> aVar3 = this.f51980c;
            a.b(this.f51978a, aVar2, aVar3, aVar, g11);
            return y.f85009a;
        }
    }

    public static final void a(FirstEcgVideoInstructionViewModel viewModel, ym0.a<y> navigateUp, ym0.a<y> exit, l<? super Boolean, y> next, androidx.compose.runtime.a aVar, int i11) {
        boolean z5;
        u.j(viewModel, "viewModel");
        u.j(navigateUp, "navigateUp");
        u.j(exit, "exit");
        u.j(next, "next");
        androidx.compose.runtime.b g11 = aVar.g(-966400990);
        g11.s(2099603550);
        Object t11 = g11.t();
        if (t11 == a.C0060a.a()) {
            t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
            g11.n(t11);
        }
        r0 r0Var = (r0) t11;
        g11.J();
        r0 a11 = androidx.compose.runtime.l0.a(viewModel.m0(), null, null, g11, 2);
        k1.y.f("ecgMeasurementSuccessEvent", new C0701a(viewModel, next, null), g11);
        Boolean bool = (Boolean) a11.getValue();
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            g11.s(915345873);
            Object t12 = g11.t();
            if (t12 == a.C0060a.a()) {
                t12 = new b(r0Var);
                g11.n(t12);
            }
            g11.J();
            b(booleanValue, navigateUp, (ym0.a) t12, g11, (i11 & 112) | ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED);
            g11.s(2099604079);
            if (((Boolean) r0Var.getValue()).booleanValue()) {
                g11.s(915346035);
                Object t13 = g11.t();
                if (t13 == a.C0060a.a()) {
                    t13 = new c(r0Var);
                    g11.n(t13);
                }
                ym0.a aVar2 = (ym0.a) t13;
                g11.J();
                String u11 = ay.b.u(C1987R.string.hwa09_usOnboarding_firstECG_title, g11);
                String u12 = ay.b.u(C1987R.string.hwa09_usOnboarding_firstECG_paragraph, g11);
                String u13 = ay.b.u(C1987R.string._PROGRAM_LEAVE_, g11);
                g11.s(915346384);
                if ((((i11 & ConstantsWs.HWFAILURE_ZERO) ^ ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) > 256 && g11.K(exit)) || (i11 & ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED) == 256) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object t14 = g11.t();
                if (z5 || t14 == a.C0060a.a()) {
                    t14 = new d(exit);
                    g11.n(t14);
                }
                ym0.a aVar3 = (ym0.a) t14;
                g11.J();
                String u14 = ay.b.u(C1987R.string._CANCEL_, g11);
                g11.s(915346534);
                Object t15 = g11.t();
                if (t15 == a.C0060a.a()) {
                    t15 = new e(r0Var);
                    g11.n(t15);
                }
                g11.J();
                wk.p.a(aVar2, u11, u12, u13, 0L, aVar3, u14, 0L, (ym0.a) t15, g11, 100663302, ConstantsWs.MEASURE_TYPE_HR_LEVEL_MAX);
            }
            g11.J();
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new f(viewModel, navigateUp, exit, next, i11));
        }
    }

    public static final void b(boolean z5, ym0.a<y> onBackClicked, ym0.a<y> onCancelClicked, androidx.compose.runtime.a aVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        u.j(onBackClicked, "onBackClicked");
        u.j(onCancelClicked, "onCancelClicked");
        androidx.compose.runtime.b g11 = aVar.g(429803615);
        if ((i11 & 14) == 0) {
            if (g11.a(z5)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (g11.w(onBackClicked)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & ConstantsWs.HWFAILURE_ZERO) == 0) {
            if (g11.w(onCancelClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && g11.h()) {
            g11.C();
        } else {
            t5.b(null, null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, ((i1) g11.D(androidx.compose.material3.j1.e())).a(), 0L, s1.b.b(g11, 1604383133, new g(onCancelClicked, onBackClicked, z5)), g11, 0, 12582912, 98303);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new h(z5, onBackClicked, onCancelClicked, i11));
        }
    }
}
