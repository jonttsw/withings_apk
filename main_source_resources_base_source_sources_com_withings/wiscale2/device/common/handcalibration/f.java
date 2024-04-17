package com.withings.wiscale2.device.common.handcalibration;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.devicesetup.ui.LottieData;
import com.withings.wiscale2.C1987R;
import fl.o;
import fl.p;
import java.util.List;
import kotlin.jvm.internal.u;
import nm0.j;
/* compiled from: HandsCalibrationPresenter.kt */
/* loaded from: classes5.dex */
public final class f implements lc0.i {

    /* renamed from: a  reason: collision with root package name */
    private h f52698a;

    /* renamed from: b  reason: collision with root package name */
    private HandsCalibrationConversation f52699b;

    /* renamed from: c  reason: collision with root package name */
    private List<HandCalibration> f52700c;

    /* renamed from: d  reason: collision with root package name */
    private int f52701d;

    /* renamed from: e  reason: collision with root package name */
    private int f52702e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f52703f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52704g;

    /* renamed from: h  reason: collision with root package name */
    private Exception f52705h;

    /* compiled from: HandsCalibrationPresenter.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f52706a;

        /* renamed from: b  reason: collision with root package name */
        private final int f52707b;

        /* renamed from: c  reason: collision with root package name */
        private final int f52708c;

        /* renamed from: d  reason: collision with root package name */
        private final int f52709d;

        /* renamed from: e  reason: collision with root package name */
        private final LottieData f52710e;

        public a(int i11, int i12, int i13, int i14, LottieData lottieData) {
            this.f52706a = i11;
            this.f52707b = i12;
            this.f52708c = i13;
            this.f52709d = i14;
            this.f52710e = lottieData;
        }

        public final int a() {
            return this.f52709d;
        }

        public final LottieData b() {
            return this.f52710e;
        }

        public final int c() {
            return this.f52708c;
        }

        public final int d() {
            return this.f52707b;
        }

        public final int e() {
            return this.f52706a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f52706a == aVar.f52706a && this.f52707b == aVar.f52707b && this.f52708c == aVar.f52708c && this.f52709d == aVar.f52709d && u.e(this.f52710e, aVar.f52710e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int a11 = androidx.appcompat.app.h.a(this.f52709d, androidx.appcompat.app.h.a(this.f52708c, androidx.appcompat.app.h.a(this.f52707b, Integer.hashCode(this.f52706a) * 31, 31), 31), 31);
            LottieData lottieData = this.f52710e;
            if (lottieData == null) {
                hashCode = 0;
            } else {
                hashCode = lottieData.hashCode();
            }
            return a11 + hashCode;
        }

        public final String toString() {
            return "HandsCalibrationInformation(titleResId=" + this.f52706a + ", subtitleResId=" + this.f52707b + ", mainActionResId=" + this.f52708c + ", imageResId=" + this.f52709d + ", lottie=" + this.f52710e + ")";
        }
    }

    public static final void a(f fVar, HandsCalibrationConversation handsCalibrationConversation, Exception exc) {
        h hVar;
        fVar.getClass();
        if (((exc instanceof WaitForInput.CancelException) || (exc instanceof ConversationException)) && (hVar = fVar.f52698a) != null) {
            hVar.S2(fVar);
        }
        h hVar2 = fVar.f52698a;
        if (hVar2 != null) {
            hVar2.F0(fVar, handsCalibrationConversation, exc);
        }
    }

    @Override // lc0.i
    public final void D1(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        e(conversation);
    }

    @Override // lc0.i
    public final void N(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        this.f52703f = false;
    }

