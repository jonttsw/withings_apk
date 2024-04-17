package com.withings.wiscale2.measure.goal.ui;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.target.WeightGoal;
import com.withings.views.view.AutoFitTextView;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import jm.a;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import w6.o;
/* compiled from: WeightGoalSpeedFragment.java */
/* loaded from: classes5.dex */
public class k extends Fragment implements SetValueView.a {

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f58428k = {0.2f, 0.4f, 0.7f, 1.0f};

    /* renamed from: c  reason: collision with root package name */
    private double f58429c;

    /* renamed from: d  reason: collision with root package name */
    private WeightGoal f58430d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f58431e;

    /* renamed from: f  reason: collision with root package name */
    private jm.a f58432f;

    /* renamed from: g  reason: collision with root package name */
    protected SetValueView f58433g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f58434h;

    /* renamed from: i  reason: collision with root package name */
    private AutoFitTextView f58435i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f58436j;

    private float t1() {
        if (this.f58430d.getTarget() < this.f58429c) {
            return -1.3f;
        }
        return 0.1f;
    }

    private void u1() {
        float f11;
        this.f58434h.setText(this.f58432f.b(this.f58430d.getSpeed(), 1));
        int dimension = (int) getResources().getDimension(C1987R.dimen.abc_action_bar_default_height_material);
        double speed = this.f58430d.getSpeed();
        float t12 = t1();
        float f12 = 1.3f;
        if (this.f58430d.getTarget() < this.f58429c) {
            f11 = -0.1f;
        } else {
            f11 = 1.3f;
        }
        if (speed > (((f11 - t1()) * 14.0f) / 15.0f) + t12) {
            dimension = 0;
        } else {
            double speed2 = this.f58430d.getSpeed();
            float t13 = t1();
            if (this.f58430d.getTarget() < this.f58429c) {
                f12 = -0.1f;
            }
            if (speed2 > (((f12 - t1()) * 13.0f) / 15.0f) + t13) {
                dimension /= 2;
            }
        }
        ((ViewGroup.MarginLayoutParams) this.f58435i.getLayoutParams()).topMargin = dimension;
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void E2(float f11) {
        this.f58430d.setSpeed(f11);
        u1();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f58432f = a.d.a(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        float f11;
        super.onCreate(bundle);
        this.f58430d = (WeightGoal) getArguments().getSerializable("weightGoal");
        this.f58429c = getArguments().getDouble("currentWeight");
        if (bundle != null) {
            this.f58430d = (WeightGoal) bundle.getSerializable("weightGoal");
        }
        WeightGoal weightGoal = this.f58430d;
        double t12 = t1();
        double speed = this.f58430d.getSpeed();
        if (this.f58430d.getTarget() < this.f58429c) {
            f11 = -0.1f;
        } else {
            f11 = 1.3f;
        }
        weightGoal.setSpeed(Math.max(t12, Math.min(speed, f11)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SetValueView setValueView = new SetValueView(getActivity());
        this.f58433g = setValueView;
        setValueView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return this.f58433g;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f58433g.setListener(null);
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("weightGoal", this.f58430d);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        float f11;
        int i11;
        String format;
        super.onViewCreated(view, bundle);
        this.f58433g.setListener(this);
        this.f58433g.setScaleHeight(3000);
        SetValueView setValueView = this.f58433g;
        float t12 = t1();
        if (this.f58430d.getTarget() < this.f58429c) {
            f11 = -0.1f;
        } else {
            f11 = 1.3f;
        }
        setValueView.m(t12, f11);
        int applyDimension = (int) TypedValue.applyDimension(1, 56.0f, getResources().getDisplayMetrics());
        this.f58433g.n(applyDimension, applyDimension);
        this.f58433g.setValue((float) this.f58430d.getSpeed());
        DateTimeFormatter forPattern = DateTimeFormat.forPattern("MMM yy");
        float[] fArr = f58428k;
        for (int i12 = 0; i12 < 4; i12++) {
            float f12 = fArr[i12];
            long abs = (long) ((Math.abs(this.f58429c - this.f58430d.getTarget()) * 6.048E8d) / f12);
            if (abs > 62899200000L) {
                format = String.format("%d %s", Long.valueOf(abs / 31449600000L), getString(C1987R.string._YEARS_));
            } else if (abs > 10368000000L) {
                format = String.format("%d %s", Long.valueOf(abs / 2592000000L), getString(C1987R.string._GRANULARITY_MONTH_));
            } else if (abs > 2419200000L) {
                format = String.format("%d %s", Long.valueOf(abs / 604800000), getString(C1987R.string._GRANULARITY_WEEK_));
            } else if (abs > 86400000) {
                format = String.format("%d %s", Long.valueOf(abs / 86400000), getString(C1987R.string._DAYS_));
            } else {
                format = String.format("%d %s", Long.valueOf(abs / 86400000), getString(C1987R.string._DAY_));
            }
            DateTime plus = DateTime.now().plus(abs);
            if (this.f58430d.getTarget() < this.f58429c) {
                f12 = -f12;
            }
            View inflate = getActivity().getLayoutInflater().inflate(C1987R.layout.view_weight_goal_speed_threshold, (ViewGroup) this.f58433g, false);
            ((TextView) inflate.findViewById(C1987R.id.duration)).setText(format);
            ((TextView) inflate.findViewById(C1987R.id.date)).setText(forPattern.print(plus));
            this.f58433g.e(inflate, f12);
        }
        View inflate2 = requireActivity().getLayoutInflater().inflate(C1987R.layout.view_weight_goal_speed_value, (ViewGroup) this.f58433g, false);
        Context context = inflate2.getContext();
        this.f58434h = (TextView) inflate2.findViewById(C1987R.id.value);
        this.f58433g.setValueView(inflate2);
        this.f58436j = (TextView) inflate2.findViewById(C1987R.id.legend);
        String h11 = this.f58432f.g(1).h(context);
        this.f58436j.setText(h11 + " / " + getString(C1987R.string._WEEK_).toLowerCase());
        TextView textView = this.f58436j;
        if (this.f58431e) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        textView.setVisibility(i11);
        String format2 = String.format(getString(C1987R.string._GOAL_WEIGHT_TUTORIAL2_TITLE__s_), o.a(this.f58432f.g(1).i(requireContext()), "/", getString(C1987R.string._REMINDER_WEEK_)));
        AutoFitTextView autoFitTextView = new AutoFitTextView(getActivity());
        this.f58435i = autoFitTextView;
        autoFitTextView.setText(format2);
        this.f58435i.setGravity(17);
        xq.a.a(this.f58435i, C1987R.style.header4);
        AutoFitTextView autoFitTextView2 = this.f58435i;
        autoFitTextView2.setMaxTextSize(ah.g.k(24, autoFitTextView2.getContext()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ah.g.k(96, getContext()));
        int k11 = ah.g.k(16, getContext());
        this.f58435i.setPadding(k11, 0, k11, 0);
        this.f58435i.setLayoutParams(layoutParams);
        this.f58433g.g(this.f58435i);
        ViewGroup viewGroup = (ViewGroup) getActivity().getLayoutInflater().inflate(C1987R.layout.view_set_goal_tutorial, (ViewGroup) this.f58433g, false);
        ((TextView) viewGroup.findViewById(C1987R.id.text)).setText(C1987R.string._GOAL_WEIGHT_TUTORIAL2_DESCRIPTION_);
        this.f58433g.h(viewGroup, (float) this.f58430d.getSpeed());
        u1();
        if (this.f58431e) {
            this.f58433g.l();
        }
    }

    public final double s1() {
        return this.f58430d.getSpeed();
    }

    @Override // com.withings.views.view.SetValueView.a
    public final void u() {
        this.f58431e = true;
        this.f58436j.setVisibility(0);
    }
}
