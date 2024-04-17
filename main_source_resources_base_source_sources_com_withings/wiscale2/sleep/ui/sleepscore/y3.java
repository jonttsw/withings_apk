package com.withings.wiscale2.sleep.ui.sleepscore;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.withings.graph.GraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import com.withings.views.view.BlockableViewPager;
import com.withings.views.view.CustomNestedScrollView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.food.ui.display.FoodDayFragment;
import com.withings.wiscale2.sleep.libc.SleepScoreRecalculator;
import com.withings.wiscale2.sleep.ui.sleepscore.ScoreWeeklyView;
import com.withings.wiscale2.track.data.SleepScore;
import com.withings.wiscale2.track.data.SleepScoreColorHelper;
import com.withings.wiscale2.track.data.SleepTrackData;
import com.withings.wiscale2.track.data.Track;
import fi0.c;
import ii0.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
import pm.e;
/* compiled from: SleepWeekFragment.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/sleepscore/y3;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/views/view/CustomNestedScrollView$c;", "Lii0/a$b;", "Lcom/withings/wiscale2/sleep/ui/sleepscore/ScoreWeeklyView$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class y3 extends Fragment implements CustomNestedScrollView.c, a.b, ScoreWeeklyView.a {

    /* renamed from: c  reason: collision with root package name */
    private final e f61566c;

    /* renamed from: d  reason: collision with root package name */
    private final f f61567d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f61568e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f61569f;

    /* renamed from: g  reason: collision with root package name */
    private int f61570g;

    /* renamed from: h  reason: collision with root package name */
    private tb0.c3 f61571h;

    /* renamed from: i  reason: collision with root package name */
    private SleepScoreRecalculator f61572i;

    /* renamed from: k  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f61565k = {androidx.camera.core.v.c(y3.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/core/models/User;", 0), androidx.camera.core.v.c(y3.class, FoodDayFragment.ARG_DAY, "getDay()Lorg/joda/time/DateTime;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final a f61564j = new Object();

    /* compiled from: SleepWeekFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: SleepWeekFragment.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void b1(y3 y3Var, int i11);

        void l1(y3 y3Var, DateTime dateTime);
    }

    /* compiled from: SleepWeekFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<b> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final b invoke() {
            Fragment parentFragment = y3.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.wiscale2.sleep.ui.sleepscore.SleepWeekFragment.Delegate");
            return (b) parentFragment;
        }
    }

    /* compiled from: SleepWeekFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<BlockableViewPager.b> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final BlockableViewPager.b invoke() {
            Fragment parentFragment = y3.this.getParentFragment();
            kotlin.jvm.internal.u.h(parentFragment, "null cannot be cast to non-null type com.withings.views.view.BlockableViewPager.PagerCallback");
            return (BlockableViewPager.b) parentFragment;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61575a = nm0.h.b(new i4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61576b;

        public e(Fragment fragment) {
            this.f61576b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.core.models.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61575a.getValue();
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Fragment, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f61577a = nm0.h.b(new j4(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f61578b;

        public f(Fragment fragment) {
            this.f61578b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f61577a.getValue();
        }
    }

    public y3() {
        super(C1987R.layout.fragment_sleep_week);
        this.f61566c = new e(this);
        this.f61567d = new f(this);
        this.f61568e = nm0.h.b(new c());
        this.f61569f = nm0.h.b(new d());
    }

    public static final void s1(y3 y3Var, List list, androidx.compose.runtime.a aVar, int i11) {
        y3Var.getClass();
        androidx.compose.runtime.b g11 = aVar.g(2031042408);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            SleepScore sleepScore = ((Track) it.next()).getSleepScore();
            if (sleepScore != null) {
                arrayList.add(sleepScore);
            }
        }
        ArrayList<SleepScore> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((SleepScore) next).isSleepScoreConsistent()) {
                arrayList2.add(next);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            int i12 = 0;
            for (SleepScore sleepScore2 : arrayList2) {
                i12 += sleepScore2.getSleepScoreValue();
            }
            com.withings.common.compose.component.o.g(null, null, s1.b.b(g11, -1605518939, new z3(i12 / arrayList2.size())), ay.b.u(C1987R.string.sleepScore_averageScore, g11), null, false, false, false, null, null, null, g11, ConstantsWs.WS_STATUS_LOGIN_UNAUTHORIZED, 0, 2035);
        }
        androidx.compose.runtime.v o02 = g11.o0();
        if (o02 != null) {
            o02.G(new a4(y3Var, list, i11));
        }
    }

    public static final String t1(y3 y3Var, Context context, List list) {
        Object a11;
        y3Var.getClass();
        Object obj = "-";
        try {
            Iterator it = list.iterator();
            long j5 = 0;
            while (it.hasNext()) {
                Parcelable data = ((Track) it.next()).getData();
                kotlin.jvm.internal.u.h(data, "null cannot be cast to non-null type com.withings.wiscale2.track.data.SleepTrackData");
                j5 += ((SleepTrackData) data).getTotalSleep().getMillis();
            }
            long size = j5 / list.size();
            if (size == 0) {
                a11 = "-";
            } else {
                e.a aVar = new e.a(context, 0);
                aVar.a(true);
                aVar.w(true);
                aVar.t(true);
                a11 = new pm.e(aVar).b(size).toString();
            }
        } catch (Throwable th2) {
            a11 = nm0.l.a(th2);
        }
        if (nm0.k.b(a11) == null) {
            obj = a11;
        }
        return (String) obj;
    }

    public static final BlockableViewPager.b v1(y3 y3Var) {
        return (BlockableViewPager.b) y3Var.f61569f.getValue();
    }

    public static final ArrayList w1(y3 y3Var) {
        y3Var.getClass();
        en0.i iVar = new en0.i(1, 7, 1);
        ArrayList arrayList = new ArrayList();
        en0.j it = iVar.iterator();
        while (it.hasNext()) {
            int a11 = it.a();
            ei0.q qVar = ei0.q.f65441d;
            if (qVar != null) {
                fn0.k<Object>[] kVarArr = f61565k;
                long id2 = ((User) y3Var.f61566c.getValue(y3Var, kVarArr[0])).getId();
                DateTime withDayOfWeek = ((DateTime) y3Var.f61567d.getValue(y3Var, kVarArr[1])).withDayOfWeek(a11);
                kotlin.jvm.internal.u.i(withDayOfWeek, "withDayOfWeek(...)");
                SleepScoreRecalculator sleepScoreRecalculator = y3Var.f61572i;
                if (sleepScoreRecalculator != null) {
                    Track C = qVar.C(id2, withDayOfWeek, sleepScoreRecalculator);
                    if (C != null) {
                        arrayList.add(C);
                    }
                } else {
                    kotlin.jvm.internal.u.s("sleepScoreRecalculator");
                    throw null;
                }
            } else {
                kotlin.jvm.internal.u.s("instance");
                throw null;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!((Track) next).isInProgress()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.withings.wiscale2.sleep.ui.sleepscore.c4, java.lang.Object] */
    public static final void x1(tb0.c3 c3Var, y3 y3Var, List list) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        y3Var.getClass();
        c3Var.f98914k.setContent(new s1.a(true, -1975212191, new g4(c3Var, y3Var, list)));
        a.c cVar = new a.c();
        cVar.f(list);
        GraphView weekSleepGraph = c3Var.f98921r;
        kotlin.jvm.internal.u.i(weekSleepGraph, "weekSleepGraph");
        ii0.a aVar = new ii0.a(weekSleepGraph, cVar);
        aVar.f(y3Var);
        aVar.n(c3Var.f98919p);
        aVar.j();
        aVar.k();
        aVar.l();
        aVar.i(new b4(y3Var, c3Var));
        aVar.e(new Object());
        weekSleepGraph.setOnScrubbingListener(new h4(y3Var, c3Var));
        aVar.d();
        ScoreWeeklyView mondayScore = c3Var.f98911h;
        kotlin.jvm.internal.u.i(mondayScore, "mondayScore");
        List list2 = list;
        Iterator it = list2.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((Track) obj2).getEndDate().dayOfWeek().get() == 1) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        y3Var.y1(mondayScore, (Track) obj2);
        ScoreWeeklyView tuesdayScore = c3Var.f98918o;
        kotlin.jvm.internal.u.i(tuesdayScore, "tuesdayScore");
        Iterator it2 = list2.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj3 = it2.next();
                if (((Track) obj3).getEndDate().dayOfWeek().get() == 2) {
                    break;
                }
            } else {
                obj3 = null;
                break;
            }
        }
        y3Var.y1(tuesdayScore, (Track) obj3);
        ScoreWeeklyView wednesdayScore = c3Var.f98920q;
        kotlin.jvm.internal.u.i(wednesdayScore, "wednesdayScore");
        Iterator it3 = list2.iterator();
        while (true) {
            if (it3.hasNext()) {
                obj4 = it3.next();
                if (((Track) obj4).getEndDate().dayOfWeek().get() == 3) {
                    break;
                }
            } else {
                obj4 = null;
                break;
            }
        }
        y3Var.y1(wednesdayScore, (Track) obj4);
        ScoreWeeklyView thursdayScore = c3Var.f98917n;
        kotlin.jvm.internal.u.i(thursdayScore, "thursdayScore");
        Iterator it4 = list2.iterator();
        while (true) {
            if (it4.hasNext()) {
                obj5 = it4.next();
                if (((Track) obj5).getEndDate().dayOfWeek().get() == 4) {
                    break;
                }
            } else {
                obj5 = null;
                break;
            }
        }
        y3Var.y1(thursdayScore, (Track) obj5);
        ScoreWeeklyView fridayScore = c3Var.f98908e;
        kotlin.jvm.internal.u.i(fridayScore, "fridayScore");
        Iterator it5 = list2.iterator();
        while (true) {
            if (it5.hasNext()) {
                obj6 = it5.next();
                if (((Track) obj6).getEndDate().dayOfWeek().get() == 5) {
                    break;
                }
            } else {
                obj6 = null;
                break;
            }
        }
        y3Var.y1(fridayScore, (Track) obj6);
        ScoreWeeklyView saturdayScore = c3Var.f98913j;
        kotlin.jvm.internal.u.i(saturdayScore, "saturdayScore");
        Iterator it6 = list2.iterator();
        while (true) {
            if (it6.hasNext()) {
                obj7 = it6.next();
                if (((Track) obj7).getEndDate().dayOfWeek().get() == 6) {
                    break;
                }
            } else {
                obj7 = null;
                break;
            }
        }
        y3Var.y1(saturdayScore, (Track) obj7);
        ScoreWeeklyView sundayScore = c3Var.f98916m;
        kotlin.jvm.internal.u.i(sundayScore, "sundayScore");
        Iterator it7 = list2.iterator();
        while (true) {
            if (!it7.hasNext()) {
                break;
            }
            Object next = it7.next();
            if (((Track) next).getEndDate().dayOfWeek().get() == 7) {
                obj = next;
                break;
            }
        }
        y3Var.y1(sundayScore, (Track) obj);
    }

    private final void y1(ScoreWeeklyView scoreWeeklyView, Track track) {
        DateTime dateTime;
        SleepScore sleepScore;
        nm0.y yVar = null;
        if (track != null) {
            dateTime = track.getEndDate();
        } else {
            dateTime = null;
        }
        scoreWeeklyView.b(dateTime);
        scoreWeeklyView.setOnClickListener(this);
        if (track != null && (sleepScore = track.getSleepScore()) != null) {
            scoreWeeklyView.c(sleepScore.getSleepScoreValue(), SleepScoreColorHelper.INSTANCE.getSleepScoreColorRes(sleepScore));
            yVar = nm0.y.f85009a;
        }
        if (yVar == null) {
            scoreWeeklyView.setPlaceHolderVisible(true);
        }
    }

    @Override // com.withings.wiscale2.sleep.ui.sleepscore.ScoreWeeklyView.a
    public final void Y0(DateTime day) {
        kotlin.jvm.internal.u.j(day, "day");
        ((b) this.f61568e.getValue()).l1(this, day);
    }

    public final void customScrollTo(int i11) {
        CustomNestedScrollView customNestedScrollView;
        this.f61570g = i11;
        tb0.c3 c3Var = this.f61571h;
        if (c3Var != null && (customNestedScrollView = c3Var.f98906c) != null) {
            customNestedScrollView.C(i11);
        }
    }

    @Override // ii0.a.b
    public final void h(DateTime day) {
        kotlin.jvm.internal.u.j(day, "day");
        ((b) this.f61568e.getValue()).l1(this, day);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61570g = yq.b.a(this).getInt("EXTRA_CURRENT_SCROLL");
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(C1987R.menu.menu_detail_sleep, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        tb0.c3 b10 = tb0.c3.b(inflater, viewGroup);
        this.f61571h = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f61571h = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == C1987R.id.action_display_bottom_sheet) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            kotlin.jvm.internal.u.i(parentFragmentManager, "getParentFragmentManager(...)");
            fi0.c.f67295k.getClass();
            c.a.a(null, false).show(parentFragmentManager, fi0.c.class.getSimpleName());
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.withings.views.view.CustomNestedScrollView.c
    public final void onScrolled(CustomNestedScrollView scrollView, int i11) {
        kotlin.jvm.internal.u.j(scrollView, "scrollView");
        this.f61570g = i11;
        ((b) this.f61568e.getValue()).b1(this, i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        vh.h.b(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        this.f61572i = SleepScoreRecalculator.Companion.get$default(SleepScoreRecalculator.Companion, ((User) this.f61566c.getValue(this, f61565k[0])).getId(), null, 2, null);
        tb0.c3 c3Var = this.f61571h;
        if (c3Var != null) {
            float f11 = i70.b.a(getActivity()).x;
            int i11 = (int) (0.42857143f * f11);
            int i12 = (int) (f11 * 0.75f);
            LinearLayout linearLayout = c3Var.f98912i;
            linearLayout.getLayoutParams().height = i12;
            linearLayout.requestLayout();
            c3Var.f98905b.a();
            c3Var.f98906c.E(c3Var.f98912i, c3Var.f98915l, c3Var.f98905b, i11, i12);
            int i13 = this.f61570g;
            CustomNestedScrollView customNestedScrollView = c3Var.f98906c;
            customNestedScrollView.F(i13);
            customNestedScrollView.setDelegate(this);
        }
        tb0.c3 c3Var2 = this.f61571h;
        if (c3Var2 != null) {
            c3Var2.f98910g.setVisibility(0);
            BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), Dispatchers.getMain(), null, new d4(c3Var2, this, null), 2, null);
        }
    }
}
