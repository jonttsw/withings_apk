package com.withings.zendesk.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.Constants;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.zendesk.R;
import com.withings.zendesk.ktx.ImageViewExtensionKt;
import com.withings.zendesk.ktx.ZendeskLabelExtensionKt;
import com.withings.zendesk.models.ZendeskLabel;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
/* compiled from: HelpCenterLanding.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/withings/zendesk/ui/LabelHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lcom/withings/zendesk/models/ZendeskLabel;", "zendeskLabel", "Lnm0/y;", Bind.ELEMENT, "(Lcom/withings/zendesk/models/ZendeskLabel;)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroid/widget/ImageView;", HealthUserProfile.USER_PROFILE_KEY_IMAGE, "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "Landroid/widget/TextView;", Constants.ScionAnalytics.PARAM_LABEL, "Landroid/widget/TextView;", "getLabel", "()Landroid/widget/TextView;", "<init>", "(Landroid/view/View;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LabelHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final ImageView image;
    private final TextView label;
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelHolder(View view) {
        super(view);
        u.j(view, "view");
        this.view = view;
        View findViewById = view.findViewById(R.id.image);
        u.i(findViewById, "findViewById(...)");
        this.image = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.label);
        u.i(findViewById2, "findViewById(...)");
        this.label = (TextView) findViewById2;
    }

    public final void bind(ZendeskLabel zendeskLabel) {
        u.j(zendeskLabel, "zendeskLabel");
        TextView textView = this.label;
        Context context = this.itemView.getContext();
        u.i(context, "getContext(...)");
        textView.setText(ZendeskLabelExtensionKt.wordingResId(zendeskLabel, context));
        ImageViewExtensionKt.setGlyph(this.image, zendeskLabel);
    }

    public final ImageView getImage() {
        return this.image;
    }

    public final TextView getLabel() {
        return this.label;
    }

    public final View getView() {
        return this.view;
    }
}
