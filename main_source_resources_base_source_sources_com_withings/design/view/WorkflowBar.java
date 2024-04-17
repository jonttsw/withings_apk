package com.withings.design.view;

import ah.u;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
/* loaded from: classes3.dex */
public class WorkflowBar extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    protected TextView f36451a;

    /* renamed from: b  reason: collision with root package name */
    protected TextView f36452b;

    /* renamed from: c  reason: collision with root package name */
    private int f36453c;

    /* renamed from: d  reason: collision with root package name */
    private int f36454d;

    /* renamed from: e  reason: collision with root package name */
    private int f36455e;

    public WorkflowBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    /* JADX WARN: Finally extract failed */
    private void a(AttributeSet attributeSet) {
        View.inflate(getContext(), C1987R.layout.view_workflowbar, this);
        int x11 = u.x(getContext(), 16842801);
        Context receiver$0 = getContext();
        kotlin.jvm.internal.u.k(receiver$0, "receiver$0");
        TypedArray obtainStyledAttributes = receiver$0.obtainStyledAttributes((AttributeSet) null, new int[]{C1987R.attr.colorSurface});
        try {
            int color = obtainStyledAttributes.getColor(0, x11);
            obtainStyledAttributes.recycle();
            setBackgroundColor(color);
            this.f36451a = (TextView) findViewById(C1987R.id.right);
            this.f36452b = (TextView) findViewById(C1987R.id.left);
            this.f36454d = this.f36451a.getCurrentTextColor();
            this.f36455e = this.f36452b.getCurrentTextColor();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(attributeSet, in.a.f72618t);
                String string = obtainStyledAttributes2.getString(1);
                String string2 = obtainStyledAttributes2.getString(2);
                this.f36453c = obtainStyledAttributes2.getColor(0, -1);
                obtainStyledAttributes2.recycle();
                setLeftText(string);
                setRightText(string2);
                int i11 = this.f36453c;
                if (i11 > 0) {
                    setTextsColor(i11);
                }
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public void setLeftClickListener(View.OnClickListener onClickListener) {
        this.f36452b.setOnClickListener(onClickListener);
    }

    public void setLeftEnabled(boolean z5) {
        int i11;
        this.f36452b.setEnabled(z5);
        int i12 = this.f36453c;
        if (i12 > 0) {
            TextView textView = this.f36452b;
            if (!z5) {
                i12 = p0.d.i(i12, 60);
            }
            textView.setTextColor(i12);
            return;
        }
        TextView textView2 = this.f36452b;
        if (z5) {
            i11 = this.f36455e;
        } else {
            i11 = p0.d.i(this.f36455e, 60);
        }
        textView2.setTextColor(i11);
    }

    public void setLeftLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36452b.setOnLongClickListener(onLongClickListener);
    }

    public void setLeftText(String str) {
        this.f36452b.setVisibility(str != null ? 0 : 8);
        this.f36452b.setText(str);
    }

    public void setLeftTextColor(int i11) {
        this.f36455e = i11;
        this.f36452b.setTextColor(i11);
    }

    public void setRightClickListener(View.OnClickListener onClickListener) {
        this.f36451a.setOnClickListener(onClickListener);
    }

    public void setRightEnabled(boolean z5) {
        int i11;
        this.f36451a.setEnabled(z5);
        int i12 = this.f36453c;
        if (i12 > 0) {
            TextView textView = this.f36451a;
            if (!z5) {
                i12 = p0.d.i(i12, 60);
            }
            textView.setTextColor(i12);
            return;
        }
        TextView textView2 = this.f36451a;
        if (z5) {
            i11 = this.f36454d;
        } else {
            i11 = p0.d.i(this.f36454d, 60);
        }
        textView2.setTextColor(i11);
    }

    public void setRightLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f36451a.setOnLongClickListener(onLongClickListener);
    }

    public void setRightText(String str) {
        this.f36451a.setVisibility(str != null ? 0 : 8);
        this.f36451a.setText(str);
    }

    public void setRightTextColor(int i11) {
        this.f36454d = i11;
        this.f36451a.setTextColor(i11);
    }

    public void setTextsColor(int i11) {
        this.f36452b.setTextColor(i11);
        this.f36451a.setTextColor(i11);
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
