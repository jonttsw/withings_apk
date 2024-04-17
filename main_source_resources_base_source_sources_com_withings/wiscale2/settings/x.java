package com.withings.wiscale2.settings;

import android.content.DialogInterface;
import com.withings.user.User;
import java.util.ArrayList;
import java.util.List;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<e0, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ DebugDeeplinkActivity f60369a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(DebugDeeplinkActivity debugDeeplinkActivity) {
        super(1);
        this.f60369a = debugDeeplinkActivity;
    }

    @Override // ym0.l
    public final nm0.y invoke(e0 e0Var) {
        final e0 it = e0Var;
        kotlin.jvm.internal.u.j(it, "it");
        fn0.k<Object>[] kVarArr = DebugDeeplinkActivity.f59723d;
        final DebugDeeplinkActivity debugDeeplinkActivity = this.f60369a;
        debugDeeplinkActivity.getClass();
        List<User> b10 = it.b();
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(b10, 10));
        for (User user : b10) {
            String l5 = user.l();
            String s11 = user.s();
            arrayList.add(l5 + " " + s11);
        }
        ArrayList m02 = kotlin.collections.x.m0("No user", arrayList);
        qc.b B = new qc.b(debugDeeplinkActivity).B("Choose user");
        B.u((CharSequence[]) m02.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.settings.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                DebugDeeplinkActivity.z3(it, debugDeeplinkActivity, i11);
            }
        });
        B.s();
        return nm0.y.f85009a;
    }
}
