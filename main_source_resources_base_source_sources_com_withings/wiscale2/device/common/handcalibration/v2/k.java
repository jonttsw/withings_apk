package com.withings.wiscale2.device.common.handcalibration.v2;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.devicesetup.ui.SetupScreen;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.handcalibration.HandCalibration;
import com.withings.wiscale2.device.common.handcalibration.a;
import dq.c0;
import dq.u;
/* compiled from: InstallHandsCalibrationDelegate.kt */
/* loaded from: classes5.dex */
public final class k implements com.withings.wiscale2.device.common.handcalibration.v2.e, h {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.devicesetup.ui.a f52790a;

    /* renamed from: b  reason: collision with root package name */
    private final zp.a f52791b;

    /* renamed from: c  reason: collision with root package name */
    private final f f52792c;

    /* renamed from: d  reason: collision with root package name */
    private final g f52793d;

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class a implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f52794a;

        a(g gVar) {
            this.f52794a = gVar;
        }

        @Override // dq.u
        public final void p() {
            this.f52794a.b(false);
        }
    }

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class b implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f52795a;

        b(g gVar) {
            this.f52795a = gVar;
        }

        @Override // dq.u
        public final void p() {
            this.f52795a.b(true);
        }
    }

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class c implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f52796a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f52797b;

        c(g gVar, k kVar) {
            this.f52796a = gVar;
            this.f52797b = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
        @Override // dq.u
        public final void p() {
            this.f52796a.e(true);
            this.f52797b.f52790a.j(new Object());
        }
    }

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class d implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f52798a;

        d(g gVar) {
            this.f52798a = gVar;
        }

        @Override // dq.u
        public final void p() {
            this.f52798a.e(false);
        }
    }

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class e implements SetupActivity.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HandCalibration f52799a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ k f52800b;

        /* compiled from: InstallHandsCalibrationDelegate.kt */
        /* loaded from: classes5.dex */
        public static final class a implements lc0.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k f52801a;

            a(k kVar) {
                this.f52801a = kVar;
            }

            @Override // lc0.c
            public final void g1(com.withings.wiscale2.device.common.handcalibration.a fragment) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
                this.f52801a.f52793d.i();
            }

            @Override // lc0.c
            public final void j0(com.withings.wiscale2.device.common.handcalibration.a fragment, int i11) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
                this.f52801a.f52793d.f(i11);
            }

            @Override // lc0.c
            public final void o3(com.withings.wiscale2.device.common.handcalibration.a fragment) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
                this.f52801a.f52793d.c();
            }
        }

        e(HandCalibration handCalibration, k kVar) {
            this.f52799a = handCalibration;
            this.f52800b = kVar;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a.b
        public final boolean f(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            return this.f52800b.f52793d.d();
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            com.withings.wiscale2.device.common.handcalibration.a.f52681i.getClass();
            com.withings.wiscale2.device.common.handcalibration.a a11 = a.C0705a.a(this.f52799a, false);
            a11.y1(new a(this.f52800b));
            setupActivity.h4(a11, 100);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.wiscale2.device.common.handcalibration.v2.g, java.lang.Object] */
    public k(com.withings.devicesetup.ui.a activityUpdater, zp.a setupDelegate, f fVar) {
        kotlin.jvm.internal.u.j(activityUpdater, "activityUpdater");
        kotlin.jvm.internal.u.j(setupDelegate, "setupDelegate");
        this.f52790a = activityUpdater;
        this.f52791b = setupDelegate;
        this.f52792c = fVar;
        ?? obj = new Object();
        obj.h(this);
        this.f52793d = obj;
    }

    public static void a(k this$0, g presenter, SetupActivity setupActivity) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(presenter, "$presenter");
        String string = setupActivity.getString(C1987R.string.hwa09Setup_calibrate_checkTitle);
        f fVar = this$0.f52792c;
        String string2 = setupActivity.getString(fVar.c());
        String string3 = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_checkYes);
        String string4 = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_checkNo);
        LottieData a11 = fVar.a();
        kotlin.jvm.internal.u.g(string);
        SetupScreen setupScreen = new SetupScreen(string, string2, null, a11, string3, string4, null, 32364);
        c0.f64134y.getClass();
        c0 a12 = c0.a.a(setupScreen);
        a12.G1(new a(presenter));
        a12.I1(new b(presenter));
        setupActivity.h4(a12, 100);
    }

    public static void b(k this$0, g presenter, SetupActivity setupActivity) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(presenter, "$presenter");
        String string = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_endTitle);
        String string2 = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_endMessage);
        String string3 = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_end_done);
        String string4 = setupActivity.getString(C1987R.string.hwa06Setup_calibrate_end_tryAgain);
        Integer b10 = this$0.f52792c.b();
        kotlin.jvm.internal.u.g(string);
        SetupScreen setupScreen = new SetupScreen(string, string2, b10, null, string3, string4, null, 32376);
        c0.f64134y.getClass();
        c0 a11 = c0.a.a(setupScreen);
        a11.G1(new c(presenter, this$0));
        a11.I1(new d(presenter));
        setupActivity.h4(a11, 100);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void A(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void C(final g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52790a.j(new SetupActivity.a() { // from class: com.withings.wiscale2.device.common.handcalibration.v2.j
            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                k.a(this, presenter, setupActivity);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void L(g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52790a.j(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void N2(g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52790a.j(new Object());
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void Q0(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void T0(g presenter, WppDeviceConversation conversation, Exception exception) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(conversation, "conversation");
        kotlin.jvm.internal.u.j(exception, "exception");
        this.f52791b.e3(conversation, exception);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void V2(g presenter, HandCalibration handCalibration) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(handCalibration, "handCalibration");
        this.f52790a.j(new e(handCalibration, this));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52791b.e3(conversation, exc);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void g2(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void h0(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void l2(g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52790a.j(new io.g(1));
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void n2(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void p3(g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void s2(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        g gVar = this.f52793d;
        gVar.getClass();
        gVar.g(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.e
    public final void u0(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52793d.u0(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.v2.h
    public final void v(final g presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52790a.j(new SetupActivity.a() { // from class: com.withings.wiscale2.device.common.handcalibration.v2.i
            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                k.b(this, presenter, setupActivity);
            }
        });
    }
}
