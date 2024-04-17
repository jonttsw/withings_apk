package com.withings.authentication.tryToLogin.mail;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.l;
import nm0.y;
import th.m;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TryToLoginViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.tryToLogin.mail.TryToLoginViewModel$confirmJtw$2", f = "TryToLoginViewModel.kt", l = {ConstantsWs.WS_STATUS_ACCOUNTUPDATEERROR}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends i implements p<m.a, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32438a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ Object f32439b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ TryToLoginViewModel f32440c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(TryToLoginViewModel tryToLoginViewModel, qm0.d<? super b> dVar) {
        super(2, dVar);
        this.f32440c = tryToLoginViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        b bVar = new b(this.f32440c, dVar);
        bVar.f32439b = obj;
        return bVar;
    }

    @Override // ym0.p
    public final Object invoke(m.a aVar, qm0.d<? super y> dVar) {
        return ((b) create(aVar, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32438a;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            MutableSharedFlow<m.a> R0 = this.f32440c.R0();
            this.f32438a = 1;
            if (R0.emit((m.a) this.f32439b, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }
}
