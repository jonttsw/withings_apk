package com.withings.wiscale2.device.common.handcalibration.v2;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.device.setup.android.setup.init.time.SendTimeConversation;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: HandsCalibrationConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/v2/HandsCalibrationConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Action", "State", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class HandsCalibrationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private e f52746f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f52747g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f52748h;

    /* renamed from: i  reason: collision with root package name */
    private State f52749i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f52750j;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HandsCalibrationConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/v2/HandsCalibrationConversation$Action;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class Action {

        /* renamed from: a  reason: collision with root package name */
        public static final Action f52751a;

        /* renamed from: b  reason: collision with root package name */
        public static final Action f52752b;

        /* renamed from: c  reason: collision with root package name */
        public static final Action f52753c;

        /* renamed from: d  reason: collision with root package name */
        private static final /* synthetic */ Action[] f52754d;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$Action] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$Action] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$Action] */
        static {
            ?? r02 = new Enum("ACTION_END", 0);
            f52751a = r02;
            ?? r12 = new Enum("ACTION_UNBLOCK_HAND", 1);
            f52752b = r12;
            ?? r22 = new Enum("ACTION_MOVE_HAND", 2);
            f52753c = r22;
            Action[] actionArr = {r02, r12, r22};
            f52754d = actionArr;
            sm0.b.a(actionArr);
        }

        private Action() {
            throw null;
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) f52754d.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: HandsCalibrationConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/common/handcalibration/v2/HandsCalibrationConversation$State;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class State {

        /* renamed from: a  reason: collision with root package name */
        public static final State f52755a;

        /* renamed from: b  reason: collision with root package name */
        public static final State f52756b;

        /* renamed from: c  reason: collision with root package name */
        public static final State f52757c;

        /* renamed from: d  reason: collision with root package name */
        public static final State f52758d;

        /* renamed from: e  reason: collision with root package name */
        public static final State f52759e;

        /* renamed from: f  reason: collision with root package name */
        public static final State f52760f;

        /* renamed from: g  reason: collision with root package name */
        private static final /* synthetic */ State[] f52761g;

        /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r2v2, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r3v2, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r4v2, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        /* JADX WARN: Type inference failed for: r5v2, types: [com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation$State, java.lang.Enum] */
        static {
            ?? r02 = new Enum("AUTO_CALIBRATING", 0);
            f52755a = r02;
            ?? r12 = new Enum("ASKING_MANUAL_CALIBRATION", 1);
            f52756b = r12;
            ?? r22 = new Enum("MANUAL_CALIBRATING", 2);
            f52757c = r22;
            ?? r32 = new Enum("CALIBRATION_ENDING", 3);
            f52758d = r32;
            ?? r42 = new Enum("CALIBRATION_ENDED", 4);
            f52759e = r42;
            ?? r52 = new Enum("UNBLOCKING_HAND", 5);
            f52760f = r52;
            State[] stateArr = {r02, r12, r22, r32, r42, r52};
            f52761g = stateArr;
            sm0.b.a(stateArr);
        }

        private State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f52761g.clone();
        }
    }

    public HandsCalibrationConversation(e eVar, boolean z5, boolean z11) {
        this.f52746f = eVar;
        this.f52747g = z5;
        this.f52748h = z11;
    }

    private final void M() {
        Action action;
        Action action2;
        Action action3;
        do {
            nm0.j jVar = (nm0.j) K();
            action = null;
            if (jVar != null) {
                action2 = (Action) jVar.c();
            } else {
                action2 = null;
            }
            if (action2 == Action.f52752b) {
                this.f52749i = State.f52760f;
                this.f52746f.h0(this);
                nj.a aVar = new nj.a(x());
                aVar.c((short) 2418, new com.withings.comm.wpp.h[0]);
                aVar.j();
                this.f52749i = State.f52757c;
                this.f52746f.g2(this);
            } else {
                if (jVar != null) {
                    action3 = (Action) jVar.c();
                } else {
                    action3 = null;
                }
                if (action3 == Action.f52753c) {
                    Object d11 = jVar.d();
                    u.h(d11, "null cannot be cast to non-null type com.withings.comm.wpp.generated.object.HandsMove");
                    nj.a aVar2 = new nj.a(x());
                    aVar2.c((short) 284, (HandsMove) d11);
                    aVar2.j();
                    this.f52746f.u0(this);
                }
            }
            if (jVar != null) {
                action = (Action) jVar.c();
            }
        } while (action != Action.f52751a);
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        com.withings.comm.trace.e a11 = com.withings.comm.trace.e.a();
        u.i(a11, "get(...)");
        E(new SendTimeConversation(a11));
        B(120000L, this.f52747g, this.f52748h);
        while (!this.f52750j) {
            try {
                this.f52749i = State.f52755a;
                this.f52746f.A(this);
                nj.a aVar = new nj.a(x());
                aVar.u(20000L);
                aVar.c((short) 286, new com.withings.comm.wpp.h[0]);
                aVar.j();
                this.f52749i = State.f52756b;
                this.f52746f.g2(this);
                Boolean bool = (Boolean) K();
                u.g(bool);
                if (bool.booleanValue()) {
                    this.f52749i = State.f52757c;
                    this.f52746f.n2(this);
                    M();
                }
                this.f52749i = State.f52758d;
                this.f52746f.s2(this);
                nj.a aVar2 = new nj.a(x());
                aVar2.c((short) 287, new com.withings.comm.wpp.h[0]);
                aVar2.j();
                this.f52749i = State.f52759e;
                this.f52746f.Q0(this);
                Object K = K();
                u.i(K, "waitForInput(...)");
                this.f52750j = ((Boolean) K).booleanValue();
            } catch (Exception e11) {
                if ((e11 instanceof WaitForInput.CancelException) || (e11 instanceof ConversationException)) {
                    nj.a aVar3 = new nj.a(x());
                    aVar3.c((short) 287, new com.withings.comm.wpp.h[0]);
                    aVar3.j();
                }
                throw e11;
            }
        }
    }

    public final State L() {
        return this.f52749i;
    }

    public final void N(g gVar) {
        this.f52746f = gVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f52746f;
    }
}
