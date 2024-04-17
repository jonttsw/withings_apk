package com.withings.wiscale2.food.ui.setup;

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
/* compiled from: FoodSetupActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.wiscale2.food.ui.setup.FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1", f = "FoodSetupActivity.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1 extends i implements p<CoroutineScope, d<? super Boolean>, Object> {
    int label;
    final /* synthetic */ FoodSetupActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1(FoodSetupActivity foodSetupActivity, d<? super FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1> dVar) {
        super(2, dVar);
        this.this$0 = foodSetupActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        t10.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            eVar = t10.e.f97966j;
            if (eVar != null) {
                FoodSetupActivity foodSetupActivity = this.this$0;
                Partner partner = Partner.f43455m;
                this.label = 1;
                obj = eVar.i(foodSetupActivity, partner, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                throw new IllegalArgumentException("you must call init before using get".toString());
            }
        }
        return obj;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super Boolean> dVar) {
        return ((FoodSetupActivity$onCreate$1$1$linkedToMyFitnessPal$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
