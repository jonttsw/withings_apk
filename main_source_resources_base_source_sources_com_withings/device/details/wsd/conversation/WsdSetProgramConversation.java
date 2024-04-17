package com.withings.device.details.wsd.conversation;

import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.trace.Traces;
import com.withings.comm.wpp.generated.object.Alarm;
import com.withings.comm.wpp.generated.object.AlarmEnabled;
import com.withings.comm.wpp.generated.object.AlarmId;
import com.withings.comm.wpp.generated.object.ProgramSetting;
import com.withings.comm.wpp.generated.object.ProgramType;
import com.withings.comm.wpp.generated.object.ResponsiveLightMode;
import com.withings.comm.wpp.generated.object.ReturnCode;
import com.withings.comm.wpp.generated.object.WsdProgramId;
import com.withings.comm.wpp.generated.object.WsdProgramInfo;
import com.withings.comm.wpp.generated.object.WsdProgramSettings;
import com.withings.device.Device;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.util.log.Fail;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import org.jivesoftware.smack.sm.packet.StreamManagement;
import org.jivesoftware.smackx.xhtmlim.XHTMLText;
/* compiled from: WsdSetProgramConversation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/withings/device/details/wsd/conversation/WsdSetProgramConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "c", "d", com.huawei.hms.feature.dynamic.e.e.f28630a, "f", ConstantsWs.JSON_SESSION_KEY_GCONST, "h", "i", "j", "k", "l", "m", "n", "o", XHTMLText.P, XHTMLText.Q, StreamManagement.AckRequest.ELEMENT, "s", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class WsdSetProgramConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private b f37057f;

    /* renamed from: g  reason: collision with root package name */
    private final short f37058g;

    /* renamed from: h  reason: collision with root package name */
    private List<s> f37059h;

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class a implements s {

        /* renamed from: a  reason: collision with root package name */
        private final short f37060a;

        public a(short s11) {
            this.f37060a = s11;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            ResponsiveLightMode responsiveLightMode = new ResponsiveLightMode();
            responsiveLightMode.mode = this.f37060a;
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2327, responsiveLightMode);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public interface b extends WppDeviceConversation.b {
        void M1(WsdSetProgramConversation wsdSetProgramConversation, qj.l lVar);

        void P0(WsdSetProgramConversation wsdSetProgramConversation, qj.m mVar);

        void S(WsdSetProgramConversation wsdSetProgramConversation, WsdProgram wsdProgram);

        void S1(WsdSetProgramConversation wsdSetProgramConversation, short s11);

        void a3(WsdSetProgramConversation wsdSetProgramConversation);

        void f1(WsdSetProgramConversation wsdSetProgramConversation, ArrayList arrayList);

        void z2(WsdSetProgramConversation wsdSetProgramConversation);
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class c implements s {
        /* JADX WARN: Type inference failed for: r0v1, types: [nj.h, nj.a] */
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            ?? aVar = new nj.a(bVar.k());
            aVar.c((short) 2328, new com.withings.comm.wpp.h[0]);
            conversation.N().S1(conversation, ((ResponsiveLightMode) aVar.y(ResponsiveLightMode.class)).mode);
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class d implements s {

        /* renamed from: a  reason: collision with root package name */
        private final WsdProgram f37061a;

        /* renamed from: b  reason: collision with root package name */
        private final AlarmId f37062b;

        public d(WsdProgram wsdProgram, AlarmId alarmId) {
            this.f37061a = wsdProgram;
            this.f37062b = alarmId;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [nj.h, nj.a] */
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            WsdProgramId wsdProgramId = new WsdProgramId();
            WsdProgram wsdProgram = this.f37061a;
            wsdProgramId.f33287id = wsdProgram.d();
            wsdProgramId.type = wsdProgram.f31078d;
            ?? aVar = new nj.a(bVar.k());
            aVar.c((short) 2310, wsdProgramId, this.f37062b);
            WsdProgramSettings wsdProgramSettings = (WsdProgramSettings) aVar.y(WsdProgramSettings.class);
            wsdProgram.u(wsdProgramSettings.brightness);
            wsdProgram.F(wsdProgramSettings.volume);
            conversation.N().S(conversation, wsdProgram);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof d) && this.f37061a.d() == ((d) obj).f37061a.d()) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i11;
            int hashCode = this.f37061a.hashCode() * 31;
            AlarmId alarmId = this.f37062b;
            if (alarmId != null) {
                i11 = alarmId.hashCode();
            } else {
                i11 = 0;
            }
            return hashCode + i11;
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class e implements s {

        /* renamed from: a  reason: collision with root package name */
        private final short f37063a;

        public e(short s11) {
            this.f37063a = s11;
        }

        /* JADX WARN: Type inference failed for: r5v3, types: [nj.h, nj.a] */
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            Object obj;
            Object obj2;
            boolean z5;
            boolean z11;
            u.j(conversation, "conversation");
            WsdProgramId wsdProgramId = new WsdProgramId();
            short s11 = this.f37063a;
            wsdProgramId.type = s11;
            nj.c cVar = new nj.c(bVar.k());
            cVar.c((short) 2313, wsdProgramId);
            ArrayList A = cVar.A(WsdProgramInfo.class);
            ?? aVar = new nj.a(bVar.k());
            aVar.c((short) 2310, wsdProgramId);
            WsdProgramSettings wsdProgramSettings = (WsdProgramSettings) aVar.y(WsdProgramSettings.class);
            ArrayList arrayList = new ArrayList(x.y(A, 10));
            Iterator it = A.iterator();
            while (it.hasNext()) {
                WsdProgramInfo wsdProgramInfo = (WsdProgramInfo) it.next();
                WsdProgram wsdProgram = new WsdProgram();
                wsdProgram.v(wsdProgramInfo.f33288id);
                wsdProgram.f31078d = wsdProgramInfo.type;
                if (wsdProgramInfo.selected == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                wsdProgram.B(z5);
                if (wsdProgramInfo.available == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wsdProgram.t(z11);
                wsdProgram.A(wsdProgramInfo.progress);
                wsdProgram.u(wsdProgramSettings.brightness);
                wsdProgram.u(wsdProgramSettings.brightness);
                arrayList.add(wsdProgram);
            }
            ProgramType programType = new ProgramType();
            programType.program = s11;
            programType.subProgram = 0L;
            nj.c cVar2 = new nj.c(bVar.k());
            cVar2.c((short) 2310, programType);
            cVar2.C();
            ArrayList A2 = cVar2.A(ProgramSetting.class);
            Iterator it2 = arrayList.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((WsdProgram) obj2).d() == 129) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            WsdProgram wsdProgram2 = (WsdProgram) obj2;
            if (wsdProgram2 != null) {
                Iterator it3 = A2.iterator();
                while (it3.hasNext()) {
                    ProgramSetting programSetting = (ProgramSetting) it3.next();
                    short s12 = programSetting.setting;
                    if (s12 == 4) {
                        wsdProgram2.G(programSetting.data);
                    } else if (s12 == 8) {
                        wsdProgram2.H(programSetting.data);
                    }
                }
            }
            Iterator it4 = arrayList.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                if (((WsdProgram) next).d() == 128) {
                    obj = next;
                    break;
                }
            }
            WsdProgram wsdProgram3 = (WsdProgram) obj;
            if (wsdProgram3 != null) {
                Iterator it5 = A2.iterator();
                while (it5.hasNext()) {
                    ProgramSetting programSetting2 = (ProgramSetting) it5.next();
                    short s13 = programSetting2.setting;
                    if (s13 == 6) {
                        wsdProgram3.D(programSetting2.data);
                    } else if (s13 == 7) {
                        wsdProgram3.C(programSetting2.data);
                    }
                }
            }
            conversation.N().f1(conversation, arrayList);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof e) {
                if (this.f37063a == ((e) obj).f37063a) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f37063a;
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class f implements s {
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            conversation.N().P0(conversation, new sn.a(bVar).a());
        }

        public final boolean equals(Object obj) {
            return obj instanceof f;
        }

        public final int hashCode() {
            return f.class.hashCode();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class g implements s {
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2321, new com.withings.comm.wpp.h[0]);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class h implements s {
        /* JADX WARN: Type inference failed for: r2v1, types: [nj.h, nj.a] */
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            ?? aVar = new nj.a(bVar.k());
            aVar.c((short) 293, new com.withings.comm.wpp.h[0]);
            aVar.j();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = null;
            for (com.withings.comm.wpp.h hVar : aVar.D().d()) {
                if (hVar instanceof Alarm) {
                    qj.a aVar2 = new qj.a();
                    ArrayList arrayList3 = new ArrayList();
                    arrayList.add(aVar2);
                    aVar2.d(arrayList3);
                    aVar2.c((Alarm) hVar);
                    arrayList2 = arrayList3;
                } else if (!(hVar instanceof ProgramSetting)) {
                    continue;
                } else if (arrayList2 != null) {
                    arrayList2.add(hVar);
                } else {
                    throw new IllegalStateException("Received ProgramType before Alarm !".toString());
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Device f11 = kn.e.c().f(bVar.g());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                qj.a aVar3 = (qj.a) arrayList.get(i11);
                Alarm a11 = aVar3.a();
                com.withings.comm.trace.e.a().d(bVar, Traces.a.a(a11.hour, a11.minute, a11.wday, a11.mday, a11.month, a11.year, a11.span, false));
                i11++;
                arrayList4.add(qg.e.d(f11, aVar3, (short) i11));
            }
            Iterator it = arrayList4.iterator();
            while (it.hasNext()) {
                DeviceAlarm deviceAlarm = (DeviceAlarm) it.next();
                if (deviceAlarm.p() == 129 || deviceAlarm.p() == 128) {
                    ProgramType programType = new ProgramType();
                    programType.program = (short) 4;
                    programType.subProgram = deviceAlarm.j();
                    nj.c cVar = new nj.c(bVar.k());
                    cVar.c((short) 2310, programType);
                    cVar.C();
                    Iterator it2 = cVar.A(ProgramSetting.class).iterator();
                    while (it2.hasNext()) {
                        ProgramSetting programSetting = (ProgramSetting) it2.next();
                        short s11 = programSetting.setting;
                        if (s11 == 6) {
                            deviceAlarm.w0(programSetting.data);
                        } else if (s11 == 7) {
                            deviceAlarm.u0(programSetting.data);
                        } else if (s11 == 4) {
                            deviceAlarm.M0(programSetting.data);
                        } else if (s11 == 8) {
                            deviceAlarm.L0(programSetting.data);
                        }
                    }
                }
            }
            rg.b.b().h(conversation.r(), f11, arrayList4);
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class i implements s {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f37064a = true;

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            AlarmEnabled alarmEnabled = new AlarmEnabled();
            alarmEnabled.state = this.f37064a ? (short) 1 : (short) 0;
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2331, alarmEnabled);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class j implements s {

        /* renamed from: a  reason: collision with root package name */
        private final List<qj.a> f37065a;

        public j(ArrayList arrayList) {
            this.f37065a = arrayList;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            List<qj.a> list = this.f37065a;
            for (qj.a aVar : list) {
                Alarm a11 = aVar.a();
                com.withings.comm.trace.e.a().d(bVar, Traces.a.a(a11.hour, a11.minute, a11.wday, a11.mday, a11.month, a11.year, a11.span, true));
            }
            ArrayList arrayList = new ArrayList();
            for (qj.a aVar2 : list) {
                Alarm a12 = aVar2.a();
                u.i(a12, "getAlarm(...)");
                arrayList.add(a12);
                List<ProgramSetting> b10 = aVar2.b();
                u.i(b10, "getSettings(...)");
                arrayList.addAll(b10);
            }
            nj.a aVar3 = new nj.a(bVar.k());
            aVar3.b(arrayList, (short) 292);
            aVar3.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class k implements s {

        /* renamed from: a  reason: collision with root package name */
        private final WsdProgram f37066a;

        public k(WsdProgram program) {
            u.j(program, "program");
            this.f37066a = program;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            WsdProgramId wsdProgramId = new WsdProgramId();
            WsdProgram wsdProgram = this.f37066a;
            wsdProgramId.type = wsdProgram.f31078d;
            wsdProgramId.f33287id = wsdProgram.d();
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2312, wsdProgramId);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class l implements s {

        /* renamed from: a  reason: collision with root package name */
        private final WsdProgram f37067a;

        /* renamed from: b  reason: collision with root package name */
        private final int f37068b;

        public l(WsdProgram wsdProgram, int i11) {
            this.f37067a = wsdProgram;
            this.f37068b = i11;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            ArrayList arrayList = new ArrayList();
            WsdProgramId wsdProgramId = new WsdProgramId();
            WsdProgram wsdProgram = this.f37067a;
            wsdProgramId.type = wsdProgram.f31078d;
            wsdProgramId.f33287id = wsdProgram.d();
            arrayList.add(wsdProgramId);
            ProgramSetting programSetting = new ProgramSetting();
            programSetting.setting = (short) 4;
            programSetting.data = wsdProgram.j();
            arrayList.add(programSetting);
            int i11 = this.f37068b;
            if (i11 > 0) {
                AlarmId alarmId = new AlarmId();
                alarmId.f33236id = (short) i11;
                arrayList.add(alarmId);
            }
            nj.a aVar = new nj.a(bVar.k());
            aVar.b(arrayList, (short) 2312);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class m implements s {

        /* renamed from: a  reason: collision with root package name */
        private final WsdProgram f37069a;

        public m(WsdProgram wsdProgram) {
            this.f37069a = wsdProgram;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            WsdProgramInfo wsdProgramInfo = new WsdProgramInfo();
            WsdProgram wsdProgram = this.f37069a;
            wsdProgramInfo.f33288id = wsdProgram.d();
            wsdProgramInfo.type = wsdProgram.f31078d;
            wsdProgramInfo.selected = wsdProgram.r() ? (short) 1 : (short) 0;
            wsdProgramInfo.available = wsdProgram.l() ? (short) 1 : (short) 0;
            wsdProgramInfo.progress = wsdProgram.g();
            WsdProgramId wsdProgramId = new WsdProgramId();
            wsdProgramId.f33287id = wsdProgramInfo.f33288id;
            wsdProgramId.type = wsdProgramInfo.type;
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2307, wsdProgramId);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class n implements s {
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2315, new com.withings.comm.wpp.h[0]);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class o implements s {
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            nj.a aVar = new nj.a(bVar.k());
            aVar.c((short) 2308, new com.withings.comm.wpp.h[0]);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class p implements s {

        /* renamed from: a  reason: collision with root package name */
        private final DeviceAlarm f37070a;

        /* renamed from: b  reason: collision with root package name */
        private final short[] f37071b;

        public p(DeviceAlarm deviceAlarm, short... modifiedSettings) {
            u.j(deviceAlarm, "deviceAlarm");
            u.j(modifiedSettings, "modifiedSettings");
            this.f37070a = deviceAlarm;
            this.f37071b = modifiedSettings;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            short[] sArr = this.f37071b;
            short[] copyOf = Arrays.copyOf(sArr, sArr.length);
            DeviceAlarm deviceAlarm = this.f37070a;
            qj.a b10 = qg.e.b(deviceAlarm, copyOf);
            Alarm a11 = b10.a();
            AlarmId alarmId = new AlarmId();
            alarmId.f33236id = deviceAlarm.j();
            boolean j5 = kotlin.collections.l.j((short) 0, sArr);
            if (j5) {
                com.withings.comm.trace.e.a().d(bVar, Traces.a.a(a11.hour, a11.minute, a11.wday, a11.mday, a11.month, a11.year, a11.span, true));
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(alarmId);
            if (j5) {
                Alarm a12 = b10.a();
                u.i(a12, "getAlarm(...)");
                arrayList.add(a12);
            }
            List<ProgramSetting> b11 = b10.b();
            u.i(b11, "getSettings(...)");
            arrayList.addAll(b11);
            nj.a aVar = new nj.a(bVar.k());
            aVar.b(arrayList, (short) 297);
            aVar.j();
            deviceAlarm.f31069o = a11.mday;
            deviceAlarm.f31070p = a11.month;
            deviceAlarm.f31071q = a11.year;
            rg.b.b().k(conversation.r(), deviceAlarm, kn.e.c().f(bVar.g()));
            conversation.N().a3(conversation);
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class q implements s {

        /* renamed from: a  reason: collision with root package name */
        private final WsdProgram f37072a;

        /* renamed from: b  reason: collision with root package name */
        private final short[] f37073b;

        public q(WsdProgram wsdProgram, short... modifiedSettings) {
            u.j(modifiedSettings, "modifiedSettings");
            this.f37072a = wsdProgram;
            this.f37073b = modifiedSettings;
        }

        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            short[] sArr;
            u.j(conversation, "conversation");
            ProgramType programType = new ProgramType();
            WsdProgram wsdProgram = this.f37072a;
            programType.program = wsdProgram.f31078d;
            ArrayList arrayList = new ArrayList();
            for (short s11 : this.f37073b) {
                ProgramSetting programSetting = new ProgramSetting();
                programSetting.setting = s11;
                if (s11 == 3) {
                    programSetting.data = String.valueOf((int) wsdProgram.d());
                } else if (s11 == 2) {
                    programSetting.data = String.valueOf((int) wsdProgram.c());
                } else if (s11 == 1) {
                    programSetting.data = String.valueOf((int) wsdProgram.i());
                } else if (s11 == 4) {
                    programSetting.data = wsdProgram.j().toString();
                } else if (s11 == 8) {
                    programSetting.data = wsdProgram.k().toString();
                } else if (s11 == 5) {
                    Fail.j("Not yet implemented");
                }
                arrayList.add(programSetting);
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(programType);
            arrayList2.addAll(arrayList);
            nj.a aVar = new nj.a(bVar.k());
            aVar.b(arrayList2, (short) 2309);
            aVar.j();
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public static final class r implements s {

        /* renamed from: a  reason: collision with root package name */
        private final ProgramType f37074a;

        public r(ProgramType programType) {
            this.f37074a = programType;
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [nj.h, nj.a] */
        /* JADX WARN: Type inference failed for: r6v4, types: [qj.l, java.lang.Object] */
        @Override // com.withings.device.details.wsd.conversation.WsdSetProgramConversation.s
        public final void a(WsdSetProgramConversation conversation, cj.b bVar) throws IOException {
            u.j(conversation, "conversation");
            ?? aVar = new nj.a(bVar.k());
            aVar.c((short) 2329, this.f37074a);
            aVar.j();
            ?? obj = new Object();
            for (com.withings.comm.wpp.h hVar : aVar.D().d()) {
                if (hVar instanceof ReturnCode) {
                    obj.d((ReturnCode) hVar);
                } else if (hVar instanceof ProgramSetting) {
                    ProgramSetting programSetting = (ProgramSetting) hVar;
                    if (programSetting.setting == 7) {
                        obj.c(programSetting.data);
                    }
                }
            }
            conversation.N().M1(conversation, obj);
        }
    }

    /* compiled from: WsdSetProgramConversation.kt */
    /* loaded from: classes3.dex */
    public interface s {
        void a(WsdSetProgramConversation wsdSetProgramConversation, cj.b bVar) throws IOException;
    }

    public WsdSetProgramConversation(b delegate, short s11) {
        u.j(delegate, "delegate");
        this.f37057f = delegate;
        this.f37058g = s11;
    }

    private final void L(s sVar) {
        List<s> list = this.f37059h;
        if (list != null) {
            if (!list.contains(sVar)) {
                list.add(sVar);
            }
            G(Boolean.TRUE);
        }
    }

    private final void M() throws IOException {
        while (true) {
            List<s> list = this.f37059h;
            u.g(list);
            if (!list.isEmpty()) {
                List<s> list2 = this.f37059h;
                u.g(list2);
                cj.b x11 = x();
                u.i(x11, "getWppDevice(...)");
                list2.remove(0).a(this, x11);
            } else {
                return;
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        B(60000L, false, false);
        this.f37059h = Collections.synchronizedList(new ArrayList());
        e eVar = new e(this.f37058g);
        cj.b x11 = x();
        u.i(x11, "getWppDevice(...)");
        eVar.a(this, x11);
        cj.b x12 = x();
        u.i(x12, "getWppDevice(...)");
        this.f37057f.P0(this, new sn.a(x12).a());
        E(new WsdInitConversation());
        this.f37057f.z2(this);
        while (true) {
            Object K = K();
            u.i(K, "waitForInput(...)");
            if (((Boolean) K).booleanValue()) {
                M();
            } else {
                M();
                return;
            }
        }
    }

    public final b N() {
        return this.f37057f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void O() {
        L(new Object());
    }

    public void P(WsdProgram wsdProgram, AlarmId alarmId) {
        L(new d(wsdProgram, alarmId));
    }

    public void Q(short s11) {
        L(new e(s11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void R() {
        L(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void S() {
        L(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void T() {
        L(new i());
        L(new Object());
    }

    public final void U(b bVar) {
        u.j(bVar, "<set-?>");
        this.f37057f = bVar;
    }

    public void V(short s11) {
        L(new a(s11));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public final void W(ArrayList arrayList) {
        L(new j(arrayList));
        L(new Object());
    }

    public void X(WsdProgram program) {
        u.j(program, "program");
        L(new k(program));
    }

    public void Y(WsdProgram wsdProgram, int i11) {
        L(new l(wsdProgram, i11));
    }

    public void Z(WsdProgram wsdProgram) {
        L(new m(wsdProgram));
    }

    public void a0() {
        G(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void b0() {
        L(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.withings.device.details.wsd.conversation.WsdSetProgramConversation$s, java.lang.Object] */
    public void c0() {
        L(new Object());
    }

    public void d0(DeviceAlarm deviceAlarm, short... sArr) {
        u.j(deviceAlarm, "deviceAlarm");
        L(new p(deviceAlarm, Arrays.copyOf(sArr, sArr.length)));
    }

    public void e0(WsdProgram wsdProgram, short... sArr) {
        L(new q(wsdProgram, Arrays.copyOf(sArr, sArr.length)));
    }

    public void f0(ProgramType programType) {
        L(new r(programType));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f37057f;
    }
}
