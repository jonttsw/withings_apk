package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.common.exception.UnauthorizedException;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WBS08EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendSmsCode$1", f = "WBS08EcgActivationViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGBIRTHDATE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class pb extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51648a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51649b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationViewModel f51650c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f51651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendSmsCode$1$2$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51652a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51652a = wBS08EcgActivationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51652a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            androidx.navigation.e.L(this.f51652a.T0(), "EcgMeasurement", null, 6);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$sendSmsCode$1$3$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51653a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Throwable f51654b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, Throwable th2, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f51653a = wBS08EcgActivationViewModel;
            this.f51654b = th2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f51653a, this.f51654b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            WBS08EcgActivationViewModel wBS08EcgActivationViewModel = this.f51653a;
            wBS08EcgActivationViewModel.Z0().setValue(Boolean.FALSE);
            if (!(this.f51654b instanceof UnauthorizedException)) {
                wBS08EcgActivationViewModel.o1(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            } else {
                wBS08EcgActivationViewModel.d1().setValue(new Integer((int) C1987R.string.hwa09_usOnboarding_error_confirmationCode_message));
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, String str, qm0.d<? super pb> dVar) {
        super(2, dVar);
        this.f51650c = wBS08EcgActivationViewModel;
        this.f51651d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        pb pbVar = new pb(this.f51650c, this.f51651d, dVar);
        pbVar.f51649b = obj;
        return pbVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((pb) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
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
            int r1 = r12.f51648a
            com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel r2 = r12.f51650c
            r3 = 1
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r12.f51649b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L13
            goto L43
        L13:
            r13 = move-exception
            goto L4a
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            nm0.l.b(r13)
            java.lang.Object r13 = r12.f51649b
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.lang.String r9 = r12.f51651d
            com.withings.ecg.webservices.EcgReviewRemoteRepository r4 = com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel.f0(r2)     // Catch: java.lang.Throwable -> L46
            long r5 = r2.g1()     // Catch: java.lang.Throwable -> L46
            com.withings.device.Device r1 = r2.B0()     // Catch: java.lang.Throwable -> L46
            long r7 = r1.getId()     // Catch: java.lang.Throwable -> L46
            r12.f51649b = r13     // Catch: java.lang.Throwable -> L46
            r12.f51648a = r3     // Catch: java.lang.Throwable -> L46
            r10 = r12
            java.lang.Object r1 = r4.checkCode(r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L46
            if (r1 != r0) goto L42
            return r0
        L42:
            r0 = r13
        L43:
            nm0.y r13 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L13
            goto L4e
        L46:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L4a:
            nm0.k$a r13 = nm0.l.a(r13)
        L4e:
            boolean r1 = r13 instanceof nm0.k.a
            r1 = r1 ^ r3
            r3 = 0
            if (r1 == 0) goto L73
            r1 = r13
            nm0.y r1 = (nm0.y) r1
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = r2.Z0()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r1.setValue(r4)
            r2.t0()
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.pb$a r7 = new com.withings.wiscale2.device.common.feature.ecg.pb$a
            r7.<init>(r2, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L73:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto L89
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            com.withings.wiscale2.device.common.feature.ecg.pb$b r7 = new com.withings.wiscale2.device.common.feature.ecg.pb$b
            r7.<init>(r2, r13, r3)
            r9 = 0
            r6 = 0
            r8 = 2
            r4 = r0
            kotlinx.coroutines.BuildersKt.launch$default(r4, r5, r6, r7, r8, r9)
        L89:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.pb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
