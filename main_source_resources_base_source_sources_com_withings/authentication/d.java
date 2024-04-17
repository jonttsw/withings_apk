package com.withings.authentication;

import androidx.compose.foundation.layout.e;
import com.withings.comm.trace.conversation.DebugDumpConversation;
import com.withings.devicesetup.ui.SetupActivity;
import java.util.ArrayList;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements SetupActivity.a, u70.b {
    public static int a(androidx.compose.ui.layout.k0 k0Var, long j5, ArrayList arrayList, int i11, int i12) {
        arrayList.add(k0Var.P(j5));
        return i11 + i12;
    }

    public static e.h b(androidx.compose.runtime.b bVar, int i11) {
        e.h o11 = androidx.compose.foundation.layout.e.o(yk.h.b());
        bVar.s(i11);
        return o11;
    }

    @Override // com.withings.devicesetup.ui.SetupActivity.a
    public void h(SetupActivity setupActivity) {
        setupActivity.f4();
    }

    @Override // u70.b
    public boolean isMatching(Object obj) {
        DebugDumpConversation debugDumpConversation = (DebugDumpConversation) obj;
        return true;
    }
}
