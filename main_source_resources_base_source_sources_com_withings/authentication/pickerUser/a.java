package com.withings.authentication.pickerUser;

import com.withings.account.core.model.Account;
import com.withings.authentication.pickerUser.PickUserViewModel;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.webservices.legacy.sync.ActionSyncJob;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import t00.g;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PickUserViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.authentication.pickerUser.PickUserViewModel$synchronizeAccountBeforeUserCreation$1", f = "PickUserViewModel.kt", l = {112}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f32278a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PickUserViewModel f32279b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PickUserViewModel pickUserViewModel, qm0.d<? super a> dVar) {
        super(2, dVar);
        this.f32279b = pickUserViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new a(this.f32279b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        lg.a aVar;
        t00.d dVar;
        vf.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f32278a;
        PickUserViewModel pickUserViewModel = this.f32279b;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            aVar = pickUserViewModel.f32259d;
            ActionSyncJob a11 = aVar.a(true);
            dVar = pickUserViewModel.f32258c;
            this.f32278a = 1;
            obj = g.a(dVar, a11, ConstantsWs.CALLCTX_APPLICATION_SIGN_IN, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            cVar = pickUserViewModel.f32257b;
            if (u.e(cVar.h().i().f(), Account.b.a.C0404a.f30950a)) {
                pickUserViewModel.t0().postValue(PickUserViewModel.a.e.f32270a);
            } else {
                pickUserViewModel.t0().postValue(PickUserViewModel.a.d.f32269a);
            }
        }
        return y.f85009a;
    }
}
