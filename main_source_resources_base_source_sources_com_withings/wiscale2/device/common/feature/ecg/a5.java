package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendStateCode$1$1", f = "EcgActivationViewModel.kt", l = {ConstantsWs.WS_STATUS_P4_ERROR_UNABLE_TO_RESIZE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a5 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51173a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51174b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ o4 f51175c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Long f51176d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ String f51177e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendStateCode$1$1$2$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f51178a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51179b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o4 o4Var, String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51178a = o4Var;
            this.f51179b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51178a, this.f51179b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            t5 t5Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            o4 o4Var = this.f51178a;
            ParcelableSnapshotMutableState G1 = o4Var.G1();
            T value = o4Var.G1().getValue();
            rq.b bVar = null;
            if (value instanceof r5) {
                t5Var = (r5) value;
            } else {
                t5Var = null;
            }
            if (t5Var == null) {
                t5Var = (t5) o4Var.G1().getValue();
                o4.c2(o4Var, 0, 0, 7);
            }
            G1.setValue(t5Var);
            ParcelableSnapshotMutableState i12 = o4Var.i1();
            rq.b bVar2 = (rq.b) o4Var.i1().getValue();
            if (bVar2 != null) {
                bVar = rq.b.a(bVar2, this.f51179b);
            }
            i12.setValue(bVar);
            o4Var.Q1();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$sendStateCode$1$1$3$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f51180a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o4 o4Var, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f51180a = o4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f51180a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f51180a.b2(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(o4 o4Var, Long l5, String str, qm0.d<? super a5> dVar) {
        super(2, dVar);
        this.f51175c = o4Var;
        this.f51176d = l5;
        this.f51177e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        a5 a5Var = new a5(this.f51175c, this.f51176d, this.f51177e, dVar);
        a5Var.f51174b = obj;
        return a5Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a5) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0079  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f51173a
            com.withings.wiscale2.device.common.feature.ecg.o4 r2 = r12.f51175c
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r12.f51174b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
            goto L49
        L13:
            r13 = move-exception
            goto L54
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            nm0.l.b(r13)
            java.lang.Object r13 = r12.f51174b
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.lang.Long r1 = r12.f51176d
            java.lang.String r9 = r12.f51177e
            com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.o4.m0(r2)     // Catch: java.lang.Throwable -> L50
            kotlin.jvm.internal.u.g(r1)     // Catch: java.lang.Throwable -> L50
            long r5 = r1.longValue()     // Catch: java.lang.Throwable -> L50
            com.withings.device.Device r1 = com.withings.wiscale2.device.common.feature.ecg.o4.j0(r2)     // Catch: java.lang.Throwable -> L50
            long r7 = r1.getId()     // Catch: java.lang.Throwable -> L50
            r12.f51174b = r13     // Catch: java.lang.Throwable -> L50
            r12.f51173a = r3     // Catch: java.lang.Throwable -> L50
            r10 = r12
            java.lang.Object r1 = r4.store(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L50
            if (r1 != r0) goto L47
            return r0
        L47:
            r0 = r13
            r13 = r1
        L49:
            com.withings.ecg.webservices.StoreEcgReviewResponse r13 = (com.withings.ecg.webservices.StoreEcgReviewResponse) r13     // Catch: java.lang.Throwable -> L13
            com.withings.ecg.webservices.StoreEcgReviewResponseDetails r13 = r13.getEcgReviewResponse()     // Catch: java.lang.Throwable -> L13
            goto L58
        L50:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L54:
            nm0.k$a r13 = nm0.l.a(r13)
        L58:
            boolean r1 = r13 instanceof nm0.k.a
            r1 = r1 ^ r3
            r3 = 0
            if (r1 == 0) goto L73
            r1 = r13
            com.withings.ecg.webservices.StoreEcgReviewResponseDetails r1 = (com.withings.ecg.webservices.StoreEcgReviewResponseDetails) r1
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.a5$a r7 = new com.withings.wiscale2.device.common.feature.ecg.a5$a
            java.lang.String r1 = r12.f51177e
            r7.<init>(r2, r1, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L73:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto L89
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.a5$b r7 = new com.withings.wiscale2.device.common.feature.ecg.a5$b
            r7.<init>(r2, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L89:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.a5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
