package com.withings.zendesk.ui;

import androidx.constraintlayout.widget.Group;
import com.withings.zendesk.databinding.FragmentHelpCenterLandingBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.SimpleArticle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lzendesk/support/SimpleArticle;", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterLanding$initViewModel$1$2 extends w implements l<List<? extends SimpleArticle>, y> {
    final /* synthetic */ HelpCenterLanding this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterLanding$initViewModel$1$2(HelpCenterLanding helpCenterLanding) {
        super(1);
        this.this$0 = helpCenterLanding;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends SimpleArticle> list) {
        invoke2(list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<? extends SimpleArticle> list) {
        FragmentHelpCenterLandingBinding binding;
        PopularQuestionAdapter popularQuestionAdapter;
        binding = this.this$0.getBinding();
        Group popularQuestions = binding.popularQuestions;
        u.i(popularQuestions, "popularQuestions");
        popularQuestions.setVisibility((list == null ? i0.f76187a : list).isEmpty() ^ true ? 0 : 8);
        popularQuestionAdapter = this.this$0.getPopularQuestionAdapter();
        popularQuestionAdapter.submitList(list);
    }
}
