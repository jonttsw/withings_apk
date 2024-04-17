package com.withings.zendesk.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.u0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import androidx.recyclerview.widget.RecyclerView;
import by.kirich1409.viewbindingdelegate.f;
import com.google.android.material.textview.MaterialTextView;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.databinding.FragmentSectionArticlesBinding;
import com.withings.zendesk.ktx.ImageViewExtensionKt;
import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import nm0.h;
import r8.g;
/* compiled from: SectionArticlesPage.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J!\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/withings/zendesk/ui/SectionArticlesPage;", "Landroidx/fragment/app/Fragment;", "Lnm0/y;", "initArticlesList", "()V", "initPopularQuestionsView", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "args$delegate", "Lr8/g;", "getArgs", "()Lcom/withings/zendesk/ui/SectionArticlesPageArgs;", "args", "Lcom/withings/zendesk/databinding/FragmentSectionArticlesBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Lcom/withings/zendesk/databinding/FragmentSectionArticlesBinding;", "binding", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "Lcom/withings/zendesk/ui/ArticleAdapter;", "articlesAdapter", "Lcom/withings/zendesk/ui/ArticleAdapter;", "Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter$delegate", "getPopularQuestionAdapter", "()Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter", "<init>", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SectionArticlesPage extends Fragment {
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(SectionArticlesPage.class, "binding", "getBinding()Lcom/withings/zendesk/databinding/FragmentSectionArticlesBinding;", 0)};
    public static final int $stable = 8;
    private final g args$delegate;
    private final ArticleAdapter articlesAdapter;
    private final f binding$delegate;
    private final nm0.g popularQuestionAdapter$delegate;
    private final nm0.g viewModel$delegate;

    public SectionArticlesPage() {
        super(R.layout.fragment_section_articles);
        this.args$delegate = new g(q0.b(SectionArticlesPageArgs.class), new SectionArticlesPage$special$$inlined$navArgs$1(this));
        this.binding$delegate = by.kirich1409.viewbindingdelegate.e.a(this, new SectionArticlesPage$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
        this.viewModel$delegate = v0.a(this, q0.b(HelpCenterViewModel.class), new SectionArticlesPage$special$$inlined$activityViewModels$default$1(this), new SectionArticlesPage$special$$inlined$activityViewModels$default$2(null, this), new SectionArticlesPage$special$$inlined$activityViewModels$default$3(this));
        this.articlesAdapter = new ArticleAdapter(new SectionArticlesPage$articlesAdapter$1(this));
        this.popularQuestionAdapter$delegate = h.b(new SectionArticlesPage$popularQuestionAdapter$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SectionArticlesPageArgs getArgs() {
        return (SectionArticlesPageArgs) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSectionArticlesBinding getBinding() {
        return (FragmentSectionArticlesBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PopularQuestionAdapter getPopularQuestionAdapter() {
        return (PopularQuestionAdapter) this.popularQuestionAdapter$delegate.getValue();
    }

    private final HelpCenterViewModel getViewModel() {
        return (HelpCenterViewModel) this.viewModel$delegate.getValue();
    }

    private final void initArticlesList() {
        RecyclerView recyclerView = getBinding().articles;
        recyclerView.setAdapter(this.articlesAdapter);
        zq.b.a(recyclerView, C1987R.drawable.list_divider_thick_with_margins, 1);
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final void initPopularQuestionsView() {
        RecyclerView recyclerView = getBinding().popularQuestionsList;
        recyclerView.setAdapter(getPopularQuestionAdapter());
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i11;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        FragmentSectionArticlesBinding binding = getBinding();
        NestedScrollView root = binding.getRoot();
        u.i(root, "getRoot(...)");
        ay.b.n(root, true, true, 21);
        MaterialTextView materialTextView = binding.label;
        ZendeskLabel label = getArgs().getLabel();
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        materialTextView.setText(ZendeskLabelExtensionKt.wordingResId(label, context));
        ImageView labelGlyph = binding.labelGlyph;
        u.i(labelGlyph, "labelGlyph");
        ImageViewExtensionKt.setGlyph(labelGlyph, getArgs().getLabel());
        binding.section.setText(getArgs().getSection().getName());
        MaterialTextView section = binding.section;
        u.i(section, "section");
        if (getArgs().getShowSectionTitle()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        section.setVisibility(i11);
        initArticlesList();
        initPopularQuestionsView();
        Group popularQuestions = getBinding().popularQuestions;
        u.i(popularQuestions, "popularQuestions");
        popularQuestions.setVisibility(4);
        getViewModel().getArticlesByTags().observe(getViewLifecycleOwner(), new SectionArticlesPage$sam$androidx_lifecycle_Observer$0(new SectionArticlesPage$onViewCreated$2(this)));
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new SectionArticlesPage$onViewCreated$3(this, null), 3, null);
    }
}
