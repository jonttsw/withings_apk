package com.withings.weight.presentation.viewmodel;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: WeightViewModel.kt */
@e(c = "com.withings.weight.presentation.viewmodel.WeightViewModel$refreshWeightGraphData$1", f = "WeightViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGCONSUMER, ConstantsWs.WS_STATUS_WRONGCONSUMER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class b extends i implements p<CoroutineScope, d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    MutableSharedFlow f47585a;

    /* renamed from: b  reason: collision with root package name */
    int f47586b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ WeightViewModel f47587c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(WeightViewModel weightViewModel, d<? super b> dVar) {
        super(2, dVar);
        this.f47587c = weightViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new b(this.f47587c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        g90.b bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f47586b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = this.f47585a;
            l.b(obj);
        } else {
            l.b(obj);
            WeightViewModel weightViewModel = this.f47587c;
            mutableSharedFlow = weightViewModel.f47493y;
            bVar = weightViewModel.f47471d;
            User user = weightViewModel.f47484p;
            this.f47585a = mutableSharedFlow;
            this.f47586b = 1;
            obj = bVar.f(user, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f47585a = null;
        this.f47586b = 2;
        if (mutableSharedFlow.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }
}
