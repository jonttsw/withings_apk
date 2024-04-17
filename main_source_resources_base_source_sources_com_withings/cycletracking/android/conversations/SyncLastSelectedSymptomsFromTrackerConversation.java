package com.withings.cycletracking.android.conversations;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.screen.repository.DeviceScreensRepository;
import ex.b;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import u60.d;
import ym.m;
import ym0.p;
/* compiled from: SyncLastSelectedSymptomsFromTrackerConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/android/conversations/SyncLastSelectedSymptomsFromTrackerConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SyncLastSelectedSymptomsFromTrackerConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final long f35427f;

    /* renamed from: g  reason: collision with root package name */
    private final long f35428g;

    /* renamed from: h  reason: collision with root package name */
    private final DeviceScreensRepository f35429h;

    /* renamed from: i  reason: collision with root package name */
    private final b f35430i;

    /* renamed from: j  reason: collision with root package name */
    private final d f35431j;

    /* renamed from: k  reason: collision with root package name */
    private final m f35432k;

    /* compiled from: SyncLastSelectedSymptomsFromTrackerConversation.kt */
    @e(c = "com.withings.cycletracking.android.conversations.SyncLastSelectedSymptomsFromTrackerConversation$run$1", f = "SyncLastSelectedSymptomsFromTrackerConversation.kt", l = {38, 42, 45, 54}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        List f35433a;

        /* renamed from: b  reason: collision with root package name */
        int f35434b;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new a(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
        /* JADX WARN: Type inference failed for: r5v1, types: [nj.h, nj.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 341
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.android.conversations.SyncLastSelectedSymptomsFromTrackerConversation.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public SyncLastSelectedSymptomsFromTrackerConversation(long j5, long j11, DeviceScreensRepository deviceScreensRepository, b noteRepository, d hasFeatureActivatedUseCase, m syncLastSelectedSymptomsFromTrackerUseCase) {
        u.j(deviceScreensRepository, "deviceScreensRepository");
        u.j(noteRepository, "noteRepository");
        u.j(hasFeatureActivatedUseCase, "hasFeatureActivatedUseCase");
        u.j(syncLastSelectedSymptomsFromTrackerUseCase, "syncLastSelectedSymptomsFromTrackerUseCase");
        this.f35427f = j5;
        this.f35428g = j11;
        this.f35429h = deviceScreensRepository;
        this.f35430i = noteRepository;
        this.f35431j = hasFeatureActivatedUseCase;
        this.f35432k = syncLastSelectedSymptomsFromTrackerUseCase;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException, UnsupportedCommandException {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }
}
