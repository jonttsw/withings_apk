package com.withings.zendesk.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.v;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.textview.MaterialTextView;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.databinding.FragmentArticleBinding;
import com.withings.zendesk.ktx.ImageViewExtensionKt;
import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.ui.ArticlePageDirections;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import fn0.k;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import r8.g;
import zendesk.support.Article;
import zendesk.support.SearchArticle;
/* compiled from: ArticlePage.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\rJ!\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/withings/zendesk/ui/ArticlePage;", "Landroidx/fragment/app/Fragment;", "Lnm0/y;", "initViewModel", "()V", "", "Lzendesk/support/SearchArticle;", "relatedArticles", "bindFooter", "(Ljava/util/List;)V", "Lzendesk/support/Article;", ConstantsWs.WELLNESS_TASK_TYPE_ARTICLE, "bindArticle", "(Lzendesk/support/Article;)V", "onContactClicked", "onCommunityClicked", "onSearchClicked", "onArticleClicked", "showArticleHtml", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withings/zendesk/ui/ArticlePageArgs;", "args$delegate", "Lr8/g;", "getArgs", "()Lcom/withings/zendesk/ui/ArticlePageArgs;", "args", "Lcom/withings/zendesk/databinding/FragmentArticleBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Lcom/withings/zendesk/databinding/FragmentArticleBinding;", "binding", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "", "currentArticleSectionId", "Ljava/lang/Long;", "<init>", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ArticlePage extends Fragment {
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(ArticlePage.class, "binding", "getBinding()Lcom/withings/zendesk/databinding/FragmentArticleBinding;", 0)};
    public static final int $stable = 8;
    private final g args$delegate;
    private final f binding$delegate;
    private Long currentArticleSectionId;
    private final nm0.g viewModel$delegate;

    public ArticlePage() {
        super(R.layout.fragment_article);
        this.args$delegate = new g(q0.b(ArticlePageArgs.class), new ArticlePage$special$$inlined$navArgs$1(this));
        this.binding$delegate = by.kirich1409.viewbindingdelegate.e.a(this, new ArticlePage$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
        this.viewModel$delegate = v0.a(this, q0.b(HelpCenterViewModel.class), new ArticlePage$special$$inlined$activityViewModels$default$1(this), new ArticlePage$special$$inlined$activityViewModels$default$2(null, this), new ArticlePage$special$$inlined$activityViewModels$default$3(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindArticle(Article article) {
        Object obj;
        Iterator<T> it = getViewModel().getLabels$zendesk_release().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (article.getLabelNames().contains(((ZendeskLabel) obj).getZendeskLabel())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ZendeskLabel zendeskLabel = (ZendeskLabel) obj;
        if (zendeskLabel != null) {
            MaterialTextView materialTextView = getBinding().breadcrumb;
            Context requireContext = requireContext();
            u.i(requireContext, "requireContext(...)");
            materialTextView.setText(ZendeskLabelExtensionKt.wordingResId(zendeskLabel, requireContext));
            ImageView labelGlyph = getBinding().labelGlyph;
            u.i(labelGlyph, "labelGlyph");
            ImageViewExtensionKt.setGlyph(labelGlyph, zendeskLabel);
            MaterialTextView breadcrumb = getBinding().breadcrumb;
            u.i(breadcrumb, "breadcrumb");
            breadcrumb.setVisibility(0);
            ImageView labelGlyph2 = getBinding().labelGlyph;
            u.i(labelGlyph2, "labelGlyph");
            labelGlyph2.setVisibility(0);
        }
        getBinding().articleTitle.setText(article.getTitle());
        this.currentArticleSectionId = article.getSectionId();
        showArticleHtml(article);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindFooter(List<? extends SearchArticle> list) {
        getBinding().footer.setContent(new s1.a(true, -111963650, new ArticlePage$bindFooter$1(list, this)));
    }

    private final ArticlePageArgs getArgs() {
        return (ArticlePageArgs) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentArticleBinding getBinding() {
        return (FragmentArticleBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    private final HelpCenterViewModel getViewModel() {
        return (HelpCenterViewModel) this.viewModel$delegate.getValue();
    }

    private final void initViewModel() {
        getViewModel().setArticleId(getArgs().getArticleId());
        getViewModel().getArticleSection().observe(getViewLifecycleOwner(), new ArticlePage$sam$androidx_lifecycle_Observer$0(new ArticlePage$initViewModel$1(this)));
        getViewModel().getArticle().observe(getViewLifecycleOwner(), new ArticlePage$sam$androidx_lifecycle_Observer$0(new ArticlePage$initViewModel$2(this)));
        getViewModel().getRelatedArticles().observe(getViewLifecycleOwner(), new ArticlePage$sam$androidx_lifecycle_Observer$0(new ArticlePage$initViewModel$3(this)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onArticleClicked(Article article) {
        androidx.navigation.e a11 = ah.e.a(this);
        ArticlePageDirections.Companion companion = ArticlePageDirections.Companion;
        Long id2 = article.getId();
        u.i(id2, "getId(...)");
        a11.K(companion.showArticle(id2.longValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommunityClicked() {
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = getBinding().getRoot().getContext();
        u.i(context, "getContext(...)");
        startActivity(aVar.b(context, Integer.valueOf((int) C1987R.string._HELP_CENTER_), C1987R.string.helpCenter_community_URL));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onContactClicked() {
        Context context = getBinding().getRoot().getContext();
        if (getViewModel().getSectionId() != null && this.currentArticleSectionId != null) {
            HMWebActivity.a aVar = HMWebActivity.f35395c;
            u.g(context);
            String string = context.getString(C1987R.string._HELP_CENTER_);
            String string2 = context.getString(C1987R.string.helpCenter_supportRequestURL, String.valueOf(getViewModel().getSectionId()), String.valueOf(this.currentArticleSectionId));
            u.i(string2, "getString(...)");
            context.startActivity(aVar.c(context, string, string2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSearchClicked() {
        ah.e.a(this).K(SearchFragmentDirections.Companion.goToSearch());
    }

    private final void showArticleHtml(Article article) {
        Context context = getBinding().article.getContext();
        u.i(context, "getContext(...)");
        if (ah.u.D(context)) {
            if (ah.u.E("FORCE_DARK")) {
                j9.b.a(getBinding().article.getSettings());
            }
            if (ah.u.E("FORCE_DARK_STRATEGY")) {
                j9.b.b(getBinding().article.getSettings());
            }
        }
        getBinding().article.getSettings().setJavaScriptEnabled(true);
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new ArticlePage$showArticleHtml$1(this, article, null), 3, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        NestedScrollView root = getBinding().getRoot();
        u.i(root, "getRoot(...)");
        ay.b.n(root, true, true, 21);
        initViewModel();
    }
}
