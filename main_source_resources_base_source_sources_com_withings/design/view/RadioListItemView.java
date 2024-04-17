package com.withings.design.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: RadioListView.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\fR*\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lcom/withings/design/view/RadioListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getCheckView", "()Landroid/widget/ImageView;", "checkView", "Landroid/widget/TextView;", "u", "getTitleView", "()Landroid/widget/TextView;", "titleView", ConstantsWs.JSON_SESSION_KEY_VALUE, "getDescriptionView", "descriptionView", "", "value", "isChecked", "Z", "()Z", "setChecked", "(Z)V", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "library_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class RadioListItemView extends ConstraintLayout {

    /* renamed from: w  reason: collision with root package name */
    static final /* synthetic */ k[] f36356w = {q0.h(new h0(q0.b(RadioListItemView.class), "checkView", "getCheckView()Landroid/widget/ImageView;")), q0.h(new h0(q0.b(RadioListItemView.class), "titleView", "getTitleView()Landroid/widget/TextView;")), q0.h(new h0(q0.b(RadioListItemView.class), "descriptionView", "getDescriptionView()Landroid/widget/TextView;"))};

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f36357t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f36358u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f36359v;

    /* compiled from: RadioListView.kt */
    /* loaded from: classes3.dex */
    static final class a extends w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) RadioListItemView.this.findViewById(C1987R.id.check);
        }
    }

    /* compiled from: RadioListView.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) RadioListItemView.this.findViewById(C1987R.id.description);
        }
    }

    /* compiled from: RadioListView.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) RadioListItemView.this.findViewById(C1987R.id.title);
        }
    }

    public RadioListItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private final ImageView getCheckView() {
        nm0.g gVar = this.f36357t;
        k kVar = f36356w[0];
        return (ImageView) gVar.getValue();
    }

    private final TextView getDescriptionView() {
        nm0.g gVar = this.f36359v;
        k kVar = f36356w[2];
        return (TextView) gVar.getValue();
    }

    private final TextView getTitleView() {
        nm0.g gVar = this.f36358u;
        k kVar = f36356w[1];
        return (TextView) gVar.getValue();
    }

    public final void setChecked(boolean z5) {
        ImageView checkView = getCheckView();
        u.f(checkView, "checkView");
        checkView.setSelected(z5);
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadioListItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.k(context, "context");
        this.f36357t = nm0.h.b(new a());
        this.f36358u = nm0.h.b(new c());
        this.f36359v = nm0.h.b(new b());
        View.inflate(context, C1987R.layout.view_radio_list, this);
    }
}
