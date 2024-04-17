package com.withings.views.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.wiscale2.C1987R;
/* loaded from: classes4.dex */
public class TwoLinesCellView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    protected TextView f46824t;

    /* renamed from: u  reason: collision with root package name */
    protected TextView f46825u;

    /* renamed from: v  reason: collision with root package name */
    protected ImageView f46826v;

    /* renamed from: w  reason: collision with root package name */
    protected View f46827w;

    /* renamed from: x  reason: collision with root package name */
    protected View f46828x;

    public TwoLinesCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1987R.attr.twoLinesCellViewStyle);
    }

    public CharSequence getValue() {
        return this.f46825u.getText();
    }

    @Override // android.view.View
    public void setAlpha(float f11) {
        this.f46824t.setAlpha(f11);
        this.f46825u.setAlpha(f11);
    }

    public void setBottomDividerVisibility(boolean z5) {
        int i11;
        View view = this.f46828x;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    public void setLabel(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f46824t.setText(charSequence.toString());
        }
    }

    public void setTopDividerVisibility(boolean z5) {
        int i11;
        View view = this.f46827w;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
    }

    public void setValue(CharSequence charSequence) {
        this.f46825u.setText(charSequence);
    }

    public TwoLinesCellView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(getContext()).inflate(C1987R.layout.two_lines_cell_view, this);
        this.f46824t = (TextView) findViewById(C1987R.id.two_lines_view_label);
        this.f46825u = (TextView) findViewById(C1987R.id.two_lines_view_value);
        this.f46826v = (ImageView) findViewById(C1987R.id.two_lines_view_icon);
        this.f46827w = findViewById(C1987R.id.two_lines_view_top_divider);
        this.f46828x = findViewById(C1987R.id.two_lines_view_bottom_divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22425u);
            TextView textView = this.f46824t;
            int resourceId = obtainStyledAttributes.getResourceId(3, C1987R.style.body1);
            if (resourceId != C1987R.style.body1) {
                xq.a.a(textView, resourceId);
            }
            TextView textView2 = this.f46825u;
            int resourceId2 = obtainStyledAttributes.getResourceId(10, C1987R.style.data7);
            if (resourceId2 != C1987R.style.data7) {
                xq.a.a(textView2, resourceId2);
            }
            this.f46824t.setTextColor(getContext().getColor(C1987R.color.textSecondary));
            this.f46825u.setText(obtainStyledAttributes.getText(9));
            if (obtainStyledAttributes.getBoolean(8, false)) {
                this.f46824t.setVisibility(8);
            } else {
                setLabel(obtainStyledAttributes.getText(2));
            }
            setTopDividerVisibility(obtainStyledAttributes.getBoolean(7, false));
            setBottomDividerVisibility(obtainStyledAttributes.getBoolean(6, false));
            int resourceId3 = obtainStyledAttributes.getResourceId(0, -1);
            if (resourceId3 != -1) {
                this.f46826v.setImageResource(resourceId3);
            }
            obtainStyledAttributes.recycle();
        }
        if (isClickable()) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            setBackgroundResource(typedValue.resourceId);
        }
    }
}
