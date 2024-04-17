package com.withings.wiscale2.device.wpa.wpa02.conversation;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.d;
import com.withings.comm.wpp.f;
import com.withings.comm.wpp.generated.object.CartridgeState;
import com.withings.comm.wpp.generated.object.DeviceState;
import com.withings.comm.wpp.generated.object.Id;
import com.withings.comm.wpp.generated.object.Null;
import com.withings.comm.wpp.generated.object.StripCount;
import com.withings.comm.wpp.h;
import com.withings.webservices.legacy.withings.model.session.DeviceSession;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.i0;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
/* compiled from: Wpa02LaunchMeasurementConversation.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02LaunchMeasurementConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "Lcom/withings/comm/wpp/d$b;", "MeasurementError", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class Wpa02LaunchMeasurementConversation extends WppDeviceConversation implements d.b {

    /* renamed from: f  reason: collision with root package name */
    private final a f55033f;

    /* renamed from: g  reason: collision with root package name */
    private List<Integer> f55034g = i0.f76187a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Wpa02LaunchMeasurementConversation.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/wiscale2/device/wpa/wpa02/conversation/Wpa02LaunchMeasurementConversation$MeasurementError;", "", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes5.dex */
    public static final class MeasurementError {

        /* renamed from: a  reason: collision with root package name */
        public static final MeasurementError f55035a;

        /* renamed from: b  reason: collision with root package name */
        public static final MeasurementError f55036b;

        /* renamed from: c  reason: collision with root package name */
        public static final MeasurementError f55037c;

        /* renamed from: d  reason: collision with root package name */
        public static final MeasurementError f55038d;

        /* renamed from: e  reason: collision with root package name */
        public static final MeasurementError f55039e;

        /* renamed from: f  reason: collision with root package name */
        public static final MeasurementError f55040f;

        /* renamed from: g  reason: collision with root package name */
        public static final MeasurementError f55041g;

        /* renamed from: h  reason: collision with root package name */
        public static final MeasurementError f55042h;

        /* renamed from: i  reason: collision with root package name */
        public static final MeasurementError f55043i;

        /* renamed from: j  reason: collision with root package name */
        private static final /* synthetic */ MeasurementError[] f55044j;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Enum, com.withings.wiscale2.device.wpa.wpa02.conversation.Wpa02LaunchMeasurementConversation$MeasurementError] */
        static {
            ?? r02 = new Enum("UnreadableCartridge", 0);
            f55035a = r02;
            ?? r12 = new Enum("InvalidCartridge", 1);
            f55036b = r12;
            ?? r22 = new Enum("InactiveCartridge", 2);
            f55037c = r22;
            ?? r32 = new Enum("CartridgeBeingActivated", 3);
            f55038d = r32;
            ?? r42 = new Enum("LowBattery", 4);
            f55039e = r42;
            ?? r52 = new Enum("Charging", 5);
            f55040f = r52;
            ?? r62 = new Enum("MeasurementInProgress", 6);
            f55041g = r62;
            ?? r7 = new Enum("HoodOpened", 7);
            f55042h = r7;
            ?? r82 = new Enum("Cleansing", 8);
            f55043i = r82;
            MeasurementError[] measurementErrorArr = {r02, r12, r22, r32, r42, r52, r62, r7, r82};
            f55044j = measurementErrorArr;
            sm0.b.a(measurementErrorArr);
        }

        private MeasurementError() {
            throw null;
        }

        public static MeasurementError valueOf(String str) {
            return (MeasurementError) Enum.valueOf(MeasurementError.class, str);
        }

        public static MeasurementError[] values() {
            return (MeasurementError[]) f55044j.clone();
        }
    }

    /* compiled from: Wpa02LaunchMeasurementConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void O();

        void c0(MeasurementError measurementError);

        void e(ArrayList arrayList);
    }

    public Wpa02LaunchMeasurementConversation(a aVar) {
        this.f55033f = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    protected final void A() {
        d k11;
        cj.b x11 = x();
        if (x11 != null && (k11 = x11.k()) != null) {
            k11.i(this);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [nj.h, nj.a] */
    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() {
        int intValue;
        MeasurementError measurementError;
        a aVar = this.f55033f;
        x().k().b(this);
        try {
            nj.c cVar = new nj.c(x());
            cVar.c((short) 2463, new h[0]);
            aVar.e(cVar.A(StripCount.class));
        } catch (Exception e11) {
            x70.b.n(e11);
            aVar.c0(MeasurementError.f55036b);
        }
        B(DeviceSession.DEVICE_SESSION_TTL, true, false);
        do {
            Object K = K();
            u.i(K, "waitForInput(...)");
            intValue = ((Number) K).intValue();
            if (intValue == 1) {
                List<Integer> list = this.f55034g;
                ArrayList arrayList = new ArrayList(x.y(list, 10));
                for (Number number : list) {
                    arrayList.add(new Id().setValue(number.intValue()));
                }
                ArrayList m02 = x.m0(new Null(), arrayList);
                ?? aVar2 = new nj.a(x());
                aVar2.b(m02, (short) 2460);
                aVar2.j();
                DeviceState deviceState = (DeviceState) aVar2.B(DeviceState.class);
                short s11 = ((CartridgeState) aVar2.B(CartridgeState.class)).state;
                if (s11 == 2) {
                    measurementError = MeasurementError.f55035a;
                } else if (s11 == 3) {
                    measurementError = MeasurementError.f55036b;
                } else if (s11 == 4) {
                    measurementError = MeasurementError.f55037c;
                } else if (s11 == 5) {
                    measurementError = MeasurementError.f55038d;
                } else {
                    int i11 = (int) deviceState.value;
                    if ((i11 & 4) != 0) {
                        measurementError = MeasurementError.f55039e;
                    } else if ((i11 & 8) != 0) {
                        measurementError = MeasurementError.f55040f;
                    } else if ((i11 & 16) != 0) {
                        measurementError = MeasurementError.f55041g;
                    } else if ((i11 & 32) != 0) {
                        measurementError = MeasurementError.f55042h;
                    } else if ((i11 & 64) != 0) {
                        measurementError = MeasurementError.f55043i;
                    } else {
                        measurementError = null;
                    }
                }
                if (measurementError != null) {
                    aVar.c0(measurementError);
                    continue;
                } else {
                    aVar.O();
                    continue;
                }
            }
        } while (intValue != 1);
    }

    public final void L(List<Integer> stripTypes) {
        u.j(stripTypes, "stripTypes");
        this.f55034g = stripTypes;
        G(1);
    }

    @Override // com.withings.comm.wpp.d.b
    public final void i(d dVar) {
        this.f55033f.getClass();
    }

    @Override // com.withings.comm.wpp.d.b
    public final void o(d dVar, f fVar) {
    }
}
