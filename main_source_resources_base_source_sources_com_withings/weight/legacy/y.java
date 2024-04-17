package com.withings.weight.legacy;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeightDetailFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.weight.legacy.WeightDetailViewModel$getHeightForBMI$1", f = "WeightDetailFragment.kt", l = {ConstantsWs.WS_STATUS_NOT_FIRST_USER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    xw.m f47088a;

    /* renamed from: b  reason: collision with root package name */
    int f47089b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a0 f47090c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f47091d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, User user, qm0.d<? super y> dVar) {
        super(2, dVar);
        this.f47090c = a0Var;
        this.f47091d = user;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new y(this.f47090c, this.f47091d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((y) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [xw.m] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        fy.n nVar;
        xw.m<List<ky.d>> mVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47089b;
        if (i11 != 0) {
            if (i11 == 1) {
                mVar = this.f47088a;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            a0 a0Var = this.f47090c;
            xw.m<List<ky.d>> p02 = a0Var.p0();
            nVar = a0Var.f47027d;
            Boolean bool = Boolean.FALSE;
            this.f47088a = p02;
            this.f47089b = 1;
            obj = nVar.a(this.f47091d.q(), null, true, bool, new int[]{4}, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            mVar = p02;
        }
        mVar.postValue(obj);
        return nm0.y.f85009a;
    }
}
