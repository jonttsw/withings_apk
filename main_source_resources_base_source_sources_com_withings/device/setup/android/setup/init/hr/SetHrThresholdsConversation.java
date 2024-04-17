package com.withings.device.setup.android.setup.init.hr;

import com.withings.comm.remote.conversation.ConversationException;
import com.withings.comm.remote.conversation.WaitForInput;
import com.withings.comm.remote.conversation.WppDeviceConversation;
import com.withings.comm.wpp.exception.UnsupportedCommandException;
import com.withings.comm.wpp.generated.object.Id;
import com.withings.comm.wpp.generated.object.Null;
import fl.r;
import fl.t;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.internal.u;
import nj.a;
import x70.b;
/* compiled from: SetHrThresholdsConversation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/device/setup/android/setup/init/hr/SetHrThresholdsConversation;", "Lcom/withings/comm/remote/conversation/WppDeviceConversation;", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class SetHrThresholdsConversation extends WppDeviceConversation {

    /* renamed from: f  reason: collision with root package name */
    private final long f37448f;

    /* renamed from: g  reason: collision with root package name */
    private final r f37449g;

    public SetHrThresholdsConversation(long j5, r hrThresholdsRepository) {
        u.j(hrThresholdsRepository, "hrThresholdsRepository");
        this.f37448f = j5;
        this.f37449g = hrThresholdsRepository;
    }

    @Override // com.withings.comm.remote.conversation.WppDeviceConversation
    public final void D() throws IOException, ConversationException, WaitForInput.CancelException, InterruptedException {
        r rVar = this.f37449g;
        long j5 = this.f37448f;
        r.a a11 = t.a(j5, rVar);
        Id value = new Id().setValue(j5);
        u.i(value, "setValue(...)");
        List W = x.W(value, a11.b(), a11.a(), new Null());
        try {
            a aVar = new a(x());
            aVar.b(W, (short) 2446);
            aVar.j();
        } catch (UnsupportedCommandException e11) {
            b.e(this, e11);
        }
    }
}
