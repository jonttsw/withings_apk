package com.withings.wiscale2.food.model;

import android.content.Context;
import com.withings.partner.model.Partner;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: SynchronizeFood.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.food.model.SynchronizeFood$run$1", f = "SynchronizeFood.kt", l = {23, 25}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SynchronizeFood$run$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ SynchronizeFood this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SynchronizeFood$run$1(SynchronizeFood synchronizeFood, d<? super SynchronizeFood$run$1> dVar) {
        super(2, dVar);
        this.this$0 = synchronizeFood;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new SynchronizeFood$run$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t10.e eVar;
        Object synchronizeMeals;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    l.b(obj);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l.b(obj);
        } else {
            l.b(obj);
            eVar = this.this$0.partnerManager;
            Context context = this.this$0.getContext();
            Partner partner = Partner.f43455m;
            this.label = 1;
            obj = eVar.i(context, partner, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            SynchronizeFood synchronizeFood = this.this$0;
            this.label = 2;
            synchronizeMeals = synchronizeFood.synchronizeMeals(this);
            if (synchronizeMeals == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((SynchronizeFood$run$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
