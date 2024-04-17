package com.withings.zendesk.ui;

import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.withings.zendesk.R;
import com.withings.zendesk.ui.ArticlePageDirections;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import zendesk.support.Article;
/* compiled from: SearchFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lnm0/y;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class SearchFragment$Content$1$1$1 extends w implements ym0.a<y> {
    final /* synthetic */ Object $item;
    final /* synthetic */ SearchFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchFragment$Content$1$1$1(SearchFragment searchFragment, Object obj) {
        super(0);
        this.this$0 = searchFragment;
        this.$item = obj;
    }

    @Override // ym0.a
    public /* bridge */ /* synthetic */ y invoke() {
        invoke2();
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentActivity requireActivity = this.this$0.requireActivity();
        u.h(requireActivity, "null cannot be cast to non-null type com.withings.zendesk.ui.HelpCenterActivity");
        EditText editText = (EditText) ((HelpCenterActivity) requireActivity).findViewById(R.id.search);
        u.g(editText);
        ay.b.p(editText);
        androidx.navigation.e a11 = ah.e.a(this.this$0);
        ArticlePageDirections.Companion companion = ArticlePageDirections.Companion;
        Long id2 = ((Article) this.$item).getId();
        u.i(id2, "getId(...)");
        a11.K(companion.showArticle(id2.longValue()));
    }
}
