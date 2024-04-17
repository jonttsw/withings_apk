package com.withings.wiscale2.device.common.feature.ecg;

import com.withings.ecg.webservices.GetEcgReviewResponse;
import com.withings.user.core.models.User;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WBS08EcgActivationViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$getEcgReviewStatusAndStates$1", f = "WBS08EcgActivationViewModel.kt", l = {204, 213, 214, 215}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class ob extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    WBS08EcgActivationViewModel f51611a;

    /* renamed from: b  reason: collision with root package name */
    User f51612b;

    /* renamed from: c  reason: collision with root package name */
    GetEcgReviewResponse f51613c;

    /* renamed from: d  reason: collision with root package name */
    List f51614d;

    /* renamed from: e  reason: collision with root package name */
    int f51615e;

    /* renamed from: f  reason: collision with root package name */
    private /* synthetic */ Object f51616f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ WBS08EcgActivationViewModel f51617g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$getEcgReviewStatusAndStates$1$1$2$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51618a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f51618a = wBS08EcgActivationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f51618a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            WBS08EcgActivationViewModel.p0(this.f51618a);
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WBS08EcgActivationViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.WBS08EcgActivationViewModel$getEcgReviewStatusAndStates$1$1$3$1", f = "WBS08EcgActivationViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WBS08EcgActivationViewModel f51619a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f51619a = wBS08EcgActivationViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f51619a, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            this.f51619a.o1(C1987R.string.hwa09_usOnboarding_status_network_message, C1987R.string.hwa09_usOnboarding_error_connection_paragraph, "error_connection");
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(WBS08EcgActivationViewModel wBS08EcgActivationViewModel, qm0.d<? super ob> dVar) {
        super(2, dVar);
        this.f51617g = wBS08EcgActivationViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        ob obVar = new ob(this.f51617g, dVar);
        obVar.f51616f = obj;
        return obVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((ob) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d9, code lost:
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118 A[Catch: all -> 0x002e, TryCatch #2 {all -> 0x002e, blocks: (B:9:0x0029, B:49:0x010e, B:51:0x0118, B:53:0x0122, B:61:0x0131, B:62:0x0137, B:64:0x013d, B:68:0x0160, B:70:0x0164, B:72:0x016b, B:74:0x0180, B:16:0x0044, B:41:0x00e4, B:45:0x00f3, B:20:0x0059, B:38:0x00cd), top: B:96:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b7  */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.ob.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
