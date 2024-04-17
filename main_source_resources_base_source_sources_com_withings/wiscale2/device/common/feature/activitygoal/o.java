package com.withings.wiscale2.device.common.feature.activitygoal;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.withings.network.android.interceptors.LogInterceptor;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
import jm.a;
import kotlin.jvm.internal.n0;
import l70.u;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class o extends kotlin.jvm.internal.w implements ym0.p<com.google.android.material.bottomsheet.l, View, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ n0 f50951a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50952b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment, n0 n0Var) {
        super(2);
        this.f50951a = n0Var;
        this.f50952b = fitnessAndStepsGoalSettingsFragment;
    }

    @Override // ym0.p
    public final nm0.y invoke(com.google.android.material.bottomsheet.l lVar, View view) {
        View view2 = view;
        kotlin.jvm.internal.u.j(lVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.u.j(view2, "view");
        SetValueView setValueView = (SetValueView) view2.findViewById(C1987R.id.set_value_view);
        kotlin.jvm.internal.u.g(setValueView);
        setValueView.setVisibility(0);
        setValueView.setScaleHeight(LogInterceptor.LOG_CHUNK_SIZE);
        setValueView.m(3000.0f, 15000.0f);
        Context context = setValueView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        int k11 = ah.g.k(72, context);
        setValueView.n(k11, k11);
        String string = setValueView.getContext().getString(C1987R.string._GOAL_STEP_14000_VALUE_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        b0.a(setValueView, string, 14000.0f);
        String string2 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_13000_VALUE_);
        kotlin.jvm.internal.u.i(string2, "getString(...)");
        b0.a(setValueView, string2, 13000.0f);
        String string3 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_11000_VALUE_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        b0.a(setValueView, string3, 11000.0f);
        String string4 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_10000_VALUE_);
        kotlin.jvm.internal.u.i(string4, "getString(...)");
        b0.a(setValueView, string4, 10000.0f);
        String string5 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_6000_VALUE_);
        kotlin.jvm.internal.u.i(string5, "getString(...)");
        b0.a(setValueView, string5, 6000.0f);
        String string6 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_5000_VALUE_);
        kotlin.jvm.internal.u.i(string6, "getString(...)");
        b0.a(setValueView, string6, 5000.0f);
        String string7 = setValueView.getContext().getString(C1987R.string._GOAL_STEP_3000_VALUE_);
        kotlin.jvm.internal.u.i(string7, "getString(...)");
        b0.a(setValueView, string7, 3000.0f);
        Context context2 = setValueView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        l70.u g11 = a.d.a(context2).g(31);
        for (float f11 = 3000.0f; f11 <= 15000.0f; f11 += 1000.0f) {
            TextView textView = new TextView(setValueView.getContext());
            textView.setText(NumberFormat.getNumberInstance().format(Float.valueOf(f11)));
            xq.a.a(textView, C1987R.style.header4);
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.leftMargin = textView.getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
            marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 2.0f, textView.getResources().getDisplayMetrics());
            textView.setLayoutParams(marginLayoutParams);
            setValueView.e(textView, f11);
            TextView textView2 = new TextView(setValueView.getContext());
            Context context3 = textView2.getContext();
            kotlin.jvm.internal.u.i(context3, "getContext(...)");
            u.a aVar = l70.u.f78815b;
            textView2.setText(g11.g(context3, 0.8f * f11, null).toString());
            xq.a.a(textView2, C1987R.style.body1);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams2.leftMargin = textView2.getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
            marginLayoutParams2.topMargin = (int) TypedValue.applyDimension(1, 2.0f, textView2.getResources().getDisplayMetrics());
            textView2.setLayoutParams(marginLayoutParams2);
            setValueView.f(textView2, f11);
        }
        n0 n0Var = this.f50951a;
        FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment = this.f50952b;
        LayoutInflater layoutInflater = fitnessAndStepsGoalSettingsFragment.getLayoutInflater();
        kotlin.jvm.internal.u.i(layoutInflater, "getLayoutInflater(...)");
        View inflate = layoutInflater.inflate(C1987R.layout.view_set_goal_tutorial, (ViewGroup) setValueView, false);
        View findViewById = inflate.findViewById(C1987R.id.text);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        ((TextView) findViewById).setText(C1987R.string._GOAL_STEP_TUTORIAL_DESCRIPTION_);
        setValueView.h(inflate, n0Var.f76254a);
        float f12 = n0Var.f76254a;
        LayoutInflater layoutInflater2 = fitnessAndStepsGoalSettingsFragment.getLayoutInflater();
        kotlin.jvm.internal.u.i(layoutInflater2, "getLayoutInflater(...)");
        View inflate2 = layoutInflater2.inflate(C1987R.layout.view_circle_value, (ViewGroup) setValueView, false);
        kotlin.jvm.internal.u.h(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        setValueView.setValueView((ViewGroup) inflate2);
        ((TextView) setValueView.getValueView().findViewById(C1987R.id.value)).setTextColor(-1);
        setValueView.setValue(f12);
        b0.c(setValueView, f12);
        setValueView.setListener(new n(n0Var, setValueView));
        return nm0.y.f85009a;
    }
}
