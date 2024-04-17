package com.withings.wiscale2.device.common.feature.activitygoal;

import com.withings.measure.android.data.FitnessLevel;
import kotlin.jvm.internal.p0;
/* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
/* loaded from: classes5.dex */
public final class q implements ym0.p<Integer, gi.b, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p0<FitnessLevel> f50955a;

    /* compiled from: FitnessAndStepsGoalSettingsFragment.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<FitnessLevel> f50956a = sm0.b.a(FitnessLevel.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(p0<FitnessLevel> p0Var) {
        this.f50955a = p0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ym0.p
    public final nm0.y invoke(Integer num, gi.b bVar) {
        int intValue = num.intValue();
        gi.b radioInfo = bVar;
        kotlin.jvm.internal.u.j(radioInfo, "radioInfo");
        this.f50955a.f76257a = ((FitnessLevel[]) ((kotlin.collections.a) a.f50956a).toArray(new FitnessLevel[0]))[intValue];
        return nm0.y.f85009a;
    }
}
