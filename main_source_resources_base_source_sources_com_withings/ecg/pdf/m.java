package com.withings.ecg.pdf;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.ecg.EcgLeadType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
/* compiled from: PDFGraphContainer.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.ecg.pdf.PDFGraphContainer$prepareMultipleLeadPage$2", f = "PDFGraphContainer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ PDFGraphContainer f38801a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Map<EcgLeadType, List<EcgEntry>> f38802b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m(PDFGraphContainer pDFGraphContainer, Map<EcgLeadType, ? extends List<EcgEntry>> map, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f38801a = pDFGraphContainer;
        this.f38802b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        return new m(this.f38801a, this.f38802b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        nm0.l.b(obj);
        PDFGraphContainer pDFGraphContainer = this.f38801a;
        pDFGraphContainer.removeAllViews();
        Context context = pDFGraphContainer.getContext();
        u.i(context, "getContext(...)");
        int j5 = wq.a.j(150.0f, context);
        Context context2 = pDFGraphContainer.getContext();
        u.i(context2, "getContext(...)");
        int j11 = wq.a.j(3.0f, context2);
        Context context3 = pDFGraphContainer.getContext();
        u.i(context3, "getContext(...)");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(j5, wq.a.j(30.0f, context3));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.width, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(layoutParams.height, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH);
        for (Map.Entry<EcgLeadType, List<EcgEntry>> entry : this.f38802b.entrySet()) {
            EcgLeadType key = entry.getKey();
            List<EcgEntry> value = entry.getValue();
            EcgLineChart b10 = PDFGraphContainer.b(pDFGraphContainer, layoutParams);
            int i12 = 0;
            if (key != EcgLeadType.DI) {
                i11 = j11;
            } else {
                i11 = 0;
            }
            pDFGraphContainer.d(j5, i11);
            pDFGraphContainer.addView(b10, layoutParams);
            pDFGraphContainer.d(j5, 0);
            float e11 = ((EcgEntry) x.I(value)).e();
            float e12 = ((EcgEntry) x.T(value)).e() - e11;
            b10.measure(makeMeasureSpec, makeMeasureSpec2);
            b10.e0(b10.getMeasuredWidth(), e12);
            b10.d0(e11, e12);
            b10.setVerticalRange$ecg_release(b10.getMeasuredHeight());
            if (e11 == 0.0f) {
                b10.setGraphScale$ecg_release(PDFGraphContainer.c(pDFGraphContainer, b10));
            }
            Iterator<EcgEntry> it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f() >= 0.36f) {
                        break;
                    }
                    i12++;
                } else {
                    i12 = -1;
                    break;
                }
            }
            b10.setEntries(value.subList(i12, x.M(value)));
        }
        return y.f85009a;
    }
}
