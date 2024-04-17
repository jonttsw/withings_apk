package com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import b50.a;
import com.withings.sleepapnea.core.AhiStatus;
import com.withings.sleepapnea.core.BreathingDisturbanceStatus;
import com.withings.views.view.HorizontalScaleView;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import tb0.q3;
/* compiled from: SleepDisorderHeaderView.kt */
/* loaded from: classes5.dex */
public final class i1 {

    /* renamed from: a  reason: collision with root package name */
    private final q3 f61346a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f61347b;

    public i1(q3 q3Var, Context context) {
        this.f61346a = q3Var;
        this.f61347b = context;
    }

    private final HorizontalScaleView.f a(int i11, en0.k kVar, int i12) {
        Context context = this.f61347b;
        return new HorizontalScaleView.f(context.getString(i11), kotlin.collections.x.A(kVar), androidx.core.content.a.getColor(context, i12));
    }

    public final void b(int i11) {
        AhiStatus a11 = b50.a.a(i11);
        q3 q3Var = this.f61346a;
        q3Var.f99442d.setText(c50.a.d(a11));
        q3Var.f99441c.setText(C1987R.string.sleepApnea_ahiTitle);
        int a12 = c50.a.a(a11);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Context context = this.f61347b;
        gradientDrawable.setColor(androidx.core.content.a.getColor(context, a12));
        q3Var.f99439a.setBackground(gradientDrawable);
        int color = androidx.core.content.a.getColor(context, androidx.health.connect.client.units.d.b(c50.a.a(a11)));
        q3Var.f99442d.setTextColor(color);
        q3Var.f99441c.setTextColor(color);
        AhiStatus ahiStatus = AhiStatus.f44270c;
        int l5 = a.C0257a.a(ahiStatus).l();
        HorizontalScaleView.f a13 = a(c50.a.d(ahiStatus), a.C0257a.a(ahiStatus), c50.a.a(ahiStatus));
        AhiStatus ahiStatus2 = AhiStatus.f44269b;
        HorizontalScaleView.f a14 = a(c50.a.d(ahiStatus2), a.C0257a.a(ahiStatus2), c50.a.a(ahiStatus2));
        AhiStatus ahiStatus3 = AhiStatus.f44268a;
        HorizontalScaleView.e eVar = new HorizontalScaleView.e(l5, kotlin.collections.x.W(a13, a14, a(c50.a.d(ahiStatus3), a.C0257a.a(ahiStatus3), c50.a.a(ahiStatus3))));
        HorizontalScaleView horizontalScaleView = q3Var.f99440b;
        horizontalScaleView.setScale(eVar);
        horizontalScaleView.setDelegate(new m6.r(9));
        horizontalScaleView.setLegendPosition(1);
        horizontalScaleView.setCursorTitle(horizontalScaleView.getContext().getString(C1987R.string.sleepAPnea_ahiPerHour, Integer.valueOf(i11)));
        horizontalScaleView.setCursorValue(i11);
        horizontalScaleView.n();
    }

    public final void c(int i11) {
        Object obj;
        Iterator it = kotlin.collections.x.W(BreathingDisturbanceStatus.f44273a, BreathingDisturbanceStatus.f44274b, BreathingDisturbanceStatus.f44275c).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (b50.b.A((BreathingDisturbanceStatus) obj).s(i11)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BreathingDisturbanceStatus breathingDisturbanceStatus = (BreathingDisturbanceStatus) obj;
        if (breathingDisturbanceStatus == null) {
            breathingDisturbanceStatus = BreathingDisturbanceStatus.f44276d;
        }
        q3 q3Var = this.f61346a;
        q3Var.f99442d.setText(c50.b.d(breathingDisturbanceStatus));
        q3Var.f99441c.setText(C1987R.string.sleepApnea_breathingDisorderTitle);
        int a11 = c50.b.a(breathingDisturbanceStatus);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        Context context = this.f61347b;
        gradientDrawable.setColor(androidx.core.content.a.getColor(context, a11));
        q3Var.f99439a.setBackground(gradientDrawable);
        int color = androidx.core.content.a.getColor(context, androidx.health.connect.client.units.d.b(c50.b.a(breathingDisturbanceStatus)));
        q3Var.f99442d.setTextColor(color);
        q3Var.f99441c.setTextColor(color);
        BreathingDisturbanceStatus breathingDisturbanceStatus2 = BreathingDisturbanceStatus.f44275c;
        int l5 = b50.b.A(breathingDisturbanceStatus2).l();
        HorizontalScaleView.f a12 = a(c50.b.d(breathingDisturbanceStatus2), b50.b.A(breathingDisturbanceStatus2), c50.b.a(breathingDisturbanceStatus2));
        BreathingDisturbanceStatus breathingDisturbanceStatus3 = BreathingDisturbanceStatus.f44274b;
        HorizontalScaleView.f a13 = a(c50.b.d(breathingDisturbanceStatus3), b50.b.A(breathingDisturbanceStatus3), c50.b.a(breathingDisturbanceStatus3));
        BreathingDisturbanceStatus breathingDisturbanceStatus4 = BreathingDisturbanceStatus.f44273a;
        HorizontalScaleView.f a14 = a(c50.b.d(breathingDisturbanceStatus4), b50.b.A(breathingDisturbanceStatus4), c50.b.a(breathingDisturbanceStatus4));
        HorizontalScaleView horizontalScaleView = q3Var.f99440b;
        horizontalScaleView.setLegendStartLabel("");
        horizontalScaleView.setLegendEndLabel("");
        horizontalScaleView.setScale(new HorizontalScaleView.e(l5, kotlin.collections.x.W(a12, a13, a14)));
        horizontalScaleView.setDelegate(new e2.o(6));
        horizontalScaleView.setCursorValue(i11);
        int dimensionPixelSize = horizontalScaleView.getResources().getDimensionPixelSize(C1987R.dimen.horizontalMargin);
        ViewGroup.LayoutParams layoutParams = horizontalScaleView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = dimensionPixelSize;
            marginLayoutParams.rightMargin = dimensionPixelSize;
            horizontalScaleView.setLayoutParams(marginLayoutParams);
            horizontalScaleView.n();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
