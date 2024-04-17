package com.withings.device.details.wsd.conversation;

import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.AlarmId;
import com.withings.comm.wpp.generated.object.ProgramType;
import com.withings.device.details.wsd.conversation.WsdSetProgramConversation;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import qj.l;
import qj.m;
/* compiled from: DummyWsdSetProgramConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/device/details/wsd/conversation/DummyWsdSetProgramConversation;", "Lcom/withings/device/details/wsd/conversation/WsdSetProgramConversation;", "<init>", "()V", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DummyWsdSetProgramConversation extends WsdSetProgramConversation {
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$b, java.lang.Object] */
    public DummyWsdSetProgramConversation() {
        super(new Object(), (short) 0);
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void X(WsdProgram program) {
        u.j(program, "program");
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void d0(DeviceAlarm deviceAlarm, short... sArr) {
        u.j(deviceAlarm, "deviceAlarm");
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void O() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void R() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void S() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void T() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void a0() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void b0() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void c0() {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void Q(short s11) {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void V(short s11) {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void Z(WsdProgram wsdProgram) {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void f0(ProgramType programType) {
    }

    /* compiled from: DummyWsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a implements WsdSetProgramConversation.b {
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void M1(WsdSetProgramConversation conversation, l lVar) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void P0(WsdSetProgramConversation conversation, m mVar) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void S(WsdSetProgramConversation conversation, WsdProgram program) {
            u.j(conversation, "conversation");
            u.j(program, "program");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void S1(WsdSetProgramConversation conversation, short s11) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void a3(WsdSetProgramConversation conversation) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void f1(WsdSetProgramConversation conversation, ArrayList arrayList) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.b
        public final void z2(WsdSetProgramConversation conversation) {
            u.j(conversation, "conversation");
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
        public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
        }
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void P(WsdProgram wsdProgram, AlarmId alarmId) {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void Y(WsdProgram wsdProgram, int i11) {
    }

    @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation
    public final void e0(WsdProgram wsdProgram, short... sArr) {
    }
}
