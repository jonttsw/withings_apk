package com.withings.common.compose.component;

import androidx.compose.runtime.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
/* compiled from: ToastHost.kt */
/* loaded from: classes3.dex */
public final class x4 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToastHost.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.ToastHostKt$ToastHost$1", f = "ToastHost.kt", l = {84}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f34921a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ w4 f34922b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k1.r0<Boolean> f34923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(w4 w4Var, k1.r0<Boolean> r0Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f34922b = w4Var;
            this.f34923c = r0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f34922b, this.f34923c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f34921a;
            k1.r0<Boolean> r0Var = this.f34923c;
            w4 w4Var = this.f34922b;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                if (w4Var != null) {
                    r0Var.setValue(Boolean.TRUE);
                    long a11 = w4Var.a();
                    this.f34921a = 1;
                    if (DelayKt.delay(a11, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return nm0.y.f85009a;
            }
            w4Var.dismiss();
            r0Var.setValue(Boolean.FALSE);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToastHost.kt */
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.q<l0.i, androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ w4 f34924a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(w4 w4Var) {
            super(3);
            this.f34924a = w4Var;
        }

        @Override // ym0.q
        public final nm0.y invoke(l0.i iVar, androidx.compose.runtime.a aVar, Integer num) {
            l0.i AnimatedVisibility = iVar;
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            kotlin.jvm.internal.u.j(AnimatedVisibility, "$this$AnimatedVisibility");
            w4 w4Var = this.f34924a;
            if (w4Var != null) {
                a5.f(w4Var, aVar2, 0);
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ToastHost.kt */
    /* loaded from: classes3.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z4 f34925a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.e f34926b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f34927c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f34928d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(z4 z4Var, androidx.compose.ui.e eVar, int i11, int i12) {
            super(2);
            this.f34925a = z4Var;
            this.f34926b = eVar;
            this.f34927c = i11;
            this.f34928d = i12;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            num.intValue();
            int g11 = ah.o.g(this.f34927c | 1);
            x4.a(this.f34925a, this.f34926b, aVar, g11, this.f34928d);
            return nm0.y.f85009a;
        }
    }

    public static final void a(z4 hostState, androidx.compose.ui.e eVar, androidx.compose.runtime.a aVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        kotlin.jvm.internal.u.j(hostState, "hostState");
        androidx.compose.runtime.b g11 = aVar.g(1267774901);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (g11.K(hostState)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (g11.K(eVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i13 & 91) == 18 && g11.h()) {
            g11.C();
        } else {
            if (i16 != 0) {
                eVar = androidx.compose.ui.e.f8927a;
            }
            w4 a11 = hostState.a();
            g11.s(-1539690394);
            Object t11 = g11.t();
            if (t11 == a.C0060a.a()) {
                t11 = androidx.compose.runtime.l0.f(Boolean.FALSE, androidx.compose.runtime.v0.f8878a);
                g11.n(t11);
            }
            k1.r0 r0Var = (k1.r0) t11;
            g11.J();
            k1.y.f(a11, new a(a11, r0Var, null), g11);
            l0.g.e(((Boolean) r0Var.getValue()).booleanValue(), eVar, androidx.compose.animation.p.h(null, 0.0f, 3), androidx.compose.animation.p.i(null, 3), null, s1.b.b(g11, 101939165, new b(a11)), g11, (i13 & 112) | 200064, 16);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new c(hostState, eVar, i11, i12));
        }
    }

    public static final z4 b(androidx.compose.runtime.a aVar) {
        Object a11 = androidx.camera.camera2.internal.q2.a(aVar, 1922143234, -1871489455);
        if (a11 == a.C0060a.a()) {
            a11 = new z4();
            aVar.n(a11);
        }
        z4 z4Var = (z4) a11;
        aVar.J();
        aVar.J();
        return z4Var;
    }
}
