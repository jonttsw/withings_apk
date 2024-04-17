package com.withings.weight.bodycomposition.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.views.view.HorizontalSausageWithLegendsView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import jm.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import ky.d;
import m70.i;
import nm0.j;
/* compiled from: BodyCompositionZonesDetailView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/withings/weight/bodycomposition/ui/BodyCompositionZonesDetailView;", "Landroid/widget/LinearLayout;", "Lky/d;", "measuresGroup", "Lnm0/y;", "setBodyCompositionZonesForMeasures", "(Lky/d;)V", "Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "a", "Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "getHorizontalSausageWithLegendsView", "()Lcom/withings/views/view/HorizontalSausageWithLegendsView;", "setHorizontalSausageWithLegendsView", "(Lcom/withings/views/view/HorizontalSausageWithLegendsView;)V", "horizontalSausageWithLegendsView", "Lcom/withings/views/widget/LineCellView;", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lcom/withings/views/widget/LineCellView;", "getBodyWaterValueView", "()Lcom/withings/views/widget/LineCellView;", "setBodyWaterValueView", "(Lcom/withings/views/widget/LineCellView;)V", "bodyWaterValueView", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "weight_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class BodyCompositionZonesDetailView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private HorizontalSausageWithLegendsView f46946a;

    /* renamed from: b  reason: collision with root package name */
    private LineCellView f46947b;

    /* renamed from: c  reason: collision with root package name */
    private d f46948c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f46949d;

    /* renamed from: e  reason: collision with root package name */
    private final jm.a f46950e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BodyCompositionZonesDetailView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static final void a(BodyCompositionZonesDetailView bodyCompositionZonesDetailView, List list, double d11, double d12) {
        String f11;
        float f12 = (float) ((d12 / d11) * 100);
        String string = bodyCompositionZonesDetailView.getContext().getString(C1987R.string._SCREEN_TITLE_2_1_);
        u.i(string, "getString(...)");
        boolean z5 = bodyCompositionZonesDetailView.f46949d;
        jm.a aVar = bodyCompositionZonesDetailView.f46950e;
        if (z5) {
            f11 = jm.a.d(aVar, f12).toString();
        } else {
            f11 = aVar.f(d12, 1);
        }
        list.add(new HorizontalSausageWithLegendsView.b(C1987R.color.datavizMonochromaticNeutral2, string, f11, f12, false, 48));
    }

    private final HorizontalSausageWithLegendsView.b b(int i11, int i12, int i13) {
        String str;
        float f11;
        ky.a e11;
        double d11;
        d dVar = this.f46948c;
        if (dVar != null && (e11 = ly.a.e(i13, dVar)) != null) {
            double f12 = e11.f();
            boolean z5 = this.f46949d;
            jm.a aVar = this.f46950e;
            if (z5) {
                double d12 = f12 * 100;
                d dVar2 = this.f46948c;
                if (dVar2 != null) {
                    d11 = ly.a.f(1, dVar2);
                } else {
                    d11 = 1.0d;
                }
                f11 = (float) (d12 / d11);
                str = jm.a.d(aVar, f11).toString();
            } else {
                f11 = (float) f12;
                str = aVar.f(f11, 1);
            }
        } else {
            str = "-";
            f11 = 0.0f;
        }
        float f13 = f11;
        String str2 = str;
        String string = getContext().getString(i12);
        u.i(string, "getString(...)");
        return new HorizontalSausageWithLegendsView.b(i11, string, str2, f13, false, 48);
    }

    public final LineCellView getBodyWaterValueView() {
        return this.f46947b;
    }

    public final HorizontalSausageWithLegendsView getHorizontalSausageWithLegendsView() {
        return this.f46946a;
    }

    public final void setBodyCompositionZonesForMeasures(d dVar) {
        String str;
        ky.a e11;
        double d11;
        d dVar2;
        ky.a aVar;
        this.f46948c = dVar;
        ArrayList arrayList = new ArrayList();
        d dVar3 = this.f46948c;
        if (dVar3 != null && ly.a.g(8, dVar3) && (dVar2 = this.f46948c) != null && ly.a.g(1, dVar2)) {
            d dVar4 = this.f46948c;
            ky.a aVar2 = null;
            if (dVar4 != null) {
                aVar = ly.a.e(8, dVar4);
            } else {
                aVar = null;
            }
            d dVar5 = this.f46948c;
            if (dVar5 != null) {
                aVar2 = ly.a.e(1, dVar5);
            }
            cr.a.a(new j(aVar, aVar2), new b(this, arrayList));
        }
        arrayList.add(b(C1987R.color.datavizMonochromaticNeutral3, C1987R.string._SCREEN_TITLE_6_16_, 76));
        arrayList.add(b(C1987R.color.datavizMonochromaticNeutral4, C1987R.string._SCREEN_TITLE_6_15_, 88));
        HorizontalSausageWithLegendsView horizontalSausageWithLegendsView = this.f46946a;
        if (horizontalSausageWithLegendsView != null) {
            horizontalSausageWithLegendsView.setLegends(arrayList);
        }
        d dVar6 = this.f46948c;
        if (dVar6 != null && (e11 = ly.a.e(77, dVar6)) != null) {
            double f11 = e11.f();
            boolean z5 = this.f46949d;
            jm.a aVar3 = this.f46950e;
            if (z5) {
                double d12 = f11 * 100;
                d dVar7 = this.f46948c;
                if (dVar7 != null) {
                    d11 = ly.a.f(1, dVar7);
                } else {
                    d11 = 1.0d;
                }
                str = jm.a.d(aVar3, (float) (d12 / d11)).toString();
            } else {
                str = aVar3.f(f11, 1);
            }
        } else {
            str = "-";
        }
        LineCellView lineCellView = this.f46947b;
        if (lineCellView != null) {
            lineCellView.setValue(str);
        }
    }

    public final void setBodyWaterValueView(LineCellView lineCellView) {
        this.f46947b = lineCellView;
    }

    public final void setHorizontalSausageWithLegendsView(HorizontalSausageWithLegendsView horizontalSausageWithLegendsView) {
        this.f46946a = horizontalSausageWithLegendsView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyCompositionZonesDetailView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f46950e = a.d.a(context);
        View.inflate(context, C1987R.layout.view_body_composition_zones_detail, this);
        this.f46946a = (HorizontalSausageWithLegendsView) findViewById(C1987R.id.horizontal_sausage_with_legend);
        this.f46947b = (LineCellView) findViewById(C1987R.id.body_water_value);
        this.f46949d = i.b().e().C();
    }
}
