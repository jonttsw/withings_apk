package com.withings.ecg.heartsound;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.ecg.model.HeartSignalRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* compiled from: HeartSoundGraphView.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/ecg/heartsound/HeartSoundGraphView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeartSoundGraphView extends FrameLayout {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f38399c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final EcgLineChart f38400a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f38401b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HeartSoundGraphView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public final Object a(long j5, int i11, qm0.d<? super nm0.y> dVar) {
        Context context = getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        HeartSignalRepository heartSignalRepository = androidx.compose.foundation.lazy.layout.d.f4443b;
        if (heartSignalRepository != null) {
            Object c11 = new y0(context, j5, this.f38400a, this.f38401b, heartSignalRepository).c(dVar);
            if (c11 == CoroutineSingletons.f76214a) {
                return c11;
            }
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("heartSignalRepository");
        throw null;
    }

    public /* synthetic */ HeartSoundGraphView(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeartSoundGraphView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        View inflate = View.inflate(context, C1987R.layout.view_graph_heart_sound, this);
        View findViewById = inflate.findViewById(C1987R.id.chart);
        EcgLineChart ecgLineChart = (EcgLineChart) findViewById;
        ecgLineChart.setTouchEnabled(false);
        ecgLineChart.setPinchZoom(false);
        ecgLineChart.setGridEnabled(false);
        ecgLineChart.setScaleXEnabled(true);
        kotlin.jvm.internal.u.i(findViewById, "apply(...)");
        this.f38400a = (EcgLineChart) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.cached_chart);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f38401b = (ImageView) findViewById2;
    }
}
