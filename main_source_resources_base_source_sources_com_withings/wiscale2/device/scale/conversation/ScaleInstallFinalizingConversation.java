package com.withings.wiscale2.device.scale.conversation;

import ah.o;
import android.content.Context;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.common.device.conversation.SendSessionConversation;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.user.core.models.User;
import com.withings.wiscale2.device.common.conversation.GetScreenSettingsAndSendScreensConversation;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import nm0.l;
import nm0.y;
import qm0.d;
import ym0.p;
/* compiled from: ScaleInstallFinalizingConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/scale/conversation/ScaleInstallFinalizingConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ScaleInstallFinalizingConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final a f54638f;

    /* renamed from: g  reason: collision with root package name */
    private final SetupConversation f54639g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f54640h;

    /* compiled from: ScaleInstallFinalizingConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void a(SetupConversation setupConversation, ScaleInstallFinalizingConversation scaleInstallFinalizingConversation);
    }

    /* compiled from: ScaleInstallFinalizingConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/withings/wiscale2/device/scale/conversation/ScaleInstallFinalizingConversation$b;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public interface b {
        r70.c S();

        p70.a i();
    }

    /* compiled from: ScaleInstallFinalizingConversation.kt */
    @e(c = "com.withings.wiscale2.device.scale.conversation.ScaleInstallFinalizingConversation$run$1", f = "ScaleInstallFinalizingConversation.kt", l = {57, 56}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class c extends i implements p<CoroutineScope, d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        r70.b f54641a;

        /* renamed from: b  reason: collision with root package name */
        int f54642b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ b f54643c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b bVar, d<? super c> dVar) {
            super(2, dVar);
            this.f54643c = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new c(this.f54643c, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            r70.b withSyncContext;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f54642b;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        l.b(obj);
                        return y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                withSyncContext = this.f54641a;
                l.b(obj);
            } else {
                l.b(obj);
                b bVar = this.f54643c;
                withSyncContext = bVar.i().withSyncContext("scale_install_finalizing_conversation");
                r70.c S = bVar.S();
                this.f54641a = withSyncContext;
                this.f54642b = 1;
                obj = r70.d.d(S, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            this.f54641a = null;
            this.f54642b = 2;
            if (withSyncContext.a((User) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return y.f85009a;
        }
    }

    public ScaleInstallFinalizingConversation(com.withings.wiscale2.device.scale.conversation.b bVar, SetupConversation conversation, boolean z5) {
        u.j(conversation, "conversation");
        this.f54638f = bVar;
        this.f54639g = conversation;
        this.f54640h = z5;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(300000L, false, false);
        this.f54638f.a(this.f54639g, this);
        Boolean bool = (Boolean) K();
        u.g(bool);
        if (bool.booleanValue()) {
            Context applicationContext = r().getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            BuildersKt__BuildersKt.runBlocking$default(null, new c((b) o.c(applicationContext, b.class), null), 1, null);
            E(new SendSessionConversation(this.f54640h));
        }
        E(new GetScreenSettingsAndSendScreensConversation());
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        kn.e c11 = kn.e.c();
        u.i(c11, "get(...)");
        new DebugDumpConversation(a11, new jl.b(c11), null, new jl.c(0L));
    }
}
