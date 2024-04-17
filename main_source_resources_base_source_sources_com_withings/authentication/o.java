package com.withings.authentication;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import th.z;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthenticationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$DebugLoginWarningContent$1", f = "AuthenticationActivity.kt", l = {ConstantsWs.WS_STATUS_UNKNOWN_ACCOUNT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32235a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthenticationActivity f32236b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32237c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.material.m0 f32238d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ androidx.navigation.e f32239e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AuthenticationActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a<T> implements FlowCollector {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.a<nm0.y> f32240a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.material.m0 f32241b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.navigation.e f32242c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AuthenticationActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.AuthenticationActivity$DebugLoginWarningContent$1$1", f = "AuthenticationActivity.kt", l = {ConstantsWs.WS_STATUS_WRONGDEPLOYGRP}, m = "emit")
        /* renamed from: com.withings.authentication.o$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0430a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: a  reason: collision with root package name */
            Object f32243a;

            /* renamed from: b  reason: collision with root package name */
            /* synthetic */ Object f32244b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a<T> f32245c;

            /* renamed from: d  reason: collision with root package name */
            int f32246d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0430a(a<? super T> aVar, qm0.d<? super C0430a> dVar) {
                super(dVar);
                this.f32245c = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f32244b = obj;
                this.f32246d |= Integer.MIN_VALUE;
                return this.f32245c.emit(null, this);
            }
        }

        a(ym0.a<nm0.y> aVar, androidx.compose.material.m0 m0Var, androidx.navigation.e eVar) {
            this.f32240a = aVar;
            this.f32241b = m0Var;
            this.f32242c = eVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(th.z.a r5, qm0.d<? super nm0.y> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.withings.authentication.o.a.C0430a
                if (r0 == 0) goto L13
                r0 = r6
                com.withings.authentication.o$a$a r0 = (com.withings.authentication.o.a.C0430a) r0
                int r1 = r0.f32246d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f32246d = r1
                goto L18
            L13:
                com.withings.authentication.o$a$a r0 = new com.withings.authentication.o$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f32244b
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
                int r2 = r0.f32246d
                r3 = 1
                if (r2 == 0) goto L33
                if (r2 != r3) goto L2b
                java.lang.Object r5 = r0.f32243a
                com.withings.authentication.o$a r5 = (com.withings.authentication.o.a) r5
                nm0.l.b(r6)
                goto L5d
            L2b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L33:
                nm0.l.b(r6)
                boolean r6 = r5 instanceof th.z.a.c
                if (r6 == 0) goto L47
                java.lang.String r5 = "debugLoginWarningContent : short code sent !!"
                java.io.PrintStream r6 = java.lang.System.out
                r6.println(r5)
                ym0.a<nm0.y> r5 = r4.f32240a
                r5.invoke()
                goto L65
            L47:
                boolean r5 = r5 instanceof th.z.a.b
                if (r5 == 0) goto L65
                androidx.compose.material.m0 r5 = r4.f32241b
                androidx.compose.material.q0 r5 = r5.a()
                r0.f32243a = r4
                r0.f32246d = r3
                java.lang.Object r5 = r5.b(r0)
                if (r5 != r1) goto L5c
                return r1
            L5c:
                r5 = r4
            L5d:
                androidx.navigation.e r5 = r5.f32242c
                java.lang.String r6 = "onboarding"
                r0 = 0
                androidx.navigation.e.P(r5, r6, r0)
            L65:
                nm0.y r5 = nm0.y.f85009a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.o.a.emit(th.z$a, qm0.d):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(AuthenticationActivity authenticationActivity, ym0.a<nm0.y> aVar, androidx.compose.material.m0 m0Var, androidx.navigation.e eVar, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f32236b = authenticationActivity;
        this.f32237c = aVar;
        this.f32238d = m0Var;
        this.f32239e = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f32236b, this.f32237c, this.f32238d, this.f32239e, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        ((o) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        return CoroutineSingletons.f76214a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32235a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            MutableStateFlow<z.a> W0 = AuthenticationActivity.P3(this.f32236b).W0();
            a aVar = new a(this.f32237c, this.f32238d, this.f32239e);
            this.f32235a = 1;
            if (W0.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        throw new KotlinNothingValueException();
    }
}
