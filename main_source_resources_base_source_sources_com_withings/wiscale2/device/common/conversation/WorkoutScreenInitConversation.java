package com.withings.wiscale2.device.common.conversation;

import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ImageMetadata;
import com.withings.comm.wpp.generated.object.LocaleSet;
import com.withings.workout.category.model.WorkoutCategoryManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: WorkoutScreenConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/WorkoutScreenInitConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class WorkoutScreenInitConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final fl.p f50788f;

    /* renamed from: g  reason: collision with root package name */
    private final WorkoutCategoryManager f50789g;

    /* renamed from: h  reason: collision with root package name */
    private final LocaleSet f50790h;

    /* compiled from: WorkoutScreenConversation.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.q<Integer, long[], List<? extends ImageMetadata>, y> {
        a() {
            super(3);
        }

        @Override // ym0.q
        public final y invoke(Integer num, long[] jArr, List<? extends ImageMetadata> list) {
            boolean z5;
            num.intValue();
            long[] screens = jArr;
            List<? extends ImageMetadata> metadata = list;
            kotlin.jvm.internal.u.j(screens, "screens");
            kotlin.jvm.internal.u.j(metadata, "metadata");
            WorkoutScreenInitConversation workoutScreenInitConversation = WorkoutScreenInitConversation.this;
            workoutScreenInitConversation.getClass();
            if (screens.length == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!(!z5)) {
                workoutScreenInitConversation.E(new WorkoutScreenSetConversation(workoutScreenInitConversation.f50789g, WorkoutScreenInitConversation.M(workoutScreenInitConversation), metadata));
            } else if (WorkoutScreenInitConversation.N(workoutScreenInitConversation)) {
                workoutScreenInitConversation.E(new WorkoutScreenSetConversation(workoutScreenInitConversation.f50789g, screens, metadata));
            }
            return y.f85009a;
        }
    }

    public WorkoutScreenInitConversation(fl.p modelFactory, WorkoutCategoryManager categoryManager, LocaleSet localeSet) {
        kotlin.jvm.internal.u.j(modelFactory, "modelFactory");
        kotlin.jvm.internal.u.j(categoryManager, "categoryManager");
        this.f50788f = modelFactory;
        this.f50789g = categoryManager;
        this.f50790h = localeSet;
    }

    public static final long[] M(WorkoutScreenInitConversation workoutScreenInitConversation) {
        cj.b x11 = workoutScreenInitConversation.x();
        kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
        fl.o f11 = workoutScreenInitConversation.f50788f.f(x11);
        kotlin.jvm.internal.u.h(f11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.DeviceWithWorkoutScreens");
        Context r7 = workoutScreenInitConversation.r();
        kotlin.jvm.internal.u.i(r7, "getContext(...)");
        ((wb0.h) f11).c0(r7);
        int[] iArr = {2, 7, 6, 1, 307, 36};
        ArrayList arrayList = new ArrayList(6);
        for (int i11 = 0; i11 < 6; i11++) {
            arrayList.add(Long.valueOf(iArr[i11]));
        }
        return x.R0(arrayList);
    }

    public static final boolean N(WorkoutScreenInitConversation workoutScreenInitConversation) {
        LocaleSet localeSet = workoutScreenInitConversation.f50790h;
        if (localeSet != null && !kotlin.jvm.internal.u.e(localeSet.locale, Locale.getDefault().getLanguage())) {
            return true;
        }
        return false;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        WorkoutScreenGetConversation workoutScreenGetConversation = new WorkoutScreenGetConversation(new a());
        cj.b x11 = x();
        kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
        fl.o f11 = this.f50788f.f(x11);
        kotlin.jvm.internal.u.h(f11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.DeviceWithWorkoutScreens");
        Context r7 = r();
        kotlin.jvm.internal.u.i(r7, "getContext(...)");
        if (((wb0.h) f11).c0(r7).a((int) x().i().softVersion)) {
            E(workoutScreenGetConversation);
        }
    }
}
