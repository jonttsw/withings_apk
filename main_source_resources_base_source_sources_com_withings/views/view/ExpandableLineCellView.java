package com.withings.views.view;

import android.animation.FloatEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: ExpandableLineCellView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/withings/views/view/ExpandableLineCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "title", "Lnm0/y;", "setInfoTitle", "(Ljava/lang/CharSequence;)V", "detail", "setInfoDetail", "Lcom/withings/views/widget/LineCellView;", "x", "Lcom/withings/views/widget/LineCellView;", "getLineCellView", "()Lcom/withings/views/widget/LineCellView;", "setLineCellView", "(Lcom/withings/views/widget/LineCellView;)V", "lineCellView", "", "y", "Z", "isCollapsed", "()Z", "setCollapsed", "(Z)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ExpandableLineCellView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f46552t;

    /* renamed from: u  reason: collision with root package name */
    private final androidx.constraintlayout.widget.b f46553u;

    /* renamed from: v  reason: collision with root package name */
    private final TextView f46554v;

    /* renamed from: w  reason: collision with root package name */
    private final TextView f46555w;

    /* renamed from: x  reason: collision with root package name */
    private LineCellView f46556x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f46557y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableLineCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    public static void t(ExpandableLineCellView this$0, ValueAnimator it) {
        u.j(this$0, "this$0");
        u.j(it, "it");
        Object animatedValue = it.getAnimatedValue();
        u.h(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        this$0.f46554v.setAlpha(floatValue);
        this$0.f46555w.setAlpha(floatValue);
    }

    private final void u(float f11, float f12) {
        TimeInterpolator accelerateInterpolator;
        ValueAnimator ofObject = ValueAnimator.ofObject(new FloatEvaluator(), Float.valueOf(f11), Float.valueOf(f12));
        if (f11 > f12) {
            accelerateInterpolator = new DecelerateInterpolator(2.0f);
        } else {
            accelerateInterpolator = new AccelerateInterpolator(2.0f);
        }
        ofObject.setInterpolator(accelerateInterpolator);
        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.withings.views.view.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ExpandableLineCellView.t(ExpandableLineCellView.this, valueAnimator);
            }
        });
        ofObject.start();
    }

    public final LineCellView getLineCellView() {
        return this.f46556x;
    }

    public final void setCollapsed(boolean z5) {
        this.f46557y = z5;
    }

    public final void setInfoDetail(CharSequence detail) {
        u.j(detail, "detail");
        this.f46555w.setText(detail);
    }

    public final void setInfoTitle(CharSequence title) {
        u.j(title, "title");
        this.f46554v.setText(title);
    }

    public final void setLineCellView(LineCellView lineCellView) {
        u.j(lineCellView, "<set-?>");
        this.f46556x = lineCellView;
    }

    public final void v() {
        this.f46557y = true;
        this.f46552t.e(this);
        this.f46556x.setRightValueIcon(C1987R.drawable.icon_medium_navigation_downsm);
        u(1.0f, 0.0f);
    }

    public final void w() {
        this.f46557y = false;
        this.f46553u.e(this);
        this.f46556x.setRightValueIcon(C1987R.drawable.icon_medium_navigation_upsm);
        u(0.0f, 1.0f);
    }

    public final void x() {
        if (this.f46557y) {
            w();
        } else {
            v();
        }
    }

    public /* synthetic */ ExpandableLineCellView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableLineCellView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        this.f46552t = bVar;
        androidx.constraintlayout.widget.b bVar2 = new androidx.constraintlayout.widget.b();
        this.f46553u = bVar2;
        this.f46557y = true;
        LayoutInflater.from(getContext()).inflate(C1987R.layout.expandable_line_cell_view_collapsed, (ViewGroup) this, true);
        View findViewById = findViewById(C1987R.id.expandable_top_divider);
        u.i(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(C1987R.id.expandable_line_cell_view);
        u.i(findViewById2, "findViewById(...)");
        this.f46556x = (LineCellView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.expandable_info_title);
        u.i(findViewById3, "findViewById(...)");
        this.f46554v = (TextView) findViewById3;
        View findViewById4 = findViewById(C1987R.id.expandable_info_detail);
        u.i(findViewById4, "findViewById(...)");
        this.f46555w = (TextView) findViewById4;
        View findViewById5 = findViewById(C1987R.id.expandable_bottom_divider);
        u.i(findViewById5, "findViewById(...)");
        this.f46556x.setShowRightValueIcon(true);
        this.f46556x.setRightValueIcon(C1987R.drawable.icon_medium_navigation_downsm);
        bringChildToFront(findViewById);
        bVar.k(this);
        bVar.e(this);
        bVar2.l(bVar);
        bVar2.N(findViewById.getId(), 1, 0);
        bVar2.N(findViewById.getId(), 2, 0);
        bVar2.j(findViewById5.getId(), 4);
        bVar2.n(findViewById5.getId(), 4, 0, 4);
    }
}
