package com.withings.zendesk.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.u0;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.databinding.FragmentLabelSectionsBinding;
import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import m0.t;
import nm0.h;
import nm0.l;
import nm0.y;
import r8.g;
/* compiled from: LabelSectionsPage.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b2\u0010\u0018J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\u0003*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0003*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ-\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010)\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/withings/zendesk/ui/LabelSectionsPage;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/zendesk/databinding/FragmentLabelSectionsBinding;", "Lnm0/y;", "initViews", "(Lcom/withings/zendesk/databinding/FragmentLabelSectionsBinding;)V", "", "isVisible", "updatePopularQuestionsVisibility", "(Lcom/withings/zendesk/databinding/FragmentLabelSectionsBinding;Z)V", "Landroidx/recyclerview/widget/RecyclerView;", "initSectionsList", "(Landroidx/recyclerview/widget/RecyclerView;)V", "initPopularQuestionsView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "()V", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "args$delegate", "Lr8/g;", "getArgs", "()Lcom/withings/zendesk/ui/LabelSectionsPageArgs;", "args", "binding", "Lcom/withings/zendesk/databinding/FragmentLabelSectionsBinding;", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "Lcom/withings/zendesk/ui/SectionAdapter;", "sectionAdapter", "Lcom/withings/zendesk/ui/SectionAdapter;", "Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter$delegate", "getPopularQuestionAdapter", "()Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter", "<init>", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LabelSectionsPage extends Fragment {
    public static final int $stable = 8;
    private final g args$delegate;
    private FragmentLabelSectionsBinding binding;
    private final nm0.g popularQuestionAdapter$delegate;
    private final SectionAdapter sectionAdapter;
    private final nm0.g viewModel$delegate;

    public LabelSectionsPage() {
        super(R.layout.fragment_label_sections);
        this.args$delegate = new g(q0.b(LabelSectionsPageArgs.class), new LabelSectionsPage$special$$inlined$navArgs$1(this));
        this.viewModel$delegate = v0.a(this, q0.b(HelpCenterViewModel.class), new LabelSectionsPage$special$$inlined$activityViewModels$default$1(this), new LabelSectionsPage$special$$inlined$activityViewModels$default$2(null, this), new LabelSectionsPage$special$$inlined$activityViewModels$default$3(this));
        this.sectionAdapter = new SectionAdapter(new LabelSectionsPage$sectionAdapter$1(this));
        this.popularQuestionAdapter$delegate = h.b(new LabelSectionsPage$popularQuestionAdapter$2(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LabelSectionsPageArgs getArgs() {
        return (LabelSectionsPageArgs) this.args$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PopularQuestionAdapter getPopularQuestionAdapter() {
        return (PopularQuestionAdapter) this.popularQuestionAdapter$delegate.getValue();
    }

    private final HelpCenterViewModel getViewModel() {
        return (HelpCenterViewModel) this.viewModel$delegate.getValue();
    }

    private final void initPopularQuestionsView(RecyclerView recyclerView) {
        recyclerView.setAdapter(getPopularQuestionAdapter());
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final void initSectionsList(RecyclerView recyclerView) {
        recyclerView.setAdapter(this.sectionAdapter);
        zq.b.a(recyclerView, C1987R.drawable.list_divider_thick_with_margins, 1);
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final void initViews(FragmentLabelSectionsBinding fragmentLabelSectionsBinding) {
        NestedScrollView root = fragmentLabelSectionsBinding.getRoot();
        u.i(root, "getRoot(...)");
        ay.b.n(root, false, true, 23);
        MaterialTextView materialTextView = fragmentLabelSectionsBinding.label;
        ZendeskLabel label = getArgs().getLabel();
        Context context = fragmentLabelSectionsBinding.getRoot().getContext();
        u.i(context, "getContext(...)");
        materialTextView.setText(ZendeskLabelExtensionKt.wordingResId(label, context));
        try {
            MaterialTextView materialTextView2 = fragmentLabelSectionsBinding.label;
            ZendeskLabel label2 = getArgs().getLabel();
            Context context2 = fragmentLabelSectionsBinding.getRoot().getContext();
            u.i(context2, "getContext(...)");
            materialTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds(ZendeskLabelExtensionKt.glyphResId(label2, context2), 0, 0, 0);
            y yVar = y.f85009a;
        } catch (Throwable th2) {
            l.a(th2);
        }
        RecyclerView sections = fragmentLabelSectionsBinding.sections;
        u.i(sections, "sections");
        initSectionsList(sections);
        RecyclerView popularQuestionsList = fragmentLabelSectionsBinding.popularQuestionsList;
        u.i(popularQuestionsList, "popularQuestionsList");
        initPopularQuestionsView(popularQuestionsList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updatePopularQuestionsVisibility(FragmentLabelSectionsBinding fragmentLabelSectionsBinding, boolean z5) {
        int i11;
        int i12;
        View popularQuestionsDivider = fragmentLabelSectionsBinding.popularQuestionsDivider;
        u.i(popularQuestionsDivider, "popularQuestionsDivider");
        int i13 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        popularQuestionsDivider.setVisibility(i11);
        RecyclerView popularQuestionsList = fragmentLabelSectionsBinding.popularQuestionsList;
        u.i(popularQuestionsList, "popularQuestionsList");
        if (z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        popularQuestionsList.setVisibility(i12);
        MaterialTextView popularQuestionsTitle = fragmentLabelSectionsBinding.popularQuestionsTitle;
        u.i(popularQuestionsTitle, "popularQuestionsTitle");
        if (z5) {
            i13 = 0;
        }
        popularQuestionsTitle.setVisibility(i13);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        FragmentLabelSectionsBinding inflate = FragmentLabelSectionsBinding.inflate(inflater, viewGroup, false);
        this.binding = inflate;
        if (inflate != null) {
            return inflate.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        FragmentLabelSectionsBinding fragmentLabelSectionsBinding = this.binding;
        if (fragmentLabelSectionsBinding != null) {
            initViews(fragmentLabelSectionsBinding);
        }
        getViewModel().getArticlesByTags().observe(getViewLifecycleOwner(), new LabelSectionsPage$sam$androidx_lifecycle_Observer$0(new LabelSectionsPage$onViewCreated$1(this)));
        BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new LabelSectionsPage$onViewCreated$2(this, null), 3, null);
    }
}
