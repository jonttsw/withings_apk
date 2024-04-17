package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.ecg.webservices.GetEcgReviewResponse;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$getEcgReviewStatusAndStates$1", f = "EcgActivationViewModel.kt", l = {489, 499, 500, 500}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class s4 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    o4 f51722a;

    /* renamed from: b  reason: collision with root package name */
    User f51723b;

    /* renamed from: c  reason: collision with root package name */
    GetEcgReviewResponse f51724c;

    /* renamed from: d  reason: collision with root package name */
    MutableSharedFlow f51725d;

    /* renamed from: e  reason: collision with root package name */
    int f51726e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f51727f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ o4 f51728g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$getEcgReviewStatusAndStates$1$2$2$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f51729a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(o4 o4Var, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51729a = o4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51729a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            o4.A0(this.f51729a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.EcgActivationViewModel$getEcgReviewStatusAndStates$1$2$3$1", f = "EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o4 f51730a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(o4 o4Var, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f51730a = o4Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f51730a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f51730a.b2(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(o4 o4Var, qm0.d<? super s4> dVar) {
        super(2, dVar);
        this.f51728g = o4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        s4 s4Var = new s4(this.f51728g, dVar);
        s4Var.f51727f = obj;
        return s4Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((s4) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x016d, code lost:
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x0021, B:49:0x010a, B:51:0x0114, B:53:0x0126, B:42:0x00eb, B:44:0x00f3, B:45:0x00f5, B:21:0x0059, B:39:0x00ce), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x0021, B:49:0x010a, B:51:0x0114, B:53:0x0126, B:42:0x00eb, B:44:0x00f3, B:45:0x00f5, B:21:0x0059, B:39:0x00ce), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0155  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.withings.wiscale2.device.common.feature.ecg.o4] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.s4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
