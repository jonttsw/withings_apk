package com.withings.wiscale2.device.common.handcalibration.v2;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.HandsMove;
import com.withings.wiscale2.device.common.handcalibration.HandCalibration;
import com.withings.wiscale2.device.common.handcalibration.v2.HandsCalibrationConversation;
import fl.o;
import java.util.List;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: HandsCalibrationPresenter.kt */
/* loaded from: classes5.dex */
public final class g implements e {

    /* renamed from: a  reason: collision with root package name */
    private h f52776a;

    /* renamed from: b  reason: collision with root package name */
    private HandsCalibrationConversation f52777b;

    /* renamed from: c  reason: collision with root package name */
    private List<HandCalibration> f52778c;

    /* renamed from: d  reason: collision with root package name */
    private int f52779d;

    /* renamed from: e  reason: collision with root package name */
    private int f52780e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f52781f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f52782g;

    /* renamed from: h  reason: collision with root package name */
    private Exception f52783h;

    /* compiled from: HandsCalibrationPresenter.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f52784a;

        static {
            int[] iArr = new int[HandsCalibrationConversation.State.values().length];
            try {
                HandsCalibrationConversation.State state = HandsCalibrationConversation.State.f52755a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                HandsCalibrationConversation.State state2 = HandsCalibrationConversation.State.f52755a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                HandsCalibrationConversation.State state3 = HandsCalibrationConversation.State.f52755a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                HandsCalibrationConversation.State state4 = HandsCalibrationConversation.State.f52755a;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                HandsCalibrationConversation.State state5 = HandsCalibrationConversation.State.f52755a;
                iArr[3] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                HandsCalibrationConversation.State state6 = HandsCalibrationConversation.State.f52755a;
                iArr[4] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f52784a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HandsCalibrationPresenter.kt */
    /* loaded from: classes5.dex */
    public static final class b extends w implements p<HandsCalibrationConversation, Exception, y> {
        b() {
            super(2);
        }

        @Override // ym0.p
        public final y invoke(HandsCalibrationConversation handsCalibrationConversation, Exception exc) {
            HandsCalibrationConversation conversation = handsCalibrationConversation;
            Exception exception = exc;
            u.j(conversation, "conversation");
            u.j(exception, "exception");
            g.a(g.this, conversation, exception);
            return y.f85009a;
        }
    }

    public static final void a(g gVar, HandsCalibrationConversation handsCalibrationConversation, Exception exc) {
        h hVar;
        gVar.getClass();
        if (((exc instanceof WaitForInput.CancelException) || (exc instanceof ConversationException)) && (hVar = gVar.f52776a) != null) {
            hVar.v(gVar);
        }
        h hVar2 = gVar.f52776a;
        if (hVar2 != null) {
            hVar2.T0(gVar, handsCalibrationConversation, exc);
        }
    }

