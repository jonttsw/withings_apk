package com.withings.views.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.coach.chatbot.a1;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.profile.q;
import dp0.j;
import kotlin.jvm.internal.u;
import v.i;
import x6.f;
/* loaded from: classes4.dex */
public class LineCellView extends ConstraintLayout {
    private boolean A;
    private boolean B;
    private int F;
    private View.OnClickListener G;

    /* renamed from: t  reason: collision with root package name */
    protected TextView f46817t;

    /* renamed from: u  reason: collision with root package name */
    protected TextView f46818u;

    /* renamed from: v  reason: collision with root package name */
    protected TextView f46819v;

    /* renamed from: w  reason: collision with root package name */
    protected ImageView f46820w;

    /* renamed from: x  reason: collision with root package name */
    protected View f46821x;

    /* renamed from: y  reason: collision with root package name */
    protected View f46822y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable[] f46823z;

    /* loaded from: classes4.dex */
    public interface a {
    }

    public LineCellView(Context context) {
        this(context, null, C1987R.attr.lineCellViewStyle);
    }

    public static void t(LineCellView lineCellView, a aVar) {
        int i11 = lineCellView.F + 1;
        lineCellView.F = i11;
        i iVar = (i) aVar;
        LineCellView lineCellView2 = (LineCellView) iVar.f102957a;
        com.withings.wiscale2.profile.b allTimeStat = (com.withings.wiscale2.profile.b) iVar.f102958b;
        q.a aVar2 = q.R;
        u.j(lineCellView2, "$lineCellView");
        u.j(allTimeStat, "$allTimeStat");
        if (i11 % 2 == 0) {
            lineCellView2.setValue(allTimeStat.a());
        } else {
            lineCellView2.setValue(allTimeStat.b());
        }
    }

