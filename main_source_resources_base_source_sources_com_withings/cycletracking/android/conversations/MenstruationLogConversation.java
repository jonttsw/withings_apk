package com.withings.cycletracking.android.conversations;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.screen.repository.DeviceScreensRepository;
import iy.e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import ky.c;
import nm0.y;
import u60.d;
import ym0.p;
/* compiled from: MenstruationLogConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/cycletracking/android/conversations/MenstruationLogConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MenstruationLogConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final long f35405f;

    /* renamed from: g  reason: collision with root package name */
    private final long f35406g;

    /* renamed from: h  reason: collision with root package name */
    private final e f35407h;

    /* renamed from: i  reason: collision with root package name */
    private final DeviceScreensRepository f35408i;

    /* renamed from: j  reason: collision with root package name */
    private final d f35409j;

    /* renamed from: k  reason: collision with root package name */
    private final c f35410k;

    /* renamed from: l  reason: collision with root package name */
    private final ym.c f35411l;

    /* compiled from: MenstruationLogConversation.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.android.conversations.MenstruationLogConversation$run$1", f = "MenstruationLogConversation.kt", l = {38, 43, 45, 59}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    static final class a extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f35412a;

        /* renamed from: b  reason: collision with root package name */
        int f35413b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f35414c;

        a(qm0.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f35414c = obj;
            return aVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0174 A[Catch: UnsupportedCommandException -> 0x013b, TryCatch #0 {UnsupportedCommandException -> 0x013b, blocks: (B:65:0x016e, B:67:0x0174, B:42:0x00fd, B:44:0x0126, B:50:0x013e, B:70:0x017b), top: B:77:0x00fd }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x00fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r2v13, types: [nj.h, nj.a] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 407
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.cycletracking.android.conversations.MenstruationLogConversation.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public MenstruationLogConversation(long j5, long j11, e measuresGroupRepository, DeviceScreensRepository deviceScreensRepository, d hasFeatureActivatedUseCase, c measureListenerManagerInterface, ym.c addPeriodUseCase) {
        u.j(measuresGroupRepository, "measuresGroupRepository");
        u.j(deviceScreensRepository, "deviceScreensRepository");
        u.j(hasFeatureActivatedUseCase, "hasFeatureActivatedUseCase");
        u.j(measureListenerManagerInterface, "measureListenerManagerInterface");
        u.j(addPeriodUseCase, "addPeriodUseCase");
        this.f35405f = j5;
        this.f35406g = j11;
        this.f35407h = measuresGroupRepository;
        this.f35408i = deviceScreensRepository;
        this.f35409j = hasFeatureActivatedUseCase;
        this.f35410k = measureListenerManagerInterface;
        this.f35411l = addPeriodUseCase;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }
}
