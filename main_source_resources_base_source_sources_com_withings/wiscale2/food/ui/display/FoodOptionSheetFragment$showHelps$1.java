package com.withings.wiscale2.food.ui.display;

import android.content.Context;
import com.withings.learnmore.adapter.LearnMoreCategories;
import com.withings.learnmore.adapter.LearnMoreEntryTranslations;
import com.withings.learnmore.adapter.LearnMoreManager;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FoodOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.wiscale2.food.ui.display.FoodOptionSheetFragment$showHelps$1", f = "FoodOptionSheetFragment.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class FoodOptionSheetFragment$showHelps$1 extends i implements p<CoroutineScope, d<? super y>, Object> {
    int label;
    final /* synthetic */ FoodOptionSheetFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoodOptionSheetFragment$showHelps$1(FoodOptionSheetFragment foodOptionSheetFragment, d<? super FoodOptionSheetFragment$showHelps$1> dVar) {
        super(2, dVar);
        this.this$0 = foodOptionSheetFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new FoodOptionSheetFragment$showHelps$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        List<LearnMoreEntryTranslations> food;
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
            Context context = this.this$0.getHelpsSection().getContext();
            u.i(context, "getContext(...)");
            LearnMoreManager learnMoreManager = new LearnMoreManager(context);
            this.label = 1;
            obj = learnMoreManager.getLearnMoreCategories(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        LearnMoreCategories learnMoreCategories = (LearnMoreCategories) obj;
        if (learnMoreCategories != null && (food = learnMoreCategories.getFood()) != null) {
            FoodOptionSheetFragment foodOptionSheetFragment = this.this$0;
            foodOptionSheetFragment.getHelpsSection().setVisibility(0);
            foodOptionSheetFragment.getHelpsTitle().setVisibility(0);
            foodOptionSheetFragment.getHelpsSection().setContent(new s1.a(true, 10203840, new FoodOptionSheetFragment$showHelps$1$1$1(food, foodOptionSheetFragment)));
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((FoodOptionSheetFragment$showHelps$1) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
