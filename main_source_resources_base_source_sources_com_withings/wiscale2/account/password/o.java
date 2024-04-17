package com.withings.wiscale2.account.password;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.h0;
import com.withings.authentication.AuthenticationActivity;
import ej.w;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: PasswordExpiredActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.password.PasswordExpiredActivity$tryToLogout$1", f = "PasswordExpiredActivity.kt", l = {119}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class o extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f48176a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PasswordExpiredActivity f48177b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(PasswordExpiredActivity passwordExpiredActivity, qm0.d<? super o> dVar) {
        super(2, dVar);
        this.f48177b = passwordExpiredActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new o(this.f48177b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((o) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f48176a;
        PasswordExpiredActivity passwordExpiredActivity = this.f48177b;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            w.w().v();
            Context applicationContext = passwordExpiredActivity.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            new hb0.b(applicationContext).a();
            cg.l lVar = passwordExpiredActivity.f48128h;
            if (lVar != null) {
                this.f48176a = 1;
                if (lVar.e(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                u.s("logoutUseCase");
                throw null;
            }
        }
        h0 m11 = h0.m(passwordExpiredActivity.getApplicationContext());
        int i12 = AuthenticationActivity.f31291w;
        Context applicationContext2 = passwordExpiredActivity.getApplicationContext();
        u.i(applicationContext2, "getApplicationContext(...)");
        m11.c(new Intent(applicationContext2, AuthenticationActivity.class).addFlags(67108864));
        m11.r();
        passwordExpiredActivity.finish();
        return y.f85009a;
    }
}
