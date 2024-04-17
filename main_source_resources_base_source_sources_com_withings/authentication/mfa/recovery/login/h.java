package com.withings.authentication.mfa.recovery.login;

import androidx.compose.ui.platform.k4;
import androidx.lifecycle.h1;
import k1.r0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.y;
/* compiled from: RecoveryCodeInput.kt */
/* loaded from: classes3.dex */
final class h extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ CoroutineScope f31863a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b2.f f31864b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LoginRecoveryCodeViewModel f31865c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k4 f31866d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ r0<String> f31867e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(CoroutineScope coroutineScope, b2.f fVar, LoginRecoveryCodeViewModel loginRecoveryCodeViewModel, k4 k4Var, r0<String> r0Var) {
        super(0);
        this.f31863a = coroutineScope;
        this.f31864b = fVar;
        this.f31865c = loginRecoveryCodeViewModel;
        this.f31866d = k4Var;
        this.f31867e = r0Var;
    }

    @Override // ym0.a
    public final y invoke() {
        BuildersKt__Builders_commonKt.launch$default(this.f31863a, null, null, new g(this.f31866d, null), 3, null);
        this.f31864b.n(false);
        String code = this.f31867e.getValue();
        LoginRecoveryCodeViewModel loginRecoveryCodeViewModel = this.f31865c;
        loginRecoveryCodeViewModel.getClass();
        u.j(code, "code");
        BuildersKt__Builders_commonKt.launch$default(h1.a(loginRecoveryCodeViewModel), Dispatchers.getIO(), null, new e(loginRecoveryCodeViewModel, code, null), 2, null);
        return y.f85009a;
    }
}
