package com.withings.wiscale2.device.wpa.wpa02.ui.details;

import android.content.Context;
import androidx.camera.camera2.internal.s2;
import com.withings.views.view.HorizontalScaleView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import k3.d;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import yk.h;
import ym0.l;
/* compiled from: HydrationDetailsScreen.kt */
/* loaded from: classes5.dex */
final class a extends w implements l<Context, HorizontalScaleView> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d f55097a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ArrayList<HorizontalScaleView.f> f55098b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ double f55099c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ DecimalFormat f55100d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(double d11, d dVar, DecimalFormat decimalFormat, ArrayList arrayList) {
        super(1);
        this.f55097a = dVar;
        this.f55098b = arrayList;
        this.f55099c = d11;
        this.f55100d = decimalFormat;
    }

    @Override // ym0.l
    public final HorizontalScaleView invoke(Context context) {
        Context context2 = context;
        u.j(context2, "context");
        HorizontalScaleView horizontalScaleView = new HorizontalScaleView(context2);
        long l5 = s2.l(10);
        d dVar = this.f55097a;
        horizontalScaleView.setLegendTextSize((int) dVar.u0(l5));
        horizontalScaleView.setTitleTextSize((int) dVar.u0(s2.l(10)));
        horizontalScaleView.setGaugeHeightPx((int) dVar.b1(h.b()));
        horizontalScaleView.setGaugeSpacingPx((int) dVar.b1(2));
        horizontalScaleView.setScale(new HorizontalScaleView.e(1000, this.f55098b));
        horizontalScaleView.setCursorValue(this.f55099c * 1000);
        final DecimalFormat decimalFormat = this.f55100d;
        horizontalScaleView.setDelegate(new HorizontalScaleView.d() { // from class: pe0.a
            @Override // com.withings.views.view.HorizontalScaleView.d
            public final String a(double d11) {
                DecimalFormat decimalFormat2 = decimalFormat;
                u.j(decimalFormat2, "$decimalFormat");
                return decimalFormat2.format(d11 / 1000);
            }
        });
        horizontalScaleView.setLegendPosition(1);
        horizontalScaleView.setLegendStartLabel(decimalFormat.format((Object) 1));
        String format = decimalFormat.format(1.03d);
        horizontalScaleView.setLegendEndLabel("< " + format);
        return horizontalScaleView;
    }
}
