package com.withings.zendesk.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.m;
import androidx.recyclerview.widget.u;
import com.withings.coach.chatbot.z0;
import com.withings.device.details.scale.z;
import com.withings.wiscale2.C1987R;
import com.withings.zendesk.R;
import com.withings.zendesk.models.ZendeskLabel;
import com.withings.zendesk.models.ZendeskLabelData;
import kotlin.Metadata;
import kotlin.collections.x;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import zendesk.support.Section;
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/withings/zendesk/ui/LabelAdapter;", "Landroidx/recyclerview/widget/u;", "Lcom/withings/zendesk/models/ZendeskLabelData;", "Lcom/withings/zendesk/ui/LabelHolder;", "", "getItemCount", "()I", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/withings/zendesk/ui/LabelHolder;", "holder", "position", "Lnm0/y;", "onBindViewHolder", "(Lcom/withings/zendesk/ui/LabelHolder;I)V", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "productInfo", "Lcom/withings/zendesk/ui/ProductHelpCenter;", "Lcom/withings/zendesk/ui/LabelAdapter$Callback;", "onLabelClick", "Lcom/withings/zendesk/ui/LabelAdapter$Callback;", "<init>", "(Lcom/withings/zendesk/ui/ProductHelpCenter;Lcom/withings/zendesk/ui/LabelAdapter$Callback;)V", "Callback", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LabelAdapter extends u<ZendeskLabelData, LabelHolder> {
    public static final int $stable = 8;
    private final Callback onLabelClick;
    private final ProductHelpCenter productInfo;

    /* compiled from: HelpCenterLanding.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/withings/zendesk/ui/LabelAdapter$Callback;", "", "Lcom/withings/zendesk/models/ZendeskLabel;", "zendeskLabel", "Lnm0/y;", "showSectionsForLabel", "(Lcom/withings/zendesk/models/ZendeskLabel;)V", "Lzendesk/support/Section;", DataLayout.Section.ELEMENT, "showArticlesForSectionAndLabel", "(Lcom/withings/zendesk/models/ZendeskLabel;Lzendesk/support/Section;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface Callback {
        void showArticlesForSectionAndLabel(ZendeskLabel zendeskLabel, Section section);

        void showSectionsForLabel(ZendeskLabel zendeskLabel);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelAdapter(ProductHelpCenter productInfo, Callback onLabelClick) {
        super(new m.f<ZendeskLabelData>() { // from class: com.withings.zendesk.ui.LabelAdapter.1
            @Override // androidx.recyclerview.widget.m.f
            public boolean areContentsTheSame(ZendeskLabelData oldItem, ZendeskLabelData newItem) {
                kotlin.jvm.internal.u.j(oldItem, "oldItem");
                kotlin.jvm.internal.u.j(newItem, "newItem");
                return kotlin.jvm.internal.u.e(oldItem.getLabel().getZendeskLabel(), newItem.getLabel().getZendeskLabel());
            }

            @Override // androidx.recyclerview.widget.m.f
            public boolean areItemsTheSame(ZendeskLabelData oldItem, ZendeskLabelData newItem) {
                kotlin.jvm.internal.u.j(oldItem, "oldItem");
                kotlin.jvm.internal.u.j(newItem, "newItem");
                return kotlin.jvm.internal.u.e(oldItem, newItem);
            }
        });
        kotlin.jvm.internal.u.j(productInfo, "productInfo");
        kotlin.jvm.internal.u.j(onLabelClick, "onLabelClick");
        this.productInfo = productInfo;
        this.onLabelClick = onLabelClick;
    }

    public static final void onBindViewHolder$lambda$0(LabelAdapter this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        view.getContext().startActivity(this$0.productInfo.getTutorialIntent());
    }

    public static final void onBindViewHolder$lambda$3$lambda$2(ZendeskLabelData zendeskLabelData, LabelAdapter this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (zendeskLabelData.getSections().size() > 1) {
            this$0.onLabelClick.showSectionsForLabel(zendeskLabelData.getLabel());
            return;
        }
        Section section = (Section) x.K(zendeskLabelData.getSections());
        if (section != null) {
            this$0.onLabelClick.showArticlesForSectionAndLabel(zendeskLabelData.getLabel(), section);
        }
    }

    @Override // androidx.recyclerview.widget.u, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i11;
        int itemCount = super.getItemCount();
        if (this.productInfo.getTutorialIntent() == null) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        return itemCount + i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(LabelHolder holder, int i11) {
        kotlin.jvm.internal.u.j(holder, "holder");
        if (this.productInfo.getTutorialIntent() != null && i11 == super.getItemCount()) {
            holder.getLabel().setText(C1987R.string.deviceDetailView_tutorial);
            holder.getImage().setImageResource(R.drawable.ic_stock_magic);
            holder.itemView.setOnClickListener(new z(this, 15));
            return;
        }
        ZendeskLabelData item = getItem(i11);
        holder.bind(item.getLabel());
        holder.itemView.setOnClickListener(new z0(2, item, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public LabelHolder onCreateViewHolder(ViewGroup parent, int i11) {
        kotlin.jvm.internal.u.j(parent, "parent");
        return new LabelHolder(androidx.collection.c.n(parent, R.layout.help_center_label_item));
    }
}
