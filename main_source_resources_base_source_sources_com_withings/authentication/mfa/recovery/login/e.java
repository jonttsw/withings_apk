package com.withings.authentication.mfa.recovery.login;

import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* compiled from: LoginRecoveryCodeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.mfa.recovery.login.LoginRecoveryCodeViewModel$renewSessionWithRecoveryCode$1", f = "LoginRecoveryCodeViewModel.kt", l = {40, 43, 45, 49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class e extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    LoginRecoveryCodeViewModel f31825a;

    /* renamed from: b  reason: collision with root package name */
    int f31826b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginRecoveryCodeViewModel f31827c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ String f31828d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, String str, qm0.d<? super e> dVar) {
        super(2, dVar);
        this.f31827c = loginRecoveryCodeViewModel;
        this.f31828d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new e(this.f31827c, this.f31828d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((e) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.authentication.mfa.recovery.login.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
