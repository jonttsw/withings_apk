package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.l;
/* compiled from: DefinitionView.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u000e\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00040\u0010j\u0002`\u0012¢\u0006\u0004\b\u000e\u0010\u0013R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019¨\u0006%"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/DefinitionView;", "Lcom/google/android/material/card/MaterialCardView;", "", "iconResId", "Lnm0/y;", "setIcon", "(I)V", "text", "setMessage", "", "(Ljava/lang/CharSequence;)V", "setButtonText", "Landroid/view/View$OnClickListener;", "onClickListener", "setButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/withings/views/measure/detail/ui/views/DefinitionActionClicked;", "(Lym0/l;)V", "", "value", "getButtonVisible", "()Z", "setButtonVisible", "(Z)V", "buttonVisible", "getButtonEnabled", "setButtonEnabled", "buttonEnabled", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class DefinitionView extends MaterialCardView {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f46475r = 0;

    /* renamed from: o  reason: collision with root package name */
    private final ImageView f46476o;

    /* renamed from: p  reason: collision with root package name */
    private final TextView f46477p;

    /* renamed from: q  reason: collision with root package name */
    private final Button f46478q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefinitionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final boolean getButtonEnabled() {
        return this.f46478q.isEnabled();
    }

    public final boolean getButtonVisible() {
        if (this.f46478q.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void setButtonClickListener(l<? super View, y> onClickListener) {
        u.j(onClickListener, "onClickListener");
        this.f46478q.setOnClickListener(new sg.b(onClickListener, 5));
    }

    public final void setButtonEnabled(boolean z5) {
        this.f46478q.setEnabled(z5);
    }

    public final void setButtonText(int i11) {
        this.f46478q.setText(i11);
        setButtonVisible(true);
    }

    public final void setButtonVisible(boolean z5) {
        int i11;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        this.f46478q.setVisibility(i11);
    }

    public final void setIcon(int i11) {
        this.f46476o.setImageResource(i11);
    }

    public final void setMessage(int i11) {
        this.f46477p.setText(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefinitionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        context.getResources().getDimensionPixelSize(C1987R.dimen.basic4);
        context.getResources().getDimensionPixelSize(C1987R.dimen.horizontalMargin);
        context.getResources().getDimensionPixelSize(C1987R.dimen.layout2);
        View.inflate(context, C1987R.layout.view_definition, this);
        View findViewById = findViewById(C1987R.id.icon);
        u.i(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        this.f46476o = imageView;
        View findViewById2 = findViewById(C1987R.id.message);
        u.i(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f46477p = textView;
        View findViewById3 = findViewById(C1987R.id.button);
        u.i(findViewById3, "findViewById(...)");
        Button button = (Button) findViewById3;
        this.f46478q = button;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22413i);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z5 = false;
        if (obtainStyledAttributes.hasValue(1)) {
            imageView.setVisibility(0);
            imageView.setImageResource(obtainStyledAttributes.getResourceId(1, C1987R.drawable.circle_shape));
        }
        textView.setText(obtainStyledAttributes.getText(3));
        button.setText(obtainStyledAttributes.getText(0));
        CharSequence text = button.getText();
        setButtonVisible(obtainStyledAttributes.getBoolean(2, true ^ ((text == null || text.length() == 0) ? true : z5)));
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
    }

    public final void setMessage(CharSequence text) {
        u.j(text, "text");
        this.f46477p.setText(text);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        u.j(onClickListener, "onClickListener");
        this.f46478q.setOnClickListener(onClickListener);
    }

    public final void setButtonText(CharSequence text) {
        u.j(text, "text");
        this.f46478q.setText(text);
        setButtonVisible(!(text.length() == 0));
    }
}
