package com.withings.wiscale2.device.common.handcalibration;

import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.devicesetup.ui.LottieData;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.devicesetup.ui.SetupScreen;
import com.withings.wiscale2.device.common.handcalibration.a;
import com.withings.wiscale2.device.common.handcalibration.f;
import dq.c0;
import dq.u;
/* compiled from: InstallHandsCalibrationDelegate.kt */
/* loaded from: classes5.dex */
public final class i implements lc0.i, h {

    /* renamed from: a  reason: collision with root package name */
    private final com.withings.devicesetup.ui.a f52712a;

    /* renamed from: b  reason: collision with root package name */
    private final zp.a f52713b;

    /* renamed from: c  reason: collision with root package name */
    private final f f52714c;

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class a implements SetupActivity.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f.a f52715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f52716b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f52717c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ HandCalibration f52718d;

        /* compiled from: InstallHandsCalibrationDelegate.kt */
        /* renamed from: com.withings.wiscale2.device.common.handcalibration.i$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0706a implements u {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f52719a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f f52720b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ HandCalibration f52721c;

            C0706a(i iVar, f fVar, HandCalibration handCalibration) {
                this.f52719a = iVar;
                this.f52720b = fVar;
                this.f52721c = handCalibration;
            }

            @Override // dq.u
            public final void p() {
                this.f52719a.D2(this.f52720b, this.f52721c);
            }
        }

        a(f.a aVar, i iVar, f fVar, HandCalibration handCalibration) {
            this.f52715a = aVar;
            this.f52716b = iVar;
            this.f52717c = fVar;
            this.f52718d = handCalibration;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a.b
        public final boolean f(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            return this.f52716b.f52714c.c();
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            f.a aVar = this.f52715a;
            String string = setupActivity.getString(aVar.e());
            String string2 = setupActivity.getString(aVar.d());
            String string3 = setupActivity.getString(aVar.c());
            LottieData b10 = aVar.b();
            int a11 = aVar.a();
            kotlin.jvm.internal.u.g(string);
            SetupScreen setupScreen = new SetupScreen(string, string2, Integer.valueOf(a11), b10, string3, null, null, 32616);
            c0.f64134y.getClass();
            c0 a12 = c0.a.a(setupScreen);
            a12.G1(new C0706a(this.f52716b, this.f52717c, this.f52718d));
            setupActivity.h4(a12, 100);
        }
    }

    /* compiled from: InstallHandsCalibrationDelegate.kt */
    /* loaded from: classes5.dex */
    public static final class b implements SetupActivity.a.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ HandCalibration f52722a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ i f52723b;

        /* compiled from: InstallHandsCalibrationDelegate.kt */
        /* loaded from: classes5.dex */
        public static final class a implements lc0.c {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ i f52724a;

            a(i iVar) {
                this.f52724a = iVar;
            }

            @Override // lc0.c
            public final void g1(com.withings.wiscale2.device.common.handcalibration.a fragment) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
            }

            @Override // lc0.c
            public final void j0(com.withings.wiscale2.device.common.handcalibration.a fragment, int i11) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
                this.f52724a.f52714c.d(i11);
            }

            @Override // lc0.c
            public final void o3(com.withings.wiscale2.device.common.handcalibration.a fragment) {
                kotlin.jvm.internal.u.j(fragment, "fragment");
                this.f52724a.f52714c.b();
            }
        }

        b(HandCalibration handCalibration, i iVar) {
            this.f52722a = handCalibration;
            this.f52723b = iVar;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a.b
        public final boolean f(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            return this.f52723b.f52714c.c();
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            kotlin.jvm.internal.u.j(setupActivity, "setupActivity");
            com.withings.wiscale2.device.common.handcalibration.a.f52681i.getClass();
            com.withings.wiscale2.device.common.handcalibration.a a11 = a.C0705a.a(this.f52722a, false);
            a11.y1(new a(this.f52723b));
            setupActivity.h4(a11, 100);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.wiscale2.device.common.handcalibration.f, java.lang.Object] */
    public i(com.withings.devicesetup.ui.a activityUpdater, zp.a setupDelegate) {
        kotlin.jvm.internal.u.j(activityUpdater, "activityUpdater");
        kotlin.jvm.internal.u.j(setupDelegate, "setupDelegate");
        this.f52712a = activityUpdater;
        this.f52713b = setupDelegate;
        ?? obj = new Object();
        obj.f(this);
        this.f52714c = obj;
    }

    @Override // lc0.i
    public final void D1(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        f fVar = this.f52714c;
        fVar.getClass();
        fVar.e(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void D2(f presenter, HandCalibration handCalibration) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(handCalibration, "handCalibration");
        this.f52712a.j(new b(handCalibration, this));
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void F0(f presenter, WppDeviceConversation conversation, Exception exception) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(conversation, "conversation");
        kotlin.jvm.internal.u.j(exception, "exception");
        this.f52713b.e3(conversation, exception);
    }

    @Override // lc0.i
    public final void N(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52714c.N(conversation);
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void S2(f presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
    }

    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void e2(f presenter, f.a aVar, HandCalibration handCalibration) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        kotlin.jvm.internal.u.j(handCalibration, "handCalibration");
        this.f52712a.j(new a(aVar, this, presenter, handCalibration));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
    public final void e3(WppDeviceConversation conversation, Exception exc) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52713b.e3(conversation, exc);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void n1(f presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52712a.j(new Object());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.withings.devicesetup.ui.SetupActivity$a, java.lang.Object] */
    @Override // com.withings.wiscale2.device.common.handcalibration.h
    public final void q2(f presenter) {
        kotlin.jvm.internal.u.j(presenter, "presenter");
        this.f52712a.j(new Object());
    }

    @Override // lc0.i
    public final void t2(HandsCalibrationConversation conversation) {
        kotlin.jvm.internal.u.j(conversation, "conversation");
        this.f52714c.t2(conversation);
    }
}
