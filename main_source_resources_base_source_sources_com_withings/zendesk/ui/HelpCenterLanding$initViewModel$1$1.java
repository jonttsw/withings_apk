package com.withings.zendesk.ui;

import androidx.constraintlayout.widget.Group;
import com.withings.zendesk.databinding.FragmentHelpCenterLandingBinding;
import com.withings.zendesk.models.ZendeskLabelData;
import com.withings.zendesk.ui.vm.HelpCenterViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/withings/zendesk/models/ZendeskLabelData;", "kotlin.jvm.PlatformType", "it", "Lnm0/y;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HelpCenterLanding$initViewModel$1$1 extends w implements l<List<? extends ZendeskLabelData>, y> {
    final /* synthetic */ HelpCenterViewModel $this_with;
    final /* synthetic */ HelpCenterLanding this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HelpCenterLanding$initViewModel$1$1(HelpCenterLanding helpCenterLanding, HelpCenterViewModel helpCenterViewModel) {
        super(1);
        this.this$0 = helpCenterLanding;
        this.$this_with = helpCenterViewModel;
    }

    @Override // ym0.l
    public /* bridge */ /* synthetic */ y invoke(List<? extends ZendeskLabelData> list) {
        invoke2((List<ZendeskLabelData>) list);
        return y.f85009a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(List<ZendeskLabelData> list) {
        FragmentHelpCenterLandingBinding binding;
        LabelAdapter labelAdapter;
        binding = this.this$0.getBinding();
        Group labelViews = binding.labelViews;
        u.i(labelViews, "labelViews");
        labelViews.setVisibility(this.$this_with.getLabels$zendesk_release().isEmpty() ? 4 : 0);
        labelAdapter = this.this$0.getLabelAdapter();
        labelAdapter.submitList(list);
    }
}
