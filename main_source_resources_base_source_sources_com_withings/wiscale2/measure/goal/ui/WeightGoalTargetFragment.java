package com.withings.wiscale2.measure.goal.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.network.android.interceptors.LogInterceptor;
import com.withings.target.WeightGoal;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import jm.a;
import l70.s;
import l70.t;
import l70.u;
import l70.y;
/* loaded from: classes5.dex */
public class WeightGoalTargetFragment extends Fragment implements SetValueView.a {

    /* renamed from: c  reason: collision with root package name */
    private double f58399c;

    /* renamed from: d  reason: collision with root package name */
    private double f58400d;

    /* renamed from: e  reason: collision with root package name */
    private double f58401e;

    /* renamed from: f  reason: collision with root package name */
    private double f58402f;

    /* renamed from: g  reason: collision with root package name */
    private double f58403g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f58404h;

    /* renamed from: i  reason: collision with root package name */
    private jm.a f58405i;

    /* renamed from: j  reason: collision with root package name */
    protected CustomSetValueView f58406j;

    /* renamed from: k  reason: collision with root package name */
    private View f58407k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f58408l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f58409m;

    /* renamed from: n  reason: collision with root package name */
    private View f58410n;

    /* renamed from: o  reason: collision with root package name */
    private ViewGroup.MarginLayoutParams f58411o;

    /* renamed from: p  reason: collision with root package name */
    private LinearLayout f58412p;

