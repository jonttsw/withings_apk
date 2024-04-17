package com.withings.cycletracking.android.conversations;

import com.withings.screen.repository.DeviceScreensRepository;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import u60.d;
import ym0.p;
/* compiled from: SyncCyclePhaseToTrackerConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/android/conversations/SyncCyclePhaseToTrackerConversation;", "Lcom/withings/cycletracking/android/conversations/RequiredForDeviceScreensConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SyncCyclePhaseToTrackerConversation extends RequiredForDeviceScreensConversation {

    /* renamed from: f  reason: collision with root package name */
    private final DeviceScreensRepository f35416f;

    /* renamed from: g  reason: collision with root package name */
    private final ex.a f35417g;

    /* renamed from: h  reason: collision with root package name */
    private final d f35418h;

    /* renamed from: i  reason: collision with root package name */
    private final xm.a f35419i;

    /* renamed from: j  reason: collision with root package name */
    private final long f35420j;

    /* renamed from: k  reason: collision with root package name */
    private final long f35421k;

    /* compiled from: SyncCyclePhaseToTrackerConversation.kt */
    @e(c = "com.withings.cycletracking.android.conversations.SyncCyclePhaseToTrackerConversation$run$1", f = "SyncCyclePhaseToTrackerConversation.kt", l = {41, 42, 42, 48, 53, 68}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        List f35422a;

        /* renamed from: b  reason: collision with root package name */
        int f35423b;

        /* renamed from: c  reason: collision with root package name */
        int f35424c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f35425d;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f35425d = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0098 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0145 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0158  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x015b  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 674
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.android.conversations.SyncCyclePhaseToTrackerConversation.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SyncCyclePhaseToTrackerConversation(DeviceScreensRepository deviceScreensRepository, ex.a lastCycleTrackingSyncRepository, d hasFeatureActivatedUseCase, xm.a cycleRepository, long j5, long j11) {
        u.j(deviceScreensRepository, "deviceScreensRepository");
        u.j(lastCycleTrackingSyncRepository, "lastCycleTrackingSyncRepository");
        u.j(hasFeatureActivatedUseCase, "hasFeatureActivatedUseCase");
        u.j(cycleRepository, "cycleRepository");
        this.f35416f = deviceScreensRepository;
        this.f35417g = lastCycleTrackingSyncRepository;
        this.f35418h = hasFeatureActivatedUseCase;
        this.f35419i = cycleRepository;
        this.f35420j = j5;
        this.f35421k = j11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }
}
