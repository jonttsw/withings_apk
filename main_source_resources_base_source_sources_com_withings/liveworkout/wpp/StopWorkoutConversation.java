package com.withings.liveworkout.wpp;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ActivitySubcategory;
import com.withings.comm.wpp.generated.object.EndTime;
import com.withings.comm.wpp.generated.object.StartTime;
import com.withings.liveworkout.model.LiveWorkout;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nj.a;
import org.joda.time.DateTime;
/* compiled from: StopWorkoutConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/liveworkout/wpp/StopWorkoutConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class StopWorkoutConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final LiveWorkout f40653f;

    public StopWorkoutConversation(LiveWorkout workout) {
        u.j(workout, "workout");
        this.f40653f = workout;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        long millis;
        StartTime startTime = new StartTime();
        LiveWorkout liveWorkout = this.f40653f;
        long j5 = 1000;
        startTime.value = (int) (liveWorkout.getStartDateMillis() / j5);
        EndTime endTime = new EndTime();
        Long endDateMillis = liveWorkout.getEndDateMillis();
        if (endDateMillis != null) {
            millis = endDateMillis.longValue();
        } else {
            millis = DateTime.now().getMillis();
        }
        endTime.value = (int) (millis / j5);
        ActivitySubcategory activitySubcategory = new ActivitySubcategory();
        activitySubcategory.value = (short) liveWorkout.getWorkoutCategoryId();
        a aVar = new a(x());
        aVar.c((short) 318, startTime, endTime, activitySubcategory);
        aVar.j();
    }
}
