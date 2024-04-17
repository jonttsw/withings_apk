package com.withings.ecg.pdf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: PDFGraphContainer.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/ecg/pdf/PDFGraphContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class PDFGraphContainer extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final int f38733a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38734b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PDFGraphContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public static final EcgLineChart b(PDFGraphContainer pDFGraphContainer, LinearLayout.LayoutParams layoutParams) {
        Context context = pDFGraphContainer.getContext();
        u.i(context, "getContext(...)");
        EcgLineChart ecgLineChart = new EcgLineChart(context, null, 6, 0);
        ecgLineChart.setLayoutParams(layoutParams);
        ecgLineChart.setTouchEnabled(false);
        ecgLineChart.setPinchZoom(false);
        ecgLineChart.setGridEnabled(true);
        ecgLineChart.setSmallGridEnabled(true);
        ecgLineChart.setBigGridEnabled(true);
        ecgLineChart.setScaleXEnabled(true);
        ecgLineChart.setSmallLineColor(pDFGraphContainer.f38734b);
        ecgLineChart.setBigLineColor(pDFGraphContainer.f38733a);
        ecgLineChart.setBackgroundColorRes(null);
        ecgLineChart.setLineColor(C1987R.color.pdf_graph_line);
        ecgLineChart.getXAxis().h(-16777216);
        return ecgLineChart;
    }

    public static final List c(PDFGraphContainer pDFGraphContainer, EcgLineChart ecgLineChart) {
        EcgEntry ecgEntry = new EcgEntry(0.0f, 0.0f);
        EcgEntry ecgEntry2 = new EcgEntry(0.078999996f, 0.0f);
        Context context = ecgLineChart.getContext();
        u.i(context, "getContext(...)");
        EcgEntry ecgEntry3 = new EcgEntry(0.08f, (ecgLineChart.getAxisLeft().B / wq.a.n(ecgLineChart.getMeasuredHeight(), context)) * 10.0f);
        Context context2 = ecgLineChart.getContext();
        u.i(context2, "getContext(...)");
        return x.W(ecgEntry, ecgEntry2, ecgEntry3, new EcgEntry(0.28f, (ecgLineChart.getAxisLeft().B / wq.a.n(ecgLineChart.getMeasuredHeight(), context2)) * 10.0f), new EcgEntry(0.281f, 0.0f), new EcgEntry(0.36f, 0.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(int i11, int i12) {
        Context context = getContext();
        u.i(context, "getContext(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(i11, wq.a.j(0.5f, context));
        marginLayoutParams.topMargin = i12;
        View view = new View(getContext());
        view.setLayoutParams(marginLayoutParams);
        view.setBackgroundColor(this.f38733a);
        addView(view, marginLayoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PDFGraphContainer(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        u.j(context, "context");
        this.f38733a = androidx.core.content.a.getColor(context, C1987R.color.pdf_grid_big);
        this.f38734b = androidx.core.content.a.getColor(context, C1987R.color.pdf_grid_small);
    }
}
