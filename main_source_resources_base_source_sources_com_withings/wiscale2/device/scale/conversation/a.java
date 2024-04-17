package com.withings.wiscale2.device.scale.conversation;

import android.content.Intent;
import com.withings.device.Device;
import com.withings.devicesetup.conversation.SetupConversation;
import com.withings.devicesetup.ui.SetupActivity;
import com.withings.user.User;
import io.g;
import kn.e;
import kotlin.jvm.internal.u;
import m70.i;
import zg.c;
/* compiled from: ScaleInstallFinalizingConversation.kt */
/* loaded from: classes5.dex */
public final class a implements SetupActivity.a.InterfaceC0497a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ SetupConversation f54659a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ScaleInstallFinalizingConversation f54660b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(SetupConversation setupConversation, ScaleInstallFinalizingConversation scaleInstallFinalizingConversation) {
        this.f54659a = setupConversation;
        this.f54660b = scaleInstallFinalizingConversation;
    }

    @Override // com.withings.devicesetup.ui.SetupActivity.a.InterfaceC0497a
    public final void e(SetupActivity setupActivity, int i11, int i12, Intent intent) {
        if (i11 == 27) {
            ScaleInstallFinalizingConversation scaleInstallFinalizingConversation = this.f54660b;
            if (i12 == -1) {
                scaleInstallFinalizingConversation.G(Boolean.TRUE);
            } else {
                scaleInstallFinalizingConversation.G(Boolean.FALSE);
            }
        }
        this.f54659a.M().j(new g(2));
    }

    @Override // com.withings.devicesetup.ui.SetupActivity.a
    public final void h(SetupActivity setupActivity) {
        u.j(setupActivity, "setupActivity");
        Device f11 = e.c().f(this.f54659a.x().g());
        c cVar = c.f110625a;
        u.g(f11);
        User e11 = i.b().e();
        u.i(e11, "getMainUser(...)");
        cVar.getClass();
        setupActivity.startActivityForResult(c.c(setupActivity, f11, e11, true), 27);
    }
}
