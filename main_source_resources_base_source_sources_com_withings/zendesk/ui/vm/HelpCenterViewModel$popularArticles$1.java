package com.withings.zendesk.ui.vm;

import androidx.lifecycle.h0;
import com.withings.zendesk.ktx.HelpCenterProviderExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SimpleArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/lifecycle/h0;", "", "Lzendesk/support/SimpleArticle;", "Lnm0/y;", "<anonymous>", "(Landroidx/lifecycle/h0;)V"}, k = 3, mv = {1, 9, 0})
@e(c = "com.withings.zendesk.ui.vm.HelpCenterViewModel$popularArticles$1", f = "HelpCenterViewModel.kt", l = {58, 58}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class HelpCenterViewModel$popularArticles$1 extends i implements p<h0<List<? extends SimpleArticle>>, d<? super y>, Object> {
    final /* synthetic */ Long $categoryId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterViewModel$popularArticles$1(Long l5, HelpCenterViewModel helpCenterViewModel, d<? super HelpCenterViewModel$popularArticles$1> dVar) {
        super(2, dVar);
        this.$categoryId = l5;
        this.this$0 = helpCenterViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        HelpCenterViewModel$popularArticles$1 helpCenterViewModel$popularArticles$1 = new HelpCenterViewModel$popularArticles$1(this.$categoryId, this.this$0, dVar);
        helpCenterViewModel$popularArticles$1.L$0 = obj;
        return helpCenterViewModel$popularArticles$1;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(h0<List<SimpleArticle>> h0Var, d<? super y> dVar) {
        return ((HelpCenterViewModel$popularArticles$1) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        HelpCenterProvider helpCenterProvider;
        List list;
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
            h0Var = (h0) this.L$0;
            l.b(obj);
            list = (List) obj;
        } else {
            l.b(obj);
            h0Var = (h0) this.L$0;
            Long l5 = this.$categoryId;
            if (l5 != null) {
                HelpCenterViewModel helpCenterViewModel = this.this$0;
                long longValue = l5.longValue();
                helpCenterProvider = helpCenterViewModel.helpCenterProvider;
                if (helpCenterProvider != null) {
                    this.L$0 = h0Var;
                    this.label = 1;
                    obj = HelpCenterProviderExtensionKt.suggestionByCategory(helpCenterProvider, longValue, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    list = (List) obj;
                } else {
                    list = null;
                }
            }
            return y.f85009a;
        }
        this.L$0 = null;
        this.label = 2;
        if (h0Var.emit(list, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return y.f85009a;
    }

    @Override // ym0.p
    public /* bridge */ /* synthetic */ Object invoke(h0<List<? extends SimpleArticle>> h0Var, d<? super y> dVar) {
        return invoke2((h0<List<SimpleArticle>>) h0Var, dVar);
    }
}
