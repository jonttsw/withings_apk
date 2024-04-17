package com.withings.authentication.tryToLogin.mail;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$sendShortCode$1", f = "TryToLoginViewModel.kt", l = {191, 195, ConstantsWs.MEASURE_TYPE_DURATION_MEDIUM_HIGH_ACTIVITY, 204}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32456a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32457b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f32458c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TryToLoginViewModel tryToLoginViewModel, String str, qm0.d<? super f> dVar) {
        super(2, dVar);
        this.f32457b = tryToLoginViewModel;
        this.f32458c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new f(this.f32457b, this.f32458c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((f) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f32456a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r6 = r7.f32457b
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            nm0.l.b(r8)
            goto L73
        L21:
            nm0.l.b(r8)
            goto L3f
        L25:
            nm0.l.b(r8)
            com.withings.features.FeatureFlag r8 = com.withings.features.FeatureFlag.f39120n0
            boolean r8 = wr.b.c(r8)
            java.lang.String r1 = r7.f32458c
            if (r8 == 0) goto L6a
            cg.i r8 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.p0(r6)
            r7.f32456a = r5
            java.lang.Object r8 = r8.d(r1, r7)
            if (r8 != r0) goto L3f
            return r0
        L3f:
            com.withings.library.authentication.login.state.LoggedOut$OutputState r8 = (com.withings.library.authentication.login.state.LoggedOut.OutputState) r8
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.LoggedOut.OutputState.SuccessNeedMailResult
            if (r1 == 0) goto L54
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.W0()
            th.z$a$c r1 = th.z.a.c.f99977a
            r7.f32456a = r4
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L73
            return r0
        L54:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r6.W0()
            th.z$a$b r2 = new th.z$a$b
            java.lang.String r8 = r8.toString()
            r2.<init>(r8)
            r7.f32456a = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto L73
            return r0
        L6a:
            r7.f32456a = r2
            java.lang.Object r8 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.A0(r6, r1, r7)
            if (r8 != r0) goto L73
            return r0
        L73:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
