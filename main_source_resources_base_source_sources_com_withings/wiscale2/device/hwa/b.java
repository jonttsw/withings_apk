package com.withings.wiscale2.device.hwa;

import android.content.Context;
import com.withings.user.User;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.hwa.HwaSyncConversation;
import kotlin.jvm.internal.u;
import xb0.n;
/* compiled from: HwaSyncConversation.kt */
/* loaded from: classes5.dex */
public final class b implements HwaSyncConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private n f54179a;

    @Override // xb0.l.a
    public final void a(Vasistas vasistas, int i11) {
        n nVar = this.f54179a;
        if (nVar != null) {
            nVar.a(vasistas, i11);
        } else {
            u.s("vasistasSyncHelper");
            throw null;
        }
    }

    public final void b() {
        n nVar = this.f54179a;
        if (nVar != null) {
            nVar.b();
        } else {
            u.s("vasistasSyncHelper");
            throw null;
        }
    }

    public final void c(Context context, cj.b bVar, User user) {
        n nVar = new n(context, bVar, user);
        this.f54179a = nVar;
        nVar.e(context);
    }
}
