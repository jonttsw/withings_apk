package com.withings.ecg.details;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.samsung.android.sdk.healthdata.HealthUserProfile;
import com.withings.ecg.core.HeartDiagnostic;
import com.withings.ecg.details.EcgDebugScreenActivity;
import com.withings.ecg.details.b0;
import com.withings.ecg.details.c2;
import com.withings.ecg.fullscreen.FullScreenEcgActivity;
import com.withings.ecg.graph.EcgEntry;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.ecg.model.HeartDiagnosticUIKt;
import com.withings.ecg.model.HeartSignalMeasurementKt;
import com.withings.ecg.pdf.PDFGenerationActivity;
import com.withings.ecg.player.PlayerView;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.library.ecg.EcgLeadType;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.views.measure.detail.ui.views.DefinitionView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.joda.time.DateTime;
import qw.a;
/* compiled from: EcgDetailsFragment.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/ecg/details/g;", "Landroidx/fragment/app/Fragment;", "Lqw/a$b;", "Lcom/withings/ecg/details/c2$a;", "Lcom/withings/ecg/graph/EcgLineChart$b;", "<init>", "()V", "a", "", "shouldShowView", "", FirebaseAnalytics.Param.INDEX, "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class g extends p2 implements a.b, c2.a, EcgLineChart.b {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public w0 f38202h;

    /* renamed from: i  reason: collision with root package name */
    private final e f38203i = new e(this);

    /* renamed from: j  reason: collision with root package name */
    private final f f38204j = new f(this);

    /* renamed from: k  reason: collision with root package name */
    private final C0502g f38205k = new C0502g(this);

    /* renamed from: l  reason: collision with root package name */
    private final h f38206l = new h(this);

    /* renamed from: m  reason: collision with root package name */
    private final LifecycleViewBindingProperty f38207m = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: n  reason: collision with root package name */
    private androidx.lifecycle.k0<Integer> f38208n;

    /* renamed from: o  reason: collision with root package name */
    private c2 f38209o;

    /* renamed from: p  reason: collision with root package name */
    private b0 f38210p;

    /* renamed from: r  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38201r = {androidx.camera.core.v.c(g.class, "ecgId", "getEcgId()J", 0), androidx.camera.core.v.c(g.class, "date", "getDate()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(g.class, "isForResult", "isForResult()Z", 0), androidx.camera.core.v.c(g.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(g.class, "binding", "getBinding()Lcom/withings/ecg/databinding/FragmentEcgDetailsBinding;", 0)};

    /* renamed from: q  reason: collision with root package name */
    public static final a f38200q = new Object();

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static g a(a aVar, long j5, long j11, boolean z5, DateTime date, int i11) {
            if ((i11 & 4) != 0) {
                z5 = false;
            }
            if ((i11 & 8) != 0) {
                date = DateTime.now();
                kotlin.jvm.internal.u.i(date, "now(...)");
            }
            aVar.getClass();
            kotlin.jvm.internal.u.j(date, "date");
            g gVar = new g();
            gVar.setArguments(androidx.core.os.e.a(new nm0.j(HealthUserProfile.USER_PROFILE_KEY_USER_ID, Long.valueOf(j5)), new nm0.j("date", date), new nm0.j("ecgId", Long.valueOf(j11)), new nm0.j("forResult", Boolean.valueOf(z5))));
            return gVar;
        }
    }

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.p<DateTime, DateTime, nm0.y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(DateTime dateTime, DateTime dateTime2) {
            DateTime startDate = dateTime;
            DateTime endDate = dateTime2;
            kotlin.jvm.internal.u.j(startDate, "startDate");
            kotlin.jvm.internal.u.j(endDate, "endDate");
            g gVar = g.this;
            if (androidx.activity.b0.o(g.A1(gVar), startDate) && androidx.activity.b0.p(g.A1(gVar), endDate)) {
                b0 b0Var = gVar.f38210p;
                if (b0Var != null) {
                    b0Var.a1(gVar.J1());
                } else {
                    kotlin.jvm.internal.u.s("viewModel");
                    throw null;
                }
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f38212a;

        c(ym0.l lVar) {
            this.f38212a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f38212a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f38212a;
        }

        public final int hashCode() {
            return this.f38212a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f38212a.invoke(obj);
        }
    }

    /* compiled from: EcgDetailsFragment.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {
        d() {
            super(1);
        }

        @Override // ym0.l
        public final nm0.y invoke(Integer num) {
            Integer num2 = num;
            if (num2 != null) {
                NestedScrollView scrollView = g.this.I1().f78066m;
                kotlin.jvm.internal.u.i(scrollView, "scrollView");
                scrollView.setScrollY(num2.intValue());
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Fragment, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38214a = nm0.h.b(new w(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38215b;

        public e(Fragment fragment) {
            this.f38215b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38214a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class f implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38216a = nm0.h.b(new x(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38217b;

        public f(Fragment fragment) {
            this.f38217b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38216a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* renamed from: com.withings.ecg.details.g$g  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0502g implements bn0.d<Fragment, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38218a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38219b;

        public C0502g(Fragment fragment) {
            this.f38219b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Boolean, java.lang.Object] */
        @Override // bn0.d
        public final Boolean getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38218a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class h implements bn0.d<Fragment, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38220a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f38221b;

        public h(Fragment fragment) {
            this.f38221b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38220a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.l<g, kq.b> {
        @Override // ym0.l
        public final kq.b invoke(g gVar) {
            g fragment = gVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return kq.b.a(fragment.requireView());
        }
    }

    public static final DateTime A1(g gVar) {
        return (DateTime) gVar.f38204j.getValue(gVar, f38201r[1]);
    }

    public static final long C1(g gVar) {
        return ((Number) gVar.f38206l.getValue(gVar, f38201r[3])).longValue();
    }

    public static final void F1(g gVar, b0.a aVar) {
        int i11;
        int i12;
        HeartDiagnostic heartDiagnostic;
        kq.b I1 = gVar.I1();
        LineCellView ecgDetailsDiagnostic = I1.f78056c;
        kotlin.jvm.internal.u.i(ecgDetailsDiagnostic, "ecgDetailsDiagnostic");
        int i13 = 8;
        if (!androidx.compose.foundation.lazy.layout.d.g()) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        ecgDetailsDiagnostic.setVisibility(i11);
        DefinitionView ecgDetailsDescription = I1.f78055b;
        kotlin.jvm.internal.u.i(ecgDetailsDescription, "ecgDetailsDescription");
        if (!androidx.compose.foundation.lazy.layout.d.g()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ecgDetailsDescription.setVisibility(i12);
        ecgDetailsDescription.setButtonClickListener(new v(gVar, aVar));
        if (!aVar.g() && !aVar.h()) {
            int e11 = aVar.e();
            Integer d11 = aVar.d();
            int b10 = aVar.b();
            int colorRes = aVar.c().getColorRes();
            kq.b I12 = gVar.I1();
            Group groupToHideForReview = gVar.I1().f78063j;
            kotlin.jvm.internal.u.i(groupToHideForReview, "groupToHideForReview");
            groupToHideForReview.setVisibility(0);
            Group groupToInvisibleForReview = gVar.I1().f78064k;
            kotlin.jvm.internal.u.i(groupToInvisibleForReview, "groupToInvisibleForReview");
            groupToInvisibleForReview.setVisibility(0);
            Group groupToShowForReview = gVar.I1().f78065l;
            kotlin.jvm.internal.u.i(groupToShowForReview, "groupToShowForReview");
            groupToShowForReview.setVisibility(8);
            LineCellView ecgDetailsDiagnostic2 = I12.f78056c;
            kotlin.jvm.internal.u.i(ecgDetailsDiagnostic2, "ecgDetailsDiagnostic");
            if (!androidx.compose.foundation.lazy.layout.d.g()) {
                i13 = 0;
            }
            ecgDetailsDiagnostic2.setVisibility(i13);
            LineCellView lineCellView = I12.f78056c;
            lineCellView.x(C1987R.drawable.ic_circle_black_12dp, colorRes);
            lineCellView.setLabel(gVar.getString(e11));
            if (d11 != null) {
                lineCellView.setSecondaryLabel(gVar.getString(d11.intValue()));
            }
            I12.f78055b.setMessage(b10);
            return;
        }
        int e12 = aVar.e();
        Integer d12 = aVar.d();
        int b11 = aVar.b();
        boolean h11 = aVar.h();
        LineCellView lineCellView2 = gVar.I1().f78056c;
        if (h11) {
            heartDiagnostic = HeartDiagnostic.f37984a;
        } else {
            heartDiagnostic = HeartDiagnostic.f37985b;
        }
        lineCellView2.x(C1987R.drawable.ic_circle_black_12dp, HeartDiagnosticUIKt.toUI(heartDiagnostic).getColorRes());
        lineCellView2.setLabel(gVar.getString(e12));
        if (d12 != null) {
            lineCellView2.setSecondaryLabel(gVar.getString(d12.intValue()));
        }
        DefinitionView definitionView = gVar.I1().f78055b;
        String string = gVar.getString(b11);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        definitionView.setMessage(string);
        Group groupToHideForReview2 = gVar.I1().f78063j;
        kotlin.jvm.internal.u.i(groupToHideForReview2, "groupToHideForReview");
        groupToHideForReview2.setVisibility(8);
        Group groupToInvisibleForReview2 = gVar.I1().f78064k;
        kotlin.jvm.internal.u.i(groupToInvisibleForReview2, "groupToInvisibleForReview");
        groupToInvisibleForReview2.setVisibility(4);
        Group groupToShowForReview2 = gVar.I1().f78065l;
        kotlin.jvm.internal.u.i(groupToShowForReview2, "groupToShowForReview");
        groupToShowForReview2.setVisibility(0);
    }

    public static final void G1(g gVar, o2 o2Var) {
        gVar.getClass();
        if (!o2Var.b().isEmpty()) {
            kq.b I1 = gVar.I1();
            ProgressBar ecgGraphLoading = I1.f78060g;
            kotlin.jvm.internal.u.i(ecgGraphLoading, "ecgGraphLoading");
            ecgGraphLoading.setVisibility(8);
            o2Var.c().getSignal().getMeta();
            List<EcgEntry> b10 = o2Var.b();
            EcgLineChart ecgLineChart = I1.f78057d;
            ecgLineChart.setEntries(b10);
            ecgLineChart.Z(o2Var.a());
            ecgLineChart.setDuration(HeartSignalMeasurementKt.getDurationSeconds(o2Var.c().getSignal().getMeta()));
        }
    }

    public static final void H1(g gVar, b0.b bVar) {
        int i11;
        int i12;
        int i13;
        gVar.getClass();
        boolean a11 = bVar.a();
        rz.a aVar = gVar.I1().f78068o;
        LineCellView shareSingleMeasurement = aVar.f96034d;
        kotlin.jvm.internal.u.i(shareSingleMeasurement, "shareSingleMeasurement");
        int i14 = 8;
        if (a11) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        shareSingleMeasurement.setVisibility(i11);
        aVar.f96032b.setImageResource(2131232227);
        int i15 = 4;
        if (a11) {
            aVar.f96034d.setOnClickListener(new androidx.media3.ui.i(gVar, 4));
            aVar.f96031a.setOnClickListener(new com.google.android.material.search.j(gVar, 5));
        }
        kq.b I1 = gVar.I1();
        I1.f78055b.setButtonEnabled(bVar.a());
        FloatingActionButton ecgDetailsGraphZoom = I1.f78058e;
        kotlin.jvm.internal.u.i(ecgDetailsGraphZoom, "ecgDetailsGraphZoom");
        if (bVar.a() && !bVar.b()) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        ecgDetailsGraphZoom.setVisibility(i12);
        EcgLineChart ecgDetailsGraph = I1.f78057d;
        kotlin.jvm.internal.u.i(ecgDetailsGraph, "ecgDetailsGraph");
        if (!bVar.b()) {
            i15 = 0;
        }
        ecgDetailsGraph.setVisibility(i15);
        PlayerView ecgPlayerView = I1.f78062i;
        kotlin.jvm.internal.u.i(ecgPlayerView, "ecgPlayerView");
        if (bVar.a() && !bVar.b()) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        ecgPlayerView.setVisibility(i13);
        LottieAnimationView ecgNoSignalLottie = I1.f78061h;
        kotlin.jvm.internal.u.i(ecgNoSignalLottie, "ecgNoSignalLottie");
        if (!bVar.a() || bVar.b()) {
            i14 = 0;
        }
        ecgNoSignalLottie.setVisibility(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kq.b I1() {
        return (kq.b) this.f38207m.getValue(this, f38201r[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long J1() {
        return ((Number) this.f38203i.getValue(this, f38201r[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L1() {
        return ((Boolean) this.f38205k.getValue(this, f38201r[2])).booleanValue();
    }

    public static void s1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        PDFGenerationActivity.a aVar = PDFGenerationActivity.f38722j;
        Context requireContext = this$0.requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long J1 = this$0.J1();
        aVar.getClass();
        Intent putExtra = new Intent(requireContext, PDFGenerationActivity.class).putExtra("ecgId", J1);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        this$0.startActivity(putExtra);
    }

    public static void t1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new n(this$0, null), 3, null);
    }

    public static void u1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        c2 c2Var = this$0.f38209o;
        if (c2Var != null) {
            c2Var.dismiss();
        } else {
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
    }

    public static void v1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b0 b0Var = this$0.f38210p;
        if (b0Var != null) {
            b0Var.z0(this$0.J1());
            c2 c2Var = this$0.f38209o;
            if (c2Var != null) {
                c2Var.dismiss();
                return;
            } else {
                kotlin.jvm.internal.u.s("bottomSheetFragment");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void w1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b0 b0Var = this$0.f38210p;
        if (b0Var != null) {
            FullScreenEcgActivity.a aVar = FullScreenEcgActivity.f38371e;
            Context requireContext = this$0.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            long J1 = this$0.J1();
            aVar.getClass();
            Intent putExtra = new Intent(requireContext, FullScreenEcgActivity.class).putExtra("ecg_id", J1).putExtra("lead", (EcgLeadType) b0Var.U0().getValue());
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            this$0.startActivity(putExtra);
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    public static void x1(g this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        androidx.lifecycle.k0<Integer> k0Var = this$0.f38208n;
        if (k0Var != null) {
            k0Var.setValue(Integer.valueOf(i11));
        }
    }

    public static void y1(g this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        b0 b0Var = this$0.f38210p;
        if (b0Var != null) {
            FullScreenEcgActivity.a aVar = FullScreenEcgActivity.f38371e;
            Context requireContext = this$0.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            long J1 = this$0.J1();
            aVar.getClass();
            Intent putExtra = new Intent(requireContext, FullScreenEcgActivity.class).putExtra("ecg_id", J1).putExtra("lead", (EcgLeadType) b0Var.U0().getValue());
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            this$0.startActivity(putExtra);
            return;
        }
        kotlin.jvm.internal.u.s("viewModel");
        throw null;
    }

    @Override // com.withings.ecg.details.c2.a
    public final void C0(c2 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        b0 b0Var = this.f38210p;
        if (b0Var != null) {
            b0Var.Z0();
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    public final androidx.lifecycle.k0<Integer> K1() {
        return this.f38208n;
    }

    @Override // com.withings.ecg.details.c2.a
    public final void M0(c2 workoutSheet) {
        kotlin.jvm.internal.u.j(workoutSheet, "workoutSheet");
        EcgDebugScreenActivity.a aVar = EcgDebugScreenActivity.f37989d;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        long J1 = J1();
        aVar.getClass();
        Intent putExtra = new Intent(requireContext, EcgDebugScreenActivity.class).putExtra("ecg_id", J1);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        startActivity(putExtra);
        c2 c2Var = this.f38209o;
        if (c2Var != null) {
            c2Var.dismiss();
        } else {
            kotlin.jvm.internal.u.s("bottomSheetFragment");
            throw null;
        }
    }

    public final void M1(androidx.lifecycle.k0<Integer> k0Var) {
        androidx.lifecycle.k0<Integer> k0Var2 = this.f38208n;
        if (k0Var2 != null) {
            k0Var2.removeObservers(this);
        }
        this.f38208n = k0Var;
        if (k0Var != null) {
            k0Var.observe(this, new c(new d()));
        }
    }

    @Override // com.withings.ecg.graph.EcgLineChart.b
    public final void Z() {
        I1().f78062i.v();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        if (!L1()) {
            inflater.inflate(C1987R.menu.menu_fragment_ecg_details, menu);
        }
    }

    @Override // qw.a.b
    public final void onLoaded(DateTime dateTime, DateTime dateTime2) {
        cr.a.a(new nm0.j(dateTime, dateTime2), new b());
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_display_bottom_sheet) {
            b0 b0Var = this.f38210p;
            if (b0Var != null) {
                boolean Y0 = b0Var.Y0();
                c2 c2Var = new c2();
                c2Var.setArguments(androidx.core.os.e.a(new nm0.j("with_delete", Boolean.valueOf(Y0))));
                this.f38209o = c2Var;
                c2Var.y1(this);
                c2 c2Var2 = this.f38209o;
                if (c2Var2 != null) {
                    c2Var2.show(getParentFragmentManager(), g.class.getSimpleName());
                    return true;
                }
                kotlin.jvm.internal.u.s("bottomSheetFragment");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        I1().f78062i.v();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Integer value;
        Integer value2;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        setHasOptionsMenu(true);
        NestedScrollView nestedScrollView = I1().f78066m;
        androidx.lifecycle.k0<Integer> k0Var = this.f38208n;
        if (k0Var != null && (value2 = k0Var.getValue()) != null) {
            nestedScrollView.setScrollY(value2.intValue());
        }
        nestedScrollView.setOnScrollChangeListener(new e2.t(this, 5));
        if (androidx.core.view.u0.L(nestedScrollView) && !nestedScrollView.isLayoutRequested()) {
            androidx.lifecycle.k0<Integer> k0Var2 = this.f38208n;
            if (k0Var2 != null && (value = k0Var2.getValue()) != null) {
                nestedScrollView.setScrollY(value.intValue());
            }
        } else {
            nestedScrollView.addOnLayoutChangeListener(new j(this, nestedScrollView));
        }
        if (!L1()) {
            ay.b.n(nestedScrollView, false, true, 23);
        }
        I1().f78054a.setListener(new com.withings.ecg.details.h(this));
        EcgLineChart ecgLineChart = I1().f78057d;
        ecgLineChart.setTouchEnabled(false);
        ecgLineChart.setPinchZoom(false);
        ecgLineChart.setGridEnabled(true);
        ecgLineChart.setScaleXEnabled(true);
        ecgLineChart.setDataAnimationListener(this);
        I1().f78058e.setOnClickListener(new com.google.android.material.search.g(this, 3));
        I1().f78067n.setContent(new s1.a(true, -508077300, new m(this)));
        PlayerView playerView = I1().f78062i;
        EcgLineChart ecgDetailsGraph = I1().f78057d;
        kotlin.jvm.internal.u.i(ecgDetailsGraph, "ecgDetailsGraph");
        playerView.setGraph(ecgDetailsGraph);
        playerView.setOnClickListener(new androidx.media3.ui.h(this, 3));
        playerView.setPlayerViewAnimationListener(new com.withings.ecg.details.i(this));
        b0 b0Var = (b0) new androidx.lifecycle.k1(this, new o(this)).a(b0.class);
        androidx.lifecycle.d0 viewLifecycleOwner = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner, b0Var.M0(), new p(this));
        androidx.lifecycle.d0 viewLifecycleOwner2 = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner2, b0Var.K0(), new q(this));
        androidx.lifecycle.d0 viewLifecycleOwner3 = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner3, b0Var.F0(), new r(this));
        androidx.lifecycle.d0 viewLifecycleOwner4 = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner4, b0Var.O0(), new s(this));
        androidx.lifecycle.d0 viewLifecycleOwner5 = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner5, b0Var.T0(), new t(this));
        androidx.lifecycle.d0 viewLifecycleOwner6 = getViewLifecycleOwner();
        kotlin.jvm.internal.u.i(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        xw.d.c(viewLifecycleOwner6, b0Var.B0(), new u(this));
        this.f38210p = b0Var;
        AddDetailsView addDetailsView = I1().f78054a;
        b0 b0Var2 = this.f38210p;
        if (b0Var2 != null) {
            addDetailsView.setDetailsItems(b0Var2.A0());
        } else {
            kotlin.jvm.internal.u.s("viewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z5) {
        super.setUserVisibleHint(z5);
        if (!z5) {
            I1().f78062i.v();
        }
    }
}
