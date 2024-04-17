package com.withings.zendesk.ui;

import com.withings.zendesk.databinding.FragmentLabelSectionsBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.i;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lnm0/y;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.e(c = "com.withings.zendesk.ui.LabelSectionsPage$onViewCreated$2", f = "LabelSectionsPage.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class LabelSectionsPage$onViewCreated$2 extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {
    int label;
    final /* synthetic */ LabelSectionsPage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelSectionsPage$onViewCreated$2(LabelSectionsPage labelSectionsPage, qm0.d<? super LabelSectionsPage$onViewCreated$2> dVar) {
        super(2, dVar);
        this.this$0 = labelSectionsPage;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new LabelSectionsPage$onViewCreated$2(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        FragmentLabelSectionsBinding fragmentLabelSectionsBinding;
        PopularQuestionAdapter popularQuestionAdapter;
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
            LabelSectionsPage$onViewCreated$2$suggestions$1 labelSectionsPage$onViewCreated$2$suggestions$1 = new LabelSectionsPage$onViewCreated$2$suggestions$1(this.this$0, null);
            this.label = 1;
            obj = BuildersKt.withContext(io2, labelSectionsPage$onViewCreated$2$suggestions$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List list = (List) obj;
        fragmentLabelSectionsBinding = this.this$0.binding;
        if (fragmentLabelSectionsBinding != null) {
            this.this$0.updatePopularQuestionsVisibility(fragmentLabelSectionsBinding, true ^ list.isEmpty());
        }
        popularQuestionAdapter = this.this$0.getPopularQuestionAdapter();
        popularQuestionAdapter.submitList(list);
        return y.f85009a;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((LabelSectionsPage$onViewCreated$2) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }
}
