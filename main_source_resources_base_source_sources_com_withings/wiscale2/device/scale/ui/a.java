package com.withings.wiscale2.device.scale.ui;

import fl.o;
import gl.k0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: ScalePostInstallActivityV2.kt */
@e(c = "com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2$initFragment$1", f = "ScalePostInstallActivityV2.kt", l = {95, 98}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    boolean f54679a;

    /* renamed from: b  reason: collision with root package name */
    int f54680b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ScalePostInstallActivityV2 f54681c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ScalePostInstallActivityV2.kt */
    @e(c = "com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2$initFragment$1$shouldShowVascularAge$1", f = "ScalePostInstallActivityV2.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.withings.wiscale2.device.scale.ui.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0721a extends i implements p<CoroutineScope, qm0.d<? super Boolean>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScalePostInstallActivityV2 f54682a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0721a(ScalePostInstallActivityV2 scalePostInstallActivityV2, qm0.d<? super C0721a> dVar) {
            super(2, dVar);
            this.f54682a = scalePostInstallActivityV2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new C0721a(this.f54682a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super Boolean> dVar) {
            return ((C0721a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            k0 k0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            l.b(obj);
            ScalePostInstallActivityV2 scalePostInstallActivityV2 = this.f54682a;
            o g11 = ScalePostInstallActivityV2.B3(scalePostInstallActivityV2).g(ScalePostInstallActivityV2.A3(scalePostInstallActivityV2));
            if (g11 instanceof k0) {
                k0Var = (k0) g11;
            } else {
                k0Var = null;
            }
            boolean z5 = false;
            if (k0Var != null && k0Var.c(ScalePostInstallActivityV2.A3(scalePostInstallActivityV2).getFirmware())) {
                z5 = true;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ScalePostInstallActivityV2 scalePostInstallActivityV2, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f54681c = scalePostInstallActivityV2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f54681c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r6.f54680b
            r2 = 0
            r3 = 1
            r4 = 2
            com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2 r5 = r6.f54681c
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            boolean r0 = r6.f54679a
            nm0.l.b(r7)
            goto L51
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            nm0.l.b(r7)
            goto L36
        L21:
            nm0.l.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.device.scale.ui.a$a r1 = new com.withings.wiscale2.device.scale.ui.a$a
            r1.<init>(r5, r2)
            r6.f54680b = r3
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            l70.w r1 = l70.w.a.a()
            r6.f54679a = r7
            r6.f54680b = r4
            kotlinx.coroutines.flow.Flow r1 = r1.get()
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r6)
            if (r1 != r0) goto L4f
            return r0
        L4f:
            r0 = r7
            r7 = r1
        L51:
            l70.v r7 = (l70.v) r7
            int r7 = r7.e()
            android.util.SparseArray r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.z3(r5, r0, r7)
            com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.H3(r5, r7)
            boolean r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.D3(r5)
            java.lang.String r0 = "get(...)"
            java.lang.String r1 = "tutorialContentList"
            if (r7 == 0) goto Lb1
            int r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.C3(r5)
            r3 = 5
            if (r7 == r3) goto L94
            r3 = 6
            if (r7 == r3) goto L94
            r3 = 13
            if (r7 == r3) goto L94
            int r7 = com.withings.wiscale2.device.scale.ui.b.f54683k
            android.util.SparseArray r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.E3(r5)
            if (r7 == 0) goto L90
            r1 = 3
            java.lang.Object r7 = r7.get(r1)
            kotlin.jvm.internal.u.i(r7, r0)
            com.withings.wiscale2.device.scale.ui.b$c r7 = (com.withings.wiscale2.device.scale.ui.b.c) r7
            com.withings.wiscale2.device.scale.ui.b r7 = com.withings.wiscale2.device.scale.ui.b.C0722b.a(r7)
            com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.G3(r5, r7)
            goto Lca
        L90:
            kotlin.jvm.internal.u.s(r1)
            throw r2
        L94:
            int r7 = com.withings.wiscale2.device.scale.ui.b.f54683k
            android.util.SparseArray r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.E3(r5)
            if (r7 == 0) goto Lad
            java.lang.Object r7 = r7.get(r4)
            kotlin.jvm.internal.u.i(r7, r0)
            com.withings.wiscale2.device.scale.ui.b$c r7 = (com.withings.wiscale2.device.scale.ui.b.c) r7
            com.withings.wiscale2.device.scale.ui.b r7 = com.withings.wiscale2.device.scale.ui.b.C0722b.a(r7)
            com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.G3(r5, r7)
            goto Lca
        Lad:
            kotlin.jvm.internal.u.s(r1)
            throw r2
        Lb1:
            int r7 = com.withings.wiscale2.device.scale.ui.b.f54683k
            android.util.SparseArray r7 = com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.E3(r5)
            if (r7 == 0) goto Lcd
            r1 = 0
            java.lang.Object r7 = r7.get(r1)
            kotlin.jvm.internal.u.i(r7, r0)
            com.withings.wiscale2.device.scale.ui.b$c r7 = (com.withings.wiscale2.device.scale.ui.b.c) r7
            com.withings.wiscale2.device.scale.ui.b r7 = com.withings.wiscale2.device.scale.ui.b.C0722b.a(r7)
            com.withings.wiscale2.device.scale.ui.ScalePostInstallActivityV2.G3(r5, r7)
        Lca:
            nm0.y r7 = nm0.y.f85009a
            return r7
        Lcd:
            kotlin.jvm.internal.u.s(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.ui.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
