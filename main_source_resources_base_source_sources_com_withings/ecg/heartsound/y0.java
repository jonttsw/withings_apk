package com.withings.ecg.heartsound;

import android.content.Context;
import android.widget.ImageView;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import pm.j;
/* compiled from: SignalCacheDisplayer.kt */
/* loaded from: classes3.dex */
public final class y0 implements j.b<EcgEntry> {

    /* renamed from: a  reason: collision with root package name */
    private final Context f38560a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38561b;

    /* renamed from: c  reason: collision with root package name */
    private final EcgLineChart f38562c;

    /* renamed from: d  reason: collision with root package name */
    private final HeartSignalRepository f38563d;

    /* renamed from: e  reason: collision with root package name */
    private final pm.j<EcgEntry> f38564e;

    public y0(Context context, long j5, EcgLineChart chartView, ImageView imageView, HeartSignalRepository heartSignalRepository) {
        kotlin.jvm.internal.u.j(chartView, "chartView");
        kotlin.jvm.internal.u.j(imageView, "imageView");
        this.f38560a = context;
        this.f38561b = j5;
        this.f38562c = chartView;
        this.f38563d = heartSignalRepository;
        this.f38564e = new pm.j<>(chartView, imageView, Integer.valueOf((int) C1987R.drawable.ic_heartsound_graph_placeholder), this);
    }

    public static final void b(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        BuildersKt__BuildersKt.runBlocking$default(null, new x0(context, null), 1, null);
    }

    @Override // pm.j.b
    public final String a() {
        String str;
        Context context = this.f38560a;
        kotlin.jvm.internal.u.j(context, "context");
        if (ah.u.D(context)) {
            str = "-dark";
        } else {
            str = "-light";
        }
        return android.support.v4.media.session.c.c(new StringBuilder("timeline-signal-2-"), this.f38561b, str);
    }

    public final Object c(qm0.d<? super nm0.y> dVar) {
        Object h11 = this.f38564e.h(dVar);
        if (h11 == CoroutineSingletons.f76214a) {
            return h11;
        }
        return nm0.y.f85009a;
    }

    @Override // pm.j.b
    public final List<EcgEntry> i() {
        HeartSignalMeasurement heartSignal = this.f38563d.getHeartSignal(this.f38561b);
        if (heartSignal != null) {
            List<Short> d11 = new mq.i(this.f38560a).d(heartSignal.getTimestamp().getMillis(), heartSignal.getSignal().getMeta());
            ArrayList arrayList = new ArrayList(kotlin.collections.x.y(d11, 10));
            int i11 = 0;
            for (Object obj : d11) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    arrayList.add(new EcgEntry(i11, ((Number) obj).shortValue()));
                    i11 = i12;
                } else {
                    kotlin.collections.x.K0();
                    throw null;
                }
            }
            return arrayList;
        }
        return kotlin.collections.i0.f76187a;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [en0.i, en0.k] */
    @Override // pm.j.b
    public final void j(List<? extends EcgEntry> data) {
        kotlin.jvm.internal.u.j(data, "data");
        EcgLineChart ecgLineChart = this.f38562c;
        ecgLineChart.setExtraLeftOffset(0.0f);
        ecgLineChart.setExtraTopOffset(8.0f);
        ecgLineChart.setExtraRightOffset(0.0f);
        ecgLineChart.setExtraBottomOffset(8.0f);
        int size = data.size() / 2;
        if (size > 2000) {
            data = kotlin.collections.x.z0(data, new en0.i(size - 2000, size + 2000, 1));
        }
        new d0(ecgLineChart).i(0L, data);
    }
}
