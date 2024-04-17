package com.withings.wiscale2.device.common.feature.ecg;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendStateCode$1", f = "WBS08EcgActivationViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGSESSIONDURATION}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class qb extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51677a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51678b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationViewModel f51679c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f51680d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendStateCode$1$2$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f51682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, String str, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51681a = wBS08EcgActivationViewModel;
            this.f51682b = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51681a, this.f51682b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            rq.b bVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51681a;
            wBS08EcgActivationViewModel.Z0().setValue(Boolean.FALSE);
            if (!(wBS08EcgActivationViewModel.a1().getValue() instanceof r5)) {
                WBS08EcgActivationViewModel.q1(wBS08EcgActivationViewModel, 0, 0, 7);
                return nm0.y.f85009a;
            }
            ParcelableSnapshotMutableState G0 = wBS08EcgActivationViewModel.G0();
            rq.b bVar2 = (rq.b) wBS08EcgActivationViewModel.G0().getValue();
            if (bVar2 != null) {
                bVar = rq.b.a(bVar2, this.f51682b);
            } else {
                bVar = null;
            }
            G0.setValue(bVar);
            wBS08EcgActivationViewModel.k1();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendStateCode$1$3$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51683a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f51683a = wBS08EcgActivationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f51683a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51683a;
            wBS08EcgActivationViewModel.Z0().setValue(Boolean.FALSE);
            wBS08EcgActivationViewModel.o1(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, String str, qm0.d<? super qb> dVar) {
        super(2, dVar);
        this.f51679c = wBS08EcgActivationViewModel;
        this.f51680d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        qb qbVar = new qb(this.f51679c, this.f51680d, dVar);
        qbVar.f51678b = obj;
        return qbVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((qb) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f51677a
            com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel r2 = r12.f51679c
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r12.f51678b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
            goto L44
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
            java.lang.Object r13 = r12.f51678b
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.lang.String r9 = r12.f51680d
            com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel.f0(r2)     // Catch: java.lang.Throwable -> L4b
            long r5 = r2.g1()     // Catch: java.lang.Throwable -> L4b
            com.withings.device.Device r1 = r2.B0()     // Catch: java.lang.Throwable -> L4b
            long r7 = r1.getId()     // Catch: java.lang.Throwable -> L4b
            r12.f51678b = r13     // Catch: java.lang.Throwable -> L4b
            r12.f51677a = r3     // Catch: java.lang.Throwable -> L4b
            r10 = r12
            java.lang.Object r1 = r4.store(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L4b
            if (r1 != r0) goto L42
            return r0
        L42:
            r0 = r13
            r13 = r1
        L44:
            com.withings.ecg.webservices.StoreEcgReviewResponse r13 = (com.withings.ecg.webservices.StoreEcgReviewResponse) r13     // Catch: java.lang.Throwable -> L13
            com.withings.ecg.webservices.StoreEcgReviewResponseDetails r13 = r13.getEcgReviewResponse()     // Catch: java.lang.Throwable -> L13
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
            if (r1 == 0) goto L6e
            r1 = r13
            com.withings.ecg.webservices.StoreEcgReviewResponseDetails r1 = (com.withings.ecg.webservices.StoreEcgReviewResponseDetails) r1
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.qb$a r7 = new com.withings.wiscale2.device.common.feature.ecg.qb$a
            java.lang.String r1 = r12.f51680d
            r7.<init>(r2, r1, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L6e:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto L84
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.qb$b r7 = new com.withings.wiscale2.device.common.feature.ecg.qb$b
            r7.<init>(r2, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L84:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.qb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
