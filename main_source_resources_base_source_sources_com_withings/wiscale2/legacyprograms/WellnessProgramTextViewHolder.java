package com.withings.wiscale2.legacyprograms;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
import org.jivesoftware.smack.packet.Bind;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WellnessProgramsAdapter.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR#\u0010\u0011\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R#\u0010\u0016\u001a\n \f*\u0004\u0018\u00010\u00120\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramTextViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "", XHTMLText.STYLE, "", "textValue", "", "showDivider", "Lnm0/y;", Bind.ELEMENT, "(ILjava/lang/String;Z)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "textView$delegate", "Lnm0/g;", "getTextView", "()Landroid/widget/TextView;", "textView", "Landroid/view/View;", "divider$delegate", "getDivider", "()Landroid/view/View;", "divider", "view", "<init>", "(Landroid/view/View;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WellnessProgramTextViewHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final g divider$delegate;
    private final g textView$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WellnessProgramTextViewHolder(View view) {
        super(view);
        u.j(view, "view");
        this.textView$delegate = h.b(new WellnessProgramTextViewHolder$textView$2(view));
        this.divider$delegate = h.b(new WellnessProgramTextViewHolder$divider$2(view));
    }

    private final View getDivider() {
        return (View) this.divider$delegate.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.textView$delegate.getValue();
    }

    public final void bind(int i11, String textValue, boolean z5) {
        int i12;
        u.j(textValue, "textValue");
        TextView textView = getTextView();
        u.i(textView, "<get-textView>(...)");
        xq.a.a(textView, i11);
        getTextView().setText(textValue);
        View divider = getDivider();
        if (z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        divider.setVisibility(i12);
    }
}