    public static /* synthetic */ void u(LineCellView lineCellView, View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            lineCellView.G = onClickListener;
        }
        lineCellView.setClickable(true);
        lineCellView.w();
    }

    private void v() {
        Drawable drawable;
        Drawable drawable2;
        TextView textView = this.f46819v;
        boolean z5 = this.A;
        Drawable[] drawableArr = this.f46823z;
        if (z5) {
            drawable = drawableArr[0];
        } else {
            drawable = null;
        }
        if (this.B) {
            drawable2 = drawableArr[2];
        } else {
            drawable2 = null;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
    }

    private void w() {
        if (isClickable()) {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            setBackgroundResource(typedValue.resourceId);
        }
    }

    public Drawable getLeftValueIcon() {
        return this.f46819v.getCompoundDrawables()[0];
    }

    public Drawable getRightValueIcon() {
        return this.f46819v.getCompoundDrawables()[2];
    }

    public CharSequence getValue() {
        return this.f46819v.getText();
    }

    @Override // android.view.View
    public void setAlpha(float f11) {
        this.f46817t.setAlpha(f11);
        this.f46819v.setAlpha(f11);
    }

    public void setAlphaEnable(Boolean bool) {
        float f11;
        if (bool.booleanValue()) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        setAlpha(f11);
    }

    public void setBottomDividerVisibility(boolean z5) {
        int i11;
        View view = this.f46822y;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public void setClickCountListener(a aVar) {
        setOnClickListener(new a1(1, this, aVar));
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        super.setEnabled(z5);
        if (z5) {
            setAlpha(1.0f);
            setOnClickListener(this.G);
            return;
        }
        setAlpha(0.3f);
        setOnClickListener(null);
    }

    public void setLabel(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f46817t.setText(charSequence.toString());
        }
    }

    public void setLabelIcon(int i11) {
        setLabelIcon(androidx.core.content.a.getDrawable(getContext(), i11));
    }

    public void setLeftValueIcon(int i11) {
        setLeftValueIcon(androidx.core.content.a.getDrawable(getContext(), i11));
    }

    public void setMaxLines(Integer num) {
        this.f46817t.setMaxLines(num.intValue());
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        post(new f(4, this, onClickListener));
    }

    public void setRightValueIcon(Drawable drawable) {
        this.f46823z[2] = drawable;
        v();
    }

    public void setSecondaryLabel(CharSequence charSequence) {
        if (charSequence != null) {
            String charSequence2 = j.i0(androidx.core.text.c.a(charSequence.toString())).toString();
            if (!TextUtils.isEmpty(charSequence2)) {
                this.f46818u.setVisibility(0);
                this.f46818u.setText(charSequence2);
            }
        }
    }

    public void setShowRightValueIcon(boolean z5) {
        this.B = z5;
        v();
    }

    public void setTopDividerVisibility(boolean z5) {
        int i11;
        View view = this.f46821x;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        view.setVisibility(i11);
    }

    public void setValue(CharSequence charSequence) {
        this.f46819v.setVisibility(0);
        this.f46819v.setText(charSequence);
    }

    public final void x(int i11, int i12) {
        setLabelIcon(y70.a.a(i11, getContext(), i12));
    }

    public LineCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1987R.attr.lineCellViewStyle);
    }

    public void setLabelIcon(Drawable drawable) {
        this.f46820w.setVisibility(0);
        this.f46820w.setImageDrawable(drawable);
    }

    public void setLeftValueIcon(Drawable drawable) {
        this.f46823z[0] = drawable;
        v();
    }

    public LineCellView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46823z = new Drawable[4];
        this.A = false;
        this.B = false;
        this.F = 0;
        LayoutInflater.from(getContext()).inflate(C1987R.layout.line_cell_view, this);
        this.f46817t = (TextView) findViewById(C1987R.id.line_cell_view_label);
        this.f46818u = (TextView) findViewById(C1987R.id.line_cell_view_secondary_label);
        this.f46819v = (TextView) findViewById(C1987R.id.line_cell_view_value);
        this.f46820w = (ImageView) findViewById(C1987R.id.line_cell_view_left_image_view);
        this.f46821x = findViewById(C1987R.id.line_cell_view_top_divider);
        this.f46822y = findViewById(C1987R.id.line_cell_view_bottom_divider);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22418n);
            TextView textView = this.f46817t;
            int resourceId = obtainStyledAttributes.getResourceId(3, C1987R.style.body1);
            if (resourceId != C1987R.style.body1) {
                xq.a.a(textView, resourceId);
            }
            TextView textView2 = this.f46819v;
            int resourceId2 = obtainStyledAttributes.getResourceId(14, C1987R.style.data7);
            if (resourceId2 != C1987R.style.data7) {
                xq.a.a(textView2, resourceId2);
            }
            this.f46817t.setTextColor(getContext().getColor(C1987R.color.textSecondary));
            this.f46819v.setText(obtainStyledAttributes.getText(13));
            if (obtainStyledAttributes.getBoolean(12, false)) {
                this.f46817t.setVisibility(8);
            } else {
                if (obtainStyledAttributes.getBoolean(8, false)) {
                    setLabelIcon(obtainStyledAttributes.getResourceId(0, 2131231540));
                }
                boolean z5 = obtainStyledAttributes.getBoolean(9, false);
                this.A = z5;
                if (z5) {
                    setLeftValueIcon(obtainStyledAttributes.getResourceId(4, 2131231540));
                }
                boolean z11 = obtainStyledAttributes.getBoolean(10, false);
                this.B = z11;
                if (z11) {
                    setRightValueIcon(obtainStyledAttributes.getResourceId(5, 2131231540));
                }
                this.f46817t.setMaxLines(obtainStyledAttributes.getInteger(1, 1));
                setLabel(obtainStyledAttributes.getText(2));
                setSecondaryLabel(obtainStyledAttributes.getText(6));
            }
            if (obtainStyledAttributes.getBoolean(11, false)) {
                setTopDividerVisibility(true);
            }
            if (obtainStyledAttributes.getBoolean(7, false)) {
                setBottomDividerVisibility(true);
            }
            obtainStyledAttributes.recycle();
        }
        w();
    }

    public void setRightValueIcon(int i11) {
        setRightValueIcon(y70.a.c(i11, getContext(), ah.u.v(C1987R.attr.colorOnSurface, getContext())));
    }
}
