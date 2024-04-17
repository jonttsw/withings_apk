package com.withings.views.measure.detail.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: BrandView.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/withings/views/measure/detail/ui/views/BrandView;", "Landroid/widget/LinearLayout;", "", "name", "Lnm0/y;", "setBrandName", "(Ljava/lang/String;)V", "Landroid/widget/TextView;", "a", "Lnm0/g;", "getBrandName", "()Landroid/widget/TextView;", "brandName", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "views_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BrandView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final g f46471a;

    /* compiled from: BrandView.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) BrandView.this.findViewById(C1987R.id.brand_name);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    private final TextView getBrandName() {
        Object value = this.f46471a.getValue();
        u.i(value, "getValue(...)");
        return (TextView) value;
    }

    public final void setBrandName(String str) {
        boolean z5;
        int i11 = 0;
        if (str != null && str.length() != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!(true ^ z5)) {
            i11 = 8;
        }
        setVisibility(i11);
        getBrandName().setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46471a = h.b(new a());
        LayoutInflater.from(getContext()).inflate(C1987R.layout.view_brand, this);
        setOrientation(1);
        setHorizontalGravity(1);
    }
}
