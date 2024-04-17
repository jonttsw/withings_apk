package com.withings.wiscale2.activity.workout.live.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.k1;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import com.withings.workout.category.model.WorkoutCategory;
import jm.a;
import kotlin.Metadata;
/* compiled from: LiveWorkoutDistanceFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/activity/workout/live/ui/d0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class d0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private Guideline f48866c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f48867d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f48868e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f48869f;

    /* renamed from: g  reason: collision with root package name */
    private Group f48870g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f48871h;

    /* renamed from: i  reason: collision with root package name */
    private Group f48872i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f48873j;

    /* renamed from: k  reason: collision with root package name */
    private Group f48874k;

    /* renamed from: l  reason: collision with root package name */
    private jm.a f48875l;

    /* renamed from: m  reason: collision with root package name */
    private androidx.core.widget.c f48876m = new androidx.core.widget.c(this, 6);

    public static void s1(d0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        TextView textView = this$0.f48869f;
        if (textView != null) {
            textView.setText("- : -");
        } else {
            kotlin.jvm.internal.u.s("paceView");
            throw null;
        }
    }

    public static final void t1(d0 d0Var, WorkoutCategory workoutCategory) {
        int i11;
        Group group = d0Var.f48870g;
        if (group != null) {
            String[] features = workoutCategory.getFeatures();
            kotlin.jvm.internal.u.i(features, "getFeatures(...)");
            int i12 = 8;
            if (kotlin.collections.l.m(features, ConstantsWs.SUBCATEGORY_FEATURE_PACE)) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            group.setVisibility(i11);
            Group group2 = d0Var.f48872i;
            if (group2 != null) {
                String[] features2 = workoutCategory.getFeatures();
                kotlin.jvm.internal.u.i(features2, "getFeatures(...)");
                if (kotlin.collections.l.m(features2, "speed")) {
                    i12 = 0;
                }
                group2.setVisibility(i12);
                Group group3 = d0Var.f48874k;
                if (group3 != null) {
                    if (group3.getVisibility() != 0) {
                        Guideline guideline = d0Var.f48866c;
                        if (guideline != null) {
                            guideline.setGuidelinePercent(0.0f);
                            return;
                        } else {
                            kotlin.jvm.internal.u.s("guideline");
                            throw null;
                        }
                    }
                    return;
                }
                kotlin.jvm.internal.u.s("hrViews");
                throw null;
            }
            kotlin.jvm.internal.u.s("speedViews");
            throw null;
        }
        kotlin.jvm.internal.u.s("paceViews");
        throw null;
    }

    public static final void v1(d0 d0Var, double d11) {
        TextView textView = d0Var.f48867d;
        if (textView != null) {
            jm.a aVar = d0Var.f48875l;
            if (aVar != null) {
                textView.setText(aVar.b(d11, 40));
                TextView textView2 = d0Var.f48868e;
                if (textView2 != null) {
                    jm.a aVar2 = d0Var.f48875l;
                    if (aVar2 != null) {
                        l70.u g11 = aVar2.g(40);
                        TextView textView3 = d0Var.f48868e;
                        if (textView3 != null) {
                            Context context = textView3.getContext();
                            kotlin.jvm.internal.u.i(context, "getContext(...)");
                            textView2.setText(g11.e(context, d11));
                            return;
                        }
                        kotlin.jvm.internal.u.s("distanceUnitView");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("measureFormatter");
                    throw null;
                }
                kotlin.jvm.internal.u.s("distanceUnitView");
                throw null;
            }
            kotlin.jvm.internal.u.s("measureFormatter");
            throw null;
        }
        kotlin.jvm.internal.u.s("distanceView");
        throw null;
    }

    public static final void w1(d0 d0Var, int i11) {
        String b10;
        Context context = d0Var.getContext();
        if (context != null) {
            TextView textView = d0Var.f48873j;
            if (textView != null) {
                if (i11 == 0) {
                    b10 = context.getString(C1987R.string.workoutLiveView_valueToDisplayWhenNoBpm);
                } else {
                    jm.a aVar = d0Var.f48875l;
                    if (aVar != null) {
                        b10 = aVar.b(i11, 11);
                    } else {
                        kotlin.jvm.internal.u.s("measureFormatter");
                        throw null;
                    }
                }
                textView.setText(b10);
                return;
            }
            kotlin.jvm.internal.u.s("hrValueView");
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r7 != null) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x1(com.withings.wiscale2.activity.workout.live.ui.d0 r6, double r7) {
        /*
            android.widget.TextView r0 = r6.f48869f
            r1 = 0
            java.lang.String r2 = "paceView"
            if (r0 == 0) goto L52
            java.lang.Double r3 = java.lang.Double.valueOf(r7)
            boolean r4 = java.lang.Double.isNaN(r7)
            if (r4 != 0) goto L18
            r4 = 0
            int r7 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r7 <= 0) goto L18
            goto L19
        L18:
            r3 = r1
        L19:
            if (r3 == 0) goto L32
            double r7 = r3.doubleValue()
            jm.a r3 = r6.f48875l
            if (r3 == 0) goto L2c
            r4 = 126(0x7e, float:1.77E-43)
            java.lang.String r7 = r3.b(r7, r4)
            if (r7 == 0) goto L32
            goto L34
        L2c:
            java.lang.String r6 = "measureFormatter"
            kotlin.jvm.internal.u.s(r6)
            throw r1
        L32:
            java.lang.String r7 = "- : -"
        L34:
            r0.setText(r7)
            android.widget.TextView r7 = r6.f48869f
            if (r7 == 0) goto L4e
            androidx.core.widget.c r8 = r6.f48876m
            r7.removeCallbacks(r8)
            android.widget.TextView r6 = r6.f48869f
            if (r6 == 0) goto L4a
            r0 = 5000(0x1388, double:2.4703E-320)
            r6.postDelayed(r8, r0)
            return
        L4a:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        L4e:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        L52:
            kotlin.jvm.internal.u.s(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.activity.workout.live.ui.d0.x1(com.withings.wiscale2.activity.workout.live.ui.d0, double):void");
    }

    public static final void y1(d0 d0Var, double d11) {
        CharSequence charSequence;
        TextView textView = d0Var.f48871h;
        if (textView != null) {
            Double valueOf = Double.valueOf(d11);
            if (!(!Double.isNaN(d11))) {
                valueOf = null;
            }
            if (valueOf != null) {
                jm.a aVar = d0Var.f48875l;
                if (aVar != null) {
                    charSequence = jm.a.c(aVar, 72, d11, C1987R.style.data4, C1987R.style.body1White, 48);
                } else {
                    kotlin.jvm.internal.u.s("measureFormatter");
                    throw null;
                }
            } else {
                charSequence = "-";
            }
            textView.setText(charSequence);
            return;
        }
        kotlin.jvm.internal.u.s("speedView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        return inflater.inflate(C1987R.layout.fragment_workout_live_distance, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        TextView textView = this.f48869f;
        if (textView != null) {
            textView.removeCallbacks(this.f48876m);
            super.onDestroy();
            return;
        }
        kotlin.jvm.internal.u.s("paceView");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        View findViewById = view.findViewById(C1987R.id.guideline);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f48866c = (Guideline) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.distance);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f48867d = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.distance_label);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f48868e = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.pace);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f48869f = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.pace_group);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f48870g = (Group) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.speed);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f48871h = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.speed_group);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f48872i = (Group) findViewById7;
        View findViewById8 = view.findViewById(C1987R.id.bpm);
        kotlin.jvm.internal.u.i(findViewById8, "findViewById(...)");
        this.f48873j = (TextView) findViewById8;
        View findViewById9 = view.findViewById(C1987R.id.bpm_group);
        kotlin.jvm.internal.u.i(findViewById9, "findViewById(...)");
        this.f48874k = (Group) findViewById9;
        Context context = view.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        this.f48875l = a.d.a(context);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            z0 z0Var = (z0) new k1(activity).a(z0.class);
            xw.d.c(this, z0Var.g1(), new x(this));
            xw.d.c(this, z0Var.W0(), new y(this));
            xw.d.c(this, z0Var.U0(), new z(this));
            xw.d.c(this, z0Var.l1(), new a0(this));
            xw.d.c(this, z0Var.Y0(), new b0(this));
            xw.d.c(this, z0Var.n1(), new c0(this));
        }
        TextView textView = this.f48869f;
        if (textView != null) {
            textView.setText("- : -");
            TextView textView2 = this.f48869f;
            if (textView2 != null) {
                textView2.postDelayed(this.f48876m, 5000L);
                return;
            } else {
                kotlin.jvm.internal.u.s("paceView");
                throw null;
            }
        }
        kotlin.jvm.internal.u.s("paceView");
        throw null;
    }
}
