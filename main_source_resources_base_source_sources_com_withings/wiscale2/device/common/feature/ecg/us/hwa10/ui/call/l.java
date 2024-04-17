package com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call;

import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: VideoCallPhoneNumberScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel$sendPhoneNumber$1", f = "VideoCallPhoneNumberScreen.kt", l = {135, ConstantsWs.MEASURE_TYPE_ECG_QTC_INTERVAL_DURATION, ConstantsWs.MEASURE_TYPE_HR_LEVEL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class l extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f51938a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f51939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ VideoCallPhoneNumberViewModel f51940c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(VideoCallPhoneNumberViewModel videoCallPhoneNumberViewModel, qm0.d<? super l> dVar) {
        super(2, dVar);
        this.f51940c = videoCallPhoneNumberViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        l lVar = new l(this.f51940c, dVar);
        lVar.f51939b = obj;
        return lVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((l) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r13.f51938a
            r2 = 3
            r3 = 2
            r4 = 1
            com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel r5 = r13.f51940c
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L24
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            nm0.l.b(r14)
            goto La6
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            java.lang.Object r1 = r13.f51939b
            nm0.l.b(r14)
            goto L7f
        L24:
            nm0.l.b(r14)     // Catch: java.lang.Throwable -> L28
            goto L54
        L28:
            r14 = move-exception
            goto L58
        L2a:
            nm0.l.b(r14)
            java.lang.Object r14 = r13.f51939b
            kotlinx.coroutines.CoroutineScope r14 = (kotlinx.coroutines.CoroutineScope) r14
            java.lang.String r11 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.i0(r5)
            kotlinx.coroutines.flow.MutableStateFlow r14 = r5.r0()
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r14.setValue(r1)
            com.withings.ecg.webservices.EcgReviewRemoteRepository r6 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.g0(r5)     // Catch: java.lang.Throwable -> L28
            long r7 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.j0(r5)     // Catch: java.lang.Throwable -> L28
            long r9 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.f0(r5)     // Catch: java.lang.Throwable -> L28
            r13.f51938a = r4     // Catch: java.lang.Throwable -> L28
            r12 = r13
            java.lang.Object r14 = r6.sendCode(r7, r9, r11, r12)     // Catch: java.lang.Throwable -> L28
            if (r14 != r0) goto L54
            return r0
        L54:
            nm0.y r14 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L28
        L56:
            r1 = r14
            goto L5d
        L58:
            nm0.k$a r14 = nm0.l.a(r14)
            goto L56
        L5d:
            boolean r14 = r1 instanceof nm0.k.a
            r14 = r14 ^ r4
            if (r14 == 0) goto L7f
            r14 = r1
            nm0.y r14 = (nm0.y) r14
            kotlinx.coroutines.flow.MutableStateFlow r14 = r5.r0()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r14.setValue(r4)
            kotlinx.coroutines.flow.MutableSharedFlow r14 = r5.p0()
            nm0.y r4 = nm0.y.f85009a
            r13.f51939b = r1
            r13.f51938a = r3
            java.lang.Object r14 = r14.emit(r4, r13)
            if (r14 != r0) goto L7f
            return r0
        L7f:
            java.lang.Throwable r14 = nm0.k.b(r1)
            if (r14 == 0) goto La6
            kotlinx.coroutines.flow.MutableStateFlow r3 = r5.r0()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
            boolean r14 = r14 instanceof com.withings.webservices.legacy.common.exception.UnauthorizedException
            if (r14 == 0) goto L95
            com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel$Error r14 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.Error.f51838a
            goto L97
        L95:
            com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel$Error r14 = com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.VideoCallPhoneNumberViewModel.Error.f51839b
        L97:
            kotlinx.coroutines.flow.MutableSharedFlow r3 = r5.m0()
            r13.f51939b = r1
            r13.f51938a = r2
            java.lang.Object r14 = r3.emit(r14, r13)
            if (r14 != r0) goto La6
            return r0
        La6:
            nm0.y r14 = nm0.y.f85009a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.feature.ecg.us.hwa10.ui.call.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
