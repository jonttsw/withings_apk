package com.withings.common.device.conversation;

import ah.o;
import android.content.Context;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.ProbeReply;
import com.withings.measure.core.models.MeasureGroupOrigin;
import com.withings.user.User;
import fl.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.u;
import m70.i;
import nm0.y;
/* compiled from: GetMeasureAndRemoteSyncConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withings/common/device/conversation/GetMeasureAndRemoteSyncConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GetMeasureAndRemoteSyncConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final kn.e f35141f;

    /* renamed from: g  reason: collision with root package name */
    private final i f35142g;

    /* renamed from: h  reason: collision with root package name */
    private final p f35143h;

    /* renamed from: i  reason: collision with root package name */
    private final bl.a f35144i;

    /* renamed from: j  reason: collision with root package name */
    private final ny.a f35145j;

    /* renamed from: k  reason: collision with root package name */
    private final iy.d f35146k;

    /* renamed from: l  reason: collision with root package name */
    private final ym0.p<List<ky.d>, ProbeReply, y> f35147l;

    /* renamed from: m  reason: collision with root package name */
    private final com.withings.comm.trace.e f35148m;

    /* compiled from: GetMeasureAndRemoteSyncConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        /* JADX WARN: Type inference failed for: r4v0, types: [bl.a, java.lang.Object] */
        public static GetMeasureAndRemoteSyncConversation a(Context context, ym0.p insertHfMeasureManager) {
            ?? obj = new Object();
            u.j(insertHfMeasureManager, "insertHfMeasureManager");
            Context applicationContext = context.getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            al.e eVar = (al.e) o.c(applicationContext, al.e.class);
            return new GetMeasureAndRemoteSyncConversation(eVar.a(), eVar.f(), eVar.O(), obj, eVar.J(), eVar.z(), insertHfMeasureManager, eVar.E());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetMeasureAndRemoteSyncConversation(kn.e deviceManager, i userManager, p hMDeviceModelFactory, bl.a aVar, ny.a batchInsertMeasureGroupUseCase, iy.d measuresGroupRemoteRepository, ym0.p<? super List<ky.d>, ? super ProbeReply, y> insertHfMeasureManager, com.withings.comm.trace.e traceManager) {
        u.j(deviceManager, "deviceManager");
        u.j(userManager, "userManager");
        u.j(hMDeviceModelFactory, "hMDeviceModelFactory");
        u.j(batchInsertMeasureGroupUseCase, "batchInsertMeasureGroupUseCase");
        u.j(measuresGroupRemoteRepository, "measuresGroupRemoteRepository");
        u.j(insertHfMeasureManager, "insertHfMeasureManager");
        u.j(traceManager, "traceManager");
        this.f35141f = deviceManager;
        this.f35142g = userManager;
        this.f35143h = hMDeviceModelFactory;
        this.f35144i = aVar;
        this.f35145j = batchInsertMeasureGroupUseCase;
        this.f35146k = measuresGroupRemoteRepository;
        this.f35147l = insertHfMeasureManager;
        this.f35148m = traceManager;
    }

    public static final boolean N(GetMeasureAndRemoteSyncConversation getMeasureAndRemoteSyncConversation, long j5) {
        List<User> d11 = getMeasureAndRemoteSyncConversation.f35142g.d();
        u.i(d11, "getAllUsers(...)");
        List<User> list = d11;
        ArrayList arrayList = new ArrayList(x.y(list, 10));
        for (User user : list) {
            arrayList.add(Long.valueOf(user.q()));
        }
        return arrayList.contains(Long.valueOf(j5));
    }

    public static final Object O(GetMeasureAndRemoteSyncConversation getMeasureAndRemoteSyncConversation, List list, boolean z5, qm0.d dVar) {
        getMeasureAndRemoteSyncConversation.getClass();
        Object c11 = getMeasureAndRemoteSyncConversation.f35145j.c(list, z5, MeasureGroupOrigin.f41680a, false, dVar);
        if (c11 != CoroutineSingletons.f76214a) {
            return y.f85009a;
        }
        return c11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03a6 A[LOOP:0: B:13:0x0081->B:113:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v24, types: [xp.b, T] */
    /* JADX WARN: Type inference failed for: r2v21, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D() {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.common.device.conversation.GetMeasureAndRemoteSyncConversation.D():void");
    }
}
