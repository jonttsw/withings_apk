package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.compose.material.g6;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.huawei.hms.feature.dynamic.ModuleCopy;
import com.rudderstack.android.sdk.core.ecomm.ECommerceParamNames;
import com.rudderstack.android.sdk.core.util.Utils;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.environment.ui.sleep.a;
import com.withings.features.FeatureFlag;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.medicalreport.ui.MedicalReportActivity;
import com.withings.user.core.models.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.views.graphs.GraphPopupView;
import com.withings.views.measure.detail.ui.views.BrandView;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomFrameLayout;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.sleep.ui.SleepGraphLevelsLegendView;
import com.withings.wiscale2.sleep.ui.SleepManualGraphLevelsLegendView;
import com.withings.wiscale2.sleep.ui.edition.NightEditionActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SecondarySleepActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRSectionView;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepDisorderSectionView;
import com.withings.wiscale2.sleep.ui.sleepscore.SleepNapListActivity;
import com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreHelper;
import com.withings.wiscale2.track.data.SleepStat;
import com.withings.wiscale2.track.data.SleepStatsFactory;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import com.withings.wiscale2.track.data.TrackKt;
import fi0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.internal.http2.Http2;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import pm.e;
/* compiled from: SleepDayFragment.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u0004\u0018\u00010\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/k0;", "Landroidx/fragment/app/Fragment;", "Lfi0/c$b;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepDisorderSectionView$a;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/SleepAverageHRSectionView$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "Lvx/e;", "selectedSleepFeeling", "Lxx/o;", "yourLogsSectionState", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class k0 extends com.withings.wiscale2.sleep.ui.sleepscore.d implements c.b, CustomNestedScrollView.c, SleepDisorderSectionView.a, SleepAverageHRSectionView.a {
    private ProgressBar A;
    private View B;
    private ComposeView F;
    private TextView G;
    private View M;
    private LineCellView P;
    private LineCellView Q;
    private LineCellView R;
    private AddDetailsView S;
    private View T;
    private ComposeView W;
    private SleepDisorderSectionView X;
    private SleepSnoringSectionView Y;
    private SleepAverageHRSectionView Z;

    /* renamed from: j  reason: collision with root package name */
    private int f61068j;

    /* renamed from: k  reason: collision with root package name */
    private Track f61069k;

    /* renamed from: l0  reason: collision with root package name */
    private SleepGraphLevelsLegendView f61071l0;

    /* renamed from: m  reason: collision with root package name */
    private boolean f61072m;

    /* renamed from: m0  reason: collision with root package name */
    private SleepManualGraphLevelsLegendView f61073m0;
    @Inject

    /* renamed from: n0  reason: collision with root package name */
    public s1 f61075n0;
    @Inject

    /* renamed from: o0  reason: collision with root package name */
    public ei0.q f61077o0;

    /* renamed from: p  reason: collision with root package name */
    private CustomNestedScrollView f61078p;
    @Inject

    /* renamed from: p0  reason: collision with root package name */
    public dg.a f61079p0;

    /* renamed from: q  reason: collision with root package name */
    private View f61080q;
    @Inject

    /* renamed from: q0  reason: collision with root package name */
    public wb0.j f61081q0;

    /* renamed from: r  reason: collision with root package name */
    private CustomFrameLayout f61082r;

    /* renamed from: s  reason: collision with root package name */
    private ViewGroup f61084s;

    /* renamed from: t  reason: collision with root package name */
    private View f61086t;

    /* renamed from: t0  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f61087t0;

    /* renamed from: u  reason: collision with root package name */
    private ImageView f61088u;

    /* renamed from: u0  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f61089u0;

    /* renamed from: v  reason: collision with root package name */
    private LinearLayout f61090v;

    /* renamed from: v0  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f61091v0;

    /* renamed from: w  reason: collision with root package name */
    private BrandView f61092w;

    /* renamed from: x  reason: collision with root package name */
    private RecyclerView f61093x;

    /* renamed from: y  reason: collision with root package name */
    private GraphView f61094y;

    /* renamed from: z  reason: collision with root package name */
    private GraphPopupView f61095z;

    /* renamed from: x0  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61065x0 = {androidx.camera.core.v.c(k0.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(k0.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: w0  reason: collision with root package name */
    public static final a f61064w0 = new Object();

    /* renamed from: h  reason: collision with root package name */
    private final h f61066h = new h(this);

    /* renamed from: i  reason: collision with root package name */
    private final i f61067i = new i(this);

    /* renamed from: l  reason: collision with root package name */
    private ArrayList f61070l = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f61074n = nm0.h.b(new c());

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f61076o = nm0.h.b(new e());

    /* renamed from: r0  reason: collision with root package name */
    private final nm0.g f61083r0 = nm0.h.b(new j());

    /* renamed from: s0  reason: collision with root package name */
    private final nm0.g f61085s0 = nm0.h.b(new g());

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void A0(k0 k0Var);

        void F(k0 k0Var, DateTime dateTime);

        void W(k0 k0Var);

        void g1(k0 k0Var, DateTime dateTime);

        void t0(k0 k0Var, int i11);
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            Fragment parentFragment = k0.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment.Delegate");
            return (b) parentFragment;
        }
    }

    /* compiled from: SleepDayFragment.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment$onDeleteSleepClicked$1$1", f = "SleepDayFragment.kt", l = {782}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f61097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k0 f61098b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Track f61099c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f61100d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: SleepDayFragment.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.sleep.ui.sleepscore.SleepDayFragment$onDeleteSleepClicked$1$1$1", f = "SleepDayFragment.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Track f61101a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f61102b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ k0 f61103c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(int i11, k0 k0Var, Track track, qm0.d dVar) {
                super(2, dVar);
                this.f61101a = track;
                this.f61102b = i11;
                this.f61103c = k0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f61102b, this.f61103c, this.f61101a, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                nm0.l.b(obj);
                Integer num = new Integer(this.f61102b);
                Track track = this.f61101a;
                track.setDeletionReason(num);
                if (ei0.q.f65441d != null) {
                    ei0.q qVar = ei0.q.f65441d;
                    if (qVar != null) {
                        qVar.c(this.f61103c.S1().getId(), track);
                        return nm0.y.f85009a;
                    }
                    kotlin.jvm.internal.u.s("instance");
                    throw null;
                }
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11, k0 k0Var, Track track, qm0.d dVar) {
            super(2, dVar);
            this.f61098b = k0Var;
            this.f61099c = track;
            this.f61100d = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new d(this.f61100d, this.f61098b, this.f61099c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((d) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f61097a;
            int i12 = this.f61100d;
            k0 k0Var = this.f61098b;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(i12, k0Var, this.f61099c, null);
                this.f61097a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            if (k0Var.getContext() != null) {
                Integer num = new Integer(i12);
                if (num.intValue() == 9) {
                    str = "keep-private";
                } else if (num.intValue() == 8) {
                    str = "not-accurate";
                } else if (num.intValue() == 5) {
                    str = "no-reason";
                } else if (num.intValue() == 6) {
                    str = "not-me";
                } else {
                    str = "other";
                }
                bi0.a aVar2 = bi0.a.f21233a;
                Map j5 = kotlin.collections.s0.j(new nm0.j("value", 1), new nm0.j(ECommerceParamNames.REASON, str), new nm0.j("origin", "bottom-sheet"));
                x70.b.l(aVar2, "night_deleted " + j5, new Object[0]);
            }
            k0.B1(k0Var).W(k0Var);
            return nm0.y.f85009a;
        }
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<BlockableViewPager.b> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final BlockableViewPager.b invoke() {
            Fragment parentFragment = k0.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
            return (BlockableViewPager.b) parentFragment;
        }
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class f implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f61105a;

        f(ym0.l lVar) {
            this.f61105a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f61105a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f61105a;
        }

        public final int hashCode() {
            return this.f61105a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f61105a.invoke(obj);
        }
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<hi0.b> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final hi0.b invoke() {
            k0 k0Var = k0.this;
            Context requireContext = k0Var.requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            return new hi0.b(requireContext, k0Var.S1());
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class h implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61107a = nm0.h.b(new z0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61108b;

        public h(Fragment fragment) {
            this.f61108b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61107a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class i implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61109a = nm0.h.b(new a1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61110b;

        public i(Fragment fragment) {
            this.f61110b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61109a.getValue();
        }
    }

    /* compiled from: SleepDayFragment.kt */
    /* loaded from: classes5.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<j1> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final j1 invoke() {
            k0 k0Var = k0.this;
            return (j1) new androidx.lifecycle.k1(k0Var, new c1(k0Var)).a(j1.class);
        }
    }

    public k0() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 6));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f61087t0 = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new cq.f(this, 4));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f61089u0 = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new com.withings.devicesetup.network.ui.a(this, 5));
        kotlin.jvm.internal.u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f61091v0 = registerForActivityResult3;
    }

    public static final DateTime A1(k0 k0Var) {
        k0Var.getClass();
        return (DateTime) k0Var.f61067i.getValue(k0Var, f61065x0[1]);
    }

    public static final b B1(k0 k0Var) {
        return (b) k0Var.f61074n.getValue();
    }

    public static final BlockableViewPager.b C1(k0 k0Var) {
        return (BlockableViewPager.b) k0Var.f61076o.getValue();
    }

    public static final j1 H1(k0 k0Var) {
        return (j1) k0Var.f61083r0.getValue();
    }

    public static final void I1(k0 k0Var, List list) {
        int i11;
        k0Var.getClass();
        if (list.size() == 0) {
            LineCellView lineCellView = k0Var.P;
            if (lineCellView != null) {
                lineCellView.setVisibility(8);
                return;
            } else {
                kotlin.jvm.internal.u.s("lineCellViewNaps");
                throw null;
            }
        }
        LineCellView lineCellView2 = k0Var.P;
        if (lineCellView2 != null) {
            if (list.size() > 1) {
                i11 = C1987R.string.sleepScore_naps;
            } else {
                i11 = C1987R.string._NAP_;
            }
            lineCellView2.setLabel(k0Var.getString(i11));
            LineCellView lineCellView3 = k0Var.P;
            if (lineCellView3 != null) {
                lineCellView3.setVisibility(0);
                if (list.size() == 1) {
                    Track track = (Track) kotlin.collections.x.I(list);
                    DateTime effectiveStartDate = TrackKt.getEffectiveStartDate(track);
                    LineCellView lineCellView4 = k0Var.P;
                    if (lineCellView4 != null) {
                        Context context = lineCellView4.getContext();
                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                        String t11 = b50.b.t(context, effectiveStartDate);
                        LineCellView lineCellView5 = k0Var.P;
                        if (lineCellView5 != null) {
                            Context context2 = lineCellView5.getContext();
                            kotlin.jvm.internal.u.i(context2, "getContext(...)");
                            Parcelable data = track.getData();
                            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                            CharSequence R1 = R1(context2, ((SleepTrackData) data).getTotalSleep().getMillis(), true);
                            LineCellView lineCellView6 = k0Var.P;
                            if (lineCellView6 != null) {
                                lineCellView6.setValue(t11 + " - " + ((Object) R1));
                            } else {
                                kotlin.jvm.internal.u.s("lineCellViewNaps");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("lineCellViewNaps");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.u.s("lineCellViewNaps");
                        throw null;
                    }
                } else {
                    LineCellView lineCellView7 = k0Var.P;
                    if (lineCellView7 != null) {
                        lineCellView7.setValue(String.valueOf(list.size()));
                    } else {
                        kotlin.jvm.internal.u.s("lineCellViewNaps");
                        throw null;
                    }
                }
                LineCellView lineCellView8 = k0Var.P;
                if (lineCellView8 != null) {
                    lineCellView8.setOnClickListener(new sg.a(5, list, k0Var));
                    return;
                } else {
                    kotlin.jvm.internal.u.s("lineCellViewNaps");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("lineCellViewNaps");
            throw null;
        }
        kotlin.jvm.internal.u.s("lineCellViewNaps");
        throw null;
    }

    public static final void K1(k0 k0Var) {
        ComposeView composeView = k0Var.W;
        if (composeView != null) {
            composeView.setVisibility(0);
            ComposeView composeView2 = k0Var.W;
            if (composeView2 != null) {
                composeView2.setContent(new s1.a(true, 1196136849, new s0(k0Var)));
                return;
            } else {
                kotlin.jvm.internal.u.s("sectionManualLogView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("sectionManualLogView");
        throw null;
    }

    public static final void L1(k0 k0Var) {
        AddDetailsView addDetailsView = k0Var.S;
        if (addDetailsView != null) {
            addDetailsView.setVisibility(0);
            AddDetailsView addDetailsView2 = k0Var.S;
            if (addDetailsView2 != null) {
                addDetailsView2.setListener(new t0(k0Var));
                return;
            } else {
                kotlin.jvm.internal.u.s("noteView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("noteView");
        throw null;
    }

    public static final void N1(k0 k0Var, Track track) {
        if (track == null) {
            LineCellView lineCellView = k0Var.Q;
            if (lineCellView != null) {
                lineCellView.setVisibility(8);
                LineCellView lineCellView2 = k0Var.R;
                if (lineCellView2 != null) {
                    lineCellView2.setVisibility(8);
                    return;
                } else {
                    kotlin.jvm.internal.u.s("nightInProgressLineCellViewSecondarySleep");
                    throw null;
                }
            }
            kotlin.jvm.internal.u.s("lineCellViewSecondarySleep");
            throw null;
        }
        LineCellView[] lineCellViewArr = new LineCellView[2];
        LineCellView lineCellView3 = k0Var.Q;
        if (lineCellView3 != null) {
            lineCellViewArr[0] = lineCellView3;
            LineCellView lineCellView4 = k0Var.R;
            if (lineCellView4 != null) {
                lineCellViewArr[1] = lineCellView4;
                for (LineCellView lineCellView5 : kotlin.collections.x.W(lineCellViewArr)) {
                    wb0.j jVar = k0Var.f61081q0;
                    if (jVar != null) {
                        String a11 = jVar.a(track.getDeviceModel());
                        Context context = lineCellView5.getContext();
                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                        Parcelable data = track.getData();
                        kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                        CharSequence R1 = R1(context, ((SleepTrackData) data).getTotalSleep().getMillis(), false);
                        lineCellView5.setVisibility(0);
                        lineCellView5.setLabel(a11);
                        lineCellView5.setValue(R1);
                        lineCellView5.setOnClickListener(new uk.a(5, k0Var, track));
                    } else {
                        kotlin.jvm.internal.u.s("getDeviceNameWhenPotentialPartner");
                        throw null;
                    }
                }
                return;
            }
            kotlin.jvm.internal.u.s("nightInProgressLineCellViewSecondarySleep");
            throw null;
        }
        kotlin.jvm.internal.u.s("lineCellViewSecondarySleep");
        throw null;
    }

    public static final void O1(k0 k0Var, di0.a aVar) {
        SleepScore sleepScore;
        List<Vasistas> list;
        Vasistas copy;
        ArrayList arrayList;
        Vasistas copy2;
        boolean z5;
        boolean z11;
        boolean z12;
        int i11;
        int i12;
        Object obj;
        char c11;
        Object obj2;
        String str;
        int i13;
        Throwable th2;
        nm0.y yVar;
        Long l5;
        Duration remSleepDuration;
        boolean z13;
        v vVar;
        k0Var.getClass();
        Track d11 = aVar.d();
        if (d11 != null) {
            View view = k0Var.T;
            if (view != null) {
                rz.a a11 = rz.a.a(view);
                if (d11.getDeviceType() == 32) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                ((j1) k0Var.f61083r0.getValue()).getClass();
                if (z13) {
                    vVar = new v(C1987R.string.shareSleepReport_sectionShare, C1987R.string.shareSleepReport_sectionMessage, C1987R.string.shareSleepReport_sectionShare, 2131232249);
                } else {
                    vVar = new v(C1987R.string.shareHealthReport_sectionTitle, C1987R.string.shareHealthReport_sectionMessage, C1987R.string.shareHealthReport_sectionShareComplete, 2131232247);
                }
                a11.f96033c.setTitle(vVar.d());
                a11.f96035e.setText(vVar.c());
                a11.f96032b.setImageResource(vVar.b());
                String string = k0Var.getString(vVar.a());
                LineCellView lineCellView = a11.f96031a;
                lineCellView.setLabel(string);
                lineCellView.setOnClickListener(new sg.b(k0Var, 20));
            } else {
                kotlin.jvm.internal.u.s("healthShareContent");
                throw null;
            }
        }
        Track d12 = aVar.d();
        if ((d12 != null && d12.getAttrib() == 2) || (d12 != null && (sleepScore = d12.getSleepScore()) != null && sleepScore.isSleepScoreConsistent() && (!aVar.a().isEmpty()))) {
            Track d13 = aVar.d();
            k0Var.f61069k = d13;
            if (d13 != null) {
                BrandView brandView = k0Var.f61092w;
                if (brandView != null) {
                    Context context = brandView.getContext();
                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                    brandView.setBrandName(com.withings.wiscale2.measure.accountmeasure.ui.add.g0.b(d13, context));
                    if (d13.getDeviceModel() == 63) {
                        list = aVar.b();
                    } else {
                        List<Vasistas> b10 = aVar.b();
                        for (Vasistas vasistas : b10) {
                            vasistas.setType(Vasistas.VasistasType.SLEEP);
                        }
                        list = b10;
                    }
                    List<Vasistas> list2 = list;
                    List<Vasistas> a12 = aVar.a();
                    List<Vasistas> e11 = aVar.e();
                    if (e11.isEmpty()) {
                        arrayList = new ArrayList();
                    } else {
                        ArrayList arrayList2 = new ArrayList();
                        copy = r18.copy((r62 & 1) != 0 ? r18.startDate : null, (r62 & 2) != 0 ? r18.f46386id : null, (r62 & 4) != 0 ? r18.userId : null, (r62 & 8) != 0 ? r18.durationMillis : 0, (r62 & 16) != 0 ? r18.type : null, (r62 & 32) != 0 ? r18.activityType : null, (r62 & 64) != 0 ? r18.category : null, (r62 & 128) != 0 ? r18.calories : 0.0f, (r62 & 256) != 0 ? r18.earnedCalories : 0.0f, (r62 & 512) != 0 ? r18.met : 0.0f, (r62 & 1024) != 0 ? r18.sleepLevel : 0, (r62 & ModuleCopy.f28574b) != 0 ? r18.sleepDebug : 0, (r62 & 4096) != 0 ? r18.snoringDurationRatio : 0, (r62 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r18.heartRate : 0, (r62 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r18.heartRateMeasureQuality : 0, (r62 & Utils.MAX_EVENT_SIZE) != 0 ? r18.skinTemperature : 0, (r62 & 65536) != 0 ? r18.coreTemperature : 0.0f, (r62 & 131072) != 0 ? r18.activityStatus : 0, (r62 & 262144) != 0 ? r18.steps : 0, (r62 & 524288) != 0 ? r18.distance : 0.0f, (r62 & 1048576) != 0 ? r18.classifierFeature : 0.0f, (r62 & 2097152) != 0 ? r18.swimMovements : 0, (r62 & 4194304) != 0 ? r18.swimLaps : 0, (r62 & 8388608) != 0 ? r18.deviceModel : 0, (r62 & 16777216) != 0 ? r18.activityRecognitionData2 : 0, (r62 & 33554432) != 0 ? r18.version : 0, (r62 & 67108864) != 0 ? r18.swimType : 0, (r62 & 134217728) != 0 ? r18.deviceId : 0L, (r62 & 268435456) != 0 ? r18.apneaHypopneaIndex : null, (536870912 & r62) != 0 ? r18.breathingProbability : null, (r62 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? r18.pauseType : null, (r62 & Integer.MIN_VALUE) != 0 ? r18.spo2 : null, (r63 & 1) != 0 ? r18.spo2Quality : null, (r63 & 2) != 0 ? r18.isSyncedToWs : false, (r63 & 4) != 0 ? r18.respiratoryRate : 0, (r63 & 8) != 0 ? r18.hrLevel : 0, (r63 & 16) != 0 ? r18.hrState : 0, (r63 & 32) != 0 ? r18.algoVersion : null, (r63 & 64) != 0 ? r18.firmwareVersion : null, (r63 & 128) != 0 ? r18.appPfmId : null, (r63 & 256) != 0 ? r18.appliVersion : null, (r63 & 512) != 0 ? r18.isTrusted : false, (r63 & 1024) != 0 ? ((Vasistas) kotlin.collections.x.I(e11)).attrib : null);
                        arrayList2.add(copy);
                        int size = e11.size();
                        for (int i14 = 1; i14 < size; i14++) {
                            copy2 = r18.copy((r62 & 1) != 0 ? r18.startDate : null, (r62 & 2) != 0 ? r18.f46386id : null, (r62 & 4) != 0 ? r18.userId : null, (r62 & 8) != 0 ? r18.durationMillis : 0, (r62 & 16) != 0 ? r18.type : null, (r62 & 32) != 0 ? r18.activityType : null, (r62 & 64) != 0 ? r18.category : null, (r62 & 128) != 0 ? r18.calories : 0.0f, (r62 & 256) != 0 ? r18.earnedCalories : 0.0f, (r62 & 512) != 0 ? r18.met : 0.0f, (r62 & 1024) != 0 ? r18.sleepLevel : 0, (r62 & ModuleCopy.f28574b) != 0 ? r18.sleepDebug : 0, (r62 & 4096) != 0 ? r18.snoringDurationRatio : 0, (r62 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r18.heartRate : 0, (r62 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? r18.heartRateMeasureQuality : 0, (r62 & Utils.MAX_EVENT_SIZE) != 0 ? r18.skinTemperature : 0, (r62 & 65536) != 0 ? r18.coreTemperature : 0.0f, (r62 & 131072) != 0 ? r18.activityStatus : 0, (r62 & 262144) != 0 ? r18.steps : 0, (r62 & 524288) != 0 ? r18.distance : 0.0f, (r62 & 1048576) != 0 ? r18.classifierFeature : 0.0f, (r62 & 2097152) != 0 ? r18.swimMovements : 0, (r62 & 4194304) != 0 ? r18.swimLaps : 0, (r62 & 8388608) != 0 ? r18.deviceModel : 0, (r62 & 16777216) != 0 ? r18.activityRecognitionData2 : 0, (r62 & 33554432) != 0 ? r18.version : 0, (r62 & 67108864) != 0 ? r18.swimType : 0, (r62 & 134217728) != 0 ? r18.deviceId : 0L, (r62 & 268435456) != 0 ? r18.apneaHypopneaIndex : null, (536870912 & r62) != 0 ? r18.breathingProbability : null, (r62 & ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH) != 0 ? r18.pauseType : null, (r62 & Integer.MIN_VALUE) != 0 ? r18.spo2 : null, (r63 & 1) != 0 ? r18.spo2Quality : null, (r63 & 2) != 0 ? r18.isSyncedToWs : false, (r63 & 4) != 0 ? r18.respiratoryRate : 0, (r63 & 8) != 0 ? r18.hrLevel : 0, (r63 & 16) != 0 ? r18.hrState : 0, (r63 & 32) != 0 ? r18.algoVersion : null, (r63 & 64) != 0 ? r18.firmwareVersion : null, (r63 & 128) != 0 ? r18.appPfmId : null, (r63 & 256) != 0 ? r18.appliVersion : null, (r63 & 512) != 0 ? r18.isTrusted : false, (r63 & 1024) != 0 ? e11.get(i14).attrib : null);
                            Vasistas vasistas2 = (Vasistas) kotlin.collections.x.T(arrayList2);
                            if (new Duration(vasistas2.getEnd(), copy2.getStartDate()).getStandardMinutes() <= 0) {
                                vasistas2.setDurationMillis((int) new Duration(vasistas2.getStartDate(), copy2.getEnd()).getMillis());
                            } else {
                                arrayList2.add(copy2);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    List<Vasistas> c12 = aVar.c();
                    Parcelable data = d13.getData();
                    kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                    SleepTrackData sleepTrackData = (SleepTrackData) data;
                    if (d13.getDeviceType() != 32 && ((remSleepDuration = sleepTrackData.getRemSleepDuration()) == null || !remSleepDuration.isLongerThan(new Duration(0L)))) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (ah.m.z(sleepTrackData.getLightSleepDuration()) <= 0 && ah.m.z(sleepTrackData.getDeepSleepDuration()) <= 0 && ah.m.z(sleepTrackData.getRemSleepDuration()) <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    SleepGraphLevelsLegendView sleepGraphLevelsLegendView = k0Var.f61071l0;
                    if (sleepGraphLevelsLegendView != null) {
                        sleepGraphLevelsLegendView.setUnspecifiedVisible(!z11);
                        if (d13.getManualStartDate() == null && d13.getManualEndDate() == null && !d13.getBlankVasistasFilled()) {
                            SleepGraphLevelsLegendView sleepGraphLevelsLegendView2 = k0Var.f61071l0;
                            if (sleepGraphLevelsLegendView2 != null) {
                                sleepGraphLevelsLegendView2.setVisibility(0);
                                SleepGraphLevelsLegendView sleepGraphLevelsLegendView3 = k0Var.f61071l0;
                                if (sleepGraphLevelsLegendView3 != null) {
                                    sleepGraphLevelsLegendView3.setREMVisible(z5);
                                    SleepManualGraphLevelsLegendView sleepManualGraphLevelsLegendView = k0Var.f61073m0;
                                    if (sleepManualGraphLevelsLegendView != null) {
                                        sleepManualGraphLevelsLegendView.setVisibility(8);
                                        z12 = false;
                                    } else {
                                        kotlin.jvm.internal.u.s("manualGraphLegend");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.u.s("graphLegend");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.u.s("graphLegend");
                                throw null;
                            }
                        } else {
                            SleepGraphLevelsLegendView sleepGraphLevelsLegendView4 = k0Var.f61071l0;
                            if (sleepGraphLevelsLegendView4 != null) {
                                sleepGraphLevelsLegendView4.setVisibility(8);
                                SleepManualGraphLevelsLegendView sleepManualGraphLevelsLegendView2 = k0Var.f61073m0;
                                if (sleepManualGraphLevelsLegendView2 != null) {
                                    sleepManualGraphLevelsLegendView2.setREMVisible(z5);
                                    SleepManualGraphLevelsLegendView sleepManualGraphLevelsLegendView3 = k0Var.f61073m0;
                                    if (sleepManualGraphLevelsLegendView3 != null) {
                                        z12 = false;
                                        sleepManualGraphLevelsLegendView3.setVisibility(0);
                                    } else {
                                        kotlin.jvm.internal.u.s("manualGraphLegend");
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.u.s("manualGraphLegend");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.u.s("graphLegend");
                                throw null;
                            }
                        }
                        k0Var.X1(z12);
                        k0Var.U1(true, d13.isInProgress());
                        RecyclerView recyclerView = k0Var.f61093x;
                        if (recyclerView != null) {
                            Context context2 = recyclerView.getContext();
                            kotlin.jvm.internal.u.i(context2, "getContext(...)");
                            List<SleepStat> generateSleepStats = new SleepStatsFactory(context2, k0Var.S1()).generateSleepStats(d13);
                            View view2 = k0Var.B;
                            if (view2 != null) {
                                if (d13.getSleepScore() != null) {
                                    i11 = 0;
                                } else {
                                    i11 = 8;
                                }
                                view2.setVisibility(i11);
                                SleepScore sleepScore2 = d13.getSleepScore();
                                if (sleepScore2 != null) {
                                    ComposeView composeView = k0Var.F;
                                    if (composeView != null) {
                                        composeView.setContent(new s1.a(true, 1687137880, new x0(sleepScore2, k0Var)));
                                        TextView textView = k0Var.G;
                                        if (textView != null) {
                                            SleepScoreHelper sleepScoreHelper = SleepScoreHelper.INSTANCE;
                                            Context context3 = textView.getContext();
                                            kotlin.jvm.internal.u.i(context3, "getContext(...)");
                                            textView.setText(sleepScoreHelper.getSleepScoreStatus(context3, sleepScore2));
                                            ArrayList arrayList3 = new ArrayList();
                                            for (Object obj3 : generateSleepStats) {
                                                SleepStat sleepStat = (SleepStat) obj3;
                                                if (sleepStat.getId() != 7 && sleepStat.getId() != 8) {
                                                    arrayList3.add(obj3);
                                                }
                                            }
                                            RecyclerView recyclerView2 = k0Var.f61093x;
                                            if (recyclerView2 != null) {
                                                recyclerView2.setAdapter(new w3(arrayList3));
                                            } else {
                                                kotlin.jvm.internal.u.s("statsRecyclerView");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.u.s("sleepScoreSummary");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.u.s("sleepScoreGoalRing");
                                        throw null;
                                    }
                                }
                                List<SleepStat> list3 = generateSleepStats;
                                Iterator<T> it = list3.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj = it.next();
                                        i12 = 8;
                                        if (((SleepStat) obj).getId() == 8) {
                                            break;
                                        }
                                    } else {
                                        i12 = 8;
                                        obj = null;
                                        break;
                                    }
                                }
                                SleepStat sleepStat2 = (SleepStat) obj;
                                SleepSnoringSectionView sleepSnoringSectionView = k0Var.Y;
                                if (sleepSnoringSectionView != null) {
                                    sleepSnoringSectionView.t(sleepStat2, k0Var.f61069k, a12, arrayList);
                                    Iterator<T> it2 = list3.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj2 = it2.next();
                                            c11 = 7;
                                            if (((SleepStat) obj2).getId() == 7) {
                                                break;
                                            }
                                        } else {
                                            c11 = 7;
                                            obj2 = null;
                                            break;
                                        }
                                    }
                                    SleepStat sleepStat3 = (SleepStat) obj2;
                                    if (sleepStat3 == null) {
                                        str = "graphLegend";
                                        i13 = i12;
                                        th2 = null;
                                        yVar = null;
                                    } else {
                                        long id2 = k0Var.S1().getId();
                                        Track track = k0Var.f61069k;
                                        if (track != null) {
                                            l5 = track.getWsId();
                                        } else {
                                            l5 = null;
                                        }
                                        str = "graphLegend";
                                        i13 = i12;
                                        f0 f0Var = new f0(id2, l5, sleepStat3, k0Var.f61069k, list2, c12);
                                        SleepAverageHRSectionView sleepAverageHRSectionView = k0Var.Z;
                                        if (sleepAverageHRSectionView != null) {
                                            sleepAverageHRSectionView.w(f0Var, k0Var);
                                            yVar = nm0.y.f85009a;
                                            th2 = null;
                                        } else {
                                            kotlin.jvm.internal.u.s("sleepAverageHRSection");
                                            throw null;
                                        }
                                    }
                                    if (yVar == null) {
                                        SleepAverageHRSectionView sleepAverageHRSectionView2 = k0Var.Z;
                                        if (sleepAverageHRSectionView2 != null) {
                                            sleepAverageHRSectionView2.setVisibility(i13);
                                        } else {
                                            kotlin.jvm.internal.u.s("sleepAverageHRSection");
                                            throw th2;
                                        }
                                    }
                                    DateTimeZone dateTimeZone = d13.getDateTimeZone();
                                    SleepGraphLevelsLegendView sleepGraphLevelsLegendView5 = k0Var.f61071l0;
                                    if (sleepGraphLevelsLegendView5 != null) {
                                        sleepGraphLevelsLegendView5.setREMVisible(z5);
                                        GraphView graphView = k0Var.f61094y;
                                        if (graphView != null) {
                                            graphView.setZoomEnabled(false);
                                            RecyclerView recyclerView3 = k0Var.f61093x;
                                            if (recyclerView3 != null) {
                                                Context context4 = recyclerView3.getContext();
                                                kotlin.jvm.internal.u.i(context4, "getContext(...)");
                                                ArrayList arrayList4 = new ArrayList();
                                                for (Object obj4 : new SleepStatsFactory(context4, k0Var.S1()).generateSleepStats(d13)) {
                                                    SleepStat sleepStat4 = (SleepStat) obj4;
                                                    if (sleepStat4.getId() != 7 && sleepStat4.getId() != i13) {
                                                        arrayList4.add(obj4);
                                                    }
                                                }
                                                RecyclerView recyclerView4 = k0Var.f61093x;
                                                if (recyclerView4 != null) {
                                                    recyclerView4.setAdapter(new w3(arrayList4));
                                                    GraphView graphView2 = k0Var.f61094y;
                                                    if (graphView2 != null) {
                                                        graphView2.i();
                                                        DateTime withZone = TrackKt.getEffectiveStartDate(d13).withZone(d13.getDateTimeZone());
                                                        DateTime withZone2 = TrackKt.getEffectiveEndDate(d13).withZone(d13.getDateTimeZone());
                                                        GraphView graphView3 = k0Var.f61094y;
                                                        if (graphView3 != null) {
                                                            a.b bVar = new a.b(graphView3, a12);
                                                            bVar.C(graphView3.getContext().getResources().getDimension(C1987R.dimen.layout2));
                                                            bVar.D();
                                                            bVar.H(dateTimeZone);
                                                            bVar.A(z5);
                                                            Parcelable data2 = d13.getData();
                                                            kotlin.jvm.internal.u.h(data2, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                                                            bVar.I(((SleepTrackData) data2).getTotalSleep().getMillis());
                                                            bVar.E();
                                                            GraphPopupView graphPopupView = k0Var.f61095z;
                                                            if (graphPopupView != null) {
                                                                bVar.z(graphPopupView);
                                                                bVar.u().x(withZone, withZone2);
                                                                k0Var.Y1();
                                                                GraphView[] graphViewArr = new GraphView[4];
                                                                GraphView graphView4 = k0Var.f61094y;
                                                                if (graphView4 != null) {
                                                                    graphViewArr[0] = graphView4;
                                                                    SleepSnoringSectionView sleepSnoringSectionView2 = k0Var.Y;
                                                                    if (sleepSnoringSectionView2 != null) {
                                                                        graphViewArr[1] = sleepSnoringSectionView2.getSnoringGraph$HealthMate_prodRelease();
                                                                        SleepAverageHRSectionView sleepAverageHRSectionView3 = k0Var.Z;
                                                                        if (sleepAverageHRSectionView3 != null) {
                                                                            graphViewArr[2] = sleepAverageHRSectionView3.getSleepAverageHRGraph$HealthMate_prodRelease();
                                                                            SleepAverageHRSectionView sleepAverageHRSectionView4 = k0Var.Z;
                                                                            if (sleepAverageHRSectionView4 != null) {
                                                                                graphViewArr[3] = sleepAverageHRSectionView4.getRespiratoryRateGraph$HealthMate_prodRelease();
                                                                                for (GraphView graphView5 : kotlin.collections.x.W(graphViewArr)) {
                                                                                    graphView5.setOnScrubbingListener(new n0(k0Var));
                                                                                }
                                                                                BuildersKt__Builders_commonKt.launch$default(m0.t.l(k0Var), null, null, new m0(k0Var, d13, null), 3, null);
                                                                                AddDetailsView addDetailsView = k0Var.S;
                                                                                if (addDetailsView != null) {
                                                                                    addDetailsView.setText(d13.getNote());
                                                                                } else {
                                                                                    kotlin.jvm.internal.u.s("noteView");
                                                                                    throw null;
                                                                                }
                                                                            } else {
                                                                                kotlin.jvm.internal.u.s("sleepAverageHRSection");
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            kotlin.jvm.internal.u.s("sleepAverageHRSection");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        kotlin.jvm.internal.u.s("snoringSection");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    kotlin.jvm.internal.u.s("graphView");
                                                                    throw null;
                                                                }
                                                            } else {
                                                                kotlin.jvm.internal.u.s("popupSleep");
                                                                throw null;
                                                            }
                                                        } else {
                                                            kotlin.jvm.internal.u.s("graphView");
                                                            throw null;
                                                        }
                                                    } else {
                                                        kotlin.jvm.internal.u.s("graphView");
                                                        throw null;
                                                    }
                                                } else {
                                                    kotlin.jvm.internal.u.s("statsRecyclerView");
                                                    throw null;
                                                }
                                            } else {
                                                kotlin.jvm.internal.u.s("statsRecyclerView");
                                                throw null;
                                            }
                                        } else {
                                            kotlin.jvm.internal.u.s("graphView");
                                            throw null;
                                        }
                                    } else {
                                        kotlin.jvm.internal.u.s(str);
                                        throw null;
                                    }
                                } else {
                                    kotlin.jvm.internal.u.s("snoringSection");
                                    throw null;
                                }
                            } else {
                                kotlin.jvm.internal.u.s("sleepScoreSection");
                                throw null;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("statsRecyclerView");
                            throw null;
                        }
                    } else {
                        kotlin.jvm.internal.u.s("graphLegend");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.u.s("brandView");
                    throw null;
                }
            }
        } else {
            ((b) k0Var.f61074n.getValue()).g1(k0Var, (DateTime) k0Var.f61067i.getValue(k0Var, f61065x0[1]));
        }
        RecyclerView recyclerView5 = k0Var.f61093x;
        if (recyclerView5 != null) {
            recyclerView5.getViewTreeObserver().addOnGlobalLayoutListener(new y0(k0Var));
        } else {
            kotlin.jvm.internal.u.s("statsRecyclerView");
            throw null;
        }
    }

    public static final void P1(k0 k0Var, String str) {
        String str2;
        Track track;
        k0Var.getClass();
        String obj = dp0.j.i0(str).toString();
        AddDetailsView addDetailsView = k0Var.S;
        if (addDetailsView != null) {
            addDetailsView.setText(str);
            Track track2 = k0Var.f61069k;
            if (track2 != null) {
                str2 = track2.getNote();
            } else {
                str2 = null;
            }
            if (!kotlin.jvm.internal.u.e(obj, str2) && (track = k0Var.f61069k) != null) {
                track.setNote(obj);
                track.setSyncedToWs(false);
                BuildersKt__Builders_commonKt.launch$default(m0.t.l(k0Var), Dispatchers.getIO(), null, new b1(track, null), 2, null);
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("noteView");
        throw null;
    }

    private static CharSequence R1(Context context, long j5, boolean z5) {
        e.a aVar = new e.a(context, 0);
        aVar.a(true);
        aVar.w(true);
        aVar.t(true);
        aVar.v();
        pm.e eVar = new pm.e(aVar);
        if (z5) {
            return eVar.b(j5);
        }
        return eVar.a(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User S1() {
        return (User) this.f61066h.getValue(this, f61065x0[0]);
    }

    private final void U1(boolean z5, boolean z11) {
        boolean z12;
        int i11;
        int i12;
        CustomNestedScrollView customNestedScrollView = this.f61078p;
        if (customNestedScrollView != null) {
            int i13 = 0;
            if (z5 && !z11) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            customNestedScrollView.setVisibility(i11);
            View view = this.f61086t;
            if (view != null) {
                if (z5 && z11) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                view.setVisibility(i12);
                ViewGroup viewGroup = this.f61084s;
                if (viewGroup != null) {
                    if (z5) {
                        i13 = 8;
                    }
                    viewGroup.setVisibility(i13);
                    return;
                }
                kotlin.jvm.internal.u.s("fullEmptyState");
                throw null;
            }
            kotlin.jvm.internal.u.s("nightIsProcessingView");
            throw null;
        }
        kotlin.jvm.internal.u.s("customNestedScrollView");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X1(boolean z5) {
        int i11;
        ProgressBar progressBar = this.A;
        if (progressBar != null) {
            if (z5) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            progressBar.setVisibility(i11);
            return;
        }
        kotlin.jvm.internal.u.s("loadingSleep");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y1() {
        /*
            r7 = this;
            android.view.View r0 = r7.M
            r1 = 0
            if (r0 == 0) goto L50
            com.withings.views.widget.LineCellView r2 = r7.P
            java.lang.String r3 = "lineCellViewNaps"
            if (r2 == 0) goto L4c
            int r2 = r2.getVisibility()
            r4 = 1
            java.lang.String r5 = "lineCellViewSecondarySleep"
            r6 = 0
            if (r2 != 0) goto L16
            goto L20
        L16:
            com.withings.views.widget.LineCellView r2 = r7.Q
            if (r2 == 0) goto L48
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L22
        L20:
            r2 = r4
            goto L23
        L22:
            r2 = r6
        L23:
            if (r2 == 0) goto L27
            r2 = r6
            goto L29
        L27:
            r2 = 8
        L29:
            r0.setVisibility(r2)
            com.withings.views.widget.LineCellView r0 = r7.Q
            if (r0 == 0) goto L44
            com.withings.views.widget.LineCellView r2 = r7.P
            if (r2 == 0) goto L40
            int r1 = r2.getVisibility()
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r4 = r6
        L3c:
            r0.setTopDividerVisibility(r4)
            return
        L40:
            kotlin.jvm.internal.u.s(r3)
            throw r1
        L44:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L48:
            kotlin.jvm.internal.u.s(r5)
            throw r1
        L4c:
            kotlin.jvm.internal.u.s(r3)
            throw r1
        L50:
            java.lang.String r0 = "sectionMoreInfo"
            kotlin.jvm.internal.u.s(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.k0.Y1():void");
    }

    private final void Z1() {
        sf.d a11;
        String string;
        Track track = this.f61069k;
        if (track != null) {
            User S1 = S1();
            if (!wr.b.c(FeatureFlag.f39120n0)) {
                a11 = null;
            } else {
                dg.a aVar = this.f61079p0;
                if (aVar != null) {
                    a11 = dg.b.a(aVar, false);
                } else {
                    kotlin.jvm.internal.u.s("activeSessionProvider");
                    throw null;
                }
            }
            if (a11 != null) {
                string = g6.i(a11.h(), "/sleephr/night?userid=%1$s&amp;activityid=%2$s");
            } else {
                string = getString(C1987R.string.sleepHR_explanationLearnMoreURL_night);
                kotlin.jvm.internal.u.g(string);
            }
            String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(S1.getId()), String.valueOf(track.getWsId())}, 2));
            HMWebActivity.a aVar2 = HMWebActivity.f35395c;
            Context requireContext = requireContext();
            kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
            startActivity(aVar2.c(requireContext, null, format));
        }
    }

    public static void s1(k0 this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == 11) {
            ((b) this$0.f61074n.getValue()).A0(this$0);
        }
    }

    public static void t1(k0 this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Context context = view.getContext();
        MedicalReportActivity.a aVar = MedicalReportActivity.f42172p;
        Context context2 = view.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        String first = this$0.S1().getNames().getFirst();
        String last = this$0.S1().getNames().getLast();
        aVar.getClass();
        context.startActivity(MedicalReportActivity.a.a(context2, first, last));
    }

    public static void u1(k0 this$0, ActivityResult activityResult) {
        Object obj;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Intent a11 = activityResult.a();
        if (a11 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializableExtra("extra_sleep_apnea_current_date", DateTime.class);
            } else {
                Object serializableExtra = a11.getSerializableExtra("extra_sleep_apnea_current_date");
                if (!(serializableExtra instanceof DateTime)) {
                    serializableExtra = null;
                }
                obj = (DateTime) serializableExtra;
            }
            DateTime dateTime = (DateTime) obj;
            if (dateTime != null) {
                ((b) this$0.f61074n.getValue()).F(this$0, dateTime);
            }
        }
    }

    public static void v1(k0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (!((hi0.b) this$0.f61085s0.getValue()).b()) {
            this$0.Z1();
        }
    }

    public static void w1(k0 this$0, Track track, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        SecondarySleepActivity.a aVar = SecondarySleepActivity.f60530u;
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        User S1 = this$0.S1();
        Long id2 = track.getId();
        kotlin.jvm.internal.u.g(id2);
        long longValue = id2.longValue();
        aVar.getClass();
        this$0.startActivity(SecondarySleepActivity.a.b(context, S1, longValue));
    }

    public static void x1(List napList, k0 this$0, View view) {
        kotlin.jvm.internal.u.j(napList, "$napList");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (napList.size() > 1) {
            SleepNapListActivity.a aVar = SleepNapListActivity.f60629g;
            Context context = view.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            User user = this$0.S1();
            DateTime day = (DateTime) this$0.f61067i.getValue(this$0, f61065x0[1]);
            aVar.getClass();
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(day, "day");
            Intent intent = new Intent(context, SleepNapListActivity.class);
            intent.putExtra("EXTRA_USER", user);
            intent.putExtra("EXTRA_DAY", day.getMillis());
            this$0.startActivity(intent);
        } else if (napList.size() == 1) {
            SecondarySleepActivity.a aVar2 = SecondarySleepActivity.f60530u;
            Context context2 = view.getContext();
            kotlin.jvm.internal.u.i(context2, "getContext(...)");
            User S1 = this$0.S1();
            Long id2 = ((Track) kotlin.collections.x.I(napList)).getId();
            kotlin.jvm.internal.u.g(id2);
            long longValue = id2.longValue();
            aVar2.getClass();
            this$0.startActivity(SecondarySleepActivity.a.a(context2, S1, longValue));
        }
    }

    @Override // fi0.c.b
    public final void Q0() {
        Track track = this.f61069k;
        if (track != null) {
            Parcelable data = track.getData();
            kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
            SleepTrackData sleepTrackData = (SleepTrackData) data;
            DateTime plus = track.getStartDate().plus(sleepTrackData.getDurationToSleep());
            if (track.getManualStartDate() != null) {
                plus = track.getManualStartDate();
            }
            DateTime minus = track.getEndDate().minus(sleepTrackData.getDurationToGetUp());
            if (track.getManualEndDate() != null) {
                minus = track.getManualEndDate();
            }
            NightEditionActivity.a aVar = NightEditionActivity.f60435u;
            View view = this.f61080q;
            if (view != null) {
                Context context = view.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                Long id2 = track.getId();
                kotlin.jvm.internal.u.g(id2);
                long longValue = id2.longValue();
                kotlin.jvm.internal.u.g(plus);
                kotlin.jvm.internal.u.g(minus);
                aVar.getClass();
                Intent putExtra = new Intent(context, NightEditionActivity.class).putExtra("EXTRA_SLEEP_TRACK", longValue).putExtra("EXTRA_ASLEEP_TIME", plus.getMillis()).putExtra("EXTRA_AWAKE_TIME", minus.getMillis());
                kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
                this.f61091v0.a(putExtra);
                return;
            }
            kotlin.jvm.internal.u.s("resizableView");
            throw null;
        }
    }

    public final void T1() {
        ((j1) this.f61083r0.getValue()).O0();
    }

    public final void V1(boolean z5) {
        this.f61072m = z5;
    }

    public final void W1(boolean z5) {
        X1(z5);
    }

    public final void a2() {
        if (this.f61069k == null || this.f61070l.isEmpty()) {
            U1(false, false);
            ImageView imageView = this.f61088u;
            if (imageView != null) {
                Context context = imageView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                int w11 = ah.u.w(C1987R.attr.colorOnBackground, context, -65281);
                ImageView imageView2 = this.f61088u;
                if (imageView2 != null) {
                    Context context2 = imageView2.getContext();
                    kotlin.jvm.internal.u.i(context2, "getContext(...)");
                    imageView2.setImageDrawable(y70.a.c(C1987R.drawable.ic_stock_trend_36dp, context2, w11));
                    return;
                }
                kotlin.jvm.internal.u.s("emptyStateGlyph");
                throw null;
            }
            kotlin.jvm.internal.u.s("emptyStateGlyph");
            throw null;
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.SleepAverageHRSectionView.a
    public final void c0() {
        nm0.g gVar = this.f61085s0;
        if (((hi0.b) gVar.getValue()).b()) {
            this.f61087t0.a(((hi0.b) gVar.getValue()).a());
            return;
        }
        Z1();
    }

    public final void customScrollTo(int i11) {
        this.f61068j = i11;
        CustomNestedScrollView customNestedScrollView = this.f61078p;
        if (customNestedScrollView != null) {
            customNestedScrollView.C(i11);
        } else {
            kotlin.jvm.internal.u.s("customNestedScrollView");
            throw null;
        }
    }

    @Override // fi0.c.b
    public final void d0(int i11) {
        Track track = this.f61069k;
        if (track != null) {
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new d(i11, this, track, null), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // com.withings.wiscale2.sleep.ui.sleepscore.SleepDisorderSectionView.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o1(com.withings.wiscale2.track.data.Track r7) {
        /*
            r6 = this;
            java.lang.String r0 = "sleepTrack"
            kotlin.jvm.internal.u.j(r7, r0)
            boolean r0 = com.withings.wiscale2.track.data.TrackKt.hasSleepApneaWithoutError(r7)
            java.lang.String r1 = "requireContext(...)"
            if (r0 == 0) goto L2d
            com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity$a r0 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity.f61233p
            android.content.Context r2 = r6.requireContext()
            kotlin.jvm.internal.u.i(r2, r1)
            com.withings.user.core.models.User r1 = r6.S1()
            org.joda.time.DateTime r7 = com.withings.wiscale2.track.data.TrackKt.getAwakeStartDate(r7)
            r0.getClass()
            r0 = 1
            android.content.Intent r7 = com.withings.wiscale2.sleep.ui.sleepscore.sleepapnea.SleepDisorderActivity.a.a(r2, r1, r7, r0)
            androidx.activity.result.b<android.content.Intent> r0 = r6.f61089u0
            r0.a(r7)
            goto Lae
        L2d:
            java.lang.Long r0 = r7.getWsId()
            r2 = 0
            if (r0 == 0) goto L36
            r0 = r7
            goto L37
        L36:
            r0 = r2
        L37:
            if (r0 == 0) goto L9b
            android.os.Parcelable r0 = r0.getData()
            boolean r3 = r0 instanceof com.withings.wiscale2.track.data.SleepTrackData
            if (r3 == 0) goto L44
            com.withings.wiscale2.track.data.SleepTrackData r0 = (com.withings.wiscale2.track.data.SleepTrackData) r0
            goto L45
        L44:
            r0 = r2
        L45:
            if (r0 == 0) goto L9b
            java.lang.Integer r0 = r0.getApneaHypopneaIndex()
            if (r0 == 0) goto L9b
            com.withings.user.core.models.User r0 = r6.S1()
            com.withings.features.FeatureFlag r3 = com.withings.features.FeatureFlag.f39120n0
            boolean r3 = wr.b.c(r3)
            if (r3 != 0) goto L5b
            r3 = r2
            goto L64
        L5b:
            dg.a r3 = r6.f61079p0
            if (r3 == 0) goto L95
            r4 = 0
            sf.d r3 = dg.b.a(r3, r4)
        L64:
            if (r3 == 0) goto L71
            java.lang.String r3 = r3.h()
            java.lang.String r4 = "/sleepapnea?userid=%1$s&amp;activityid=%2$s"
            java.lang.String r3 = androidx.compose.material.g6.i(r3, r4)
            goto L7b
        L71:
            r3 = 2132025713(0x7f142171, float:1.9689938E38)
            java.lang.String r3 = r6.getString(r3)
            kotlin.jvm.internal.u.g(r3)
        L7b:
            long r4 = r0.getId()
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            java.lang.Long r7 = r7.getWsId()
            java.lang.Object[] r7 = new java.lang.Object[]{r0, r7}
            r0 = 2
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r0)
            java.lang.String r7 = java.lang.String.format(r3, r7)
            goto L9c
        L95:
            java.lang.String r7 = "activeSessionProvider"
            kotlin.jvm.internal.u.s(r7)
            throw r2
        L9b:
            r7 = r2
        L9c:
            if (r7 == 0) goto Lae
            com.withings.core.webcontent.HMWebActivity$a r0 = com.withings.core.webcontent.HMWebActivity.f35395c
            android.content.Context r3 = r6.requireContext()
            kotlin.jvm.internal.u.i(r3, r1)
            android.content.Intent r7 = r0.c(r3, r2, r7)
            r6.startActivity(r7)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.sleep.ui.sleepscore.k0.o1(com.withings.wiscale2.track.data.Track):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        Bundle arguments = getArguments();
        int i11 = 0;
        if (arguments != null) {
            i11 = arguments.getInt("EXTRA_CURRENT_SCROLL", 0);
        }
        this.f61068j = i11;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.menu_detail_sleep, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean z5;
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_display_bottom_sheet) {
            if (this.f61069k != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            fi0.c.f67295k.getClass();
            c.a.a(this, z5).show(getParentFragmentManager(), fi0.c.class.getSimpleName());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Context context = getContext();
        if (context != null) {
            ((j1) this.f61083r0.getValue()).M0(context);
        }
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView scrollView, int i11) {
        kotlin.jvm.internal.u.j(scrollView, "scrollView");
        if (!this.f61072m) {
            return;
        }
        this.f61068j = i11;
        ((b) this.f61074n.getValue()).t0(this, i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        new gi0.a(context, S1());
        View findViewById = view.findViewById(C1987R.id.brand_view);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f61092w = (BrandView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.custom_nested_scroll_view);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f61078p = (CustomNestedScrollView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.resizable_view);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f61080q = findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.content_container);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f61082r = (CustomFrameLayout) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.full_empty_state);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f61084s = (ViewGroup) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.night_is_processing);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f61086t = findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.empty_state_glyph);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f61088u = (ImageView) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.scroll_content);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.f61090v = (LinearLayout) findViewById8;
        kotlin.jvm.internal.u.i(view.findViewById(C1987R.id.graphContainer), "findViewById(...)");
        View findViewById9 = view.findViewById(C1987R.id.graphView);
        kotlin.jvm.internal.u.i(findViewById9, "findViewById(...)");
        this.f61094y = (GraphView) findViewById9;
        View findViewById10 = view.findViewById(C1987R.id.view_popup_sleep);
        kotlin.jvm.internal.u.i(findViewById10, "findViewById(...)");
        this.f61095z = (GraphPopupView) findViewById10;
        View findViewById11 = view.findViewById(C1987R.id.loading);
        kotlin.jvm.internal.u.i(findViewById11, "findViewById(...)");
        this.A = (ProgressBar) findViewById11;
        View findViewById12 = view.findViewById(C1987R.id.sleep_score_section);
        kotlin.jvm.internal.u.i(findViewById12, "findViewById(...)");
        this.B = findViewById12;
        View findViewById13 = view.findViewById(C1987R.id.sleep_score);
        kotlin.jvm.internal.u.i(findViewById13, "findViewById(...)");
        this.F = (ComposeView) findViewById13;
        View findViewById14 = view.findViewById(C1987R.id.sleep_score_summary);
        kotlin.jvm.internal.u.i(findViewById14, "findViewById(...)");
        this.G = (TextView) findViewById14;
        View findViewById15 = view.findViewById(C1987R.id.stats_naps);
        kotlin.jvm.internal.u.i(findViewById15, "findViewById(...)");
        this.P = (LineCellView) findViewById15;
        View findViewById16 = view.findViewById(C1987R.id.stats_secondary_sleep);
        kotlin.jvm.internal.u.i(findViewById16, "findViewById(...)");
        this.Q = (LineCellView) findViewById16;
        View findViewById17 = view.findViewById(C1987R.id.nightInProgress_stats_secondary_sleep);
        kotlin.jvm.internal.u.i(findViewById17, "findViewById(...)");
        this.R = (LineCellView) findViewById17;
        View findViewById18 = view.findViewById(C1987R.id.stats_recycler_view);
        kotlin.jvm.internal.u.i(findViewById18, "findViewById(...)");
        this.f61093x = (RecyclerView) findViewById18;
        View findViewById19 = view.findViewById(C1987R.id.legend_view);
        kotlin.jvm.internal.u.i(findViewById19, "findViewById(...)");
        this.f61071l0 = (SleepGraphLevelsLegendView) findViewById19;
        View findViewById20 = view.findViewById(C1987R.id.manual_legend_view);
        kotlin.jvm.internal.u.i(findViewById20, "findViewById(...)");
        this.f61073m0 = (SleepManualGraphLevelsLegendView) findViewById20;
        View findViewById21 = view.findViewById(C1987R.id.apnea_section);
        kotlin.jvm.internal.u.i(findViewById21, "findViewById(...)");
        this.X = (SleepDisorderSectionView) findViewById21;
        View findViewById22 = view.findViewById(C1987R.id.snoring_section);
        kotlin.jvm.internal.u.i(findViewById22, "findViewById(...)");
        this.Y = (SleepSnoringSectionView) findViewById22;
        View findViewById23 = view.findViewById(C1987R.id.average_hr_section);
        kotlin.jvm.internal.u.i(findViewById23, "findViewById(...)");
        this.Z = (SleepAverageHRSectionView) findViewById23;
        View findViewById24 = view.findViewById(C1987R.id.section_more_info);
        kotlin.jvm.internal.u.i(findViewById24, "findViewById(...)");
        this.M = findViewById24;
        View findViewById25 = view.findViewById(C1987R.id.section_notes);
        kotlin.jvm.internal.u.i(findViewById25, "findViewById(...)");
        this.S = (AddDetailsView) findViewById25;
        View findViewById26 = view.findViewById(C1987R.id.section_share);
        kotlin.jvm.internal.u.i(findViewById26, "findViewById(...)");
        this.T = findViewById26;
        View findViewById27 = view.findViewById(C1987R.id.section_manual_log);
        kotlin.jvm.internal.u.i(findViewById27, "findViewById(...)");
        this.W = (ComposeView) findViewById27;
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new u0(this, null), 3, null);
        float f11 = i70.b.a(getActivity()).x;
        int i11 = (int) (0.42857143f * f11);
        int i12 = (int) (f11 * 0.75f);
        View view2 = this.f61080q;
        if (view2 != null) {
            view2.getLayoutParams().height = i12;
            View view3 = this.f61080q;
            if (view3 != null) {
                view3.requestLayout();
                CustomNestedScrollView customNestedScrollView = this.f61078p;
                if (customNestedScrollView != null) {
                    View view4 = this.f61080q;
                    if (view4 != null) {
                        LinearLayout linearLayout = this.f61090v;
                        if (linearLayout != null) {
                            CustomFrameLayout customFrameLayout = this.f61082r;
                            if (customFrameLayout != null) {
                                customNestedScrollView.E(view4, linearLayout, customFrameLayout, i11, i12);
                                CustomNestedScrollView customNestedScrollView2 = this.f61078p;
                                if (customNestedScrollView2 != null) {
                                    customNestedScrollView2.setDelegate(this);
                                    CustomFrameLayout customFrameLayout2 = this.f61082r;
                                    if (customFrameLayout2 != null) {
                                        customFrameLayout2.a();
                                        RecyclerView recyclerView = this.f61093x;
                                        if (recyclerView != null) {
                                            recyclerView.getContext();
                                            GridLayoutManager gridLayoutManager = new GridLayoutManager(2);
                                            RecyclerView recyclerView2 = this.f61093x;
                                            if (recyclerView2 != null) {
                                                recyclerView2.setLayoutManager(gridLayoutManager);
                                                RecyclerView recyclerView3 = this.f61093x;
                                                if (recyclerView3 != null) {
                                                    Context requireContext = requireContext();
                                                    kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                                                    int k11 = ah.g.k(8, requireContext);
                                                    Context requireContext2 = requireContext();
                                                    kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
                                                    recyclerView3.j(new x3(k11, ah.g.k(8, requireContext2)));
                                                    ((j1) this.f61083r0.getValue()).F0().observe(getViewLifecycleOwner(), new f(new l0(this)));
                                                    return;
                                                }
                                                kotlin.jvm.internal.u.s("statsRecyclerView");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("statsRecyclerView");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("statsRecyclerView");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("customFrameLayout");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("customNestedScrollView");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("customFrameLayout");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("scrollContent");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("resizableView");
                    throw null;
                }
                kotlin.jvm.internal.u.s("customNestedScrollView");
                throw null;
            }
            kotlin.jvm.internal.u.s("resizableView");
            throw null;
        }
        kotlin.jvm.internal.u.s("resizableView");
        throw null;
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.SleepDisorderSectionView.a
    public final void y0(Track sleepTrack) {
        kotlin.jvm.internal.u.j(sleepTrack, "sleepTrack");
        SleepDisorderActivity.a aVar = SleepDisorderActivity.f61233p;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        User S1 = S1();
        DateTime awakeStartDate = TrackKt.getAwakeStartDate(sleepTrack);
        aVar.getClass();
        startActivity(SleepDisorderActivity.a.a(requireContext, S1, awakeStartDate, false));
    }
}
