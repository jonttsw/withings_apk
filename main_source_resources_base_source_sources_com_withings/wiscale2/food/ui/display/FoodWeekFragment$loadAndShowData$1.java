package com.withings.wiscale2.food.ui.display;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import qm0.d;
import tb0.s2;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodWeekFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.food.ui.display.FoodWeekFragment$loadAndShowData$1", f = "FoodWeekFragment.kt", l = {101}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FoodWeekFragment$loadAndShowData$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ FoodWeekFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodWeekFragment$loadAndShowData$1(FoodWeekFragment foodWeekFragment, d<? super FoodWeekFragment$loadAndShowData$1> dVar) {
        super(2, dVar);
        this.this$0 = foodWeekFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodWeekFragment$loadAndShowData$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        s2 binding;
        s2 binding2;
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
            CoroutineDispatcher io2 = Dispatchers.getIO();
            FoodWeekFragment$loadAndShowData$1$dataHolder$1 foodWeekFragment$loadAndShowData$1$dataHolder$1 = new FoodWeekFragment$loadAndShowData$1$dataHolder$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, foodWeekFragment$loadAndShowData$1$dataHolder$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        binding = this.this$0.getBinding();
        binding.f99476h.setVisibility(8);
        binding2 = this.this$0.getBinding();
        binding2.f99471c.setVisibility(0);
        this.this$0.showData((FoodWeekDataHolder) obj);
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((FoodWeekFragment$loadAndShowData$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