    /* renamed from: q  reason: collision with root package name */
    private TextView f58413q;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class CustomSetValueView extends SetValueView {

        /* renamed from: q  reason: collision with root package name */
        private float f58414q;

        /* renamed from: r  reason: collision with root package name */
        private View f58415r;

        public CustomSetValueView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.withings.views.view.SetValueView
        public final void k() {
            super.k();
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(400L);
            alphaAnimation.setStartOffset(1000L);
            alphaAnimation.setAnimationListener(new l(this));
            if (this.f58415r.getAnimation() != null) {
                this.f58415r.getAnimation().setAnimationListener(null);
                this.f58415r.getAnimation().cancel();
            }
            this.f58415r.startAnimation(alphaAnimation);
        }

        @Override // com.withings.views.view.SetValueView
        public final void l() {
            super.l();
            this.f58415r.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.withings.views.view.SetValueView, android.view.ViewGroup, android.view.View
        public final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
            super.onLayout(z5, i11, i12, i13, i14);
            int measuredWidth = getMeasuredWidth() / 2;
            int measuredWidth2 = this.f58415r.getMeasuredWidth();
            int measuredHeight = this.f58415r.getMeasuredHeight();
            int yForValue = getYForValue();
            if (getValue() < this.f58414q) {
                yForValue -= measuredHeight;
            }
            int i15 = measuredWidth2 / 2;
            this.f58415r.layout(measuredWidth - i15, yForValue, measuredWidth + i15, measuredHeight + yForValue);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.withings.views.view.SetValueView, android.view.View
        public final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int f11 = this.f46695b.f(this.f58414q) - this.f46695b.getRealScrollY();
            this.f58415r.measure(i11, View.MeasureSpec.makeMeasureSpec(Math.abs(getYForValue() - f11), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
        }

        public final void q(View view) {
            View view2 = this.f58415r;
            if (view2 != null) {
                removeView(view2);
            }
            this.f58415r = view;
            view.setVisibility(8);
            addView(view);
        }

        public final void r(float f11) {
            this.f58414q = f11;
        }

        public CustomSetValueView(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
        }
    }

    private void s1(int i11, int i12, double d11) {
        ViewGroup viewGroup = (ViewGroup) getActivity().getLayoutInflater().inflate(C1987R.layout.view_weight_goal_target_threshold, (ViewGroup) this.f58406j, false);
        ((TextView) viewGroup.findViewById(C1987R.id.textBelow)).setText(i11);
        ((TextView) viewGroup.findViewById(C1987R.id.textAbove)).setText(i12);
        CustomSetValueView customSetValueView = this.f58406j;
        double d12 = this.f58402f;
        customSetValueView.e(viewGroup, (float) (d11 * d12 * d12));
    }

    private float t1() {
        double d11 = this.f58401e;
        double d12 = this.f58402f;
        float f11 = (float) ((d11 / d12) / d12);
        if (f11 < 18.5f) {
            return 25.0f;
        }
        if (f11 > 25.0f) {
            return (f11 - 18.5f) + f11;
        }
        return 35.0f;
    }

    private double u1() {
        if (this.f58400d == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d11 = this.f58402f;
            this.f58400d = t1() * d11 * d11;
        }
        return this.f58400d;
    }

    private float v1() {
        double d11 = this.f58401e;
        double d12 = this.f58402f;
        float f11 = (float) ((d11 / d12) / d12);
        if (f11 < 18.5f) {
            return f11 - (25.0f - f11);
        }
        if (f11 > 25.0f) {
            return 18.5f;
        }
        return 16.0f;
    }

    private double w1() {
        if (this.f58399c == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            double d11 = this.f58402f;
            this.f58399c = v1() * d11 * d11;
        }
        return this.f58399c;
    }

    private void y1() {
        this.f58408l.setText(a.d.a(this.f58407k.getContext()).b(this.f58403g, 1));
        double d11 = ((int) this.f58403g) - this.f58401e;
        TextView textView = this.f58413q;
        textView.setText(a.d.a(textView.getContext()).b(d11, 1));
        int applyDimension = (int) TypedValue.applyDimension(1, 1.0f, getResources().getDisplayMetrics());
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f58413q.getLayoutParams();
        int i11 = 0;
        if (this.f58401e > this.f58403g) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f58411o;
            marginLayoutParams.bottomMargin = applyDimension;
            marginLayoutParams.topMargin = 0;
            layoutParams.bottomMargin = this.f58407k.getLayoutParams().height / 2;
            layoutParams.topMargin = 0;
            this.f58412p.setGravity(48);
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = this.f58411o;
            marginLayoutParams2.topMargin = applyDimension;
            marginLayoutParams2.bottomMargin = 0;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = this.f58407k.getLayoutParams().height / 2;
            this.f58412p.setGravity(80);
        }
        this.f58410n.requestLayout();
        int dimension = (int) getResources().getDimension(C1987R.dimen.abc_action_bar_default_height_material);
        if (this.f58403g <= (((u1() - w1()) * 14.0d) / 15.0d) + w1()) {
            if (this.f58403g > (((u1() - w1()) * 13.0d) / 15.0d) + w1()) {
                i11 = dimension / 2;
            } else {
                i11 = dimension;
            }
        }
        ((ViewGroup.MarginLayoutParams) this.f58409m.getLayoutParams()).topMargin = i11;
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void E2(float f11) {
        double floor;
        double d11;
        double d12 = f11;
        if (Math.abs(this.f58401e - d12) != FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            u g11 = this.f58405i.g(1);
            if (g11 instanceof t) {
                int i11 = t.f78812e;
                y a11 = t.a.a(d12);
                int i12 = (int) a11.f78868a;
                double d13 = a11.f78869b;
                int i13 = 0;
                if (d13 > 8.0d) {
                    i12++;
                } else if (d13 > 2.0d) {
                    i13 = 5;
                }
                floor = (float) t.a.b(i12, i13);
            } else if (g11 instanceof s) {
                int i14 = s.f78810d;
                d12 = Math.round(d12 / 0.453592d) * 0.453592d;
            } else {
                floor = Math.floor(d12);
                double d14 = d12 - floor;
                if (d14 > 0.75d) {
                    d11 = 1.0d;
                } else {
                    d11 = d14 > 0.25d ? 0.5d : 0.5d;
                }
                floor += d11;
            }
            d12 = floor;
        }
        this.f58403g = d12;
        y1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f58405i = a.d.a(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f58402f = getArguments().getDouble("currentHeight");
        this.f58401e = getArguments().getDouble("currentWeight");
        this.f58403g = ((WeightGoal) getArguments().getSerializable("weightGoal")).getTarget();
        if (bundle != null) {
            this.f58403g = bundle.getDouble("weightGoal");
        }
        this.f58403g = Math.max(w1(), Math.min(this.f58403g, u1()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.views.view.SetValueView, com.withings.wiscale2.measure.goal.ui.WeightGoalTargetFragment$CustomSetValueView, android.view.View] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? setValueView = new SetValueView(getActivity());
        this.f58406j = setValueView;
        setValueView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.f58406j;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f58406j.setListener(null);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putDouble("weightGoal", this.f58403g);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58406j.setListener(this);
        this.f58406j.setScaleHeight(LogInterceptor.LOG_CHUNK_SIZE);
        this.f58406j.m((float) w1(), (float) u1());
        int k11 = ah.g.k(56, view.getContext());
        this.f58406j.n(k11, k11);
        this.f58406j.setValue((float) this.f58403g);
        this.f58406j.r((float) this.f58401e);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 4.0f, getResources().getDisplayMetrics());
        double w12 = w1();
        double d11 = this.f58402f;
        double u12 = u1();
        double d12 = this.f58402f;
        int ceil = (int) Math.ceil(Math.max(t1(), (u12 / d12) / d12));
        for (int min = (int) Math.min(v1(), (w12 / d11) / d11); min <= ceil; min++) {
            TextView textView = new TextView(getActivity());
            String string = getString(C1987R.string._IMC_);
            textView.setText(string + " " + min);
            xq.a.a(textView, C1987R.style.body1);
            textView.setLayoutParams(marginLayoutParams);
            CustomSetValueView customSetValueView = this.f58406j;
            double d13 = this.f58402f;
            customSetValueView.e(textView, (float) (min * d13 * d13));
        }
        s1(C1987R.string._GOAL_WEIGHT_18_VALUE_, C1987R.string._GOAL_WEIGHT_25_VALUE_, 18.5d);
        s1(C1987R.string._GOAL_WEIGHT_25_VALUE_, C1987R.string._GOAL_WEIGHT_30_VALUE_, 25.0d);
        s1(C1987R.string._GOAL_WEIGHT_30_VALUE_, C1987R.string._GOAL_WEIGHT_70_VALUE_, 30.0d);
        this.f58410n = getActivity().getLayoutInflater().inflate(C1987R.layout.view_weight_goal_current, (ViewGroup) null);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
        this.f58411o = marginLayoutParams2;
        this.f58410n.setLayoutParams(marginLayoutParams2);
        ((TextView) this.f58410n.findViewById(C1987R.id.current)).setText(this.f58405i.b(this.f58401e, 1));
        this.f58406j.e(this.f58410n, (float) this.f58401e);
        View inflate = getActivity().getLayoutInflater().inflate(C1987R.layout.view_weight_goal_delta, (ViewGroup) this.f58406j, false);
        this.f58412p = (LinearLayout) inflate.findViewById(C1987R.id.deltaContainer);
        this.f58413q = (TextView) inflate.findViewById(C1987R.id.delta);
        this.f58406j.q(inflate);
        View inflate2 = getActivity().getLayoutInflater().inflate(C1987R.layout.view_circle_value, (ViewGroup) this.f58406j, false);
        this.f58407k = inflate2;
        this.f58408l = (TextView) inflate2.findViewById(C1987R.id.value);
        this.f58406j.setValueView(this.f58407k);
        String format = String.format(getString(C1987R.string._GOAL_WEIGHT_TUTORIAL1_TITLE__s_), this.f58405i.g(1).i(requireContext()));
        TextView textView2 = new TextView(getActivity());
        this.f58409m = textView2;
        textView2.setText(format);
        this.f58409m.setGravity(17);
        xq.a.a(this.f58409m, C1987R.style.header4);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        int applyDimension = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f58409m.setPadding(applyDimension, 0, applyDimension, 0);
        this.f58409m.setLayoutParams(marginLayoutParams3);
        this.f58406j.g(this.f58409m);
        ViewGroup viewGroup = (ViewGroup) getActivity().getLayoutInflater().inflate(C1987R.layout.view_set_goal_tutorial, (ViewGroup) this.f58406j, false);
        ((TextView) viewGroup.findViewById(C1987R.id.text)).setText(C1987R.string._GOAL_WEIGHT_TUTORIAL1_DESCRIPTION_);
        this.f58406j.h(viewGroup, (float) this.f58403g);
        y1();
        if (this.f58404h) {
            this.f58406j.l();
        }
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void u() {
        this.f58404h = true;
    }

    public final double x1() {
        return this.f58403g;
    }
}
