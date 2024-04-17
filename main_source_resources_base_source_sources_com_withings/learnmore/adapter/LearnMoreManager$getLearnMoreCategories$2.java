package com.withings.learnmore.adapter;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LearnMore.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/withings/learnmore/adapter/LearnMoreCategories;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@e(c = "com.withings.learnmore.adapter.LearnMoreManager$getLearnMoreCategories$2", f = "LearnMore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LearnMoreManager$getLearnMoreCategories$2 extends i implements p<CoroutineScope, d<? super LearnMoreCategories>, Object> {
    int label;
    final /* synthetic */ LearnMoreManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LearnMoreManager$getLearnMoreCategories$2(LearnMoreManager learnMoreManager, d<? super LearnMoreManager$getLearnMoreCategories$2> dVar) {
        super(2, dVar);
        this.this$0 = learnMoreManager;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new LearnMoreManager$getLearnMoreCategories$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LearnMoreCategories learnMoreCategories;
        LearnMoreCategories learnMoreCategories2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        if (this.label == 0) {
            l.b(obj);
            learnMoreCategories = this.this$0.learnMoreCategories;
            if (learnMoreCategories == null) {
                this.this$0.loadLearnMoreCategories();
            }
            learnMoreCategories2 = this.this$0.learnMoreCategories;
            return learnMoreCategories2;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super LearnMoreCategories> dVar) {
        return ((LearnMoreManager$getLearnMoreCategories$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
