package com.withings.wiscale2.device.common.conversation;

import com.withings.comm.wpp.generated.object.WamVasistasHead;
import com.withings.vasistas.model.Vasistas;
import com.withings.wiscale2.device.common.conversation.VasistasSyncConversation;
import org.joda.time.DateTime;
import org.joda.time.Duration;
/* compiled from: VasistasSyncConversation.kt */
/* loaded from: classes5.dex */
public final class t implements VasistasSyncConversation.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f50851a;

    /* renamed from: b  reason: collision with root package name */
    private DateTime f50852b;

    /* renamed from: c  reason: collision with root package name */
    private DateTime f50853c;

    /* compiled from: VasistasSyncConversation.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void n(VasistasSyncConversation vasistasSyncConversation, float f11);
    }

    public t(a listener) {
        kotlin.jvm.internal.u.j(listener, "listener");
        this.f50851a = listener;
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void a(VasistasSyncConversation vasistasSyncConversation, int i11) {
        kotlin.jvm.internal.u.j(vasistasSyncConversation, "vasistasSyncConversation");
        this.f50851a.n(vasistasSyncConversation, 1.0f);
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void c(VasistasSyncConversation vasistasSyncConversation, DateTime dateTime) {
        this.f50851a.n(vasistasSyncConversation, 0.0f);
        if (this.f50853c == null) {
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            this.f50853c = now;
        }
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void d(VasistasSyncConversation vasistasSyncConversation, Vasistas vasistas) {
        if (this.f50852b == null) {
            this.f50852b = vasistas.getStartDate();
        }
        DateTime dateTime = this.f50852b;
        if (dateTime != null) {
            float millis = (float) new Duration(dateTime, vasistas.getStartDate()).getMillis();
            DateTime dateTime2 = this.f50852b;
            if (dateTime2 != null) {
                DateTime dateTime3 = this.f50853c;
                if (dateTime3 != null) {
                    this.f50851a.n(vasistasSyncConversation, millis / ((float) new Duration(dateTime2, dateTime3).getMillis()));
                    return;
                }
                kotlin.jvm.internal.u.s("syncStart");
                throw null;
            }
            kotlin.jvm.internal.u.s("firstVasistasStart");
            throw null;
        }
        kotlin.jvm.internal.u.s("firstVasistasStart");
        throw null;
    }

    @Override // com.withings.wiscale2.device.common.conversation.VasistasSyncConversation.a
    public final void b(VasistasSyncConversation vasistasSyncConversation, qj.c<WamVasistasHead> cVar, Vasistas vasistas) {
    }
}
