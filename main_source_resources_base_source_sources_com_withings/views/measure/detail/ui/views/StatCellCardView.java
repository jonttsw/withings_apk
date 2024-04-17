package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: StatCellCardView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/StatCellCardView;", "Lcom/google/android/material/card/MaterialCardView;", "", "text", "Lnm0/y;", "setValue", "(Ljava/lang/String;)V", "", RemoteMessageConst.Notification.COLOR, "setColorRes", "(I)V", "Landroid/widget/TextView;", "o", "Landroid/widget/TextView;", "getTitleView", "()Landroid/widget/TextView;", "titleView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StatCellCardView extends MaterialCardView {

    /* renamed from: o  reason: collision with root package name */
    private final TextView f46485o;

    /* renamed from: p  reason: collision with root package name */
    private final ImageView f46486p;

    /* renamed from: q  reason: collision with root package name */
    private final TextView f46487q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StatCellCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final void g() {
        this.f46486p.setVisibility(8);
    }

    public final TextView getTitleView() {
        return this.f46485o;
    }

    public final void setColorRes(int i11) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        this.f46486p.setImageDrawable(y70.a.a(C1987R.drawable.circle_shape, context, i11));
    }

    public final void setValue(String text) {
        u.j(text, "text");
        this.f46487q.setText(text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatCellCardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        View.inflate(context, C1987R.layout.view_card_stat, this);
        View findViewById = findViewById(C1987R.id.stat_arrow);
        u.i(findViewById, "findViewById(...)");
        ImageView imageView = (ImageView) findViewById;
        View findViewById2 = findViewById(C1987R.id.stat_dot);
        u.i(findViewById2, "findViewById(...)");
        this.f46486p = (ImageView) findViewById2;
        View findViewById3 = findViewById(C1987R.id.stat_title);
        u.i(findViewById3, "findViewById(...)");
        TextView textView = (TextView) findViewById3;
        this.f46485o = textView;
        View findViewById4 = findViewById(C1987R.id.stat_value);
        u.i(findViewById4, "findViewById(...)");
        this.f46487q = (TextView) findViewById4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c80.a.f22423s);
        u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
        textView.setText(obtainStyledAttributes.getString(1));
        imageView.setVisibility(obtainStyledAttributes.getInt(0, 0) != 0 ? 8 : 0);
        y yVar = y.f85009a;
        obtainStyledAttributes.recycle();
    }
}
