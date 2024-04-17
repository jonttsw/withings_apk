package com.withings.zendesk.ui;

import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.databinding.FragmentArticleBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
import zendesk.support.Section;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzendesk/support/Section;", "it", "Lnm0/y;", "invoke", "(Lzendesk/support/Section;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ArticlePage$initViewModel$1 extends w implements l<Section, y> {
    final /* synthetic */ ArticlePage this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArticlePage$initViewModel$1(ArticlePage articlePage) {
        super(1);
        this.this$0 = articlePage;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(Section section) {
        invoke2(section);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Section section) {
        FragmentArticleBinding binding;
        FragmentArticleBinding binding2;
        if (section != null) {
            ArticlePage articlePage = this.this$0;
            binding = articlePage.getBinding();
            MaterialTextView materialTextView = binding.breadcrumb;
            binding2 = articlePage.getBinding();
            CharSequence text = binding2.breadcrumb.getText();
            String name = section.getName();
            materialTextView.setText(((Object) text) + " > " + name);
        }
    }
}
