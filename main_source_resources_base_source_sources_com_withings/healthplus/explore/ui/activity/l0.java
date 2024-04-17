package com.withings.healthplus.explore.ui.activity;

import android.os.Bundle;
import com.withings.healthplus.congrats.ui.model.SuccessTaskInfo;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
/* compiled from: ExploreTabActivity.kt */
/* loaded from: classes3.dex */
final class l0 extends kotlin.jvm.internal.w implements ym0.p<vt.a, SuccessTaskInfo, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ExploreTabActivity f40326a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Integer f40327b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(ExploreTabActivity exploreTabActivity, Integer num) {
        super(2);
        this.f40326a = exploreTabActivity;
        this.f40327b = num;
    }

    @Override // ym0.p
    public final nm0.y invoke(vt.a aVar, SuccessTaskInfo successTaskInfo) {
        Bundle c11;
        NavigationArguments.ProgramInformation retrieveProgramInformation;
        vt.a completionSuccessInfo = aVar;
        SuccessTaskInfo successTaskNotNullable = successTaskInfo;
        kotlin.jvm.internal.u.j(completionSuccessInfo, "completionSuccessInfo");
        kotlin.jvm.internal.u.j(successTaskNotNullable, "successTaskNotNullable");
        ExploreTabActivity exploreTabActivity = this.f40326a;
        r8.n nVar = exploreTabActivity.f40243f;
        Long l5 = null;
        if (nVar != null) {
            androidx.navigation.d w11 = nVar.w();
            if (w11 != null && (c11 = w11.c()) != null && (retrieveProgramInformation = NavigationArguments.ProgramInformation.Companion.retrieveProgramInformation(c11)) != null) {
                l5 = Long.valueOf(retrieveProgramInformation.getProgramId());
            }
            ExploreTabActivity.G3(exploreTabActivity, this.f40327b, l5, successTaskNotNullable, completionSuccessInfo);
            return nm0.y.f85009a;
        }
        kotlin.jvm.internal.u.s("navController");
        throw null;
    }
}
