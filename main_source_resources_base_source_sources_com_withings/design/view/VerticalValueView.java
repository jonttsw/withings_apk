package com.withings.design.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
/* loaded from: classes3.dex */
public class VerticalValueView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private TextView f36432a;

    /* renamed from: b  reason: collision with root package name */
    private TextView f36433b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f36434c;

    public VerticalValueView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.vertical_value_display, this);
        this.f36432a = (TextView) inflate.findViewById(C1987R.id.name);
        this.f36433b = (TextView) inflate.findViewById(C1987R.id.value);
        this.f36434c = (TextView) inflate.findViewById(C1987R.id.unit);
        setOrientation(1);
        setGravity(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, in.a.f72616r);
            setName(obtainStyledAttributes.getString(0));
            setUnit(obtainStyledAttributes.getString(2));
            this.f36432a.setTextAppearance(obtainStyledAttributes.getResourceId(1, C1987R.style.metricTitle));
            this.f36434c.setTextAppearance(obtainStyledAttributes.getResourceId(3, C1987R.style.subtextRegular));
            this.f36433b.setTextAppearance(obtainStyledAttributes.getResourceId(6, C1987R.style.data4));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, (int) obtainStyledAttributes.getDimension(5, ah.g.i(20, getContext())), 0, (int) obtainStyledAttributes.getDimension(4, ah.g.i(4, getContext())));
            this.f36433b.setLayoutParams(layoutParams);
            obtainStyledAttributes.recycle();
        }
        if (isInEditMode()) {
            this.f36433b.setText("value");
        }
    }

    public void setName(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36432a.setText(str);
        }
    }

    public void setNameTextAppearance(int i11) {
        this.f36432a.setTextAppearance(i11);
    }

    public void setUnit(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f36434c.setText(str);
        }
    }

    public void setUnitTextAppearance(int i11) {
        this.f36434c.setTextAppearance(i11);
    }

    public void setValue(int i11) {
        this.f36433b.setText(NumberFormat.getNumberInstance().format(i11));
    }

    public void setValueText(CharSequence charSequence) {
        this.f36433b.setText(charSequence);
    }

    public void setValueTextAppearance(int i11) {
        this.f36433b.setTextAppearance(i11);
    }

    public VerticalValueView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(attributeSet);
    }
}
