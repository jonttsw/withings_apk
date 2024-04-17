package com.withings.wiscale2.device.wam02.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.m;
import androidx.activity.o;
import androidx.core.view.i1;
import androidx.core.view.u0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wam02.ui.GoPolarizationView;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.f4;
/* compiled from: GoPolarizationView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB'\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/GoPolarizationView;", "Landroid/widget/FrameLayout;", "Lcom/withings/wiscale2/device/wam02/ui/GoPolarizationView$a;", "polarization", "Lnm0/y;", "setPolarization", "(Lcom/withings/wiscale2/device/wam02/ui/GoPolarizationView$a;)V", "", "selected", "setSelectedPolarizationWithoutAnimation", "(Z)V", "setSelectedPolarizationWithAnimation", "Ltb0/f4;", com.huawei.hms.feature.dynamic.e.b.f28627a, "Ltb0/f4;", "getBinding", "()Ltb0/f4;", "binding", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GoPolarizationView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f54869c = 0;

    /* renamed from: a  reason: collision with root package name */
    private a f54870a;

    /* renamed from: b  reason: collision with root package name */
    private final f4 f54871b;

    /* compiled from: GoPolarizationView.kt */
    /* loaded from: classes5.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f54872a;

        /* renamed from: b  reason: collision with root package name */
        private final int f54873b;

        /* renamed from: c  reason: collision with root package name */
        private final int f54874c;

        /* compiled from: GoPolarizationView.kt */
        /* renamed from: com.withings.wiscale2.device.wam02.ui.GoPolarizationView$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0726a extends a {

            /* renamed from: d  reason: collision with root package name */
            public static final C0726a f54875d = new a(C1987R.drawable.go_polarization_dark, -1, C1987R.string._DARK_COLOR_);
        }

        /* compiled from: GoPolarizationView.kt */
        /* loaded from: classes5.dex */
        public static final class b extends a {

            /* renamed from: d  reason: collision with root package name */
            public static final b f54876d = new a(C1987R.drawable.go_polarization_light, -16777216, C1987R.string._LIGHT_COLOR_);
        }

        public a(int i11, int i12, int i13) {
            this.f54872a = i11;
            this.f54873b = i12;
            this.f54874c = i13;
        }

        public final int a() {
            return this.f54872a;
        }

        public final int b() {
            return this.f54873b;
        }

        public final int c() {
            return this.f54874c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoPolarizationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final f4 getBinding() {
        return this.f54871b;
    }

    public final void setPolarization(a polarization) {
        u.j(polarization, "polarization");
        this.f54870a = polarization;
        f4 f4Var = this.f54871b;
        f4Var.f99096a.setBackgroundResource(polarization.a());
        Context context = getContext();
        u.i(context, "getContext(...)");
        f4Var.f99097b.setImageDrawable(y70.a.c(C1987R.drawable.ic_device_goscreen2, context, polarization.b()));
        f4Var.f99098c.setText(polarization.c());
    }

    public final void setSelectedPolarizationWithAnimation(boolean z5) {
        int i11;
        final f4 f4Var = this.f54871b;
        ImageView imageView = f4Var.f99097b;
        if (!z5) {
            i11 = 0;
        } else if (u.e(this.f54870a, a.C0726a.f54875d)) {
            i11 = C1987R.drawable.selected_polarization_dark;
        } else {
            i11 = C1987R.drawable.selected_polarization_light;
        }
        imageView.setBackgroundResource(i11);
        ImageView imageView2 = f4Var.f99097b;
        View view = f4Var.f99096a;
        if (z5) {
            final float dimension = getResources().getDimension(C1987R.dimen.polarization_large_circle);
            final float dimension2 = getResources().getDimension(C1987R.dimen.polarization_small_circle);
            i1 b10 = u0.b(view);
            float f11 = dimension / dimension2;
            b10.d(f11);
            b10.e(f11);
            b10.a(0.0f);
            b10.o(new m(f4Var, 8));
            b10.n(new o(f4Var, 9));
            b10.k();
            i1 b11 = u0.b(imageView2);
            b11.o(new Runnable() { // from class: je0.a
                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = GoPolarizationView.f54869c;
                    f4 this_animateSelected = f4.this;
                    u.j(this_animateSelected, "$this_animateSelected");
                    ImageView imageView3 = this_animateSelected.f99097b;
                    imageView3.setAlpha(0.0f);
                    float f12 = dimension2 / dimension;
                    imageView3.setScaleX(f12);
                    imageView3.setScaleY(f12);
                    imageView3.setVisibility(0);
                }
            });
            b11.d(1.0f);
            b11.e(1.0f);
            b11.a(1.0f);
            b11.k();
            return;
        }
        final float dimension3 = getResources().getDimension(C1987R.dimen.polarization_large_circle);
        final float dimension4 = getResources().getDimension(C1987R.dimen.polarization_small_circle);
        i1 b12 = u0.b(view);
        b12.d(1.0f);
        b12.e(1.0f);
        b12.a(1.0f);
        b12.o(new Runnable() { // from class: je0.b
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = GoPolarizationView.f54869c;
                f4 this_animateDeselected = f4.this;
                u.j(this_animateDeselected, "$this_animateDeselected");
                float f12 = dimension3 / dimension4;
                View view2 = this_animateDeselected.f99096a;
                view2.setScaleX(f12);
                view2.setScaleY(f12);
                view2.setAlpha(0.0f);
                view2.setVisibility(0);
            }
        });
        b12.k();
        i1 b13 = u0.b(imageView2);
        b13.n(new wn.d(f4Var, 3));
        b13.a(0.0f);
        float f12 = dimension4 / dimension3;
        b13.d(f12);
        b13.e(f12);
        b13.k();
    }

    public final void setSelectedPolarizationWithoutAnimation(boolean z5) {
        int i11;
        int i12;
        f4 f4Var = this.f54871b;
        ImageView imageView = f4Var.f99097b;
        int i13 = 0;
        if (!z5) {
            i11 = 0;
        } else if (u.e(this.f54870a, a.C0726a.f54875d)) {
            i11 = C1987R.drawable.selected_polarization_dark;
        } else {
            i11 = C1987R.drawable.selected_polarization_light;
        }
        imageView.setBackgroundResource(i11);
        View circleView = f4Var.f99096a;
        u.i(circleView, "circleView");
        if (!z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        circleView.setVisibility(i12);
        ImageView polarizationImage = f4Var.f99097b;
        u.i(polarizationImage, "polarizationImage");
        if (!z5) {
            i13 = 8;
        }
        polarizationImage.setVisibility(i13);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoPolarizationView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        a.C0726a c0726a = a.C0726a.f54875d;
        this.f54870a = c0726a;
        this.f54871b = f4.a(LayoutInflater.from(context), this);
        setPolarization(c0726a);
    }
}
