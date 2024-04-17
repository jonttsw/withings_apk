package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import gi.h;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
import ym0.l;
/* compiled from: BannerView.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0015\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u000f\u001a\u00020\u00042\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0011j\u0002`\u0013¢\u0006\u0004\b\u000f\u0010\u0014¨\u0006\u001c"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/BannerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "text", "Lnm0/y;", "setTitle", "(I)V", "", "(Ljava/lang/CharSequence;)V", "setMessage", "setButtonText", "imageRes", "setIllustration", "Landroid/view/View$OnClickListener;", "onClickListener", "setButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/withings/views/measure/detail/ui/views/BannerActionClicked;", "(Lym0/l;)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BannerView extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f46466x = 0;

    /* renamed from: t  reason: collision with root package name */
    private final TextView f46467t;

    /* renamed from: u  reason: collision with root package name */
    private final TextView f46468u;

    /* renamed from: v  reason: collision with root package name */
    private final Button f46469v;

    /* renamed from: w  reason: collision with root package name */
    private final ImageView f46470w;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final void setButtonClickListener(l<? super View, y> onClickListener) {
        u.j(onClickListener, "onClickListener");
        this.f46469v.setOnClickListener(new h(1, onClickListener));
    }

    public final void setButtonText(int i11) {
        this.f46469v.setText(i11);
    }

    public final void setIllustration(int i11) {
        ImageView imageView = this.f46470w;
        imageView.setImageResource(i11);
        imageView.setVisibility(0);
    }

    public final void setMessage(int i11) {
        this.f46468u.setText(i11);
    }

    public final void setTitle(int i11) {
        this.f46467t.setText(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        View.inflate(context, C1987R.layout.view_banner, this);
        View findViewById = findViewById(C1987R.id.title);
        u.i(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f46467t = textView;
        View findViewById2 = findViewById(C1987R.id.message);
        u.i(findViewById2, "findViewById(...)");
        TextView textView2 = (TextView) findViewById2;
        this.f46468u = textView2;
        View findViewById3 = findViewById(C1987R.id.button);
        u.i(findViewById3, "findViewById(...)");
        Button button = (Button) findViewById3;
        this.f46469v = button;
        View findViewById4 = findViewById(C1987R.id.illustration);
        u.i(findViewById4, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById4;
        this.f46470w = imageView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22407c);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textView.setText(obtainStyledAttributes.getResourceId(3, 0));
        textView2.setText(obtainStyledAttributes.getResourceId(2, 0));
        button.setText(obtainStyledAttributes.getResourceId(0, 0));
        Integer valueOf = Integer.valueOf(obtainStyledAttributes.getResourceId(1, 0));
        valueOf = valueOf.intValue() == 0 ? null : valueOf;
        if (valueOf != null) {
            imageView.setImageResource(valueOf.intValue());
            imageView.setVisibility(0);
            y yVar = y.f85009a;
        }
        obtainStyledAttributes.recycle();
    }

    public final void setButtonText(CharSequence text) {
        u.j(text, "text");
        this.f46469v.setText(text);
    }

    public final void setMessage(CharSequence text) {
        u.j(text, "text");
        this.f46468u.setText(text);
    }

    public final void setTitle(CharSequence text) {
        u.j(text, "text");
        this.f46467t.setText(text);
    }

    public final void setButtonClickListener(View.OnClickListener onClickListener) {
        u.j(onClickListener, "onClickListener");
        this.f46469v.setOnClickListener(onClickListener);
    }
}
