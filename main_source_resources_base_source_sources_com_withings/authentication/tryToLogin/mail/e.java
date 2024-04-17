package com.withings.authentication.tryToLogin.mail;

import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$reSendShortCode$1", f = "TryToLoginViewModel.kt", l = {210, 214, 221, 226}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class e extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32453a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32454b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ String f32455c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(TryToLoginViewModel tryToLoginViewModel, String str, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f32454b = tryToLoginViewModel;
        this.f32455c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f32454b, this.f32455c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f32453a
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            com.withings.authentication.tryToLogin.mail.TryToLoginViewModel r6 = r7.f32454b
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
            goto L86
        L21:
            nm0.l.b(r8)
            goto L3d
        L25:
            nm0.l.b(r8)
            com.withings.features.FeatureFlag r8 = com.withings.features.FeatureFlag.f39120n0
            boolean r8 = wr.b.c(r8)
            if (r8 == 0) goto L7b
            cg.i r8 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.p0(r6)
            r7.f32453a = r5
            java.lang.Object r8 = r8.c(r7)
            if (r8 != r0) goto L3d
            return r0
        L3d:
            com.withings.library.authentication.login.state.NeedMailResult$ResendMailOutputState r8 = (com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState) r8
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.SuccessResendMail
            if (r1 == 0) goto L52
            kotlinx.coroutines.flow.MutableStateFlow r8 = r6.W0()
            th.z$a$c r1 = th.z.a.c.f99977a
            r7.f32453a = r4
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L86
            return r0
        L52:
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.NetworkError
            if (r1 == 0) goto L57
            goto L65
        L57:
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.WithingsError
            if (r1 == 0) goto L5c
            goto L65
        L5c:
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.GenericError
            if (r1 == 0) goto L61
            goto L65
        L61:
            boolean r1 = r8 instanceof com.withings.library.authentication.login.state.NeedMailResult.ResendMailOutputState.TooManyRequestException
            if (r1 == 0) goto L86
        L65:
            kotlinx.coroutines.flow.MutableStateFlow r1 = r6.W0()
            th.z$a$b r2 = new th.z$a$b
            java.lang.String r8 = r8.toString()
            r2.<init>(r8)
            r7.f32453a = r3
            java.lang.Object r8 = r1.emit(r2, r7)
            if (r8 != r0) goto L86
            return r0
        L7b:
            r7.f32453a = r2
            java.lang.String r8 = r7.f32455c
            java.lang.Object r8 = com.withings.authentication.tryToLogin.mail.TryToLoginViewModel.A0(r6, r8, r7)
            if (r8 != r0) goto L86
            return r0
        L86:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.tryToLogin.mail.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
