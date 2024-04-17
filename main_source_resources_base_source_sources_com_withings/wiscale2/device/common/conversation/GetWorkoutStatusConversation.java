package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.ActivitySubcategory;
import com.withings.comm.wpp.generated.object.PauseState;
import com.withings.comm.wpp.generated.object.StartTime;
import com.withings.comm.wpp.generated.object.Status;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.liveworkout.model.LiveWorkout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import nm0.y;
/* compiled from: GetWorkoutStatusConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/common/conversation/GetWorkoutStatusConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetWorkoutStatusConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final fl.p f50734f;

    /* renamed from: g  reason: collision with root package name */
    private final b f50735g;

    /* compiled from: GetWorkoutStatusConversation.kt */
    /* loaded from: classes5.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ym0.l<LiveWorkout, y> f50736a;

        /* JADX WARN: Multi-variable type inference failed */
        a(ym0.l<? super LiveWorkout, y> lVar) {
            this.f50736a = lVar;
        }

        @Override // com.withings.wiscale2.device.common.conversation.GetWorkoutStatusConversation.b
        public final void a(LiveWorkout liveWorkout) {
            this.f50736a.invoke(liveWorkout);
        }
    }

    /* compiled from: GetWorkoutStatusConversation.kt */
    /* loaded from: classes5.dex */
    public interface b {
        void a(LiveWorkout liveWorkout);
    }

    public GetWorkoutStatusConversation(fl.p pVar, b bVar) {
        this.f50734f = pVar;
        this.f50735g = bVar;
    }

    private final LiveWorkout L(nj.h hVar) {
        short s11;
        int i11;
        boolean z5;
        List<com.withings.comm.wpp.h> d11 = hVar.D().d();
        kotlin.jvm.internal.u.g(d11);
        List<com.withings.comm.wpp.h> list = d11;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ActivitySubcategory) {
                arrayList.add(obj);
            }
        }
        ActivitySubcategory activitySubcategory = (ActivitySubcategory) x.K(arrayList);
        if (activitySubcategory != null) {
            s11 = activitySubcategory.value;
        } else {
            s11 = 0;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof StartTime) {
                arrayList2.add(obj2);
            }
        }
        StartTime startTime = (StartTime) x.K(arrayList2);
        if (startTime != null) {
            i11 = startTime.value;
        } else {
            i11 = 0;
        }
        long j5 = i11 * 1000;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (obj3 instanceof Status) {
                arrayList3.add(obj3);
            }
        }
        Status status = (Status) x.K(arrayList3);
        if (status != null && status.value == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        String iVar = x().g().toString();
        kotlin.jvm.internal.u.i(iVar, "toString(...)");
        cj.b x11 = x();
        kotlin.jvm.internal.u.i(x11, "getWppDevice(...)");
        int a11 = this.f50734f.f(x11).a();
        Integer valueOf = Integer.valueOf((int) kn.e.c().f(x().g()).getId());
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (obj4 instanceof PauseState) {
                arrayList4.add(obj4);
            }
        }
        return new LiveWorkout(s11, j5, null, z5, iVar, a11, valueOf, (PauseState) x.K(arrayList4), null, ConstantsWs.WS_STATUS_WRONGDEVTYPE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        try {
            ?? aVar = new nj.a(x());
            aVar.c((short) 322, new com.withings.comm.wpp.h[0]);
            aVar.j();
            LiveWorkout L = L(aVar);
            b bVar = this.f50735g;
            if (bVar != null) {
                bVar.a(L);
            }
        } catch (UnsupportedCommandException unused) {
            x70.b.t(this, "Command WPP_CMD_WORKOUT_STATUS is not supported by %s with firmware %d", x(), Long.valueOf(x().i().softVersion));
        }
    }

    public GetWorkoutStatusConversation(fl.p pVar, ym0.l<? super LiveWorkout, y> lVar) {
        a aVar = new a(lVar);
        this.f50734f = pVar;
        this.f50735g = aVar;
    }
}
