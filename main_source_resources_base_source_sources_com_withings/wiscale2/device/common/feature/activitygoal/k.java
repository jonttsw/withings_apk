package com.withings.wiscale2.device.common.feature.activitygoal;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.withings.wiscale2.C1987R;
import gi.j;
import kotlin.jvm.internal.n0;
import tb0.k1;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class k extends kotlin.jvm.internal.w implements ym0.l<Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50945a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        super(1);
        this.f50945a = fitnessAndStepsGoalSettingsFragment;
    }

    @Override // ym0.l
    public final nm0.y invoke(Integer num) {
        k1 v12;
        final Integer num2 = num;
        final FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment = this.f50945a;
        v12 = fitnessAndStepsGoalSettingsFragment.v1();
        v12.f99265c.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.device.common.feature.activitygoal.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FitnessAndStepsGoalSettingsFragment this$0 = FitnessAndStepsGoalSettingsFragment.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                Integer num3 = num2;
                kotlin.jvm.internal.u.g(num3);
                int intValue = num3.intValue();
                int i11 = FitnessAndStepsGoalSettingsFragment.f50885m;
                n0 n0Var = new n0();
                n0Var.f76254a = intValue;
                FragmentManager supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                j.a aVar = new j.a(supportFragmentManager);
                aVar.o();
                aVar.y(this$0.getString(C1987R.string.stepGoalScreen_dailyStepGoal));
                aVar.a(this$0.getString(C1987R.string.stepGoalScreen_dailyStepGoal_description));
                aVar.v(C1987R.layout.bottom_sheet_steps_goal, new o(this$0, n0Var));
                String string = this$0.getString(C1987R.string._CONFIRM_YES_);
                kotlin.jvm.internal.u.i(string, "getString(...)");
                aVar.q(string, new p(this$0, n0Var));
                aVar.x();
            }
        });
        return nm0.y.f85009a;
    }
}
