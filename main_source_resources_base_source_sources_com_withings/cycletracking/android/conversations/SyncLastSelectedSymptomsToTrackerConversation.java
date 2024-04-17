package com.withings.cycletracking.android.conversations;

import com.withings.comm.wpp.generated.object.SymptomType;
import com.withings.screen.repository.DeviceScreensRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import u60.d;
import ym.h;
import ym0.p;
/* compiled from: SyncLastSelectedSymptomsToTrackerConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/android/conversations/SyncLastSelectedSymptomsToTrackerConversation;", "Lcom/withings/cycletracking/android/conversations/RequiredForDeviceScreensConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SyncLastSelectedSymptomsToTrackerConversation extends RequiredForDeviceScreensConversation {

    /* renamed from: f  reason: collision with root package name */
    private final DeviceScreensRepository f35436f;

    /* renamed from: g  reason: collision with root package name */
    private final h f35437g;

    /* renamed from: h  reason: collision with root package name */
    private final ex.a f35438h;

    /* renamed from: i  reason: collision with root package name */
    private final d f35439i;

    /* renamed from: j  reason: collision with root package name */
    private final long f35440j;

    /* renamed from: k  reason: collision with root package name */
    private final long f35441k;

    /* compiled from: SyncLastSelectedSymptomsToTrackerConversation.kt */
    @e(c = "com.withings.cycletracking.android.conversations.SyncLastSelectedSymptomsToTrackerConversation$run$1", f = "SyncLastSelectedSymptomsToTrackerConversation.kt", l = {29, 31, 38, 50}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        com.withings.comm.wpp.h[] f35442a;

        /* renamed from: b  reason: collision with root package name */
        SymptomType f35443b;

        /* renamed from: c  reason: collision with root package name */
        int f35444c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f35445d;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f35445d = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0115 A[LOOP:0: B:48:0x010d->B:50:0x0115, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x013f A[LOOP:1: B:52:0x0139->B:54:0x013f, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0193 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) {
            /*
                Method dump skipped, instructions count: 475
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.android.conversations.SyncLastSelectedSymptomsToTrackerConversation.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SyncLastSelectedSymptomsToTrackerConversation(DeviceScreensRepository deviceScreensRepository, h getMostFrequentSymptomsUseCase, ex.a lastCycleTrackingSyncRepository, d hasFeatureActivatedUseCase, long j5, long j11) {
        u.j(deviceScreensRepository, "deviceScreensRepository");
        u.j(getMostFrequentSymptomsUseCase, "getMostFrequentSymptomsUseCase");
        u.j(lastCycleTrackingSyncRepository, "lastCycleTrackingSyncRepository");
        u.j(hasFeatureActivatedUseCase, "hasFeatureActivatedUseCase");
        this.f35436f = deviceScreensRepository;
        this.f35437g = getMostFrequentSymptomsUseCase;
        this.f35438h = lastCycleTrackingSyncRepository;
        this.f35439i = hasFeatureActivatedUseCase;
        this.f35440j = j5;
        this.f35441k = j11;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }
}
