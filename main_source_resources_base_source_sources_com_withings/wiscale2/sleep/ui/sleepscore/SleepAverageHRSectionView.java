package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.features.FeatureFlag;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.track.data.SleepStat;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: SleepAverageHRSectionView.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepAverageHRSectionView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/util/AttributeSet;", "t", "Landroid/util/AttributeSet;", "getAttrs", "()Landroid/util/AttributeSet;", "attrs", "Lcom/withings/graph/GraphView;", ConstantsWs.JSON_SESSION_KEY_VALUE, "Lcom/withings/graph/GraphView;", "getSleepAverageHRGraph$HealthMate_prodRelease", "()Lcom/withings/graph/GraphView;", "sleepAverageHRGraph", "x", "getRespiratoryRateGraph$HealthMate_prodRelease", "respiratoryRateGraph", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepAverageHRSectionView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final AttributeSet f60603t;

    /* renamed from: u  reason: collision with root package name */
    private final ComposeView f60604u;

    /* renamed from: v  reason: collision with root package name */
    private final GraphView f60605v;

    /* renamed from: w  reason: collision with root package name */
    private final GraphPopupView f60606w;

    /* renamed from: x  reason: collision with root package name */
    private final GraphView f60607x;

    /* renamed from: y  reason: collision with root package name */
    private final GraphPopupView f60608y;

    /* renamed from: z  reason: collision with root package name */
    private final DefinitionView f60609z;

    /* compiled from: SleepAverageHRSectionView.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void c0();
    }

    /* compiled from: SleepAverageHRSectionView.kt */
    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SleepStat f60610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f60611b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(SleepStat sleepStat, a aVar) {
            super(2);
            this.f60610a = sleepStat;
            this.f60611b = aVar;
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -343555746, new j0(this.f60610a, this.f60611b)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepAverageHRSectionView.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.l<View, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f60612a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(1);
            this.f60612a = aVar;
        }

        @Override // ym0.l
        public final nm0.y invoke(View view) {
            View it = view;
            kotlin.jvm.internal.u.j(it, "it");
            a aVar = this.f60612a;
            if (aVar != null) {
                aVar.c0();
            }
            return nm0.y.f85009a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepAverageHRSectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.u.j(context, "context");
    }

    public static final /* synthetic */ void u(SleepAverageHRSectionView sleepAverageHRSectionView, Track track, ha0.h hVar, GraphView graphView, GraphPopupView graphPopupView) {
        sleepAverageHRSectionView.getClass();
        v(track, hVar, graphView, graphPopupView);
    }

    private static void v(Track track, ha0.h hVar, GraphView graphView, GraphPopupView graphPopupView) {
        graphView.setLayerType(1, null);
        Context context = graphView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        new ha0.k(context, graphView, graphPopupView, hVar, TrackKt.getEffectiveStartDate(track), TrackKt.getEffectiveEndDate(track)).d();
    }

    public final AttributeSet getAttrs() {
        return this.f60603t;
    }

    public final GraphView getRespiratoryRateGraph$HealthMate_prodRelease() {
        return this.f60607x;
    }

    public final GraphView getSleepAverageHRGraph$HealthMate_prodRelease() {
        return this.f60605v;
    }

    public final void w(f0 f0Var, a aVar) {
        nm0.y yVar;
        boolean z5;
        int i11;
        int i12;
        nm0.j jVar;
        nm0.j jVar2;
        SleepStat c11 = f0Var.c();
        if (c11 != null) {
            this.f60604u.setContent(new s1.a(true, -783081660, new b(c11, aVar)));
            this.f60609z.setButtonClickListener(new c(aVar));
            if (c11.getValue() != 0 && f0Var.a().size() > 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            GraphView graphView = this.f60605v;
            graphView.setVisibility(i11);
            View findViewById = findViewById(C1987R.id.respiratory_group);
            kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
            if (wr.b.c(FeatureFlag.X) && z5 && (!f0Var.b().isEmpty())) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            findViewById.setVisibility(i12);
            if (z5 && f0Var.d() != null) {
                if (!f0Var.a().isEmpty()) {
                    long millis = f0Var.a().get(0).getStartDate().getMillis();
                    List<Vasistas> a11 = f0Var.a();
                    ArrayList arrayList = new ArrayList(kotlin.collections.x.y(a11, 10));
                    for (Vasistas vasistas : a11) {
                        arrayList.add(new nm0.j(Long.valueOf(vasistas.getStartDate().getMillis()), Integer.valueOf(vasistas.getHeartRate())));
                    }
                    jVar2 = ha0.k.f70400k;
                    ha0.h hVar = new ha0.h(millis, arrayList, jVar2);
                    Track d11 = f0Var.d();
                    kotlin.jvm.internal.u.g(d11);
                    v(d11, hVar, graphView, this.f60606w);
                }
                if (wr.b.c(FeatureFlag.X) && (!f0Var.b().isEmpty())) {
                    GraphView graphView2 = this.f60607x;
                    if (androidx.core.view.u0.L(graphView2) && !graphView2.isLayoutRequested()) {
                        long millis2 = f0Var.a().get(0).getStartDate().getMillis();
                        List<Vasistas> b10 = f0Var.b();
                        ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(b10, 10));
                        for (Vasistas vasistas2 : b10) {
                            arrayList2.add(new nm0.j(Long.valueOf(vasistas2.getStartDate().getMillis()), Integer.valueOf(vasistas2.getRespiratoryRate())));
                        }
                        jVar = ha0.k.f70401l;
                        ha0.h hVar2 = new ha0.h(millis2, arrayList2, jVar);
                        Track d12 = f0Var.d();
                        kotlin.jvm.internal.u.g(d12);
                        v(d12, hVar2, getRespiratoryRateGraph$HealthMate_prodRelease(), this.f60608y);
                    } else {
                        graphView2.addOnLayoutChangeListener(new g0(f0Var, this));
                    }
                }
            }
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepAverageHRSectionView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.u.j(context, "context");
        this.f60603t = attributeSet;
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.view_sleep_average_hr_section, this);
        View findViewById = inflate.findViewById(C1987R.id.sleep_average_hr_composeview);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f60604u = (ComposeView) findViewById;
        View findViewById2 = inflate.findViewById(C1987R.id.sleep_average_hr_graph);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f60605v = (GraphView) findViewById2;
        View findViewById3 = inflate.findViewById(C1987R.id.sleep_average_hr_popup);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f60606w = (GraphPopupView) findViewById3;
        View findViewById4 = inflate.findViewById(C1987R.id.respiratory_graph);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f60607x = (GraphView) findViewById4;
        View findViewById5 = inflate.findViewById(C1987R.id.respiratory_graph_popup);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f60608y = (GraphPopupView) findViewById5;
        View findViewById6 = inflate.findViewById(C1987R.id.average_hr_definition);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f60609z = (DefinitionView) findViewById6;
    }
}
