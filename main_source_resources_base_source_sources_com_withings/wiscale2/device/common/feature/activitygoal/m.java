package com.withings.wiscale2.device.common.feature.activitygoal;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.withings.measure.android.data.FitnessLevel;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.feature.activitygoal.FitnessAndStepsGoalSettingsFragment;
import gi.j;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.p0;
import tb0.k1;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
final class m extends kotlin.jvm.internal.w implements ym0.l<FitnessLevel, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FitnessAndStepsGoalSettingsFragment f50948a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment) {
        super(1);
        this.f50948a = fitnessAndStepsGoalSettingsFragment;
    }

    @Override // ym0.l
    public final nm0.y invoke(FitnessLevel fitnessLevel) {
        k1 v12;
        final FitnessLevel fitnessLevel2 = fitnessLevel;
        final FitnessAndStepsGoalSettingsFragment fitnessAndStepsGoalSettingsFragment = this.f50948a;
        v12 = fitnessAndStepsGoalSettingsFragment.v1();
        LineCellView lineCellView = v12.f99267e;
        lineCellView.setValue(fitnessAndStepsGoalSettingsFragment.getString(fitnessLevel2.d()));
        lineCellView.setOnClickListener(new View.OnClickListener() { // from class: com.withings.wiscale2.device.common.feature.activitygoal.l
            /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.measure.android.data.FitnessLevel, T, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                boolean z5;
                FitnessAndStepsGoalSettingsFragment this$0 = FitnessAndStepsGoalSettingsFragment.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                ?? r02 = fitnessLevel2;
                kotlin.jvm.internal.u.g(r02);
                int i11 = FitnessAndStepsGoalSettingsFragment.f50885m;
                p0 p0Var = new p0();
                p0Var.f76257a = r02;
                sm0.a<FitnessLevel> aVar = FitnessAndStepsGoalSettingsFragment.a.f50890a;
                ArrayList arrayList = new ArrayList(kotlin.collections.x.y(aVar, 10));
                Iterator it = ((kotlin.collections.c) aVar).iterator();
                while (it.hasNext()) {
                    FitnessLevel fitnessLevel3 = (FitnessLevel) it.next();
                    String string = this$0.getString(fitnessLevel3.d());
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    String string2 = this$0.getString(fitnessLevel3.a());
                    if (fitnessLevel3 == p0Var.f76257a) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    arrayList.add(new gi.b(8, string, string2, z5, false));
                }
                FragmentManager supportFragmentManager = this$0.requireActivity().getSupportFragmentManager();
                kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
                j.a aVar2 = new j.a(supportFragmentManager);
                aVar2.y(this$0.getString(C1987R.string.activityGoals_workoutRegularity));
                aVar2.a(this$0.getString(C1987R.string.activityGoals_workoutRegularitySelection_description));
                aVar2.r(new q(p0Var), arrayList);
                String string3 = this$0.getString(C1987R.string._CONFIRM_YES_);
                kotlin.jvm.internal.u.i(string3, "getString(...)");
                aVar2.q(string3, new r(this$0, p0Var));
                aVar2.x();
            }
        });
        return nm0.y.f85009a;
    }
}
