package com.withings.wiscale2.food.ui.display;

import android.widget.ProgressBar;
import com.withings.views.view.CustomScrollViewGroup;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodDayFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.food.ui.display.FoodDayFragment$loadAndShowData$1", f = "FoodDayFragment.kt", l = {113}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FoodDayFragment$loadAndShowData$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ FoodDayFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodDayFragment$loadAndShowData$1(FoodDayFragment foodDayFragment, d<? super FoodDayFragment$loadAndShowData$1> dVar) {
        super(2, dVar);
        this.this$0 = foodDayFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodDayFragment$loadAndShowData$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ProgressBar progressBar;
        CustomScrollViewGroup customScrollViewGroup;
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
            FoodDayFragment$loadAndShowData$1$dataHolder$1 foodDayFragment$loadAndShowData$1$dataHolder$1 = new FoodDayFragment$loadAndShowData$1$dataHolder$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, foodDayFragment$loadAndShowData$1$dataHolder$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        FoodDayFragment.FoodDayDataHolder foodDayDataHolder = (FoodDayFragment.FoodDayDataHolder) obj;
        progressBar = this.this$0.progressView;
        if (progressBar != null) {
            progressBar.setVisibility(8);
            customScrollViewGroup = this.this$0.scrollViewGroup;
            if (customScrollViewGroup != null) {
                customScrollViewGroup.setVisibility(0);
                this.this$0.showData(foodDayDataHolder);
                return y.f85009a;
            }
            u.s("scrollViewGroup");
            throw null;
        }
        u.s("progressView");
        throw null;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((FoodDayFragment$loadAndShowData$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
