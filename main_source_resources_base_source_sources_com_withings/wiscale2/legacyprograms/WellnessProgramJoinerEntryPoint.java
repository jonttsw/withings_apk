package com.withings.wiscale2.legacyprograms;

import kotlin.Metadata;
import x30.h;
import x30.l;
/* compiled from: WellnessProgramJoiner.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/legacyprograms/WellnessProgramJoinerEntryPoint;", "", "Lx30/l;", "isProgramRunningUseCase", "()Lx30/l;", "Lj30/c;", "enrolledRepository", "()Lj30/c;", "Lx30/h;", "getMostRecentEnrolledProgramLastUpdateUseCase", "()Lx30/h;", "Lv30/b;", "fetchTasksProgramByIdUseCase", "()Lv30/b;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public interface WellnessProgramJoinerEntryPoint {
    j30.c enrolledRepository();

    v30.b fetchTasksProgramByIdUseCase();

    h getMostRecentEnrolledProgramLastUpdateUseCase();

    l isProgramRunningUseCase();
}
