package com.withings.common.compose.component.interop;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: LabelValueCellInterop.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/common/compose/component/interop/LabelValueCellInterop;", "Landroid/widget/FrameLayout;", "Landroidx/compose/ui/platform/ComposeView;", "a", "Landroidx/compose/ui/platform/ComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "composeView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "remedy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LabelValueCellInterop extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final ComposeView f33892a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelValueCellInterop(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static void a(LabelValueCellInterop labelValueCellInterop, String str, String str2, ym0.a aVar, int i11) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        labelValueCellInterop.f33892a.setContent(new s1.a(true, 1351306225, new b(str, null, str2, false, false, true, aVar)));
    }

    public final ComposeView getComposeView() {
        return this.f33892a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelValueCellInterop(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        ComposeView composeView = new ComposeView(context, null, 6, 0);
        this.f33892a = composeView;
        removeAllViews();
        addView(composeView, new FrameLayout.LayoutParams(-1, -2));
    }
}
