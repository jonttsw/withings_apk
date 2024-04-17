package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import org.jivesoftware.smack.sm.packet.StreamManagement;
/* compiled from: ToggleCellView.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u00109\u001a\u000208\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\b\u0002\u0010<\u001a\u00020\u0011¢\u0006\u0004\b=\u0010>J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001e\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR#\u0010#\u001a\n \u0016*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\"R#\u0010&\u001a\n \u0016*\u0004\u0018\u00010\u001f0\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b%\u0010\"R#\u0010+\u001a\n \u0016*\u0004\u0018\u00010'0'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010*R$\u00103\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00105\u001a\u00020\u00022\u0006\u00104\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0006¨\u0006?"}, d2 = {"Lcom/withings/views/view/ToggleCellView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", StreamManagement.Enabled.ELEMENT, "Lnm0/y;", "setEnabled", "(Z)V", "visible", "setBottomDividerVisibility", "setTopDividerVisibility", "isChecked", "setChecked", "", "text", "setLabelText", "(Ljava/lang/CharSequence;)V", "setValueText", "", RemoteMessageConst.Notification.VISIBILITY, "setValueTextVisibility", "(I)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getLabelView", "()Landroid/widget/TextView;", "labelView", "u", "getValueView", "valueView", "Landroid/view/View;", ConstantsWs.JSON_SESSION_KEY_VALUE, "getTopDivider", "()Landroid/view/View;", "topDivider", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "getBottomDivider", "bottomDivider", "Lcom/google/android/material/switchmaterial/SwitchMaterial;", "x", "getSwitchView", "()Lcom/google/android/material/switchmaterial/SwitchMaterial;", "switchView", "Lcom/withings/views/view/m;", "y", "Lcom/withings/views/view/m;", "getToggleListener", "()Lcom/withings/views/view/m;", "setToggleListener", "(Lcom/withings/views/view/m;)V", "toggleListener", "value", "isToggleVisible", "()Z", "setToggleVisible", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ToggleCellView extends ConstraintLayout {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f46718z = 0;

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f46719t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f46720u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f46721v;

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f46722w;

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f46723x;

    /* renamed from: y  reason: collision with root package name */
    private m f46724y;

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<View> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return ToggleCellView.this.findViewById(C1987R.id.toggle_cell_view_bottom_divider);
        }
    }

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) ToggleCellView.this.findViewById(C1987R.id.toggle_cell_view_label);
        }
    }

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    public static final class c implements m {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.p<ToggleCellView, Boolean, y> f46727a;

        /* JADX WARN: Multi-variable type inference failed */
        c(ym0.p<? super ToggleCellView, ? super Boolean, y> pVar) {
            this.f46727a = pVar;
        }

        @Override // com.withings.views.view.m
        public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
            u.j(toggleView, "toggleView");
            this.f46727a.invoke(toggleView, Boolean.valueOf(z5));
        }
    }

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<SwitchMaterial> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final SwitchMaterial invoke() {
            return (SwitchMaterial) ToggleCellView.this.findViewById(C1987R.id.toggle_cell_view_switch);
        }
    }

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    static final class e extends w implements ym0.a<View> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return ToggleCellView.this.findViewById(C1987R.id.toggle_cell_view_top_divider);
        }
    }

    /* compiled from: ToggleCellView.kt */
    /* loaded from: classes4.dex */
    static final class f extends w implements ym0.a<TextView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) ToggleCellView.this.findViewById(C1987R.id.toggle_cell_view_value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ToggleCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        u.j(context, "context");
    }

    private final View getBottomDivider() {
        return (View) this.f46722w.getValue();
    }

    private final TextView getLabelView() {
        return (TextView) this.f46719t.getValue();
    }

    private final SwitchMaterial getSwitchView() {
        return (SwitchMaterial) this.f46723x.getValue();
    }

    private final View getTopDivider() {
        return (View) this.f46721v.getValue();
    }

    private final TextView getValueView() {
        return (TextView) this.f46720u.getValue();
    }

    public static void t(ToggleCellView this$0) {
        u.j(this$0, "this$0");
        this$0.getSwitchView().toggle();
    }

    public static void u(ToggleCellView this$0, boolean z5) {
        u.j(this$0, "this$0");
        m mVar = this$0.f46724y;
        if (mVar != null) {
            mVar.onCellSwitched(this$0, z5);
        }
    }

    public static void v(ToggleCellView this$0) {
        u.j(this$0, "this$0");
        this$0.getSwitchView().toggle();
    }

    public final void A(ym0.p<? super ToggleCellView, ? super Boolean, y> pVar) {
        this.f46724y = new c(pVar);
    }

    public final m getToggleListener() {
        return this.f46724y;
    }

    public final void setBottomDividerVisibility(boolean z5) {
        int i11;
        View bottomDivider = getBottomDivider();
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        bottomDivider.setVisibility(i11);
    }

    public final void setChecked(boolean z5) {
        getSwitchView().setOnCheckedChangeListener(null);
        getSwitchView().setChecked(z5);
        getSwitchView().setOnCheckedChangeListener(new o(this));
    }

    @Override // android.view.View
    public void setEnabled(boolean z5) {
        float f11;
        super.setEnabled(z5);
        if (z5) {
            f11 = 1.0f;
        } else {
            f11 = 0.3f;
        }
        setAlpha(f11);
        x();
    }

    public final void setLabelText(CharSequence charSequence) {
        getLabelView().setText(charSequence);
    }

    public final void setToggleListener(m mVar) {
        this.f46724y = mVar;
    }

    public final void setToggleVisible(boolean z5) {
        int i11;
        SwitchMaterial switchView = getSwitchView();
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        switchView.setVisibility(i11);
    }

    public final void setTopDividerVisibility(boolean z5) {
        int i11;
        View topDivider = getTopDivider();
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        topDivider.setVisibility(i11);
    }

    public final void setValueText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            getValueView().setVisibility(8);
            return;
        }
        getValueView().setVisibility(0);
        getValueView().setText(charSequence);
    }

    public final void setValueTextVisibility(int i11) {
        getValueView().setVisibility(i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.View$OnClickListener, java.lang.Object] */
    public final void w() {
        getSwitchView().setClickable(false);
        getSwitchView().setEnabled(false);
        setOnClickListener(new Object());
        getSwitchView().setAlpha(0.3f);
        getValueView().setAlpha(0.3f);
        getLabelView().setAlpha(0.3f);
        setBackgroundColor(0);
    }

    public final void x() {
        getSwitchView().setClickable(false);
    }

    public final void y() {
        getSwitchView().setClickable(true);
        getSwitchView().setEnabled(true);
        setOnClickListener(new gi.f(this, 5));
        getSwitchView().setAlpha(1.0f);
        getValueView().setAlpha(1.0f);
        getLabelView().setAlpha(1.0f);
        setBackground(null);
    }

    public final boolean z() {
        return getSwitchView().isChecked();
    }

    public /* synthetic */ ToggleCellView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, C1987R.attr.toggleCellViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleCellView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46719t = nm0.h.b(new b());
        this.f46720u = nm0.h.b(new f());
        this.f46721v = nm0.h.b(new e());
        this.f46722w = nm0.h.b(new a());
        this.f46723x = nm0.h.b(new d());
        LayoutInflater.from(getContext()).inflate(C1987R.layout.toggle_cell_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22424t);
            u.i(obtainStyledAttributes, "obtainStyledAttributes(...)");
            getLabelView().setText(obtainStyledAttributes.getText(0));
            setValueText(obtainStyledAttributes.getText(4));
            if (obtainStyledAttributes.getBoolean(2, false)) {
                setTopDividerVisibility(true);
            }
            if (obtainStyledAttributes.getBoolean(1, false)) {
                setBottomDividerVisibility(true);
            }
            setToggleVisible(obtainStyledAttributes.getBoolean(3, true));
            obtainStyledAttributes.recycle();
        }
        getSwitchView().setOnCheckedChangeListener(new o(this));
        setOnClickListener(new androidx.viewpager.widget.c(this, 5));
    }
}
