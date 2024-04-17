package com.withings.wiscale2.activity.workout.live.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Chronometer;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import androidx.viewpager.widget.ViewPager;
import com.withings.views.widget.InkPageIndicator;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
/* compiled from: LiveWorkoutPagerFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/k0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class k0 extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    private TextView f48899d;

    /* renamed from: e  reason: collision with root package name */
    private Chronometer f48900e;

    /* renamed from: f  reason: collision with root package name */
    private ViewPager f48901f;

    /* renamed from: g  reason: collision with root package name */
    private InkPageIndicator f48902g;

    /* renamed from: i  reason: collision with root package name */
    private LiveWorkoutChronometer f48904i;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, ym0.a<Fragment>> f48898c = kotlin.collections.s0.j(new nm0.j("key_screen_distance", a.f48905a), new nm0.j("key_screen_hr", b.f48906a));

    /* renamed from: h  reason: collision with root package name */
    private List<? extends Fragment> f48903h = kotlin.collections.i0.f76187a;

    /* compiled from: LiveWorkoutPagerFragment.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48905a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final d0 invoke() {
            return new d0();
        }
    }

    /* compiled from: LiveWorkoutPagerFragment.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<g0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f48906a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final g0 invoke() {
            g0.f48888e.getClass();
            return new g0();
        }
    }

    public static final void t1(k0 k0Var, WorkoutCategory workoutCategory) {
        TextView textView = k0Var.f48899d;
        if (textView != null) {
            textView.setText(workoutCategory.getName(textView.getContext()));
        } else {
            kotlin.jvm.internal.u.s("titleView");
            throw null;
        }
    }

    public static final void u1(k0 k0Var, List list) {
        Fragment invoke;
        k0Var.getClass();
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
        for (String str : list2) {
            ym0.a<Fragment> aVar = k0Var.f48898c.get(str);
            if (aVar != null && (invoke = aVar.invoke()) != null) {
                arrayList.add(invoke);
            } else {
                throw new IllegalArgumentException("This fragment key doesn't exist");
            }
        }
        k0Var.f48903h = arrayList;
        ViewPager viewPager = k0Var.f48901f;
        if (viewPager != null) {
            androidx.viewpager.widget.e adapter = viewPager.getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        kotlin.jvm.internal.u.s("viewPager");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_workout_live_pager, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LiveWorkoutChronometer liveWorkoutChronometer = this.f48904i;
        if (liveWorkoutChronometer != null) {
            liveWorkoutChronometer.b();
            super.onDestroyView();
            return;
        }
        kotlin.jvm.internal.u.s("liveChronometer");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.title);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f48899d = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.duration);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f48900e = (Chronometer) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.view_pager);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f48901f = (ViewPager) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.indicator);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f48902g = (InkPageIndicator) findViewById4;
        Chronometer chronometer = this.f48900e;
        if (chronometer != null) {
            this.f48904i = new LiveWorkoutChronometer(chronometer);
            FragmentActivity activity = getActivity();
            if (activity != null) {
                z0 z0Var = (z0) new k1(activity).a(z0.class);
                xw.d.c(this, z0Var.n1(), new l0(this));
                xw.d.c(this, z0Var.e1(), new m0(this));
                LiveWorkoutChronometer liveWorkoutChronometer = this.f48904i;
                if (liveWorkoutChronometer != null) {
                    liveWorkoutChronometer.e(z0Var.c1());
                } else {
                    kotlin.jvm.internal.u.s("liveChronometer");
                    throw null;
                }
            }
            ViewPager viewPager = this.f48901f;
            if (viewPager != null) {
                viewPager.setAdapter(new n0(this, getParentFragmentManager()));
                InkPageIndicator inkPageIndicator = this.f48902g;
                if (inkPageIndicator != null) {
                    ViewPager viewPager2 = this.f48901f;
                    if (viewPager2 != null) {
                        inkPageIndicator.setViewPager(viewPager2);
                        return;
                    } else {
                        kotlin.jvm.internal.u.s("viewPager");
                        throw null;
                    }
                }
                kotlin.jvm.internal.u.s("indicator");
                throw null;
            }
            kotlin.jvm.internal.u.s("viewPager");
            throw null;
        }
        kotlin.jvm.internal.u.s("chronometerView");
        throw null;
    }
}
