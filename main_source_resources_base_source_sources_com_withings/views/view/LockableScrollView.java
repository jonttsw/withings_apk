package com.withings.views.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: LockableScrollView.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/views/view/LockableScrollView;", "Landroidx/core/widget/NestedScrollView;", "", StreamManagement.Enabled.ELEMENT, "Lnm0/y;", "setScrollingEnabled", "(Z)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class LockableScrollView extends NestedScrollView {
    private boolean M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        u.j(context, "context");
        this.M = true;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent ev2) {
        u.j(ev2, "ev");
        if (!this.M) {
            return false;
        }
        return super.onInterceptTouchEvent(ev2);
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev2) {
        u.j(ev2, "ev");
        if (ev2.getAction() == 0) {
            if (this.M) {
                return super.onTouchEvent(ev2);
            }
            return false;
        }
        return super.onTouchEvent(ev2);
    }

    public final void setScrollingEnabled(boolean z5) {
        this.M = z5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableScrollView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.M = true;
    }
}
