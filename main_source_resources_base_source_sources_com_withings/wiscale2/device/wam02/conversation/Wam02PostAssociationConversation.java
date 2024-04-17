package com.withings.wiscale2.device.wam02.conversation;

import androidx.core.os.e;
import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.generated.object.WamAutoSleep;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation;
import com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation;
import com.withings.wiscale2.device.wam02.ui.b;
import com.withings.wiscale2.device.wam02.ui.e;
import java.io.IOException;
import nm0.j;
/* loaded from: classes5.dex */
public class Wam02PostAssociationConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private User f54857f;

    /* renamed from: g  reason: collision with root package name */
    private b f54858g;

    /* loaded from: classes5.dex */
    public interface b extends WppDeviceConversation.b, Wam02PolarizationConversation.a, Wam02AutoSleepConversation.a {
    }

    public Wam02PostAssociationConversation(User user, a aVar) {
        this.f54857f = user;
        this.f54858g = aVar;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        b bVar = this.f54858g;
        ((a) bVar).b();
        Wam02InitConversation wam02InitConversation = new Wam02InitConversation(this.f54857f);
        wam02InitConversation.L();
        E(wam02InitConversation);
        E(new Wam02AutoSleepConversation(bVar, true));
        E(new Wam02PolarizationConversation(bVar, true));
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final WppDeviceConversation.b u() {
        return this.f54858g;
    }

    /* loaded from: classes5.dex */
    public static class a implements b {

        /* renamed from: a  reason: collision with root package name */
        private com.withings.devicesetup.ui.a f54859a;

        /* renamed from: b  reason: collision with root package name */
        private zp.a f54860b;

        /* renamed from: com.withings.wiscale2.device.wam02.conversation.Wam02PostAssociationConversation$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        final class C0723a implements SetupActivity.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Wam02AutoSleepConversation f54861a;

            /* renamed from: com.withings.wiscale2.device.wam02.conversation.Wam02PostAssociationConversation$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            final class C0724a implements b.a {
                C0724a() {
                }

                @Override // com.withings.wiscale2.device.wam02.ui.b.a
                public final void I(com.withings.wiscale2.device.wam02.ui.b bVar, int i11) {
                    C0723a c0723a = C0723a.this;
                    a.this.f54859a.g();
                    c0723a.f54861a.G(Integer.valueOf(i11));
                }
            }

            C0723a(Wam02AutoSleepConversation wam02AutoSleepConversation) {
                this.f54861a = wam02AutoSleepConversation;
            }

            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                com.withings.wiscale2.device.wam02.ui.b bVar = new com.withings.wiscale2.device.wam02.ui.b();
                bVar.setArguments(e.a(new j("KEY_KNOWN_AUTO_SLEEP", -1)));
                bVar.y1(new C0724a());
                setupActivity.h4(bVar, 300);
            }
        }

        /* loaded from: classes5.dex */
        final class b implements SetupActivity.a {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f54864a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Wam02PolarizationConversation f54865b;

            /* renamed from: com.withings.wiscale2.device.wam02.conversation.Wam02PostAssociationConversation$a$b$a  reason: collision with other inner class name */
            /* loaded from: classes5.dex */
            final class C0725a implements e.a {
                C0725a() {
                }

                @Override // com.withings.wiscale2.device.wam02.ui.e.a
                public final void c0() {
                    b.this.f54865b.G(1);
                }

                @Override // com.withings.wiscale2.device.wam02.ui.e.a
                public final void i0() {
                    b bVar = b.this;
                    bVar.f54865b.G(null);
                    a.this.f54859a.g();
                }

                @Override // com.withings.wiscale2.device.wam02.ui.e.a
                public final void t0() {
                    b.this.f54865b.G(0);
                }
            }

            b(int i11, Wam02PolarizationConversation wam02PolarizationConversation) {
                this.f54864a = i11;
                this.f54865b = wam02PolarizationConversation;
            }

            @Override // com.withings.devicesetup.ui.SetupActivity.a
            public final void h(SetupActivity setupActivity) {
                int i11 = com.withings.wiscale2.device.wam02.ui.e.f54908f;
                com.withings.wiscale2.device.wam02.ui.e eVar = new com.withings.wiscale2.device.wam02.ui.e();
                eVar.setArguments(androidx.core.os.e.a(new j("polarization", Integer.valueOf(this.f54864a))));
                eVar.v1(new C0725a());
                setupActivity.h4(eVar, 301);
            }
        }

        public a(SetupConversation setupConversation) {
            this.f54859a = setupConversation.M();
            this.f54860b = setupConversation.N();
        }

        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation.a
        public final void O2(Wam02PolarizationConversation wam02PolarizationConversation, int i11) {
            this.f54859a.k(new b(i11, wam02PolarizationConversation));
        }

        public final void b() {
            this.f54859a.g();
        }

        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation.a
        public final void b1(Wam02AutoSleepConversation wam02AutoSleepConversation, WamAutoSleep wamAutoSleep) {
            this.f54859a.k(new C0723a(wam02AutoSleepConversation));
        }

        @Override // com.withings.comm.remote.conversation.WppDeviceConversation.b
        public final void e3(WppDeviceConversation wppDeviceConversation, Exception exc) {
            this.f54860b.e3(wppDeviceConversation, exc);
        }

        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02PolarizationConversation.a
        public final void H0(Wam02PolarizationConversation wam02PolarizationConversation) {
        }

        @Override // com.withings.wiscale2.device.wam02.conversation.Wam02AutoSleepConversation.a
        public final void u1(Wam02AutoSleepConversation wam02AutoSleepConversation) {
        }
    }
}