    public final void b() {
        int i11 = this.f52701d + 1;
        this.f52701d = i11;
        List<HandCalibration> list = this.f52700c;
        if (list != null) {
            if (i11 < list.size()) {
                h hVar = this.f52698a;
                if (hVar != null) {
                    List<HandCalibration> list2 = this.f52700c;
                    if (list2 != null) {
                        hVar.D2(this, list2.get(this.f52701d));
                        return;
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                return;
            }
            HandsCalibrationConversation handsCalibrationConversation = this.f52699b;
            if (handsCalibrationConversation != null && handsCalibrationConversation.L() && !this.f52704g) {
                this.f52704g = true;
                HandsCalibrationConversation handsCalibrationConversation2 = this.f52699b;
                if (handsCalibrationConversation2 != null) {
                    handsCalibrationConversation2.G(null);
                }
                h hVar2 = this.f52698a;
                if (hVar2 != null) {
                    hVar2.q2(this);
                    return;
                }
                return;
            }
            return;
        }
        u.s("handsCalibrations");
        throw null;
    }

    public final boolean c() {
        boolean z5;
        int i11 = this.f52701d;
        if (i11 > 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            int i12 = i11 - 1;
            this.f52701d = i12;
            h hVar = this.f52698a;
            if (hVar != null) {
                List<HandCalibration> list = this.f52700c;
                if (list != null) {
                    hVar.D2(this, list.get(i12));
                } else {
                    u.s("handsCalibrations");
                    throw null;
                }
            }
        }
        return z5;
    }

    public final void d(int i11) {
        if (!this.f52704g) {
            this.f52702e += i11;
            if (!this.f52703f) {
                this.f52703f = true;
                HandsCalibrationConversation handsCalibrationConversation = this.f52699b;
                if (handsCalibrationConversation != null) {
                    List<HandCalibration> list = this.f52700c;
                    if (list != null) {
                        short f11 = list.get(this.f52701d).f();
                        HandsMove handsMove = new HandsMove();
                        handsMove.hand = f11;
                        handsMove.nbSteps = (short) this.f52702e;
                        handsCalibrationConversation.G(handsMove);
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                this.f52702e = 0;
            }
        }
    }

    public final void e(HandsCalibrationConversation handsCalibrationConversation) {
        h hVar;
        this.f52699b = handsCalibrationConversation;
        if (handsCalibrationConversation != null && handsCalibrationConversation.x().i() != null) {
            p a11 = p.f67672b.a();
            cj.b x11 = handsCalibrationConversation.x();
            u.i(x11, "getWppDevice(...)");
            o f11 = a11.f(x11);
            u.h(f11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.handcalibration.DeviceModelWithHandCalibration");
            lc0.a aVar = (lc0.a) f11;
            a aVar2 = new a(aVar.h(), aVar.J(), C1987R.string.setup_deviceConnected_calibrate, aVar.z(), aVar.u());
            this.f52700c = aVar.p();
            if (handsCalibrationConversation.L() && (hVar = this.f52698a) != null) {
                List<HandCalibration> list = this.f52700c;
                if (list != null) {
                    hVar.e2(this, aVar2, list.get(this.f52701d));
                } else {
                    u.s("handsCalibrations");
                    throw null;
                }
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        h hVar;
        u.j(conversation, "conversation");
        HandsCalibrationConversation handsCalibrationConversation = (HandsCalibrationConversation) conversation;
        e(handsCalibrationConversation);
        this.f52705h = exc;
        if (((exc instanceof WaitForInput.CancelException) || (exc instanceof ConversationException)) && (hVar = this.f52698a) != null) {
            hVar.S2(this);
        }
        h hVar2 = this.f52698a;
        if (hVar2 != null) {
            hVar2.F0(this, handsCalibrationConversation, exc);
        }
    }

    public final void f(h hVar) {
        this.f52698a = hVar;
        if (hVar != null) {
            Exception exc = this.f52705h;
            if (exc != null) {
                cr.a.a(new j(this.f52699b, exc), new g(this));
                return;
            }
            HandsCalibrationConversation handsCalibrationConversation = this.f52699b;
            if (handsCalibrationConversation != null && handsCalibrationConversation.L()) {
                if (this.f52704g) {
                    h hVar2 = this.f52698a;
                    if (hVar2 != null) {
                        hVar2.q2(this);
                        return;
                    }
                    return;
                }
                h hVar3 = this.f52698a;
                if (hVar3 != null) {
                    List<HandCalibration> list = this.f52700c;
                    if (list != null) {
                        hVar3.D2(this, list.get(this.f52701d));
                        return;
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                return;
            }
            h hVar4 = this.f52698a;
            if (hVar4 != null) {
                hVar4.n1(this);
            }
        }
    }

    @Override // lc0.i
    public final void t2(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        h hVar = this.f52698a;
        if (hVar != null) {
            hVar.S2(this);
        }
    }
}