    private final void j() {
        HandsCalibrationConversation.State state;
        int i11;
        Exception exc = this.f52783h;
        if (exc != null) {
            cr.a.a(new nm0.j(this.f52777b, exc), new b());
            return;
        }
        HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
        if (handsCalibrationConversation != null) {
            state = handsCalibrationConversation.L();
        } else {
            state = null;
        }
        if (state == null) {
            i11 = -1;
        } else {
            i11 = a.f52784a[state.ordinal()];
        }
        switch (i11) {
            case 1:
                h hVar = this.f52776a;
                if (hVar != null) {
                    hVar.L(this);
                    return;
                }
                return;
            case 2:
                h hVar2 = this.f52776a;
                if (hVar2 != null) {
                    hVar2.C(this);
                    return;
                }
                return;
            case 3:
                h hVar3 = this.f52776a;
                if (hVar3 != null) {
                    List<HandCalibration> list = this.f52778c;
                    if (list != null) {
                        hVar3.V2(this, list.get(this.f52779d));
                        return;
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                return;
            case 4:
                h hVar4 = this.f52776a;
                if (hVar4 != null) {
                    hVar4.N2(this);
                    return;
                }
                return;
            case 5:
                h hVar5 = this.f52776a;
                if (hVar5 != null) {
                    hVar5.l2(this);
                    return;
                }
                return;
            case 6:
                h hVar6 = this.f52776a;
                if (hVar6 != null) {
                    hVar6.v(this);
                    return;
                }
                return;
            default:
                h hVar7 = this.f52776a;
                if (hVar7 != null) {
                    hVar7.L(this);
                    return;
                }
                return;
        }
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void A(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void Q0(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    public final void b(boolean z5) {
        this.f52779d = 0;
        this.f52782g = false;
        HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
        if (handsCalibrationConversation != null) {
            handsCalibrationConversation.G(Boolean.valueOf(z5));
        }
    }

    public final void c() {
        HandsCalibrationConversation.State state;
        int i11 = this.f52779d + 1;
        this.f52779d = i11;
        List<HandCalibration> list = this.f52778c;
        if (list != null) {
            if (i11 < list.size()) {
                h hVar = this.f52776a;
                if (hVar != null) {
                    List<HandCalibration> list2 = this.f52778c;
                    if (list2 != null) {
                        hVar.V2(this, list2.get(this.f52779d));
                        return;
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                return;
            }
            HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
            if (handsCalibrationConversation != null) {
                state = handsCalibrationConversation.L();
            } else {
                state = null;
            }
            if (state == HandsCalibrationConversation.State.f52757c && !this.f52782g) {
                this.f52782g = true;
                HandsCalibrationConversation handsCalibrationConversation2 = this.f52777b;
                if (handsCalibrationConversation2 != null) {
                    handsCalibrationConversation2.G(new nm0.j(HandsCalibrationConversation.Action.f52751a, null));
                }
                h hVar2 = this.f52776a;
                if (hVar2 != null) {
                    hVar2.p3(this);
                    return;
                }
                return;
            }
            return;
        }
        u.s("handsCalibrations");
        throw null;
    }

    public final boolean d() {
        HandsCalibrationConversation.State state;
        boolean z5;
        boolean z11;
        HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
        if (handsCalibrationConversation != null) {
            state = handsCalibrationConversation.L();
        } else {
            state = null;
        }
        if (state == HandsCalibrationConversation.State.f52757c) {
            z5 = true;
        } else {
            z5 = false;
        }
        int i11 = this.f52779d;
        if (i11 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z5 && z11) {
            int i12 = i11 - 1;
            this.f52779d = i12;
            h hVar = this.f52776a;
            if (hVar != null) {
                List<HandCalibration> list = this.f52778c;
                if (list != null) {
                    hVar.V2(this, list.get(i12));
                } else {
                    u.s("handsCalibrations");
                    throw null;
                }
            }
        }
        if (!z5 || !z11) {
            return false;
        }
        return true;
    }

    public final void e(boolean z5) {
        HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
        if (handsCalibrationConversation != null) {
            if (z5) {
                handsCalibrationConversation.G(Boolean.TRUE);
            } else {
                handsCalibrationConversation.G(Boolean.FALSE);
            }
        }
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        h hVar;
        u.j(conversation, "conversation");
        HandsCalibrationConversation handsCalibrationConversation = (HandsCalibrationConversation) conversation;
        g(handsCalibrationConversation);
        this.f52783h = exc;
        if (((exc instanceof WaitForInput.CancelException) || (exc instanceof ConversationException)) && (hVar = this.f52776a) != null) {
            hVar.v(this);
        }
        h hVar2 = this.f52776a;
        if (hVar2 != null) {
            hVar2.T0(this, handsCalibrationConversation, exc);
        }
    }

    public final void f(int i11) {
        if (!this.f52782g) {
            this.f52780e += i11;
            if (!this.f52781f) {
                this.f52781f = true;
                HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
                if (handsCalibrationConversation != null) {
                    List<HandCalibration> list = this.f52778c;
                    if (list != null) {
                        short f11 = list.get(this.f52779d).f();
                        HandsMove handsMove = new HandsMove();
                        handsMove.hand = f11;
                        handsMove.nbSteps = (short) this.f52780e;
                        handsCalibrationConversation.G(new nm0.j(HandsCalibrationConversation.Action.f52753c, handsMove));
                    } else {
                        u.s("handsCalibrations");
                        throw null;
                    }
                }
                this.f52780e = 0;
            }
        }
    }

    public final void g(HandsCalibrationConversation handsCalibrationConversation) {
        this.f52777b = handsCalibrationConversation;
        if (handsCalibrationConversation != null && handsCalibrationConversation.x().i() != null) {
            fl.p a11 = fl.p.f67672b.a();
            cj.b x11 = handsCalibrationConversation.x();
            u.i(x11, "getWppDevice(...)");
            o f11 = a11.f(x11);
            u.h(f11, "null cannot be cast to non-null type com.withings.wiscale2.device.common.handcalibration.DeviceModelWithHandCalibration");
            this.f52778c = ((lc0.a) f11).p();
            j();
        }
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void g2(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    public final void h(h hVar) {
        this.f52776a = hVar;
        if (hVar != null) {
            j();
        }
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void h0(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    public final void i() {
        HandsCalibrationConversation handsCalibrationConversation = this.f52777b;
        if (handsCalibrationConversation != null) {
            handsCalibrationConversation.G(new nm0.j(HandsCalibrationConversation.Action.f52752b, null));
        }
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void n2(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void s2(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void u0(HandsCalibrationConversation conversation) {
        u.j(conversation, "conversation");
        this.f52781f = false;
    }
}
