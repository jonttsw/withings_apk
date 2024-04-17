package com.withings.wiscale2.activity.workout.model;

import kotlin.Metadata;
import kotlin.jvm.internal.w;
/* compiled from: WorkoutSaver.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lvf/c;", "invoke", "()Lvf/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class WorkoutSaver$accountManager$2 extends w implements ym0.a<vf.c> {
    public static final WorkoutSaver$accountManager$2 INSTANCE = new WorkoutSaver$accountManager$2();

    WorkoutSaver$accountManager$2() {
        super(0);
    }

    @Override // ym0.a
    public final vf.c invoke() {
        vf.c cVar;
        cVar = vf.c.f103617d;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("You must call init before".toString());
    }
}
