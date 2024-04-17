package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendSmsCode$1$1", f = "EcgActivationViewModel.kt", l = {624}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class z4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f52148a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f52149b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o4 f52150c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Long f52151d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f52152e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ h5 f52153f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendSmsCode$1$1$2$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f52154a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h5 f52155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o4 o4Var, h5 h5Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f52154a = o4Var;
            this.f52155b = h5Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f52154a, this.f52155b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f52154a.R1(this.f52155b);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendSmsCode$1$1$3$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f52156a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f52157b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o4 o4Var, Throwable th2, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f52156a = o4Var;
            this.f52157b = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f52156a, this.f52157b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g5 g5Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            o4 o4Var = this.f52156a;
            ParcelableSnapshotMutableState A1 = o4Var.A1();
            g5 g5Var2 = (g5) o4Var.A1().getValue();
            if (g5Var2 != null) {
                g5Var = g5.a(g5Var2, false);
            } else {
                g5Var = null;
            }
            A1.setValue(g5Var);
            if (!(this.f52157b instanceof UnauthorizedException)) {
                o4Var.b2(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            } else {
                o4Var.L1().setValue(new Integer((int) C1987R.string.hwa09_usOnboarding_error_confirmationCode_message));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(o4 o4Var, Long l5, String str, h5 h5Var, qm0.d<? super z4> dVar) {
        super(2, dVar);
        this.f52150c = o4Var;
        this.f52151d = l5;
        this.f52152e = str;
        this.f52153f = h5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        z4 z4Var = new z4(this.f52150c, this.f52151d, this.f52152e, this.f52153f, dVar);
        z4Var.f52149b = obj;
        return z4Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((z4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f52148a
            com.withings.wiscale2.device.common.feature.ecg.o4 r2 = r12.f52150c
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r12.f52149b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
            goto L48
        L13:
            r13 = move-exception
            goto L4f
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            nm0.l.b(r13)
            java.lang.Object r13 = r12.f52149b
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.lang.Long r1 = r12.f52151d
            java.lang.String r9 = r12.f52152e
            com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.o4.m0(r2)     // Catch: java.lang.Throwable -> L4b
            kotlin.jvm.internal.u.g(r1)     // Catch: java.lang.Throwable -> L4b
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L4b
            com.withings.device.Device r1 = com.withings.wiscale2.device.common.feature.ecg.o4.j0(r2)     // Catch: java.lang.Throwable -> L4b
            long r7 = r1.getId()     // Catch: java.lang.Throwable -> L4b
            r12.f52149b = r13     // Catch: java.lang.Throwable -> L4b
            r12.f52148a = r3     // Catch: java.lang.Throwable -> L4b
            r10 = r12
            java.lang.Object r1 = r4.checkCode(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L4b
            if (r1 != r0) goto L47
            return r0
        L47:
            r0 = r13
        L48:
            nm0.y r13 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
            goto L53
        L4b:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L4f:
            nm0.k$a r13 = nm0.l.a(r13)
        L53:
            boolean r1 = r13 instanceof nm0.k.a
            r1 = r1 ^ r3
            r3 = 0
            if (r1 == 0) goto L71
            r1 = r13
            nm0.y r1 = (nm0.y) r1
            com.withings.wiscale2.device.common.feature.ecg.o4.f0(r2)
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.z4$a r7 = new com.withings.wiscale2.device.common.feature.ecg.z4$a
            com.withings.wiscale2.device.common.feature.ecg.h5 r1 = r12.f52153f
            r7.<init>(r2, r1, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L71:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto L87
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.z4$b r7 = new com.withings.wiscale2.device.common.feature.ecg.z4$b
            r7.<init>(r2, r13, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L87:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.z4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
