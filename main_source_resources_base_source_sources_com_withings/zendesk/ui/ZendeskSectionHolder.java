package com.withings.zendesk.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.withings.zendesk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.packet.Bind;
import org.jivesoftware.smackx.xdatalayout.packet.DataLayout;
import zendesk.support.Section;
/* compiled from: SectionList.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/withings/zendesk/ui/ZendeskSectionHolder;", "Landroidx/recyclerview/widget/RecyclerView$z;", "Lzendesk/support/Section;", DataLayout.Section.ELEMENT, "Lnm0/y;", Bind.ELEMENT, "(Lzendesk/support/Section;)V", "Lcom/google/android/material/textview/MaterialTextView;", "title", "Lcom/google/android/material/textview/MaterialTextView;", "getTitle", "()Lcom/google/android/material/textview/MaterialTextView;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "zendesk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ZendeskSectionHolder extends RecyclerView.z {
    public static final int $stable = 8;
    private final MaterialTextView title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZendeskSectionHolder(View view) {
        super(view);
        u.j(view, "view");
        View findViewById = view.findViewById(R.id.help_center_section_title);
        u.i(findViewById, "findViewById(...)");
        this.title = (MaterialTextView) findViewById;
    }

    public final void bind(Section section) {
        u.j(section, "section");
        this.title.setText(section.getName());
    }

    public final MaterialTextView getTitle() {
        return this.title;
    }
}
