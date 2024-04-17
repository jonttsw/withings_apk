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
import com.withings.core.webcontent.HMWebActivity;
import com.withings.zendesk.R;
import com.withings.zendesk.databinding.FragmentHelpCenterLandingBinding;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.ui.LabelAdapter;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import dp0.j;
import fn0.k;
import ga.f;
import gi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import nm0.h;
import nm0.y;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import r8.g;
import zendesk.support.Section;
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b8\u0010\u0005J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\u0005J!\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010%\u001a\u0004\b0\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010%\u001a\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/withings/zendesk/ui/HelpCenterLanding;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/zendesk/ui/LabelAdapter$Callback;", "Lnm0/y;", "initViewModel", "()V", "initLabelsView", "initPopularQuestionsView", "initHeaderInfos", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/withings/zendesk/models/ZendeskLabel;", "zendeskLabel", "showSectionsForLabel", "(Lcom/withings/zendesk/models/ZendeskLabel;)V", "Lzendesk/support/Section;", DataLayout.Section.ELEMENT, "showArticlesForSectionAndLabel", "(Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;)V", "Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "args$delegate", "Lr8/g;", "getArgs", "()Lcom/withings/zendesk/ui/HelpCenterLandingArgs;", "args", "Lcom/withings/zendesk/databinding/FragmentHelpCenterLandingBinding;", "binding$delegate", "Lby/kirich1409/viewbindingdelegate/f;", "getBinding", "()Lcom/withings/zendesk/databinding/FragmentHelpCenterLandingBinding;", "binding", "Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel$delegate", "Lnm0/g;", "getViewModel", "()Lcom/withings/zendesk/ui/vm/HelpCenterViewModel;", "viewModel", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo$delegate", "getProductInfo", "()Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo", "Lcom/withings/zendesk/ui/LabelAdapter;", "labelAdapter$delegate", "getLabelAdapter", "()Lcom/withings/zendesk/ui/LabelAdapter;", "labelAdapter", "Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter$delegate", "getPopularQuestionAdapter", "()Lcom/withings/zendesk/ui/PopularQuestionAdapter;", "popularQuestionAdapter", "<init>", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterLanding extends Fragment implements LabelAdapter.Callback {
    static final /* synthetic */ k<Object>[] $$delegatedProperties = {v.c(HelpCenterLanding.class, "binding", "getBinding()Lcom/withings/zendesk/databinding/FragmentHelpCenterLandingBinding;", 0)};
    public static final int $stable = 8;
    private final g args$delegate;
    private final f binding$delegate;
    private final nm0.g labelAdapter$delegate;
    private final nm0.g popularQuestionAdapter$delegate;
    private final nm0.g productInfo$delegate;
    private final nm0.g viewModel$delegate;

    public HelpCenterLanding() {
        super(R.layout.fragment_help_center_landing);
        this.args$delegate = new g(q0.b(HelpCenterLandingArgs.class), new HelpCenterLanding$special$$inlined$navArgs$1(this));
        this.binding$delegate = by.kirich1409.viewbindingdelegate.e.a(this, new HelpCenterLanding$special$$inlined$viewBindingFragment$default$1(), u9.a.a());
        this.viewModel$delegate = v0.a(this, q0.b(HelpCenterViewModel.class), new HelpCenterLanding$special$$inlined$activityViewModels$default$1(this), new HelpCenterLanding$special$$inlined$activityViewModels$default$2(null, this), new HelpCenterLanding$special$$inlined$activityViewModels$default$3(this));
        this.productInfo$delegate = h.b(new HelpCenterLanding$productInfo$2(this));
        this.labelAdapter$delegate = h.b(new HelpCenterLanding$labelAdapter$2(this));
        this.popularQuestionAdapter$delegate = h.b(new HelpCenterLanding$popularQuestionAdapter$2(this));
    }

    public final HelpCenterLandingArgs getArgs() {
        return (HelpCenterLandingArgs) this.args$delegate.getValue();
    }

    public final FragmentHelpCenterLandingBinding getBinding() {
        return (FragmentHelpCenterLandingBinding) this.binding$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final LabelAdapter getLabelAdapter() {
        return (LabelAdapter) this.labelAdapter$delegate.getValue();
    }

    public final PopularQuestionAdapter getPopularQuestionAdapter() {
        return (PopularQuestionAdapter) this.popularQuestionAdapter$delegate.getValue();
    }

    public final ProductHelpCenter getProductInfo() {
        return (ProductHelpCenter) this.productInfo$delegate.getValue();
    }

    private final HelpCenterViewModel getViewModel() {
        return (HelpCenterViewModel) this.viewModel$delegate.getValue();
    }

    private final void initHeaderInfos() {
        getBinding().productName.setText(getProductInfo().getProductName());
        getBinding().productInfo.setText(getProductInfo().getProductInfo());
        String productImageUrl = getProductInfo().getProductImageUrl();
        String str = null;
        if (j.D(productImageUrl)) {
            productImageUrl = null;
        }
        if (productImageUrl != null) {
            ImageView productImage = getBinding().productImage;
            u.i(productImage, "productImage");
            String productImageUrl2 = getProductInfo().getProductImageUrl();
            if (!j.D(productImageUrl2)) {
                str = productImageUrl2;
            }
            w9.g a11 = w9.a.a(productImage.getContext());
            f.a aVar = new f.a(productImage.getContext());
            aVar.d(str);
            aVar.q(productImage);
            a11.d(aVar.b());
        } else {
            ImageView productImage2 = getBinding().productImage;
            u.i(productImage2, "productImage");
            productImage2.setVisibility(8);
            y yVar = y.f85009a;
        }
        getBinding().productDetail.setOnClickListener(new i(this, 12));
    }

    public static final void initHeaderInfos$lambda$7(HelpCenterLanding this$0, View view) {
        u.j(this$0, "this$0");
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        Context context = view.getContext();
        u.i(context, "getContext(...)");
        this$0.startActivity(aVar.c(context, null, this$0.getProductInfo().getProductUrl()));
    }

    private final void initLabelsView() {
        RecyclerView recyclerView = getBinding().labels;
        recyclerView.setAdapter(getLabelAdapter());
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final void initPopularQuestionsView() {
        RecyclerView recyclerView = getBinding().popularQuestionsList;
        recyclerView.setAdapter(getPopularQuestionAdapter());
        recyclerView.setHasFixedSize(false);
        u0.o0(recyclerView);
    }

    private final void initViewModel() {
        HelpCenterViewModel viewModel = getViewModel();
        viewModel.getLabelsAndSections().observe(getViewLifecycleOwner(), new HelpCenterLanding$sam$androidx_lifecycle_Observer$0(new HelpCenterLanding$initViewModel$1$1(this, viewModel)));
        viewModel.getPopularArticles().observe(getViewLifecycleOwner(), new HelpCenterLanding$sam$androidx_lifecycle_Observer$0(new HelpCenterLanding$initViewModel$1$2(this)));
    }

    public static /* synthetic */ void s1(HelpCenterLanding helpCenterLanding, View view) {
        initHeaderInfos$lambda$7(helpCenterLanding, view);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        NestedScrollView root = getBinding().getRoot();
        u.i(root, "getRoot(...)");
        ay.b.n(root, true, true, 21);
        initHeaderInfos();
        initLabelsView();
        initPopularQuestionsView();
        Group popularQuestions = getBinding().popularQuestions;
        u.i(popularQuestions, "popularQuestions");
        popularQuestions.setVisibility(4);
        Group labelViews = getBinding().labelViews;
        u.i(labelViews, "labelViews");
        labelViews.setVisibility(4);
        initViewModel();
    }

    @Override // com.withings.zendesk.ui.LabelAdapter.Callback
    public void showArticlesForSectionAndLabel(ZendeskLabel zendeskLabel, Section section) {
        u.j(zendeskLabel, "zendeskLabel");
        u.j(section, "section");
        ah.e.a(this).K(HelpCenterLandingDirections.Companion.showArticleForSectionAndLabel(getProductInfo(), zendeskLabel, section, false));
    }

    @Override // com.withings.zendesk.ui.LabelAdapter.Callback
    public void showSectionsForLabel(ZendeskLabel zendeskLabel) {
        u.j(zendeskLabel, "zendeskLabel");
        ah.e.a(this).K(HelpCenterLandingDirections.Companion.showSectionsForLabel(getProductInfo(), zendeskLabel));
    }
}
