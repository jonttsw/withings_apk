package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.g;
import nm0.h;
/* compiled from: DataView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\bR#\u0010\u0010\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0013\u001a\n \u000b*\u0004\u0018\u00010\n0\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/DataView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lnm0/y;", "setLabel", "(I)V", "", "(Ljava/lang/CharSequence;)V", "setValue", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getLabelView", "()Landroid/widget/TextView;", "labelView", "u", "getValueView", "valueView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DataView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final g f46473t;

    /* renamed from: u  reason: collision with root package name */
    private final g f46474u;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final TextView getLabelView() {
        return (TextView) this.f46473t.getValue();
    }

    public final TextView getValueView() {
        return (TextView) this.f46474u.getValue();
    }

    public final void setLabel(int i11) {
        setLabel(getContext().getString(i11));
    }

    public final void setValue(int i11) {
        setValue(getContext().getString(i11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46473t = h.b(new a(this));
        this.f46474u = h.b(new b(this));
        View.inflate(context, C1987R.layout.view_data_value, this);
        if (attributeSet == null || isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22410f);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        setLabel(obtainStyledAttributes.getString(0));
        setValue(obtainStyledAttributes.getString(1));
        obtainStyledAttributes.recycle();
    }

    public final void setLabel(CharSequence charSequence) {
        getLabelView().setText(charSequence);
    }

    public final void setValue(CharSequence charSequence) {
        getValueView().setText(charSequence);
    }
}
