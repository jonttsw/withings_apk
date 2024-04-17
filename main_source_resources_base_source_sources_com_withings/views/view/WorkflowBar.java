package com.withings.views.view;

import ah.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
@Deprecated
/* loaded from: classes4.dex */
public class WorkflowBar extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    protected TextView f46745a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f46746b;

    /* renamed from: c  reason: collision with root package name */
    private int f46747c;

    /* renamed from: d  reason: collision with root package name */
    private int f46748d;

    /* renamed from: e  reason: collision with root package name */
    private int f46749e;

    public WorkflowBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        View.inflate(getContext(), C1987R.layout.view_workflowbar, this);
        setBackgroundColor(u.w(C1987R.attr.colorSurface, getContext(), u.v(16842801, getContext())));
        this.f46745a = (TextView) findViewById(C1987R.id.right);
        this.f46746b = (TextView) findViewById(C1987R.id.left);
        this.f46748d = this.f46745a.getCurrentTextColor();
        this.f46749e = this.f46746b.getCurrentTextColor();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22426v);
            String string = obtainStyledAttributes.getString(1);
            String string2 = obtainStyledAttributes.getString(2);
            this.f46747c = obtainStyledAttributes.getColor(0, -1);
            obtainStyledAttributes.recycle();
            setLeftText(string);
            setRightText(string2);
            int i11 = this.f46747c;
            if (i11 > 0) {
                setTextsColor(i11);
            }
        }
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.f46746b.setOnClickListener(onClickListener);
    }

    public void setLeftEnabled(boolean z5) {
        int k11;
        this.f46746b.setEnabled(z5);
        int i11 = this.f46747c;
        if (i11 > 0) {
            TextView textView = this.f46746b;
            if (!z5) {
                i11 = u.k(i11, 60);
            }
            textView.setTextColor(i11);
            return;
        }
        TextView textView2 = this.f46746b;
        if (z5) {
            k11 = this.f46749e;
        } else {
            k11 = u.k(this.f46749e, 60);
        }
        textView2.setTextColor(k11);
    }

    public void setLeftLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f46746b.setOnLongClickListener(onLongClickListener);
    }

    public void setLeftText(String str) {
        this.f46746b.setVisibility(str != null ? 0 : 8);
        this.f46746b.setText(str);
    }

    public void setLeftTextColor(int i11) {
        this.f46749e = i11;
        this.f46746b.setTextColor(i11);
    }

    public void setRightClickListener(View.OnClickListener onClickListener) {
        this.f46745a.setOnClickListener(onClickListener);
    }

    public void setRightEnabled(boolean z5) {
        int k11;
        this.f46745a.setEnabled(z5);
        int i11 = this.f46747c;
        if (i11 > 0) {
            TextView textView = this.f46745a;
            if (!z5) {
                i11 = u.k(i11, 60);
            }
            textView.setTextColor(i11);
            return;
        }
        TextView textView2 = this.f46745a;
        if (z5) {
            k11 = this.f46748d;
        } else {
            k11 = u.k(this.f46748d, 60);
        }
        textView2.setTextColor(k11);
    }

    public void setRightLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f46745a.setOnLongClickListener(onLongClickListener);
    }

    public void setRightText(String str) {
        this.f46745a.setVisibility(str != null ? 0 : 8);
        this.f46745a.setText(str);
    }

    public void setRightTextColor(int i11) {
        this.f46748d = i11;
        this.f46745a.setTextColor(i11);
    }

    public void setTextsColor(int i11) {
        this.f46746b.setTextColor(i11);
        this.f46745a.setTextColor(i11);
    }

    public WorkflowBar(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        a(attributeSet);
    }

    public void setLeftText(int i11) {
        setLeftText(getResources().getString(i11));
    }

    public void setRightText(int i11) {
        setRightText(getResources().getString(i11));
    }
}
