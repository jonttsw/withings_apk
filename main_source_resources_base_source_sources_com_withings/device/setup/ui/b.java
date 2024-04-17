package com.withings.device.setup.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.user.User;
import fl.p;
import java.util.Locale;
import kotlin.jvm.internal.u;
import yp.a;
/* compiled from: PickUserForSetup.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f37530a = new Handler(Looper.getMainLooper());

    /* compiled from: PickUserForSetup.kt */
    /* loaded from: classes3.dex */
    public static final class a implements SetupActivity.a.InterfaceC0497a {

        /* renamed from: a  reason: collision with root package name */
        private final SetupWithUser f37531a;

        /* renamed from: b  reason: collision with root package name */
        private final SetupConversation f37532b;

        /* renamed from: c  reason: collision with root package name */
        private final int f37533c;

        public a(int i11, SetupWithUser setup, SetupConversation setupConversation) {
            u.j(setup, "setup");
            u.j(setupConversation, "setupConversation");
            this.f37531a = setup;
            this.f37532b = setupConversation;
            this.f37533c = i11;
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a.InterfaceC0497a
        public final void e(SetupActivity setupActivity, int i11, int i12, Intent data) {
            u.j(setupActivity, "setupActivity");
            u.j(data, "data");
            if (i11 == 5432) {
                if (i12 == -1) {
                    long longExtra = data.getLongExtra(NavigationArguments.USER_ID, -1L);
                    User i13 = m70.i.b().i(longExtra);
                    u.g(i13);
                    SetupWithUser setupWithUser = this.f37531a;
                    setupWithUser.m0(i13);
                    setupActivity.S3().G(new a.C1938a(longExtra, p.f67672b.a().d(this.f37533c).getDeviceType(), !setupWithUser.j2()));
                    this.f37532b.M().j(null);
                    return;
                }
                setupActivity.q4();
            }
        }

        @Override // com.withings.devicesetup.ui.SetupActivity.a
        public final void h(SetupActivity setupActivity) {
            u.j(setupActivity, "setupActivity");
            setupActivity.m4();
            String iVar = this.f37532b.x().g().toString();
            u.i(iVar, "toString(...)");
            setupActivity.startActivityForResult(b.a(setupActivity, this.f37531a, this.f37533c, iVar), 5432);
        }
    }

    /* compiled from: Handler.kt */
    /* renamed from: com.withings.device.setup.ui.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class RunnableC0491b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ SetupConversation f37534a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ SetupWithUser f37535b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f37536c;

        public RunnableC0491b(int i11, SetupWithUser setupWithUser, SetupConversation setupConversation) {
            this.f37534a = setupConversation;
            this.f37535b = setupWithUser;
            this.f37536c = i11;
        }

        @Override // java.lang.Runnable
        public final void run() {
            SetupConversation setupConversation = this.f37534a;
            setupConversation.M().k(new a(this.f37536c, this.f37535b, setupConversation));
        }
    }

    public static final Intent a(Context context, SetupWithUser setupWithUser, int i11, String macAddress) {
        u.j(context, "context");
        u.j(setupWithUser, "setupWithUser");
        u.j(macAddress, "macAddress");
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(context.getPackageName(), "com.withings.wiscale2.device.common.setup.PickUserForSetupActivity").putExtra("setup", setupWithUser).putExtra("device_model", i11);
        String lowerCase = macAddress.toLowerCase(Locale.ROOT);
        u.i(lowerCase, "toLowerCase(...)");
        Intent putExtra2 = putExtra.putExtra("EXTRA_DEVICE_MAC", lowerCase);
        u.i(putExtra2, "putExtra(...)");
        return putExtra2;
    }

    public static final void b(SetupWithUser setup, SetupConversation setupConversation, int i11, long j5) {
        u.j(setup, "setup");
        u.j(setupConversation, "setupConversation");
        f37530a.postDelayed(new RunnableC0491b(i11, setup, setupConversation), j5);
    }
}
