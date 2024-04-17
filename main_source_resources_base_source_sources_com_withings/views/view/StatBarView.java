package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.messaging.Constants;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: StatBarLayout.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\bR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/withings/views/view/StatBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", Constants.ScionAnalytics.PARAM_LABEL, "Lnm0/y;", "setLabel", "(I)V", "", "(Ljava/lang/CharSequence;)V", "setValue", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getLabelView", "()Landroid/widget/TextView;", "labelView", "u", "getValueView", "valueView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StatBarView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f46714t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f46715u;

    /* compiled from: StatBarLayout.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) StatBarView.this.findViewById(C1987R.id.label);
        }
    }

    /* compiled from: StatBarLayout.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) StatBarView.this.findViewById(C1987R.id.value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final TextView getLabelView() {
        return (TextView) this.f46714t.getValue();
    }

    public final TextView getValueView() {
        return (TextView) this.f46715u.getValue();
    }

    public final void setLabel(int i11) {
        getLabelView().setText(i11);
    }

    public final void setValue(int i11) {
        getValueView().setText(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatBarView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46714t = nm0.h.b(new a());
        this.f46715u = nm0.h.b(new b());
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1987R.dimen.keyline_0);
        View.inflate(context, C1987R.layout.design_view_stat_bar, this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = dimensionPixelSize;
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.weight = 1.0f;
        setLayoutParams(layoutParams);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22422r);
            u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            getLabelView().setText(obtainStyledAttributes.getString(0));
            TextView labelView = getLabelView();
            u.i(labelView, "<get-labelView>(...)");
            xq.a.a(labelView, obtainStyledAttributes.getResourceId(1, C1987R.style.detail));
            getValueView().setText(obtainStyledAttributes.getString(3));
            TextView valueView = getValueView();
            u.i(valueView, "<get-valueView>(...)");
            xq.a.a(valueView, obtainStyledAttributes.getResourceId(2, C1987R.style.header4));
            obtainStyledAttributes.recycle();
        }
    }

    public final void setLabel(CharSequence label) {
        u.j(label, "label");
        getLabelView().setText(label);
    }

    public final void setValue(CharSequence label) {
        u.j(label, "label");
        getValueView().setText(label);
    }
}
