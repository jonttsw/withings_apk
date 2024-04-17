package com.withings.design.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.design.view.HorizontalBarGraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import withings.android.content.ContextKt;
/* compiled from: HorizontalBarGraphView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006R#\u0010\u000e\u001a\n \t*\u0004\u0018\u00010\b0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR#\u0010\u0013\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0016\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R#\u0010\u0019\u001a\n \t*\u0004\u0018\u00010\u000f0\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012¨\u0006\""}, d2 = {"Lcom/withings/design/view/HorizontalBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/withings/design/view/HorizontalBarGraphView$a;", "bar", "Lnm0/y;", "setBackground", "(Lcom/withings/design/view/HorizontalBarGraphView$a;)V", "setBar", "Landroid/view/View;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getBarView", "()Landroid/view/View;", "barView", "Landroid/widget/TextView;", "u", "getBarLabelView", "()Landroid/widget/TextView;", "barLabelView", ConstantsWs.JSON_SESSION_KEY_VALUE, "getBarPrimaryValueView", "barPrimaryValueView", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "getBarSecondaryValueView", "barSecondaryValueView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class HorizontalBarView extends ConstraintLayout {

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ k[] f36242x = {q0.h(new h0(q0.b(HorizontalBarView.class), "barView", "getBarView()Landroid/view/View;")), q0.h(new h0(q0.b(HorizontalBarView.class), "barLabelView", "getBarLabelView()Landroid/widget/TextView;")), q0.h(new h0(q0.b(HorizontalBarView.class), "barPrimaryValueView", "getBarPrimaryValueView()Landroid/widget/TextView;")), q0.h(new h0(q0.b(HorizontalBarView.class), "barSecondaryValueView", "getBarSecondaryValueView()Landroid/widget/TextView;"))};

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f36243t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f36244u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f36245v;

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f36246w;

    /* compiled from: HorizontalBarGraphView.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) HorizontalBarView.this.findViewById(C1987R.id.bar_label);
        }
    }

    /* compiled from: HorizontalBarGraphView.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) HorizontalBarView.this.findViewById(C1987R.id.bar_primary_value);
        }
    }

    /* compiled from: HorizontalBarGraphView.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) HorizontalBarView.this.findViewById(C1987R.id.bar_secondary_value);
        }
    }

    /* compiled from: HorizontalBarGraphView.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<View> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return HorizontalBarView.this.findViewById(C1987R.id.bar);
        }
    }

    public HorizontalBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final TextView getBarLabelView() {
        nm0.g gVar = this.f36244u;
        k kVar = f36242x[1];
        return (TextView) gVar.getValue();
    }

    private final TextView getBarPrimaryValueView() {
        nm0.g gVar = this.f36245v;
        k kVar = f36242x[2];
        return (TextView) gVar.getValue();
    }

    private final TextView getBarSecondaryValueView() {
        nm0.g gVar = this.f36246w;
        k kVar = f36242x[3];
        return (TextView) gVar.getValue();
    }

    private final View getBarView() {
        nm0.g gVar = this.f36243t;
        k kVar = f36242x[0];
        return (View) gVar.getValue();
    }

    private final void setBackground(HorizontalBarGraphView.a aVar) {
        aVar.getClass();
        View barView = getBarView();
        u.f(barView, "barView");
        barView.setBackgroundTintList(ColorStateList.valueOf(androidx.core.content.a.getColor(getContext(), 0)));
    }

    public final void setBar(HorizontalBarGraphView.a bar) {
        u.k(bar, "bar");
        setBackground(bar);
        TextView barLabelView = getBarLabelView();
        u.f(barLabelView, "barLabelView");
        barLabelView.setText((CharSequence) null);
        TextView barPrimaryValueView = getBarPrimaryValueView();
        u.f(barPrimaryValueView, "barPrimaryValueView");
        barPrimaryValueView.setText((CharSequence) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalBarView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        this.f36243t = nm0.h.b(new d());
        this.f36244u = nm0.h.b(new a());
        this.f36245v = nm0.h.b(new b());
        this.f36246w = nm0.h.b(new c());
        ContextKt.getDimension(context, (int) C1987R.dimen.keyline_1);
        View.inflate(context, C1987R.layout.view_horizontal_bar, this);
    }

    public /* synthetic */ HorizontalBarView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }
}
