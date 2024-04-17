package com.withings.zendesk.ui;

import androidx.constraintlayout.widget.Group;
import com.withings.zendesk.databinding.FragmentSectionArticlesBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: SectionArticlesPage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.SectionArticlesPage$onViewCreated$3", f = "SectionArticlesPage.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class SectionArticlesPage$onViewCreated$3 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    int label;
    final /* synthetic */ SectionArticlesPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionArticlesPage$onViewCreated$3(SectionArticlesPage sectionArticlesPage, qm0.d<? super SectionArticlesPage$onViewCreated$3> dVar) {
        super(2, dVar);
        this.this$0 = sectionArticlesPage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new SectionArticlesPage$onViewCreated$3(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentSectionArticlesBinding binding;
        int i11;
        PopularQuestionAdapter popularQuestionAdapter;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.label;
        if (i12 != 0) {
            if (i12 == 1) {
                l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            l.b(obj);
            CoroutineDispatcher io2 = Dispatchers.getIO();
            SectionArticlesPage$onViewCreated$3$suggestions$1 sectionArticlesPage$onViewCreated$3$suggestions$1 = new SectionArticlesPage$onViewCreated$3$suggestions$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, sectionArticlesPage$onViewCreated$3$suggestions$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        binding = this.this$0.getBinding();
        Group popularQuestions = binding.popularQuestions;
        u.i(popularQuestions, "popularQuestions");
        if (!list.isEmpty()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        popularQuestions.setVisibility(i11);
        popularQuestionAdapter = this.this$0.getPopularQuestionAdapter();
        popularQuestionAdapter.submitList(list);
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((SectionArticlesPage$onViewCreated$3) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
