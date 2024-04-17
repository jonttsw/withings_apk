package com.withings.wiscale2.activity.workout.model;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
import pi.i;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lpi/i;", "invoke", "()Lpi/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutSaver$isForClinicalStudy$2 extends w implements ym0.a<i> {
    public static final WorkoutSaver$isForClinicalStudy$2 INSTANCE = new WorkoutSaver$isForClinicalStudy$2();

    WorkoutSaver$isForClinicalStudy$2() {
        super(0);
    }

    @Override // ym0.a
    public final i invoke() {
        vf.c accountManager;
        accountManager = WorkoutSaver.INSTANCE.getAccountManager();
        return new i(new pb0.a(accountManager));
    }
}
