package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import org.jivesoftware.smackx.amp.packet.AMPExtension;
/* compiled from: SectionView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/withings/views/view/SectionView;", "Landroid/widget/LinearLayout;", "", "title", "Lnm0/y;", "setTitle", "(I)V", "", "(Ljava/lang/CharSequence;)V", "detail", "setDetail", AMPExtension.Action.ATTRIBUTE_NAME, "setAction", "Landroid/view/View$OnClickListener;", "onClickListener", "setActionClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SectionView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final TextView f46678a;

    /* renamed from: b  reason: collision with root package name */
    private final TextView f46679b;

    /* renamed from: c  reason: collision with root package name */
    private final Button f46680c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final void setAction(int i11) {
        if (i11 != 0) {
            Button button = this.f46680c;
            button.setText(i11);
            button.setVisibility(0);
        }
    }

    public final void setActionClickListener(View.OnClickListener onClickListener) {
        this.f46680c.setOnClickListener(onClickListener);
    }

    public final void setDetail(int i11) {
        if (i11 != 0) {
            TextView textView = this.f46679b;
            textView.setText(i11);
            textView.setVisibility(0);
        }
    }

    public final void setTitle(int i11) {
        Integer valueOf = Integer.valueOf(i11);
        if (!isInEditMode() && i11 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            this.f46678a.setText(valueOf.intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        View.inflate(context, C1987R.layout.section_view, this);
        View findViewById = findViewById(C1987R.id.section_title);
        u.i(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f46678a = textView;
        View findViewById2 = findViewById(C1987R.id.section_detail);
        TextView textView2 = (TextView) findViewById2;
        u.g(textView2);
        textView2.setVisibility(8);
        u.i(findViewById2, "apply(...)");
        this.f46679b = (TextView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.section_action);
        Button button = (Button) findViewById3;
        u.g(button);
        button.setVisibility(8);
        u.i(findViewById3, "apply(...)");
        this.f46680c = (Button) findViewById3;
        setOrientation(0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22421q);
            u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            setTitle(obtainStyledAttributes.getText(2));
            setDetail(obtainStyledAttributes.getResourceId(1, 0));
            setAction(obtainStyledAttributes.getResourceId(0, 0));
            xq.a.a(textView, obtainStyledAttributes.getResourceId(3, C1987R.style.header3));
            y yVar = y.f85009a;
            obtainStyledAttributes.recycle();
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1987R.dimen.horizontalMargin);
        setPadding(dimensionPixelSize, getResources().getDimensionPixelSize(C1987R.dimen.verticalMargin), dimensionPixelSize, getResources().getDimensionPixelSize(C1987R.dimen.topCardMargin));
    }

    public final void setTitle(CharSequence charSequence) {
        this.f46678a.setText(charSequence);
    }

    public final void setAction(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        Button button = this.f46680c;
        if (!isEmpty) {
            button.setText(charSequence);
            button.setVisibility(0);
            return;
        }
        button.setVisibility(8);
    }

    public final void setDetail(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        TextView textView = this.f46679b;
        textView.setText(charSequence);
        textView.setVisibility(0);
    }
}
