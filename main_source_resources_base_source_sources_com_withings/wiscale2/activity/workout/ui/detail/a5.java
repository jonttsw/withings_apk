package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.widget.ProgressBar;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.withings.graph.GraphView;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.LockableScrollView;
import com.withings.views.view.SectionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.activity.workout.ui.detail.s4;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: WorkoutHeartRate.kt */
/* loaded from: classes4.dex */
public final class a5 {

    /* renamed from: a  reason: collision with root package name */
    private final View f49104a;

    /* renamed from: b  reason: collision with root package name */
    private final CoroutineScope f49105b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockableViewPager.b f49106c;

    /* renamed from: d  reason: collision with root package name */
    private final View f49107d;

    /* renamed from: e  reason: collision with root package name */
    private final SectionView f49108e;

    /* renamed from: f  reason: collision with root package name */
    private final GraphView f49109f;

    /* renamed from: g  reason: collision with root package name */
    private final GraphPopupView f49110g;

    /* renamed from: h  reason: collision with root package name */
    private final LineCellView f49111h;

    /* renamed from: i  reason: collision with root package name */
    private final LockableScrollView f49112i;

    /* renamed from: j  reason: collision with root package name */
    private final ProgressBar f49113j;

    /* renamed from: k  reason: collision with root package name */
    private z4 f49114k;

    public a5(View view, BlockableViewPager.b pagerCallback, LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl) {
        kotlin.jvm.internal.u.j(view, "view");
        kotlin.jvm.internal.u.j(pagerCallback, "pagerCallback");
        this.f49104a = view;
        this.f49106c = pagerCallback;
        this.f49107d = view.findViewById(C1987R.id.section_heart_rate);
        this.f49108e = (SectionView) view.findViewById(C1987R.id.hr_section_view);
        GraphView graphView = (GraphView) view.findViewById(C1987R.id.workout_hr_graph);
        this.f49109f = graphView;
        this.f49110g = (GraphPopupView) view.findViewById(C1987R.id.workout_hr_popup);
        this.f49111h = (LineCellView) view.findViewById(C1987R.id.average_heart_rate);
        this.f49112i = (LockableScrollView) view.findViewById(C1987R.id.scroll_view);
        this.f49113j = (ProgressBar) view.findViewById(C1987R.id.workout_hr_loading);
        this.f49114k = new z4(this);
        graphView.setZoomEnabled(false);
        graphView.setOnScrubbingListener(new y4(this));
    }

    public static void a(a5 this$0, boolean z5) {
        int i11;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        ProgressBar progress = this$0.f49113j;
        kotlin.jvm.internal.u.i(progress, "progress");
        if (z5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        progress.setVisibility(i11);
    }

    public static void b(ym0.l lVar, a5 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        SectionView heartRateTitle = this$0.f49108e;
        kotlin.jvm.internal.u.i(heartRateTitle, "heartRateTitle");
        lVar.invoke(heartRateTitle);
    }

    public final BlockableViewPager.b d() {
        return this.f49106c;
    }

    public final View e() {
        return this.f49104a;
    }

    public final void f() {
        this.f49109f.setOnScrubbingListener(null);
    }

    public final void g(String averageValue) {
        kotlin.jvm.internal.u.j(averageValue, "averageValue");
        this.f49111h.setValue(averageValue);
    }

    public final void h(q4 graphData) {
        int i11;
        kotlin.jvm.internal.u.j(graphData, "graphData");
        s4.a a11 = graphData.a();
        List<rs.e> mainDatumList = a11.f66439a;
        kotlin.jvm.internal.u.i(mainDatumList, "mainDatumList");
        boolean z5 = !mainDatumList.isEmpty();
        View heartRateSection = this.f49107d;
        kotlin.jvm.internal.u.i(heartRateSection, "heartRateSection");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        heartRateSection.setVisibility(i11);
        if (z5) {
            GraphView hrGraphView = this.f49109f;
            kotlin.jvm.internal.u.i(hrGraphView, "hrGraphView");
            Track c11 = graphData.c();
            User b10 = graphData.b();
            GraphPopupView hrGraphPopUp = this.f49110g;
            kotlin.jvm.internal.u.i(hrGraphPopUp, "hrGraphPopUp");
            s4 s4Var = new s4(hrGraphView, c11, b10, hrGraphPopUp, a11, this.f49114k);
            s4Var.C(new w6.h(this, z5));
            s4Var.x(TrackKt.getEffectiveStartDate(graphData.c()), graphData.a().a());
            List<rs.e> mainDatumList2 = a11.f66439a;
            kotlin.jvm.internal.u.i(mainDatumList2, "mainDatumList");
            s4Var.G(mainDatumList2);
        }
    }

    public final void i(ym0.l<? super SectionView, nm0.y> lVar) {
        nm0.y yVar;
        SectionView sectionView = this.f49108e;
        if (lVar != null) {
            sectionView.setActionClickListener(new com.withings.coach.chatbot.z0(1, lVar, this));
            yVar = nm0.y.f85009a;
        } else {
            yVar = null;
        }
        if (yVar == null) {
            sectionView.setAction((CharSequence) null);
        }
    }
}
