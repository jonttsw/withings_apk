package com.withings.wiscale2.activity.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import tb0.k4;
/* compiled from: WorkoutTimelineView.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/activity/ui/WorkoutTimelineView;", "Landroid/widget/RelativeLayout;", "Ltb0/k4;", "a", "Ltb0/k4;", "getBinding", "()Ltb0/k4;", "binding", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WorkoutTimelineView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private final k4 f48615a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WorkoutTimelineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public final k4 getBinding() {
        return this.f48615a;
    }

    public /* synthetic */ WorkoutTimelineView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkoutTimelineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f48615a = k4.a(LayoutInflater.from(context), this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{C1987R.attr.selectableItemBackground});
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setForeground(obtainStyledAttributes.getDrawable(0));
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
    }
}
