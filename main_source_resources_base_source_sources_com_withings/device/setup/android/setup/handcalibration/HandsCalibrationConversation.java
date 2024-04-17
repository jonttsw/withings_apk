package com.withings.device.setup.android.setup.handcalibration;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.e;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.comm.wpp.h;
import com.withings.device.setup.android.setup.b;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import com.withings.device.setup.android.setup.s;
import javax.inject.Inject;
import jo.a0;
import jo.b0;
import jo.c0;
import jo.d0;
import jo.e0;
import jo.f0;
import jo.z;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.j;
import sm0.b;
/* compiled from: HandsCalibrationConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/setup/android/setup/handcalibration/HandsCalibrationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Action", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HandsCalibrationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final jo.a f37414f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HandsCalibrationConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/handcalibration/HandsCalibrationConversation$Action;", "", "android_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public static final class Action {

        /* renamed from: a  reason: collision with root package name */
        public static final Action f37415a;

        /* renamed from: b  reason: collision with root package name */
        public static final Action f37416b;

        /* renamed from: c  reason: collision with root package name */
        public static final Action f37417c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Action[] f37418d;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation$Action, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation$Action, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.device.setup.android.setup.handcalibration.HandsCalibrationConversation$Action, java.lang.Enum] */
        static {
            ?? r02 = new Enum("ACTION_END", 0);
            f37415a = r02;
            ?? r12 = new Enum("ACTION_UNBLOCK_HAND", 1);
            f37416b = r12;
            ?? r22 = new Enum("ACTION_MOVE_HAND", 2);
            f37417c = r22;
            Action[] actionArr = {r02, r12, r22};
            f37418d = actionArr;
            b.a(actionArr);
        }

        private Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f37418d.clone();
        }
    }

    /* compiled from: HandsCalibrationConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final jo.a f37419a;

        @Inject
        public a(jo.a mutableSetupStateRepository) {
            u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
            this.f37419a = mutableSetupStateRepository;
        }

        public final HandsCalibrationConversation a() {
            return new HandsCalibrationConversation(this.f37419a);
        }
    }

    public HandsCalibrationConversation(jo.a mutableSetupStateRepository) {
        u.j(mutableSetupStateRepository, "mutableSetupStateRepository");
        this.f37414f = mutableSetupStateRepository;
    }

    private final void L() {
        j jVar;
        do {
            b.f fVar = b.f.f37405a;
            jo.a aVar = this.f37414f;
            jVar = (j) s.b(this, aVar, fVar, true);
            if (jVar.c() == Action.f37416b) {
                s.a(this, aVar, f0.f74690a);
                nj.a aVar2 = new nj.a(x());
                aVar2.c((short) 2418, new h[0]);
                aVar2.j();
                s.a(this, aVar, z.f74720a);
            } else if (jVar.c() == Action.f37417c) {
                Object d11 = jVar.d();
                u.h(d11, "null cannot be cast to non-null type com.withings.comm.wpp.generated.object.HandsMove");
                nj.a aVar3 = new nj.a(x());
                aVar3.c((short) 284, (HandsMove) d11);
                aVar3.j();
                s.a(this, aVar, e0.f74688a);
            }
        } while (((Action) jVar.c()) != Action.f37415a);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        jo.a aVar = this.f37414f;
        e a11 = e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        B(120000L, true, true);
        do {
            try {
                s.a(this, aVar, a0.f74681a);
                nj.a aVar2 = new nj.a(x());
                aVar2.u(20000L);
                aVar2.c((short) 286, new h[0]);
                aVar2.j();
                s.a(this, aVar, z.f74720a);
                if (((Boolean) s.b(this, aVar, b.e.f37404a, true)).booleanValue()) {
                    s.a(this, aVar, d0.f74686a);
                    L();
                }
                s.a(this, aVar, c0.f74684a);
                nj.a aVar3 = new nj.a(x());
                aVar3.c((short) 287, new h[0]);
                aVar3.j();
                s.a(this, aVar, b0.f74682a);
            } catch (Exception e11) {
                if ((e11 instanceof WaitForInput.CancelException) || (e11 instanceof ConversationException)) {
                    nj.a aVar4 = new nj.a(x());
                    aVar4.c((short) 287, new h[0]);
                    aVar4.j();
                }
                throw e11;
            }
        } while (!((Boolean) s.b(this, aVar, b.a.f37400a, true)).booleanValue());
    }
}
